package com.test;

import java.math.BigDecimal;

import javax.annotation.Resource;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bean.Page;
import com.bean.ShopUser;
import com.service.InterfaceUserService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Test{

	@Resource(name="usi")
	private InterfaceUserService ius;
	@org.junit.Test
	public void fun() {
		// TODO Auto-generated method stub
//		System.out.println(its.testid().toString());'
		BigDecimal price=new BigDecimal(10.78);
		BigDecimal amount=new BigDecimal(5);
		price=price.multiply(amount);
		System.out.println(price.doubleValue());
	}
//	@org.junit.Test
//	public void fun2() {
//		// TODO Auto-generated method stub
//		System.out.println(ius.findById(new ShopUser(10000, null, null, null, null, null, null, null)).toString());
//	}
//	@org.junit.Test
//	public void insert() {
//		// TODO Auto-generated method stub
//		
//		ShopUser u=new ShopUser(null, "emadmin", "emadmin", "ÄÐ", "1234567", "Éí·ÝÖ¤", "ÉòÑô", 100.00);
//		System.out.println(ius.insert(u));
//	}
//	@org.junit.Test
//	public void fun3() {
//		// TODO Auto-generated method stub
//		int ps=5;
//		int cp=3;
//		int all=13;
//		int maxpage=0;
//		int begin=0;
//		int end=0;
//		if(all%ps==0) {
//			maxpage=all/ps;
//		}else {
//			maxpage=all/ps+1;
//		}
//		if(cp>maxpage) {
//			cp=maxpage;
//		}
//		if(cp<1) {
//			cp=1;
//		}
//		begin=(cp-1)*ps+1;
//		if(all-begin>ps) {
//			end=cp*ps;
//		}else {
//			end=all;
//		}
//		System.out.println(begin);
//		System.out.println(end);
//	}
//	@org.junit.Test
//	public void fun4() {
//		// TODO Auto-generated method stub
////		System.out.println(its.testid().toString());
//		ShopUser user=new ShopUser(null, "a", null, null, null, null, null, null);
//		Page<ShopUser> p = new Page<ShopUser>(1, 5, 1, user, null, null);
//		System.out.println(ius.findSize(p).toString());
//		p.setBegin(1);
//		p.setEnd(5);
//		System.out.println(ius.findByPage(p).toString());
//	}
}
