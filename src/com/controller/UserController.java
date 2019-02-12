package com.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.bean.ShopUser;
import com.service.InterfaceUserService;

import net.sf.json.JSONObject;
@Controller
public class UserController {
	@Resource(name="usi")
	InterfaceUserService ius;
	@RequestMapping(value="gologin.action")
	public ModelAndView gologin() {
		ModelAndView mad= new ModelAndView();
		mad.setViewName("login.jsp");
		return mad;
	}

	
	@RequestMapping(value="goindex.action")
	public ModelAndView goindex() {
		ModelAndView mad= new ModelAndView();
		mad.setViewName("index.jsp");
		return mad;
	}
	@RequestMapping(value="testname.action")
	public ModelAndView findByName(ShopUser u) {
		ModelAndView mad= new ModelAndView();
		ShopUser res=ius.findByName(u);
		if(res!=null) {
			mad.addObject("test", false);
		}else {
			mad.addObject("test", true);
		}
		mad.addObject("u", u);
		mad.setViewName("regist.jsp");
		return mad;
	}
	@RequestMapping(value="sublogin.action")
	public ModelAndView sublogin() {
		ModelAndView mad= new ModelAndView();
		mad.setViewName("loginf.jsp");
		return mad;  
	}
	@RequestMapping(value="uplogin.action")
	public ModelAndView uplogin() {
		ModelAndView mad= new ModelAndView();
		mad.setViewName("loginup.jsp");
		return mad;  
	}
	@RequestMapping(value="login.action")
	public ModelAndView login(ShopUser u) {
		ModelAndView mad= new ModelAndView();
		if(!u.getU_username().equals("")) {
			System.out.println(u.toString());
			ShopUser shopUser=ius.login(u);
			if(shopUser!=null) {
				mad.addObject("success", true);
				Integer result=ius.findAdmin(shopUser);
				System.out.println(result);
				if(result!=null) {
					mad.addObject("admin", true);
				}else {
					mad.addObject("admin", false);
				}
				mad.addObject("u_id", shopUser.getU_id());
				mad.addObject("u", shopUser);
			}else {
				mad.addObject("success", false);
				mad.addObject("admin", false);
				mad.addObject("u", u);
			}
		}
		mad.setViewName("loginf.jsp");
		return mad;  
	}

	@RequestMapping(value="goregist.action")
	public ModelAndView goregist() {
		ModelAndView mad= new ModelAndView();
		mad.setViewName("regist.jsp");
		return mad;  
	}
	@RequestMapping(value="regist.action")
	public ModelAndView regist(ShopUser u) {
		ModelAndView mad= new ModelAndView();
		System.out.println(u.toString());
		Integer integer=ius.insert(u);
		System.out.println(integer);
		mad.addObject("success", true);
		mad.setViewName("regist.jsp");
		return mad;  
	}
	@RequestMapping(value="manage.action")
	public ModelAndView manage(ShopUser u) {
		ModelAndView mad= new ModelAndView();
		System.out.println(u.toString());
		ShopUser admin=ius.findById(u);
		System.out.println(admin);
		mad.addObject("u", admin);
		mad.setViewName("WEB-INF/admin/manage.jsp");
		return mad;  
	}
	@RequestMapping(value="/ajaxname.action")
	public void fun(HttpServletRequest request,HttpServletResponse response) {
		String parameter = request.getParameter("u_username");
		System.out.println("u_username:"+parameter);
		ShopUser selectUserByName = ius.selectUserByName(parameter);
		response.setContentType("application/x-json;charset=utf-8");
		JSONObject jsonObject=new JSONObject();
		if(selectUserByName!=null) {
			jsonObject.put("msg", "用户名已存在");

		}else {
			jsonObject.put("msg", "用户名可以使用");
		}
		try {
			jsonObject.write(response.getWriter());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
