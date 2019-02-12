package com.service;

import java.util.List;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Goods;
import com.bean.GoodsPage;
import com.bean.Orders;
import com.bean.Page;
import com.dao.InterfaceShopDao;

@Transactional(isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED,readOnly=false)
public class ShopServiceImp implements InterfaceShopService{

	@Override
	@Transactional(isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED,readOnly=true)
	public Integer addgoods(Goods g) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		InterfaceShopDao isd = ac.getBean(InterfaceShopDao.class);
		ac.close();
		return isd.addgoods(g);
	}

	@Override
	public List findByPage(GoodsPage p) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		InterfaceShopDao isd = ac.getBean(InterfaceShopDao.class);
		ac.close();
		return isd.findByPage(p);
	}

	@Override
	public Integer findSize(GoodsPage p) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		InterfaceShopDao isd = ac.getBean(InterfaceShopDao.class);
		ac.close();
		return isd.findSize(p);
	}

	@Override
	public Goods findById(Goods g) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		InterfaceShopDao isd = ac.getBean(InterfaceShopDao.class);
		ac.close();
		return isd.findById(g);
	}

	@Override
	public Integer update(Goods g) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		InterfaceShopDao isd = ac.getBean(InterfaceShopDao.class);
		ac.close();
		return isd.update(g);
	}

	@Override
	public Integer deleteById(Goods g) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		InterfaceShopDao isd = ac.getBean(InterfaceShopDao.class);
		ac.close();
		return isd.deleteById(g);
	}

	@Override
	public Integer insertaddress(Map<Object, Object> map) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		InterfaceShopDao isd = ac.getBean(InterfaceShopDao.class);
		ac.close();
		return isd.insertaddress(map);
	}

	@Override
	public List<Map<String,String>> findAddressByU_id(Integer u_id) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		InterfaceShopDao isd = ac.getBean(InterfaceShopDao.class);
		ac.close();
		return isd.findAddressByU_id(u_id);
	}

	@Override
	public Integer insertorder(Orders d) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		InterfaceShopDao isd = ac.getBean(InterfaceShopDao.class);
		ac.close();
		return isd.insertorder(d);
	}

	@Override
	public List findOrderById(Integer u_id) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		InterfaceShopDao isd = ac.getBean(InterfaceShopDao.class);
		ac.close();
		return isd.findOrderById(u_id);
	}

	@Override
	public Integer updateorder(Orders d) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		InterfaceShopDao isd = ac.getBean(InterfaceShopDao.class);
		ac.close();
		return isd.updateorder(d);
	}

	@Override
	public Orders findOrderByD_id(Orders d) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		InterfaceShopDao isd = ac.getBean(InterfaceShopDao.class);
		ac.close();
		return isd.findOrderByD_id(d);
	}

}
