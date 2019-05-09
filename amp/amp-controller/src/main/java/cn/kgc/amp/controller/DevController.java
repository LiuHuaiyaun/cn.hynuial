package cn.kgc.amp.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.kgc.amp.base.controller.BaseController;
import cn.kgc.amp.beans.entity.Dev;
import cn.kgc.amp.service.DevService;
import cn.kgc.amp.util.MD5Util;

@Controller("devController")
@RequestMapping("/dev")
public class DevController extends BaseController {
	@Resource(name = "devService")
	private DevService devService;
	
	/**
	 * *转发登录页面
	 * @return String
	 * @throws Exception
	 */
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String getLoginForm() throws Exception {
		return "/dev/dev_login_form";
	}
	/**
	 * *开发人员登录验证，成功后重定向到首页；失败后转发到登录页面
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
		return "/dev/dev_login_form";
	}
}
