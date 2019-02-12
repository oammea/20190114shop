<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加商品</title>
<script type="text/javascript" src="jquery.min.js"></script>
<script type="text/javascript">

	$(function(){
		$('#tb').hide();
	})
</script>

</head>
<body>

<!-- g_id g_name g_price g_type g_shortage u_id-->
	<form action="addgoods.action" method="post" >
	<input type="button" value="添加" onclick="$('#tb').toggle()">
		<table id="tb">
			<tr><td>商品名称:<td><input type="text" name="g_name">
			<tr><td>商品价格:<td><input type="text" name="g_price">
			<tr><td>商品类型:<td><input type="text" name="g_type">
			<tr><td>库存:<td><input type="text" name="g_shortage">
			<tr><td><input type="hidden" name="u_id" value="${u.u_id }">
				<td><input type="submit" value="提交">
		</table>
	</form>
		<table>
			<tr><td>id<td>商品名称<td>商品价格<td>商品类型<td>库存
			<c:forEach items="${p.list }" var="l">
				<c:choose>
					<c:when test="${l.g_id==changeall}">
						<form action="updategoods.action">
						<tr>
							<td><span class="s">${l.g_id }</span>
							<input type="hidden" name="g_id" value="${l.g_id }">
							<td>
							<input type="text" name="g_name" value="${l.g_name }">
							<td>
							<input type="text" name="g_price" value="${l.g_price }">
							<td>
							<input type="text" name="g_type" value="${l.g_type}">
							<input type="hidden" name="u_id" value="${l.u_id}">
							<td><input type="text" name="g_shortage" value="${l.g_shortage}">
							<td><input type="submit" value="确认"></a>
						</form>
					</c:when>
					<c:when test="${l.g_id==changeshortage }">
						<form action="updategoods.action">
						<tr>
							<td><span class="s">${l.g_id }</span>
							<input type="hidden" name="g_id" value="${l.g_id }">
							<td><span class="s">${l.g_name }</span>
							<input type="hidden" name="g_name" value="${l.g_name }">
							<td><span class="s">${l.g_price }</span>
							<input type="hidden" name="g_price" value="${l.g_price }">
							<td><span class="s">${l.g_type}</span>
							<input type="hidden" name="g_type" value="${l.g_type}">
							<input type="hidden" name="u_id" value="${l.u_id}">
							<td><input type="text" name="g_shortage" value="${l.g_shortage}">
							<td><input type="submit" value="确认"></a>
						</form>
					</c:when>
					<c:otherwise>
						<tr>
						<td><span class="s">${l.g_id }</span>
						<td><span class="s">${l.g_name }</span>
						<td><span class="s">${l.g_price }</span>
						<td><span class="s">${l.g_type}</span>
						<td><span class="s">${l.g_shortage}</span>
						<td><a href="changeshortage.action?g_id=${l.g_id }">修改库存</a>
						<td><a href="changegoods.action?g_id=${l.g_id }">修改信息</a>
						<td><input type="button" value="删除" onclick="if(confirm('是否删除${l.g_id }?')){location.href='deletegoods.action?g_id=${l.g_id }'}">
					</c:otherwise>
				</c:choose>
			</c:forEach>
		</table>
		<a href="gogoods.action?currentPage=${p.currentPage-1 }&pageSize=8&u_id=${u.u_id }">上一页</a> &nbsp
		<a href="gogoods.action?currentPage=${p.currentPage+1 }&pageSize=8&u_id=${u.u_id }">下一页</a>
</body>
</html>