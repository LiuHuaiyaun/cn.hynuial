package cn.kgc.amp.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.kgc.amp.beans.entity.Dev;
import cn.kgc.amp.beans.vo.Page;

/**
 * <b>开发者平台业务层实体类</b>
 * @author LiuHuaiyaun
 * @version 1.0 
 * @since 2019-05-09
 */
@Repository("devDao")
public interface DevDao {
	public Integer save(Dev dev) throws Exception;
	public Integer update(Dev dev) throws Exception;
	public Integer delete(Dev dev) throws Exception;
	public Dev findDevsByQuery(Dev dev) throws Exception;
	public List<Dev> findDevByPage(Page<Dev> page) throws Exception;
	
}
