package cn.kgc.amp.beans.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * <b>字典信息实体类对象</b>
 * @author LiuHuanYuan
 * @since 5/8
 */
public class Dictionary implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long dictionaryId;				//主键
	private Dictionary parentId;			//上级字典
	private String dictionaryName;			//字典名称
	private Admin createAdmin;				//创建人
	private Date createDate;				//创建时间
	private Admin updateAdmin;				//修改人
	private Date updatedDate;				//修改时间
	
	
	public Long getDictionaryId() {
		return dictionaryId;
	}
	public void setDictionaryId(Long dictionaryId) {
		this.dictionaryId = dictionaryId;
	}
	public Dictionary getParentId() {
		return parentId;
	}
	public void setParentId(Dictionary parentId) {
		this.parentId = parentId;
	}
	public String getDictionaryName() {
		return dictionaryName;
	}
	public void setDictionaryName(String dictionaryName) {
		this.dictionaryName = dictionaryName;
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
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	
}
