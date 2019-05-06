package cn.hynuial.dms.dao;

import java.util.List;
import java.util.Map;

import cn.hynuial.dms.bean.entity.User;

public interface UserDao {

	/**
	 * 条件查询用户信息
	 * @param user
	 * @return User
	 * @throws Exception
	 */
	public User findUserByQuery(User user) throws Exception;

	/**
	 * 进行分页查询
	 * @param paramMap
	 * @return List<User>
	 * @throws Exception
	 */
	public List<User> findUserListByPage(Map<String, Object> paramMap) throws Exception;
}
