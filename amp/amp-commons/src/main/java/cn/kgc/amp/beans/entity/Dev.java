package cn.kgc.amp.beans.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * <b>开发人员信息实体类对象</b>
 * @author LiuHuanYuan
 * @since 5/8
 */
public class Dev implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long devId;				//主键
	private String devNo;			//编号
	private String devName;			//姓名
	private String password;		//登录密码
	private String cellphone;		//联系电话
	private String email;			//电子邮箱
	private String devInfo;			//开发人员简介
	private Date createDate;		//创建时间
	private Date updateDate;		//修改时间
	
	
	public Long getDevId() {
		return devId;
	}
	public void setDevId(Long devId) {
		this.devId = devId;
	}
	public String getDevNo() {
		return devNo;
	}
	public void setDevNo(String devNo) {
		this.devNo = devNo;
	}
	public String getDevName() {
		return devName;
	}
	public void setDevName(String devName) {
		this.devName = devName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCellphone() {
		return cellphone;
	}
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDevInfo() {
		return devInfo;
	}
	public void setDevInfo(String devInfo) {
		this.devInfo = devInfo;
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
