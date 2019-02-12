package com.bean;

import java.util.List;

public class GoodsPage{
	private Integer currentPage;
	private Integer pageSize;
	private Integer allPage;
	private Integer begin;
	private Integer end;
	private Integer u_id;
	private String g_name;
	private String g_type;
	public String getG_name() {
		return g_name;
	}
	public void setG_name(String g_name) {
		this.g_name = g_name;
	}
	public String getG_type() {
		return g_type;
	}
	public void setG_type(String g_type) {
		this.g_type = g_type;
	}
	private List<Goods> list;
	public Integer getCurrentPage() {
		return currentPage;
	}

	@Override
	public String toString() {
		return "GoodsPage [currentPage=" + currentPage + ", pageSize=" + pageSize + ", allPage=" + allPage + ", begin="
				+ begin + ", end=" + end + ", u_id=" + u_id + ", g_name=" + g_name + ", g_type=" + g_type + ", list="
				+ list + "]";
	}
	public GoodsPage(Integer currentPage, Integer pageSize, Integer allPage, Integer begin, Integer end, Integer u_id,
			String g_name, String g_type, List<Goods> list) {
		super();
		this.currentPage = currentPage;
		this.pageSize = pageSize;
		this.allPage = allPage;
		this.begin = begin;
		this.end = end;
		this.u_id = u_id;
		this.g_name = g_name;
		this.g_type = g_type;
		this.list = list;
	}
	public GoodsPage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getAllPage() {
		return allPage;
	}
	public void setAllPage(Integer allPage) {
		this.allPage = allPage;
	}
	public Integer getBegin() {
		return begin;
	}
	public void setBegin(Integer begin) {
		this.begin = begin;
	}
	public Integer getEnd() {
		return end;
	}
	public void setEnd(Integer end) {
		this.end = end;
	}
	public Integer getU_id() {
		return u_id;
	}
	public void setU_id(Integer u_id) {
		this.u_id = u_id;
	}
	public List<Goods> getList() {
		return list;
	}
	public void setList(List<Goods> list) {
		this.list = list;
	}
}
