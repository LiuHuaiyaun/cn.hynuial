package cn.kgc.amp.beans.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * <b>APP信息实体类对象</b>
 * @author LiuHuanYuan
 * @since 5/8
 */
public class AppInfo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long appId;				//主键
	private String appName;			//名称
	private Dev dev;				//开发人
	private Category category;		//类别
	private String appInfo;			//简介
	private int flatformId;			//使用平台
	private int statusId;			//审核状态
	private int sale_id;			//APP状态
	private Admin checker;			//审核人
	private Date createDate;		//创建时间
	private Date updateDate;		//修改时间
	
	public Long getAppId() {
		return appId;
	}
	public void setAppId(Long appId) {
		this.appId = appId;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public Dev getDev() {
		return dev;
	}
	public void setDev(Dev dev) {
		this.dev = dev;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getAppInfo() {
		return appInfo;
	}
	public void setAppInfo(String appInfo) {
		this.appInfo = appInfo;
	}
	public int getFlatformId() {
		return flatformId;
	}
	public void setFlatformId(int flatformId) {
		this.flatformId = flatformId;
	}
	public int getStatusId() {
		return statusId;
	}
	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}
	public int getSale_id() {
		return sale_id;
	}
	public void setSale_id(int sale_id) {
		this.sale_id = sale_id;
	}
	public Admin getChecker() {
		return checker;
	}
	public void setChecker(Admin checker) {
		this.checker = checker;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
	
}
