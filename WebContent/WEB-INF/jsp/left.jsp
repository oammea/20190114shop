<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>菜单</title>
</head>
<body>
	<ol>
		<li><a href="goself.action?u_id=${u.u_id }" target="mainFrame">个人地址
		<li><a href="gobuy.action?currentPage=1&pageSize=10&u_id=${u.u_id }" target="mainFrame">购物界面
		<li><a href="gopay.action?u_id=${u.u_id }" target="mainFrame">我的订单
		<li><a href="gogoods.action?currentPage=1&pageSize=8&u_id=${u.u_id }" target="mainFrame">上架商品
		
	</ol>
</body>
</html>