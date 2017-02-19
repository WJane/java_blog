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
    
    <title>write</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="ckeditor/ckeditor.js"></script>
	<script type="text/javascript">
    CKEDITOR.replace('editor01');
	</script>
  </head>
  
  <body>
 
  <form method="post" action="${pageContext.request.contextPath }/servlet/addEssayServlet">
	    你好，${sessionScope.user.username}
	    选择分类： <select name="category_id">
	    			<c:forEach items="${cs }" var="c">
	    				<option value="${c.id}">${c.name}</option>
	    			</c:forEach>
	    	    </select> <br />   
	    主题:<input type="text" name="title" value="" /><br/>
	    正文:<textarea id="editor01" rows="50" cols="70" name="content" class="ckeditor"></textarea>
	    提交：<input type="submit" value="ok" />
  </form>
  </body>
</html>
