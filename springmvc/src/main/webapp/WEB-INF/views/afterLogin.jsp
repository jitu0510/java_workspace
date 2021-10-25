<%@page import="com.ty.springmvc.bean.LoginDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%--  <%
    	String name =(String)request.getAttribute("name");
    	String pwd = (String)request.getAttribute("pwd"); 
    %> --%>
    
    <%
    	LoginDetails loginDetails = (LoginDetails)request.getAttribute("details");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Your name is:
<%=loginDetails.getName() %></h1>

<h1>Your password is:
<%=loginDetails.getPwd()%></h1>
 
</body>
</html>