package cn.hynuial.dms.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cn.hynuial.dms.bean.entity.User;
import cn.hynuial.dms.bean.vo.Page;
import cn.hynuial.dms.service.UserService;

@Controller("userController")
@RequestMapping("/user")
public class UserController {
	@Resource(name = "userService")
	private UserService userService;
	@Autowired
	private HttpServletRequest request;
	@Autowired
	private HttpSession session;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String getLoginForm() throws Exception {
		return "user/user_login_form";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginUser(User user) throws Exception {
		// 判断此时的电话号码和密码是否为null
		if (user.getCellphone() != null && !"".equals(user.getCellphone().trim()) && 
				user.getPassword() != null && !"".equals(user.getPassword().trim())) {
			// 用户填入了有效的登录信息，进行下一步登录过程
			user = userService.loginUser(user);
			if (user != null) {
				// 登陆成功，绑定Session信息
				session.setAttribute("user", user);
				// 重定向到列表页面
				return "redirect:list";
			}
		}
		return "redirect:login";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView getUserListByPage(Integer pageNum, Integer pageSize) throws Exception {
		// 使用当前页面pageNum和每页显示数量pageSize封装分页对象
		Page<User> page = new Page<User>(pageNum, pageSize);
		// 使用业务层进行分页查询
		page = userService.getUserListByPage(page);
		return new ModelAndView("user/user_list", "page", page);
	}
}
