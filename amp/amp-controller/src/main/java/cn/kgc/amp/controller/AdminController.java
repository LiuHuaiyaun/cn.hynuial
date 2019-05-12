package cn.kgc.amp.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.kgc.amp.base.controller.BaseController;
import cn.kgc.amp.beans.entity.Admin;
import cn.kgc.amp.service.AdminService;
import cn.kgc.amp.util.AdminUtil;
import cn.kgc.amp.util.MD5Util;

/**
 * <b>后台管理者平台控制器</b>
 * @author LiuHuaiyaun
 * @version 1.0 
 * @since 2019-05-11
 */
@Controller("adminController")
@RequestMapping("/admin")
public class AdminController extends BaseController {
	@Resource(name = "adminService")
	private AdminService adminService;
	
	/**
	 * *<b>加载后台管理者登录界面</b>
	 * @return String
	 * @throws Exception
	 */
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String getLoginForm() throws Exception {
		return "/admin/login_form";
	}
	/**
	 * *<b>后台管理者登录信息验证</b>
	 * *<p>成功后重定向到首页；失败后转发到登录页面</p>
	 * @param admin
	 * @return String
	 * @throws Exception
	 */
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String loginadmin(Admin admin) throws Exception {
		if(admin.getAdminNo() != null && !"".equals(admin.getAdminNo().trim()) &&
				admin.getPassword() != null && !"".equals(admin.getPassword().trim())) {
			//通过MD5Util对用户密码进行加密
			admin.setPassword(MD5Util.encrypt(admin.getPassword()));
			admin = adminService.loginAdmin(admin);
			if (admin != null) {
				session.setAttribute("admin", admin);
				return "redirect:home";
			}
		}
		return "redirect:login";
	}
	/**
	 * *<b>加载后台管理者注册界面</b>
	 * @return String
	 * @throws Exception
	 */
	@RequestMapping(value="/registry",method=RequestMethod.GET)
	public String getRegistryForm() throws Exception {
		return "/admin/registry_form";
	}
	/**
	 * *<b>后台管理者注册信息验证</b>
	 * *<p>成功后重定向到首页；失败后转发到登录页面</p>
	 * @param admin
	 * @return String
	 * @throws Exception
	 */
	@RequestMapping(value="/registry",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> registryadmin(Admin admin) throws Exception {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		if(AdminUtil.registryAdmin(admin)) {
			//通过MD5Util对用户密码进行加密
			
			admin.setPassword(MD5Util.encrypt(admin.getPassword()));
			//添加后台管理者编码号
			admin.setAdminNo(AdminUtil.getAdminNo());
			int count = adminService.saveAdmin(admin);
			if (count > 0) {
				resultMap.put("admin", admin);
				resultMap.put("result", true);
				return resultMap;
			}
		}
		resultMap.put("result", false);
		return resultMap;
	}
}
