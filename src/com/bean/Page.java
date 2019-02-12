package com.bean;

import java.util.List;

public class Page<T> {
	private Integer currentPage;
	private Integer pageSize;
	private Integer allPage;
	private Integer begin;
	private Integer end;
	private ShopUser user=new ShopUser();
	private Goods goods;
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
	
	private List<T> list;
	public Page() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Page [currentPage=" + currentPage + ", pageSize=" + pageSize + ", allPage=" + allPage + ", user=" + user
				+ ", goods=" + goods + ", list=" + list + "]";
	}
	public Page(Integer currentPage, Integer pageSize, Integer allPage, ShopUser user, Goods goods, List<T> list) {
		super();
		this.currentPage = currentPage;
		this.pageSize = pageSize;
		this.allPage = allPage;
		this.user = user;
		this.goods = goods;
		this.list = list;
		
	}

	public Integer getCurrentPage() {
		return currentPage;
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
	
	public ShopUser getUser() {
		return user;
	}
	public void setUser(ShopUser user) {
		this.user = user;
	}
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	public Integer getU_id() {
		return user.getU_id();
	}
	public void setU_id(Integer u_id) {
		user.setU_id(u_id);
	}
	public String getU_username() {
		return user.getU_username();
	}
	public void setU_username(String u_username) {
		user.setU_username(u_username);
	}
	public String getU_password() {
		return user.getU_password();
	}
	public void setU_password(String u_password) {
		user.setU_password(u_password);
	}
	public String getU_sex() {
		return user.getU_sex();
	}
	public void setU_sex(String u_sex) {
		user.setU_sex(u_sex);
	}
	public String getU_phone() {
		return user.getU_phone();
	}
	public void setU_phone(String u_phone) {
		user.setU_phone(u_phone);
	}
	public String getU_cardType() {
		return user.getU_cardType();
	}
	public void setU_cardType(String u_cardType) {
		user.setU_cardType(u_cardType);
	}
	public String getU_address() {
		return user.getU_address();
	}
	public void setU_address(String u_address) {
		user.setU_address(u_address);
	}
	public Double getU_wallet() {
		return user.getU_wallet();
	}
	public void setU_wallet(Double u_wallet) {
		user.setU_wallet(u_wallet);
	}
}
