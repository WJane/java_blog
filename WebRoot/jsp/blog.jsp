<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>blog</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
		.title{font-size:30px;text-align:center;}
		.content{width:80%;font-size:20px;margin:0 auto;}
		.tit{font-size:30px;text-align:center;}
		.con{width:80%;font-size:20px;margin:0 auto;}
		.block{border:1px solid gray;width:90%;margin:5px auto;}
	</style>

  </head>
  
  <body>
  	<a href="${pageContext.request.contextPath }/jsp/main.jsp">首页</a>  <br />
  	<form action="${pageContext.request.contextPath }/servlet/searchServlet" method="post">
  	搜索博文:<input type="text" name="title">
  			<input type="submit" value="search">
  	</form>
  	<div class="title">${essay.title}<br/></div>
  	<div class="content">${essay.content } <br/></div>
    <c:forEach items="${es }" var="e">
    <div class="block">
    	<div class="tit">${e.title}<br/></div>
    	<div class="con">${e.content }<br/></div>
    </div>
    	
    </c:forEach>
  </body>
</html>
