package cn.kgc.amp.beans.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * <b>类别信息实体类对象</b>
 * @author LiuHuanYuan
 * @since 5/8
 */
public class Category implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long categoryId;			//主键
	private String categoryCode;		//编号
	private String categoryName;		//类别名称
	private Admin createAdmin;			//创建人
	private Date createDate;			//创建时间
	private Admin updateAdmin;			//修改人
	private Date updateDate;			//修改时间
	
	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
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
