package com.bean;

public class Goods {
//sid 商品名 商品单价  商品类型 
	//g_id g_name g_price g_type u_id g_shortage
	private Integer g_id;
	private String g_name;
	private Double g_price;
	private String g_type;
	private Integer g_shortage;
	private Integer u_id;
	public Integer getG_id() {
		return g_id;
	}
	public void setG_id(Integer g_id) {
		this.g_id = g_id;
	}
	public String getG_name() {
		return g_name;
	}
	public void setG_name(String g_name) {
		this.g_name = g_name;
	}
	public Double getG_price() {
		return g_price;
	}
	public void setG_price(Double g_price) {
		this.g_price = g_price;
	}
	public String getG_type() {
		return g_type;
	}
	public void setG_type(String g_type) {
		this.g_type = g_type;
	}
	public Integer getG_shortage() {
		return g_shortage;
	}
	public void setG_shortage(Integer g_shortage) {
		this.g_shortage = g_shortage;
	}
	public Integer getU_id() {
		return u_id;
	}
	public void setU_id(Integer u_id) {
		this.u_id = u_id;
	}
	public Goods(Integer g_id, String g_name, Double g_price, String g_type, Integer g_shortage, Integer u_id) {
		super();
		this.g_id = g_id;
		this.g_name = g_name;
		this.g_price = g_price;
		this.g_type = g_type;
		this.g_shortage = g_shortage;
		this.u_id = u_id;
	}
	@Override
	public String toString() {
		return "Goods [g_id=" + g_id + ", g_name=" + g_name + ", g_price=" + g_price + ", g_type=" + g_type
				+ ", g_shortage=" + g_shortage + ", u_id=" + u_id + "]";
	}
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
