package cn.kgc.amp.dao;

import java.util.Map;

import org.springframework.stereotype.Repository;

import cn.kgc.amp.beans.entity.AppInfo;
import cn.kgc.amp.beans.vo.Page;

/**
 * <b>APPInFo数据持久层接口</b>
 * @author LiuHuaiyaun
 * @version 1.0 
 * @since 2019-05-13
 */
@Repository("appDao")
public interface AppDao {

	public Page<AppInfo> findListByPageAndQuery(Map<String, Object> map)throws Exception;

}
