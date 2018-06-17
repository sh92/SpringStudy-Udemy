<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> Yahoo!!! From JSP</title>
</head>
<%
System.out.println(request.getParameter("name"));
System.out.println(request.getParameter("password"));
%>
<body>
My name is ${name} and password is ${password}
</body>
</html>
