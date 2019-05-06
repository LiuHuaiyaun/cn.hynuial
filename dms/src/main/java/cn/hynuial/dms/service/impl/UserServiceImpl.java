package cn.hynuial.dms.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.hynuial.dms.bean.entity.User;
import cn.hynuial.dms.bean.vo.Page;
import cn.hynuial.dms.dao.UserDao;
import cn.hynuial.dms.service.UserService;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
	@Resource(name = "userDao")
	private UserDao userDao;

	/**
	 * 使用登录电话和登录密码进行用户登录，
	 * 登陆成功返回登录对象
	 * @param cellphone
	 * @param password
	 * @return User
	 * @throws Exception
	 */
	public User loginUser(User user) throws Exception {
		user = userDao.findUserByQuery(user);
		return user;
	}

	/**
	 * 分页查询用户信息列表
	 * @param page
	 * @return Page<User>
	 * @throws Exception
	 */
	public Page<User> getUserListByPage(Page<User> page) throws Exception {
		// 根据分页对象，封装Mybatis分页信息
		Map<String, Object> paramMap = new HashMap<String, Object>();
		// 计算开始的下标数
		Integer begin = (page.getPageNum() - 1) * page.getPageSize();
		// 获得连续查询条数
		Integer size = page.getPageSize();
		paramMap.put("begin", begin);
		paramMap.put("size", size);
		// 开始分页查询
		List<User> userList = userDao.findUserListByPage(paramMap);
		// 查询总数量
		Long totalCount = (long) userDao.findUserListByPage(null).size();
		// 计算总页数
		Long totalPage = (totalCount % page.getPageSize() == 0) ? (totalCount / page.getPageSize()) : (totalCount / page.getPageSize()) + 1;
		
		// 将结果放入分页对象
		page.setList(userList);
		page.setTotalCount(totalCount);
		page.setTotalPage(totalPage);
		return page;
	}
}
