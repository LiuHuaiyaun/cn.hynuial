package cn.kgc.amp.service;

import cn.kgc.amp.beans.entity.Admin;

/**
 * <b>后台管理者平台业务层接口</b>
 * @author LiuHuaiyaun
 * @version 1.0 
 * @since 2019-05-11
 */
public interface AdminService {

	/**
	 * <b>后台管理者登录信息验证</b>
	 * @param Admin
	 * @return Admin
	 * @throws Exception
	 */
	public Admin loginAdmin(Admin admin) throws Exception;
	
	/**
	 * *<b>后台管理者注册信息验证</b>
	 * @param Admin
	 * @return int
	 * @throws Exception
	 */
	public int saveAdmin(Admin admin) throws Exception;
}
