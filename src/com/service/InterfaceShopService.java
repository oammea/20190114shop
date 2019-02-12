package com.service;

import java.util.List;
import java.util.Map;

import com.bean.Goods;
import com.bean.GoodsPage;
import com.bean.Orders;

public interface InterfaceShopService {

	public Integer addgoods(Goods g);

	public Integer findSize(GoodsPage p);

	public List findByPage(GoodsPage p);

	public Goods findById(Goods g);

	public Integer update(Goods g);

	public Integer deleteById(Goods g);

	public Integer insertaddress(Map<Object, Object> map);

	public List<Map<String,String>> findAddressByU_id(Integer u_id);

	public Integer insertorder(Orders d);

	public List findOrderById(Integer u_id);

	public Integer updateorder(Orders d);

	public Orders findOrderByD_id(Orders d);

}
