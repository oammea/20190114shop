package com.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Goods;
import com.bean.GoodsPage;
import com.bean.Orders;
import com.bean.Page;
import com.bean.ShopUser;
import com.service.InterfaceShopService;
import com.service.InterfaceUserService;

@Controller
public class ShopController {
	@Resource(name="usi")
	InterfaceUserService ius;
	@Resource(name="ushop")
	InterfaceShopService iss;

	@RequestMapping(value="upshop.action")
	public ModelAndView top(ShopUser u) {
		ModelAndView mad= new ModelAndView();
		mad.addObject("u", ius.findByName(u));
		mad.setViewName("WEB-INF/jsp/top.jsp");
		return mad;
	}
	@RequestMapping(value="leftshop.action")
	public ModelAndView left(ShopUser u) {
		ModelAndView mad= new ModelAndView();
		mad.addObject("u", ius.findByName(u));
		mad.setViewName("WEB-INF/jsp/left.jsp");
		return mad;
	}
	@RequestMapping(value="mainshop.action")
	public ModelAndView main(ShopUser u) {
		ModelAndView mad= new ModelAndView();
		mad.addObject("u", ius.findByName(u));
		mad.setViewName("WEB-INF/jsp/main.jsp");
		return mad;
	}
	@RequestMapping(value="gobuy.action")
	public ModelAndView gobuy(GoodsPage p) {
		ModelAndView mad= new ModelAndView();
		System.out.println(p.toString());
		Integer u_id=p.getU_id();
		p.setU_id(null);
		p=pg(p);
		System.out.println(p.toString());
		p.setList(iss.findByPage(p));
		p.setU_id(u_id);
		mad.addObject("p", p);
		mad.addObject("u", ius.findById(newuser(p.getU_id())));
		mad.setViewName("WEB-INF/jsp/buy.jsp");
		return mad;
	}
	@RequestMapping(value="gogoods.action")
	public ModelAndView gogoods(GoodsPage p) {
		ModelAndView mad= new ModelAndView();
		System.out.println(p.toString());
		p=pg(p);
		p.setList(iss.findByPage(p));
		mad.addObject("p", p);
		mad.addObject("u", ius.findById(newuser(p.getU_id())));
		mad.setViewName("WEB-INF/jsp/goods.jsp");
		return mad;
	}
	@RequestMapping(value="addgoods.action")
	public ModelAndView addgoods(Goods g) {
		ModelAndView mad= new ModelAndView();
		System.out.println(g.toString());
		Integer integer=iss.addgoods(g);
		System.out.println(integer);
		GoodsPage p=new GoodsPage();
		p.setCurrentPage(1);
		p.setPageSize(8);
		p.setU_id(g.getU_id());
		p=pg(p);
		p.setList(iss.findByPage(p));
		mad.addObject("p", p);
		mad.addObject("u", ius.findById(new ShopUser(g.getU_id(), null, null, null, null, null, null, null)));
		mad.setViewName("WEB-INF/jsp/goods.jsp");
		return mad;                 
	}
	@RequestMapping(value="changeshortage.action")
	public ModelAndView changeshortage(Goods g) {
		ModelAndView mad= new ModelAndView();
		System.out.println(g.toString());
		g=iss.findById(g);
		System.out.println(g);
		GoodsPage p=newpage(g);
		p.setList(iss.findByPage(p));
		mad.addObject("p", p);
		mad.addObject("changeshortage", g.getG_id());
		mad.addObject("u", ius.findById(newuser(g.getU_id())));
		mad.setViewName("WEB-INF/jsp/goods.jsp");
		return mad;
	}
	
	@RequestMapping(value="updategoods.action")
	public ModelAndView updategoods(Goods g) {
		ModelAndView mad= new ModelAndView();
		System.out.println("更改"+g.toString());
		Integer i=iss.update(g);
		System.out.println("更改"+i);
		System.out.println(g);
		GoodsPage p=newpage(g);
		p.setList(iss.findByPage(p));
		mad.addObject("p", p);
		mad.addObject("u", ius.findById(newuser(g.getU_id())));
		mad.setViewName("WEB-INF/jsp/goods.jsp");
		return mad;
	}
	@RequestMapping(value="changegoods.action")
	public ModelAndView changegoods(Goods g) {
		ModelAndView mad= new ModelAndView();
		System.out.println(g.toString());
		g=iss.findById(g);
		System.out.println(g);
		GoodsPage p=newpage(g);
		p.setList(iss.findByPage(p));
		mad.addObject("p", p);
		mad.addObject("changeall", g.getG_id());
		mad.addObject("u", ius.findById(newuser(g.getU_id())));
		mad.setViewName("WEB-INF/jsp/goods.jsp");
		return mad;
	}
	@RequestMapping(value="deletegoods.action")
	public ModelAndView deletegoods(Goods g) {
		ModelAndView mad= new ModelAndView();
		System.out.println(g.toString());
		g=iss.findById(g);
		System.out.println(g);
		GoodsPage p=newpage(g);
		Integer integer=iss.deleteById(g);
		System.out.println(integer);
		p.setList(iss.findByPage(p));
		mad.addObject("p", p);
		mad.addObject("u", ius.findById(newuser(g.getU_id())));
		mad.setViewName("WEB-INF/jsp/goods.jsp");
		return mad;
	}

	@RequestMapping(value="makeorder.action")
	public ModelAndView makeorder(Orders d) {
		ModelAndView mad= new ModelAndView();
		Goods goods=iss.findById(newgoods(d.getG_id()));
		BigDecimal total=total(goods.getG_price(),d.getG_amount());
		d.setD_total(total.doubleValue());
		System.out.println(d.toString());
		List<Map<String, String>> findAddressByU_id = iss.findAddressByU_id(d.getU_id());
		System.out.println(findAddressByU_id);
		mad.addObject("addresslist",findAddressByU_id);
		mad.addObject("u", ius.findById(newuser(d.getU_id())));
		mad.addObject("g", goods);
		mad.addObject("d", d);
		mad.setViewName("WEB-INF/jsp/order.jsp");
		return mad;
	}
	@RequestMapping(value="submitorder.action")
	public ModelAndView submitorder(Orders d) {
		ModelAndView mad= new ModelAndView();
		d.setD_state("未支付");
		d.setD_time(System.currentTimeMillis());
		Integer integer=iss.insertorder(d);
		List orderlist=iss.findOrderById(d.getU_id());
		System.out.println(d.toString());
		mad.addObject("orderlist", orderlist);
		mad.addObject("u", ius.findById(newuser(d.getU_id())));
		mad.setViewName("WEB-INF/jsp/gopay.jsp");
		return mad;
	}
	@RequestMapping(value="gopay.action")
	public ModelAndView gopay(Orders d) {
		ModelAndView mad= new ModelAndView();
		List orderlist=iss.findOrderById(d.getU_id());
		System.out.println(orderlist.toString());
		mad.addObject("orderlist", orderlist);
		mad.addObject("u", ius.findById(newuser(d.getU_id())));
		mad.setViewName("WEB-INF/jsp/gopay.jsp");
		return mad;
	}
	@RequestMapping(value="goself.action")
	public ModelAndView goself(ShopUser u) {
		ModelAndView mad= new ModelAndView();
		List<Map<String,String>> addresslist = iss.findAddressByU_id(u.getU_id());
		System.out.println(addresslist);
		mad.addObject("u", ius.findById(u));
		mad.addObject("addresslist", addresslist);
		mad.setViewName("WEB-INF/jsp/self.jsp");
		return mad;
	}
	@RequestMapping(value="goshop.action")
	public ModelAndView gologin(ShopUser u) {
		ModelAndView mad= new ModelAndView();
		mad.addObject("u", ius.findById(u));
		mad.setViewName("WEB-INF/jsp/shop.jsp");
		return mad;
	}
	@RequestMapping(value="buyitem.action")
	public ModelAndView buyitem(Orders d) {
		ModelAndView mad= new ModelAndView();
		System.out.println(d.toString());
		mad.addObject("u", ius.findById(newuser(d.getU_id())));
		mad.addObject("g", iss.findById(newgoods(d.getG_id())));
		mad.setViewName("WEB-INF/jsp/makeorder.jsp");
		return mad;
	}
	@RequestMapping(value="insertaddress.action")
	public ModelAndView insertaddress(String address_name,Orders d) {
		ModelAndView mad= new ModelAndView();
		System.out.println(d.toString());
		Map<Object, Object> map=new HashMap<Object,Object>();
		map.put("u_id", d.getU_id());
		map.put("address_name", address_name);
		Integer integer=iss.insertaddress(map);
		System.out.println(integer);
		mad.addObject("u", ius.findById(newuser(d.getU_id())));
		mad.addObject("d", d);
		List addresslist=iss.findAddressByU_id(d.getU_id());
		mad.addObject("addresslist",addresslist);
		if(d.getG_id()!=null) {
			Goods goods=iss.findById(newgoods(d.getG_id()));
			mad.addObject("g", goods);
			mad.setViewName("WEB-INF/jsp/order.jsp");
		}else {
			mad.setViewName("WEB-INF/jsp/self.jsp");
		}
		return mad;
	}
	@RequestMapping(value="payed.action")
	public ModelAndView payed(Orders d) {
		ModelAndView mad= new ModelAndView();
		d=iss.findOrderByD_id(d);
		d.setD_state("已支付");
		d.setD_time(System.currentTimeMillis());
		System.out.println(d.toString());
		Integer integer=iss.updateorder(d);
		List orderlist=iss.findOrderById(d.getU_id());

		mad.addObject("orderlist", orderlist);
		mad.addObject("u", ius.findById(newuser(d.getU_id())));
		mad.setViewName("WEB-INF/jsp/gopay.jsp");
		return mad;
	}
	
	private BigDecimal total(Double g_price, Integer g_amount) {
		// TODO Auto-generated method stub
		BigDecimal price=new BigDecimal(g_price);
		BigDecimal amount=new BigDecimal(g_amount);
		return price.multiply(amount);
	}
	private Goods newgoods(Integer g_id) {
		// TODO Auto-generated method stub
		Goods goods = new Goods();
		goods.setG_id(g_id);
		return goods;
	}
	private GoodsPage newpage(Goods g) {
		// TODO Auto-generated method stub
		GoodsPage p = new GoodsPage();
		p.setCurrentPage(1);
		p.setPageSize(8);
		p.setU_id(g.getU_id());
		p=pg(p);
		return p;
	}
	private ShopUser newuser(Integer u_id) {
		// TODO Auto-generated method stub
		ShopUser user=new ShopUser();
		user.setU_id(u_id);
		return user;
	}
	private GoodsPage pg(GoodsPage p) {
		// TODO Auto-generated method stub
		int ps=p.getPageSize();
		int cp=p.getCurrentPage();
		int all=iss.findSize(p);
		int maxpage=0;
		int begin=0;
		int end=0;
		if(all%ps==0) {
			maxpage=all/ps;
		}else {
			maxpage=all/ps+1;
		}
		if(cp>maxpage) {
			cp=maxpage;
		}
		if(cp<1) {
			cp=1;
		}
		begin=(cp-1)*ps+1;
		if(all-begin>=ps) {
			end=cp*ps;
		}else {
			end=all;
		}
		System.out.println("start="+begin);
		System.out.println("end="+end);
		p.setCurrentPage(cp);
		p.setAllPage(maxpage);
		p.setBegin(begin);
		p.setEnd(end);
		return p;
	}
}
