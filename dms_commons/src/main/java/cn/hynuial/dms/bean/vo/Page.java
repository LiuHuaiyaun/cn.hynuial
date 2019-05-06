package cn.hynuial.dms.bean.vo;

import java.io.Serializable;
import java.util.List;

import cn.hynuial.dms.util.ConstantUtil;

public class Page<E> implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer pageNum;
	private Integer pageSize;
	private List<E> list;
	private Long totalCount;
	private Long totalPage;
	
	public Page() {}
	public Page(Integer pageNum, Integer pageSize) {
		// 分别判断pageNum和pageSize是否可用
		if (pageNum != null && pageNum > 0) {
			this.pageNum = pageNum;
		} else {
			// 当前所给定的pageNum不符合参数要求
			this.pageNum = ConstantUtil.PAGE_NUM;
		}
		
		if (pageSize != null && pageSize > 0) {
			this.pageSize = pageSize;
		} else {
			this.pageSize = ConstantUtil.PAGE_SIZE;
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
	public Long getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}
}
