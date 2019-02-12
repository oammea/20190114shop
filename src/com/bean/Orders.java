package com.bean;

public class Orders {
	//did 商品id 商品数量  用户id
	//d_id g_id g_amount u_id d_time d_total d_address d_state
	private Integer d_id;
	private Integer g_id;
	private Integer g_amount;
	private Integer u_id;
	private Long d_time;
	private Double d_total;
	private String d_address;
	private String d_state;
	public Integer getD_id() {
		return d_id;
	}
	public void setD_id(Integer d_id) {
		this.d_id = d_id;
	}
	public Integer getG_id() {
		return g_id;
	}
	public void setG_id(Integer g_id) {
		this.g_id = g_id;
	}
	public Integer getG_amount() {
		return g_amount;
	}
	public void setG_amount(Integer g_amount) {
		this.g_amount = g_amount;
	}
	public Integer getU_id() {
		return u_id;
	}
	public void setU_id(Integer u_id) {
		this.u_id = u_id;
	}
	public Long getD_time() {
		return d_time;
	}
	public void setD_time(Long d_time) {
		this.d_time = d_time;
	}
	public Double getD_total() {
		return d_total;
	}
	public void setD_total(Double d_total) {
		this.d_total = d_total;
	}
	public String getD_address() {
		return d_address;
	}
	public void setD_address(String d_address) {
		this.d_address = d_address;
	}
	public String getD_state() {
		return d_state;
	}
	public void setD_state(String d_state) {
		this.d_state = d_state;
	}
	@Override
	public String toString() {
		return "Orders [d_id=" + d_id + ", g_id=" + g_id + ", g_amount=" + g_amount + ", u_id=" + u_id + ", d_time="
				+ d_time + ", d_total=" + d_total + ", d_address=" + d_address + ", d_state=" + d_state + "]";
	}
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Orders(Integer d_id, Integer g_id, Integer g_amount, Integer u_id, Long d_time, Double d_total,
			String d_address, String d_state) {
		super();
		this.d_id = d_id;
		this.g_id = g_id;
		this.g_amount = g_amount;
		this.u_id = u_id;
		this.d_time = d_time;
		this.d_total = d_total;
		this.d_address = d_address;
		this.d_state = d_state;
	}

	
	
}
