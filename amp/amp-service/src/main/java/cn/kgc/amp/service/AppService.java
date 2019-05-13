package cn.kgc.amp.service;

import cn.kgc.amp.beans.entity.AppInfo;
import cn.kgc.amp.beans.entity.Dev;
import cn.kgc.amp.beans.vo.Page;

/**
 * <b>APPInFo业务层接口</b>
 * @author LiuHuaiyaun
 * @version 1.0 
 * @since 2019-05-13
 */
public interface AppService {

	/**
	 * <b>获取app分页信息列表 </b>
	 * @param pageNum 当前页面数
	 * @param pageSize 当前页面显示数量
	 * @return ModelAndView
	 * @throws Exception
	 */
	public Page<AppInfo> getListByPageAndDev(Page<AppInfo> page, Dev dev)throws Exception;

}
