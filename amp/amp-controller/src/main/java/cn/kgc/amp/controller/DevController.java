package cn.kgc.amp.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cn.kgc.amp.base.controller.BaseController;
import cn.kgc.amp.beans.entity.Dev;
import cn.kgc.amp.beans.vo.Page;
import cn.kgc.amp.service.DevService;
import cn.kgc.amp.util.MD5Util;

/**
 * <b>开发者平台控制器</b>
 * @author LiuHuaiyaun
 * @version 1.0 
 * @since 2019-05-09
 */
@Controller("devController")
@RequestMapping("/dev")
public class DevController extends BaseController {
	@Resource(name = "devService")
	private DevService devService;
	
	/**
	 * *<b>加载开发者登录界面</b>
	 * @return String
	 * @throws Exception
	 */
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String getLoginForm() throws Exception {
		return "/dev/login_form";
	}
	/**
	 * *<b>开发人员登录信息验证</b>
	 * *<p>成功后重定向到首页；失败后转发到登录页面</p>
	 * @param dev
	 * @return String
	 * @throws Exception
	 */
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String loginDev(Dev dev) throws Exception {
		if(dev.getCellphone() != null && !"".equals(dev.getCellphone()) &&
				dev.getPassword() != null && !"".equals(dev.getPassword())) {
			//通过MD5Util对用户密码进行加密
			dev.setPassword(MD5Util.encrypt(dev.getPassword()));
			dev = devService.loginDev(dev);
			if (dev != null) {
				session.setAttribute("dev", dev);
				return "redirect:home";
			}
		}
		return "redirect:login";
	}
	/**
	 * *<b>加载开发者注册界面</b>
	 * @return String
	 * @throws Exception
	 */
	@RequestMapping(value="/registry",method=RequestMethod.GET)
	public String getRegistryForm() throws Exception {
		return "/dev/registry_form";
	}
	/**
	 * *<b>开发人员注册信息验证</b>
	 * *<p>成功后重定向到首页；失败后转发到登录页面</p>
	 * @param dev
	 * @return String
	 * @throws Exception
	 */
	@RequestMapping(value="/registry",method=RequestMethod.POST)
	public String registryDev(Dev dev) throws Exception {
		if(dev.getCellphone() != null && !"".equals(dev.getCellphone()) &&
				dev.getPassword() != null && !"".equals(dev.getPassword())) {
			//通过MD5Util对用户密码进行加密
			dev.setPassword(MD5Util.encrypt(dev.getPassword()));
			int count = devService.saveDev(dev);
			if (count > 0) {
				session.setAttribute("dev", dev);
				return "redirect:home";
			}
		}
		return "redirect:registry";
	}
	
}
