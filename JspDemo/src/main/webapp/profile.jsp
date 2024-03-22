<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%String fname=request.getParameter("fanme");
String lname=request.getParameter("lanme");
String email=request.getParameter("email");
%>
<%="First Name:"+fname+"Last Name:"+lname+"Email  Id:"+email %>


</body>
</html>