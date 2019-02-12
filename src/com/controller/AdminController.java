package com.controller;

import java.awt.print.Pageable;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Page;
import com.bean.ShopUser;
import com.service.InterfaceUserService;
import com.sun.javafx.font.PGFont;

@Controller
public class AdminController {
	@Resource(name="usi")
	InterfaceUserService ius;
	@RequestMapping(value="upmanage.action")
	public ModelAndView top(ShopUser u) {
		ModelAndView mad= new ModelAndView();
		System.out.println(u.toString());
		mad.addObject("u_username", u.getU_username());
		mad.setViewName("WEB-INF/admin/top.jsp");
		return mad;
	}
	@RequestMapping(value="leftmanage.action")
	public ModelAndView left(ShopUser u) {
		ModelAndView mad= new ModelAndView();
		System.out.println(u.toString());
		mad.addObject("u_username", u.getU_username());
		mad.setViewName("WEB-INF/admin/left.jsp");
		return mad;
	}
	@RequestMapping(value="mainmanage.action")
	public ModelAndView main(ShopUser u) {
		ModelAndView mad= new ModelAndView();
		System.out.println(u.toString());
		mad.addObject("u_username", u.getU_username());
		mad.setViewName("WEB-INF/admin/main.jsp");
		return mad;
	}
	@RequestMapping(value="userchange.action")
	public ModelAndView change(ShopUser u) {
		ModelAndView mad= new ModelAndView();
		System.out.println(u.toString());
		mad.addObject("u", ius.findById(u));
		mad.setViewName("WEB-INF/admin/main.jsp");
		return mad;
	}
	
	@RequestMapping(value="usermanage.action")
	public ModelAndView usermanage(Page p) {
		ModelAndView mad= new ModelAndView();
		p=pg(p);
		p.setList(ius.findByPage(p));
		mad.addObject("page",p);
		mad.setViewName("WEB-INF/admin/usermanage.jsp");
		return mad;
	}
	private Page pg(Page p) {
		// TODO Auto-generated method stub
		int ps=p.getPageSize();
		int cp=p.getCurrentPage();
		int all=ius.findSize(p);
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
		if(all-begin>ps) {
			end=cp*ps;
		}else {
			end=all;
		}
		p.setCurrentPage(cp);
		p.setAllPage(maxpage);
		p.setBegin(begin);
		p.setEnd(end);
		return p;
	}
	
}
