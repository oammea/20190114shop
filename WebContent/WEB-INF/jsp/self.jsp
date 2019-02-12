<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<form action="insertaddress.action">
			<input type="hidden" name="u_id" value="${u.u_id }" >
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<input name="address_name">
			<input type="submit" value="添加新地址">
		</form>
		<c:forEach items="${addresslist}" var="l">
			<ol style="list-style:none; float: left;" >
				<li>地址:${l.ADDRESS_ID  }
				<li>${l.U_ID   }
				<li>${l.ADDRESS_NAME  }
			</ol>
		</c:forEach>
<%-- 	<c:forEach items="${addresslist}" var="l">
			<c:forEach items="${l }" var="m">
				<c:out value="${m[\"key\"]}"></c:out>
				<c:out value="${m[\"value\"]}"></c:out>
			</c:forEach>
		</c:forEach>
 --%>
	<!-- address_id u_id address_name -->
</body>
</html>