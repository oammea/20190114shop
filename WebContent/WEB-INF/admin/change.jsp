<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
<script type="text/javascript" src="jquery.min.js"></script>
<script type="text/javascript">
if(${success}){
	alert('注册成功去登录');
	window.open('gologin.action','_top');
}

</script>
<script type="text/javascript">
	$(function(){
		var t=${test}; 
		if(t==false){
			$("#name_msg").html('<font color="red">用户名已存在</font>');
		}else{
			$("#name_msg").html('<font color="green">用户名可以使用</font>');
		}	
	})
</script>
</head>
<body>
<!-- u_id u_username u_password u_sex u_phone u_cardType u_address u_wallet -->
	<form action="regist.action" method="post">
		<table>
		<tr><td>注册名称:<td><input type="text" value="${u.u_username}" placeholder="请输入6-15位用户名" id="u_username" 
		name="u_username" onblur="self.location='testname.action?u_username='+$(this).val()+'&u_password='+$('#u_password').val()+'&u_sex='+$('#u_sex').val()+'&u_phone='+$('#u_phone').val()+'&u_cardType='+$('#u_cardType').val()+'&u_address='+$('#u_address').val()+'&u_wallet='+$('#u_wallet').val()">
			<span id="name_msg">
		<tr><td>密码:<td><input type="text" value="${u.u_password}" placeholder="请输入6-15密码" id="u_password" name="u_password">
		<tr><td>确认密码:<td><input type="text" placeholder="请重复输入密码" id="u_password2" >
		<tr><td>性别:<td><input type="radio" id="u_sex" name="u_sex" value="男" checked="checked">
						<label >男</label>
						<input type="radio" id="u_sex" name="u_sex" value="女">
						<label >女</label>
		<tr><td>电话号码:<td><input type="text" value="${u.u_phone}" placeholder="请输入手机号码" id="u_phone" name="u_phone">
		<tr><td>身份类型:<td><select id="u_cardType" name="u_cardType">
								<option value="普通身份证">普通身份证
								<option value="港澳台身份证">港澳台身份证
								<option value="军队残疾证">军队残疾证
							</select>
		<tr><td>地址:<td><input type="text"  value="${u.u_address}" placeholder="请输入详细地址" id="u_address" name="u_address">
		<input type="hidden" value="0.00" id="u_wallet" name="u_wallet">
		<tr><td><td><input type="submit" value="注册" >
		</table>
	</form>
</body>
</html>