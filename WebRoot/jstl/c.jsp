<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'c.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    This is my <font color="red">jstl</font> page. <br>

  	<c:set var="core" value="<script>alert('12345');</script>" scope="request"></c:set>
  	<c:out value="core"></c:out>
  	<c:out value="${core}" escapeXml="true"></c:out>
  	<c:out value="${sss }" default="sssbbb"/>
  	<c:url value="/index.jsp">
  		<c:param name="abc" value="def"></c:param>
  	</c:url>
  	<a href="<c:url value="/index.jsp">">return</a>
  </body>
</html>
