package com.dao;

import java.util.List;
import java.util.Map;

import com.bean.Page;
import com.bean.ShopUser;

public interface InterfaceUserDao {
	public ShopUser findById(ShopUser u);
	public Integer insert(ShopUser u);
	public ShopUser findByName(ShopUser u);
	public ShopUser selectUserByName(String u_username);
	public Integer findAdmin(ShopUser u);
	public Integer findSize(Page p);
	public List<Map<String,String>> findByPage(Page p);
}
