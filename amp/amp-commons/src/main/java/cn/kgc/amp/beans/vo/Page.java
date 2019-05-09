package cn.kgc.amp.beans.vo;

import java.io.Serializable;
import java.util.List;

import cn.kgc.amp.util.CommonsUtil;

/**
 * <b>分页查询对象实体类</b>
 * @author Administrator
 * @since 5/8
 * @param <E>
 */
public class Page<E> implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer pageNum;		//当前页面数
	private Integer pageSize;		//当前页面显示数量
	private List<E> list;			//当前页面显示分页列表
	private Integer totalPageNum;	//页面总页数
	private Integer totalPageSize;	//页面显示总数
	
	public Page() {}
	public Page(Integer pageNum, Integer pageSize) {
		if (pageNum != null && pageNum >0) {
			this.pageNum = pageNum;
		} else {
			this.pageNum = CommonsUtil.PAGE_NUM;
		}
		if (pageSize != null && pageSize >0) {
			this.pageSize = pageNum;
		} else {
			this.pageSize = CommonsUtil.PAGE_SIZE;
		}
	}
	
	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public List<E> getList() {
		return list;
	}
	public void setList(List<E> list) {
		this.list = list;
	}
	public Integer getTotalPageNum() {
		return totalPageNum;
	}
	public void setTotalPageNum(Integer totalPageNum) {
		this.totalPageNum = totalPageNum;
	}
	public Integer getTotalPageSize() {
		return totalPageSize;
	}
	public void setTotalPageSize(Integer totalPageSize) {
		this.totalPageSize = totalPageSize;
	}
	
	
}
