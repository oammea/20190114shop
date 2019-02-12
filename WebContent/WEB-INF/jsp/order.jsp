<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>订单</title>
<script type="text/javascript">
$(function(){
	$('#add').hide();
})
</script>
</head>
<body>	
	<c:forEach items="">
	
	</c:forEach>
		<form action="insertaddress.action">
		
			<span id="add"><input type="text" id="address_name" name="address_name" value="">
							<input type="submit" value="添加地址"></span>
			<input type="hidden" id="g_id" name="g_id" value="${d.g_id }">
			<input type="hidden" id="g_amount" name="g_amount" value="${d.g_amount }">
			<input type="hidden" id="u_id" name="u_id" value="${d.u_id }">
			<input type="hidden" id="d_total" name="d_total" value="${d.d_total }">
		</form>
		
		<form action="submitorder.action">
		<ol style="list-style: square;">
		<!-- d_id g_id g_amount u_id d_time d_total -->
			<li>收货地址:	
				<select name="d_address">
					<option>请选择收货地址
					<c:forEach items="${addresslist}" var="l">
						<option value="${l.ADDRESS_NAME  }">${l.ADDRESS_NAME  }
					</c:forEach>
				</select>
			<input type="button" value="新增地址" onclick="$('#add').toggle()">
			<li>买家:${u.u_username }
			<li>	${g.g_name  }
			<li>单价:${g.g_price  }
			<li>种类:${g.g_type  }
			<li>库存:${g.g_shortage  }
			<li>数量:${d.g_amount }
			<li>总价:${d.d_total }元
			<input type="hidden" id="g_id" name="g_id" value="${d.g_id }">
			<input type="hidden" id="g_amount" name="g_amount" value="${d.g_amount }">
			<input type="hidden" id="u_id" name="u_id" value="${d.u_id }">
			<input type="hidden" id="d_total" name="d_total" value="${d.d_total }">
			<br>
			<br>
			<input type="submit" value="提交">
		</ol>
	</form>
</body>
</html>