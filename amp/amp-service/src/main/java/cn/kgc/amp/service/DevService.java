package cn.kgc.amp.service;

import cn.kgc.amp.beans.entity.Dev;

public interface DevService {
	/**
	 * <b>开发人员登录验证</b>
	 * @param dev
	 * @return Dev
	 * @throws Exception
	 */
	public Dev loginDev(Dev dev) throws Exception;

}
