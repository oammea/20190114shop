<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>购物车</title>
<script type="text/javascript" src="jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$('#payedtable').hide();
		$('#sendtable').hide();
		$('#reflecttable').hide();
	})
	/* sendtable reflecttable unpaytable payedtable */
</script>
</head>
<body>
	<input id="unpay" type="button" value="未支付" onclick="$('#unpaytable').show();$('#payedtable').hide();$('#sendtable').hide();$('#reflecttable').hide();">&nbsp;
	<input id="payed" type="button" value="待发货" onclick="$('#unpaytable').hide();$('#payedtable').show();$('#sendtable').hide();$('#reflecttable').hide();">&nbsp;
	<input id="send" type="button" value="已发货" onclick="$('#unpaytable').hide();$('#payedtable').hide();$('#sendtable').show();$('#reflecttable').hide();">&nbsp;
	<input id="reflect" type="button" value="待评价" onclick="$('#unpaytable').hide();$('#payedtable').hide();$('#sendtable').hide();$('#reflecttable').show();">
	<table id="unpaytable">
		<tr><td>订单ID<td>商品名称<td>数量<td>总价<td>地址<td>状态
	<c:forEach items="${orderlist }" var="o">
		<c:choose>
			<c:when test="${o.D_STATE=='未支付' }">
				<tr><td>${o.D_ID }<td>${o.G_NAME }<td>${o.G_AMOUNT }<td>${o.D_TOTAL }元<td>${o.D_ADDRESS }<td>${o.D_STATE }
					<td><input type="button" onclick="location.href='payed.action?d_id=${o.D_ID }'" value="支付">
			</c:when>
		</c:choose>
	</c:forEach>
	</table>

	<table id="payedtable">
		<tr><td>订单ID<td>商品名称<td>数量<td>总价<td>地址<td>状态
		<c:forEach items="${orderlist }" var="o">
			<c:choose>
				<c:when test="${o.D_STATE=='已支付' }">
					<tr><td>${o.D_ID }<td>${o.G_NAME }<td>${o.G_AMOUNT }<td>${o.D_TOTAL }元<td>${o.D_ADDRESS }<td>${o.D_STATE }
				</c:when>
			</c:choose>
		</c:forEach>
	</table>
	
	<table id="sendtable">
		<tr><td>订单ID<td>商品名称<td>数量<td>总价<td>地址<td>状态
		<c:forEach items="${orderlist }" var="o">
			<c:choose>
				<c:when test="${o.D_STATE=='已发货' }">
					<tr><td>${o.D_ID }<td>${o.G_NAME }<td>${o.G_AMOUNT }<td>${o.D_TOTAL }元<td>${o.D_ADDRESS }<td>${o.D_STATE }
						<td><input type="button" onclick="" value="确认收货">
				</c:when>
			</c:choose>
		</c:forEach>
	</table>
		
	<table id="reflecttable">
		<tr><td>订单ID<td>商品名称<td>数量<td>总价<td>地址<td>状态
		<c:forEach items="${orderlist }" var="o">
			<c:choose>
				<c:when test="${o.D_STATE=='待评价' }">
					<tr><td>${o.D_ID }<td>${o.G_NAME }<td>${o.G_AMOUNT }<td>${o.D_TOTAL }元<td>${o.D_ADDRESS }<td>${o.D_STATE }
						<td><input type="button" onclick="" value="支付">
				</c:when>
			</c:choose>
		</c:forEach>
	</table>
	
</body>
</html>