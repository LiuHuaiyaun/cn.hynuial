package cn.kgc.amp.service;

import cn.kgc.amp.beans.entity.Dev;
/**
 * <b>开发者平台业务层接口</b>
 * @author LiuHuaiyaun
 * @version 1.0 
 * @since 2019-05-09
 */
public interface DevService {
	/**
	 * <b>开发人员登录信息验证</b>
	 * @param dev
	 * @return Dev
	 * @throws Exception
	 */
	public Dev loginDev(Dev dev) throws Exception;
	
	/**
	 * *<b>开发人员注册信息验证</b>
	 * @param dev
	 * @return int
	 * @throws Exception
	 */
	public int saveDev(Dev dev) throws Exception;

}
