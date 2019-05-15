package cn.kgc.amp.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.kgc.amp.beans.entity.AppInfo;
import cn.kgc.amp.beans.entity.Dev;
import cn.kgc.amp.beans.vo.Page;
import cn.kgc.amp.dao.AppDao;
import cn.kgc.amp.service.AppService;

/**
 * <b>APPInFo业务层实现类</b>
 * @author LiuHuaiyaun
 * @version 1.0 
 * @since 2019-05-13
 */
@Service("appService")
@Transactional
public class AppServiceImpl implements AppService{
	@Resource(name = "appDao")
	private AppDao appDao;

	/**
	 * <b>获取app分页信息列表 </b>
	 * @param pageNum 当前页面数
	 * @param pageSize 当前页面显示数量
	 * @return ModelAndView
	 * @throws Exception
	 */
	public Page<AppInfo> getListByPageAndDev(Page<AppInfo> page, Dev dev) throws Exception {
		//查询信息开始下标值
				Integer beginIndex = (page.getPageNum() - 1) * page.getPageSize();
				//分页查询数
				Integer pageSize = page.getPageSize();
				//查询对象id值
				Long devId = dev.getDevId();
				//创建Map集合
				Map<String, Object> map = new HashMap<String, Object>();
				//查询页面显示总数
				map.put("devId", devId);
				page.setTotalPageSize(appDao.findListByPageAndQuery(map).size());
				page.setTotalPageNum((page.getTotalPageSize()%pageSize)==0 ? (page.getTotalPageSize() / page.getPageSize()) : 
									(page.getTotalPageNum() / page.getPageSize() + 1));
				//查询分页列表
				map.put("beginIndex", beginIndex);
				map.put("pageSize", pageSize);
				
				page.setList(appDao.findListByPageAndQuery(map));
				
				return page;
	}

}
