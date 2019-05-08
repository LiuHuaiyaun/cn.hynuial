package cn.kgc.amp.beans.entity;

import java.util.Date;

/**
 * <b>APP版本信息实体类对象</b>
 * @author LiuHuanYuan
 * @since 5/8
 */
public class Version {
	
	private Long versionId;				//主键
	private AppInfo appInfo;			//软件信息
	private String apkName;				//开发包名称
	private String supportRom;			//硬件支持
	private String softwareSize;		//软件大小
	private String downloadlink;		//下载地址
	private int statusId;				//审核状态
	private int saleId;					//app状态
	private Admin checker;				//审核人
	private Date createDate;			//创建时间
	private Date updateDate;			//修改时间
	
	public Long getVersionId() {
		return versionId;
	}
	public void setVersionId(Long versionId) {
		this.versionId = versionId;
	}
	public AppInfo getAppInfo() {
		return appInfo;
	}
	public void setAppInfo(AppInfo appInfo) {
		this.appInfo = appInfo;
	}
	public String getApkName() {
		return apkName;
	}
	public void setApkName(String apkName) {
		this.apkName = apkName;
	}
	public String getSupportRom() {
		return supportRom;
	}
	public void setSupportRom(String supportRom) {
		this.supportRom = supportRom;
	}
	public String getSoftwareSize() {
		return softwareSize;
	}
	public void setSoftwareSize(String softwareSize) {
		this.softwareSize = softwareSize;
	}
	public String getDownloadlink() {
		return downloadlink;
	}
	public void setDownloadlink(String downloadlink) {
		this.downloadlink = downloadlink;
	}
	public int getStatusId() {
		return statusId;
	}
	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}
	public int getSaleId() {
		return saleId;
	}
	public void setSaleId(int saleId) {
		this.saleId = saleId;
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
