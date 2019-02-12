package com.service;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Page;
import com.bean.ShopUser;
import com.dao.InterfaceUserDao;

@Transactional(isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED,readOnly=false)
public class UserServiceImp implements InterfaceUserService {

	public ShopUser findById(ShopUser u) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		InterfaceUserDao iud = ac.getBean(InterfaceUserDao.class);
		ac.close();
		return iud.findById(u);
	}
	@Override
	@Transactional(isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED,readOnly=true)
	public Integer insert(ShopUser u) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		InterfaceUserDao iud = ac.getBean(InterfaceUserDao.class);
		ac.close();
		return iud.insert(u);
	}
	@Override
	@Transactional(isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED,readOnly=true)
	public ShopUser findByName(ShopUser u) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		InterfaceUserDao iud = ac.getBean(InterfaceUserDao.class);
		ac.close();
		return iud.findByName(u);
	}
	@Override
	@Transactional(isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED,readOnly=true)
	public ShopUser login(ShopUser u) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		InterfaceUserDao iud = ac.getBean(InterfaceUserDao.class);
		ac.close();
		ShopUser findByName = iud.findByName(u);
		if(findByName!=null) {
			if(findByName.getU_password().equals(u.getU_password())) {
				return findByName;
			}
		}
		return null;
	}
	@Override
	@Transactional(isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED,readOnly=true)
	public Integer findAdmin(ShopUser u) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		InterfaceUserDao iud = ac.getBean(InterfaceUserDao.class);
		ac.close();
		return iud.findAdmin(u);
	}
	@Override
	@Transactional(isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED,readOnly=true)
	public Integer findSize(Page p) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		InterfaceUserDao iud = ac.getBean(InterfaceUserDao.class);
		ac.close();
		return iud.findSize(p);
	}
	@Override
	public List findByPage(Page p) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		InterfaceUserDao iud = ac.getBean(InterfaceUserDao.class);
		ac.close();
		return iud.findByPage(p);
	}
	@Override
	public ShopUser selectUserByName(String u_username) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		InterfaceUserDao iud = ac.getBean(InterfaceUserDao.class);
		ac.close();
		return iud.selectUserByName(u_username);
	}
}                

