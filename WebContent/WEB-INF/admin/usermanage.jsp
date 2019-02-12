<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="WebContent/jquery.min.js"></script>
<script type="text/javascript">
</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户管理</title>
</head>
<body>
<!-- u_id u_username u_password u_sex u_phone u_cardType u_address u_wallet -->
	<form action="usermanage.action" method="post">
	<div><h4>查询</h4>&nbsp;用户名<input type="text" name="u_username">
		性别<select name="u_sex"><option value="男">男<option value="女">女</select>
	</div>
	<table>
		<tr><td>id<td>姓名<td>性别<td>电话号码<td>卡类型<td>地址<td>资金<td>操作
		<c:forEach items="${page.list }" var="u">
		<c:if test="${u.u_id==id }"></c:if>
		<tr><td>${u.u_id }<td>${u.u_username }<td>${u.u_sex }<td>${u.u_phone }<td>${u.u_cardType }<td>${u.u_address }<td>${u.u_wallet }
		<td><input type="button" value="修改" onclick="location.href='userchange.action?u_id=${u.u_id}'"><input type="button" value="删除">
		</c:forEach>
	</table>
	</form>
</body>
</html>