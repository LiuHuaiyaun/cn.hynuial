package cn.kgc.amp.beans.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * <b>角色信息实体类</b>
 * <p> id=1为管理员</p>
 * <p> id=2为审核员</p>
 * @author LiuHuanYuan
 * @since 5/8
 */
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long roleId;
	private String roleName;
	private Date createDate;
	private Date updatedDate;
	
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	
}
