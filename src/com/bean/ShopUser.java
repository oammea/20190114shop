package com.bean;

import java.util.List;

public class ShopUser {
	//uid 用户名  密码 性别 手机号 证件类型 证件号码  收货地址   钱属性
	//u_id u_username u_password u_sex u_phone u_cardType u_address u_wallet
	private Integer u_id;
	private String u_username;
	private String u_password;
	private String u_sex;
	private String u_phone;
	private String u_cardType;
	private String u_address;
	private Double u_wallet;
	
	private List<Orders> list;
	
	public List<Orders> getList() {
		return list;
	}
	public void setList(List<Orders> list) {
		this.list = list;
	}
	public Integer getU_id() {
		return u_id;
	}
	public void setU_id(Integer u_id) {
		this.u_id = u_id;
	}
	public String getU_username() {
		return u_username;
	}
	public void setU_username(String u_username) {
		this.u_username = u_username;
	}
	public String getU_password() {
		return u_password;
	}
	public void setU_password(String u_password) {
		this.u_password = u_password;
	}
	public String getU_sex() {
		return u_sex;
	}
	public void setU_sex(String u_sex) {
		this.u_sex = u_sex;
	}
	public String getU_phone() {
		return u_phone;
	}
	public void setU_phone(String u_phone) {
		this.u_phone = u_phone;
	}
	public String getU_cardType() {
		return u_cardType;
	}
	public void setU_cardType(String u_cardType) {
		this.u_cardType = u_cardType;
	}
	public String getU_address() {
		return u_address;
	}
	public void setU_address(String u_address) {
		this.u_address = u_address;
	}
	public Double getU_wallet() {
		return u_wallet;
	}
	public void setU_wallet(Double u_wallet) {
		this.u_wallet = u_wallet;
	}
	@Override
	public String toString() {
		return "ShopUser [u_id=" + u_id + ", u_username=" + u_username + ", u_password=" + u_password + ", u_sex="
				+ u_sex + ", u_phone=" + u_phone + ", u_cardType=" + u_cardType + ", u_address=" + u_address
				+ ", u_wallet=" + u_wallet + ", list=" + list + "]";
	}
	public String show() {
		return "ShopUser [u_id=" + u_id + ", u_username=" + u_username + ", u_password=" + u_password + ", u_sex="
				+ u_sex + ", u_phone=" + u_phone + ", u_cardType=" + u_cardType + ", u_address=" + u_address
				+ ", u_wallet=" + u_wallet +"]";
	}
	public ShopUser(Integer u_id, String u_username, String u_password, String u_sex, String u_phone, String u_cardType,
			String u_address, Double u_wallet) {
		super();
		this.u_id = u_id;
		this.u_username = u_username;
		this.u_password = u_password;
		this.u_sex = u_sex;
		this.u_phone = u_phone;
		this.u_cardType = u_cardType;
		this.u_address = u_address;
		this.u_wallet = u_wallet;
	}
	public ShopUser() {
		super();
		// TODO Auto-generated constructor stub
	}

}
