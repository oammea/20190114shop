<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>下订单</title>
<script type="text/javascript" src="jquery.min.js"></script>
</head>
<body>
	<form action="makeorder.action">
		<ol style="list-style: square;">
			<li>买家:${u.u_username }<input type="hidden" name="u_id" value="${u.u_id }">
			<li>	${g.g_name  }<input type="hidden" name="g_id" value="${g.g_id }">
			<li>单价:${g.g_price  }
			<li>种类:${g.g_type  }
			<li>库存:${g.g_shortage  }
			<li>选择数量 <input id="amount" name="g_amount" style="width: 25px" value="1">
			<input type="button" value=" - " onclick="var a=$('#amount').val();if(a<2){}else{a--};$('#amount').val(a)">
			<input type="button" value=" +" onclick="var a=$('#amount').val();a++;$('#amount').val(a)">
			<br>
			<br>
			<input type="submit" value="去下订单">
		</ol>
	</form>
</body>
</html>