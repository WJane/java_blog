<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>main</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<style type="text/css">
	    body{background-color:#CDC9A5}
		ul{list-style:none;width:150px}
		ul li a{text-decoration:none;display:block;height:50px;background-color:#CDB79E;width:150px;line-height:50px;margin-bottom:2px;text-indent:10px;}
		ul li a:hover{font-size:20px;}
		a{text-decoration:none;}
		.lr{float:right;margin:10px;top:10px}
	</style>
	

  </head>
  
  <body>
    <h1><font color="red" face="verdana" text-align:center>Zhen's Blog</font></h1>
    <div class="lr">
    <a href="${pageContext.request.contextPath}/servlet/categoryServlet?operation=isLogin">Write blog</a>&nbsp;&nbsp;
    </div>
    
    <ul>
    <c:forEach items="${cs}" var="c">
    <li><a href="${pageContext.request.contextPath}/servlet/categoryServlet?operation=findEssays&category_id=${c.id}">${c.name}</a></li>    
    </c:forEach>
    </ul>
    
    ${message }
    
  </body>
</html>
