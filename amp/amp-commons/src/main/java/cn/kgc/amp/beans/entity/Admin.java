package cn.kgc.amp.beans.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * <b>管理员信息实体类对象</b>
 * @author LiuHuanYuan
 * @since 5/8
 */
public class Admin implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long adminId;			//后台管理主键
	private String adminNo;			//管理人员编号
	private String adminName;		//管理人员姓名
	private String password;		//登录密码
	private Role role;				//角色id
	private Admin createAdmin;		//添加人
	private Date createDate;		//创建时间
	private Admin updateAdmin;		//修改人
	private Date updateDate;		//修改时间
	
	
	public Long getAdminId() {
		return adminId;
	}
	public void setAdminId(Long adminId) {
		this.adminId = adminId;
	}
	public String getAdminNo() {
		return adminNo;
	}
	public void setAdminNo(String adminNo) {
		this.adminNo = adminNo;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Admin getCreateAdmin() {
		return createAdmin;
	}
	public void setCreateAdmin(Admin createAdmin) {
		this.createAdmin = createAdmin;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Admin getUpdateAdmin() {
		return updateAdmin;
	}
	public void setUpdateAdmin(Admin updateAdmin) {
		this.updateAdmin = updateAdmin;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
}
