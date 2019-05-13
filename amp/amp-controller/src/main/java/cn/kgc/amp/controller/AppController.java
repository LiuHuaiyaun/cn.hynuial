package cn.kgc.amp.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cn.kgc.amp.base.controller.BaseController;
import cn.kgc.amp.beans.entity.AppInfo;
import cn.kgc.amp.beans.entity.Dev;
import cn.kgc.amp.beans.vo.Page;
import cn.kgc.amp.service.AppService;
/**
 * <b>APPInFo控制器</b>
 * @author LiuHuaiyaun
 * @version 1.0 
 * @since 2019-05-13
 */
@Controller("appController")
@RequestMapping("/app")
public class AppController extends BaseController{
	@Resource(name = "appService")
	private AppService appService;
	
	/**
	 * <b>通过page信息与Dev对象获取app信息列表 </b>
	 * @param pageNum 当前页面数
	 * @param pageSize 当前页面显示数量
	 * @return ModelAndView
	 * @throws Exception
	 */
	@RequestMapping(value = "appList",method = RequestMethod.GET)
	public ModelAndView getListByPageAndDev(Integer pageNum, Integer pageSize) throws Exception {
		//封装page对象
		Page<AppInfo> page = new Page<AppInfo>(pageNum, pageSize);
		//获取dev对象
		Dev dev = (Dev) session.getAttribute("dev");
		page = appService.getListByPageAndDev(page, dev);
		return new ModelAndView("/app_list_form", "page", page);
		
	}
}
