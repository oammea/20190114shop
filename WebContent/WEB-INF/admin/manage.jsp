<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理</title>
</head>

<frameset rows="130,*" cols="*" frameborder="no" border="0" framespacing="0">
  <frame src="upmanage.action?u_username=${u.u_username }">
  <frameset rows="*" cols="247,*" framespacing="0" frameborder="no" border="0">
    <frame src="leftmanage.action?u_username=${u.u_username }" name="leftFrame" id="leftFrame" title="leftFrame">
    <frame src="mainmanage.action?u_username=${u.u_username }" name="mainFrame" scrolling="No" noresize="noresize" id="mainFrame" title="mainFrame">
  </frameset>
</frameset>
<noframes>
<body>
</body>
</noframes>
</html>