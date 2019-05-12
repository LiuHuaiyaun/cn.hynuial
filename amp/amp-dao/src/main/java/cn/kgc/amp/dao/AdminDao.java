package cn.kgc.amp.dao;

import org.springframework.stereotype.Repository;

import cn.kgc.amp.beans.entity.Admin;
/**
 * <b>后台管理者平台业务层实体类</b>
 * @author LiuHuaiyaun
 * @version 1.0 
 * @since 2019-05-11
 */
@Repository("adminDao")
public interface AdminDao {

	public int save(Admin admin)throws Exception;
	public Admin findDevsByQuery(Admin admin) throws Exception;


}
