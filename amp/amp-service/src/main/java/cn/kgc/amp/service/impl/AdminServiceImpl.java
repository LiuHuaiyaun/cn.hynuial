package cn.kgc.amp.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.kgc.amp.beans.entity.Admin;
import cn.kgc.amp.dao.AdminDao;
import cn.kgc.amp.service.AdminService;

/**
 * <b>后台管理者平台业务层接口</b>
 * @author LiuHuaiyaun
 * @version 1.0 
 * @since 2019-05-11
 */
@Service("adminService")
@Transactional
public class AdminServiceImpl implements AdminService {

	@Resource(name="adminDao")
	private AdminDao adminDao;
	/**
	 * <b>后台管理者登录信息验证</b>
	 * @param dev
	 * @return Dev
	 * @throws Exception
	 */
	public Admin loginAdmin(Admin admin) throws Exception {
		admin = adminDao.findDevsByQuery(admin);
		return admin;
	}

	/**
	 * *<b>后台管理者注册信息验证</b>
	 * @param dev
	 * @return int
	 * @throws Exception
	 */
	public int saveAdmin(Admin admin) throws Exception {
		int count = adminDao.save(admin);
		return count;
	}

}
