package com.service;

import java.util.List;

import com.bean.Goods;
import com.bean.Page;
import com.bean.ShopUser;

public interface InterfaceUserService {
	public ShopUser findById(ShopUser u);
	public Integer insert(ShopUser u);
	public ShopUser findByName(ShopUser u);
	public ShopUser selectUserByName(String u_username);
	public ShopUser login(ShopUser u);
	public Integer findAdmin(ShopUser u);
	public Integer findSize(Page p);
	public List findByPage(Page p);
}
