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
	private Dictionary platformId;			//使用平台
	private Dictionary statusId;			//审核状态
	private Dictionary saleId;			//APP状态
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
	public Dictionary getPlatformId() {
		return platformId;
	}
	public void setPlatformId(Dictionary platformId) {
		this.platformId = platformId;
	}
	public Dictionary getStatusId() {
		return statusId;
	}
	public void setStatusId(Dictionary statusId) {
		this.statusId = statusId;
	}
	public Dictionary getSaleId() {
		return saleId;
	}
	public void setSaleId(Dictionary saleId) {
		this.saleId = saleId;
	}
	
	
}
