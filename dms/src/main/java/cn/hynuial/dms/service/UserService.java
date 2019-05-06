package cn.hynuial.dms.service;

import cn.hynuial.dms.bean.entity.User;
import cn.hynuial.dms.bean.vo.Page;

public interface UserService {

	/**
	 * 使用登录电话和登录密码进行用户登录，
	 * 登陆成功返回登录对象
	 * @param user
	 * @return User
	 * @throws Exception
	 */
	public User loginUser(User user) throws Exception;

	/**
	 * 分页查询用户信息列表
	 * @param page
	 * @return Page<User>
	 * @throws Exception
	 */
	public Page<User> getUserListByPage(Page<User> page) throws Exception;
}
