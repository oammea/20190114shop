<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>货物架</title>
<script type="text/javascript" src="jquery.min.js"></script>
<script type="text/javascript">

	
</script>
</head>
<body>
<!-- g_id g_name g_price g_type u_id g_shortage -->
	<form action="gobuy.action?pageSize=10&u_id=${u.u_id }" id="form">
		<input type="hidden" id="currentPage" name="currentPage" value="${p.currentPage }">
		<input type="hidden" name="pageSize" value="${p.pageSize }">
		<input type="hidden" name="u_id" value="${u.u_id }">
		<div>商品名称 <input type="text" name="g_name" value="${p.g_name }">
			 商品类型 <input type="text" name="g_type" value="${p.g_type }">
			<input type="submit" value="查询">
			<input type="button" value="上一页" onclick="$('#currentPage').val('${p.currentPage-1}');$('#form').submit()">
			<input type="button" value="下一页" onclick="$('#currentPage').val('${p.currentPage+1}');$('#form').submit()">
		</div>
	</form>
	
	<ol style="width: 75%">
		<c:forEach items="${p.list }" var="s">
			<li style="float: left;width: 20%" >
				<h5>商品名称:${s.g_name }</h5>
				<h5>商品种类:${s.g_type }</h5>
				<h5>商品价格:${s.g_price }</h5>
				<h5>商品库存:${s.g_shortage }</h5>
				<h5><input type="button" value="购买" onclick="location.href='buyitem.action?g_id=${s.g_id }&u_id=${u.u_id }'"></h5>
		</c:forEach>
	</ol>
</body>
</html>