<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="webjavabean.domain.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'el.jsp' starting page</title>
    
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
    <%
    	Clazz clazz = new Clazz("6年级","2班");
    	Student s = new Student(3,3,clazz);
    	request.setAttribute("s", s);
    %>
    ${s.clazz.city}
    --------el表达式-------------------
    ${header['User-Agent'] }
    <a href="${pageContext.request.contextPath}/index.jsp">index</a>
    
  </body>
</html>
