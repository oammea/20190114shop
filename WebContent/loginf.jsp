<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
<script type="text/javascript" src="jquery.min.js"></script>
<script type="text/javascript">
$(function(){
	var s=${success};
	var id=${u_id};
	var ad=${admin};
	if(ad==true){
		window.open('manage.action?u_id='+id,'_top');
	}else{
	 	if(s==true){
			alert('登录成功:'+id);
			window.open('goshop.action?u_id='+id,'_top');
		}else if(s==false){
			alert('用户名或密码错误');
		} 
	}
})
</script>
</head>
<body>
	<form action="login.action" method="post">
		<table>
			<tr><td>用户名:<td><input type="text" id="u_username" name="u_username" placeholder="请输入用户名6-14位" value="${u.u_username }" >
			<td><span id="name_msg"></span>
<%-- 			<c:if test="${not empty test }">
				<c:choose>
					<c:when test="${test==true }"><font color="red">用户名已存在</font></c:when>
					<c:otherwise><font color="green">用户名可以使用</font></c:otherwise>
				</c:choose>
			</c:if> --%>
			<tr><td>密码:<td><input type="text" name="u_password" placeholder="请输入密码6-14位">
			<tr><td><td><input type="submit" value="登录"><td><a href="goregist.action" target="_self">注册</a>
		</table>
	</form>
</body>
</html>