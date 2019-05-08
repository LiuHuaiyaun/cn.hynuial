package cn.kgc.amp.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.kgc.amp.beans.entity.Dev;
import cn.kgc.amp.dao.DevDao;
import cn.kgc.amp.service.DevService;

@Service("devService")
@Transactional
public class DevServiceImpl implements DevService {
	
	@Resource(name="devDao")
	private DevDao devDao;

	/**
	 * <b>开发人员登录验证</b>
	 * @param dev
	 * @return Dev
	 * @throws Exception
	 */
	public Dev loginDev(Dev dev) throws Exception {
		dev = devDao.findDevsByQuery(dev);
		return dev;
	}

}
