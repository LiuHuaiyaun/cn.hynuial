package cn.kgc.amp.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import cn.kgc.amp.base.controller.BaseController;
import cn.kgc.amp.beans.entity.Dev;
import cn.kgc.amp.service.DevService;
import cn.kgc.amp.util.DevUtil;
import cn.kgc.amp.util.MD5Util;

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
				System.out.println("登陆成功！");
				session.setAttribute("dev", dev);
				return "/app/appList";
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
	@ResponseBody
	public Map<String, Object> registryDev(Dev dev) throws Exception {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		if(DevUtil.registryDev(dev)) {
			//通过MD5Util对用户密码进行加密
			
			dev.setPassword(MD5Util.encrypt(dev.getPassword()));
			//添加开发者编码号
			dev.setDevNo(DevUtil.getDevNo());
			int count = devService.saveDev(dev);
			if (count > 0) {
				resultMap.put("dev", dev);
				resultMap.put("result", true);
				return resultMap;
			}
		}
		resultMap.put("result", false);
		return resultMap;
	}
	
}
