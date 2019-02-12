<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css"> a:link {color: white}a:visited {color: white} </style>
</head>
<body bgcolor="blue">
	<font color="white">返回<a href="mainshop.action?u_username=${u.u_username }" target="mainFrame">首页</a></font>
	<div align="right"><h6><span><font color="white">欢迎  ${requestScope.u.u_username}</font></span>
	<a href="changeself.action?u_username=${u.u_username }" target="mainFrame">管理(待完成)</a>
	<a href="goindex.action" target="_top">注销登录</a>
	</h6></div>
</body>
</html>