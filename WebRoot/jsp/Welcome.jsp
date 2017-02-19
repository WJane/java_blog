<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Welcome.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">
	

  </head>
  
  <body>
<div class="wrapper">
<header>
	<nav>
		<div id="me">
		
		<a href="#">WuZhen</a>

		</div>
		<ul>
			
			<li><a href="${pageContext.request.contextPath}/jsp/main.jsp">首页</a></li>
			<li><a href="${pageContext.request.contextPath}/jsp/login.jsp">登录</a></li>
			<li><a href="#">注册</a></li>
		</ul>
	</nav>
	<div id="banner">
		<div class="inner">
			<h2>吴真</h2>
		
			<p class="pgf">
				欢迎来看我的博客~<br/>
				Welcome to my blog.
			</p>
			<button>
				养我
			</button>
			<div class="more">
				更多
			</div>
		</div>
	</div>
</header>
<div id="content">
	<div class="green">
		<div class="title">
			<h2>我是标题一个</h2>
			<div class="hr"></div>
			<p class="p2">
				nfkad fsdkfkjsdj fsdkjn fksjd
				fgd gdf g df g df gdfgd
				xcvbcxvb cxv vcbbvb dfbdf
			</p>
		</div>
		<div class="icon-group">
			<span class="icon">item1</span>
			<span class="icon">item2</span>
			<span class="icon">item3</span>
		</div>
	</div>
	<div class="gray">
		<div class="illustrate">
			<div class="pic">
				<img src="img/pic01.jpg">
			</div>
			<div class="text">
				<h2>我不开心</h2>
				<p>
				&nbsp;&nbsp;&nbsp;不知道该说什么，也没有图片，我是不喜欢拍照的人。
				凑合着看吧哈~
				</p>
			</div>
		</div>

		<div class="illustrate">
			<div class="text">
				<h2>我不开心</h2>
				<p>
				&nbsp;&nbsp;&nbsp;不知道该说什么，也没有图片，我是不喜欢拍照的人。
				凑合着看吧哈~
				</p>
			</div>
			<div class="pic">
				<img src="img/pic02.jpg">
			</div>
		</div>

		<div class="illustrate">
			<div class="pic">
				<img src="img/pic03.jpg">
			</div>
			<div class="text">
				<h2>我不开心</h2>
				<p>
				&nbsp;&nbsp;&nbsp;不知道该说什么，也没有图片，我是不喜欢拍照的人。
				凑合着看吧哈~
				</p>
			</div>
		</div>

		
	</div>
	<div class="purple">
		<div class="heading">
			<h2>我自己学编程</h2>
			<div class="hr"></div>
			<div class="p3">
				 &nbsp;&nbsp;&nbsp;自己一个人学，其实着实是走了不少弯路，个中辛酸不在此赘述，回头看看自己走的路~
			</div>
		</div>
		
		<div class="cards">
			<div class="card">
				<h3>2015.4</h3>
				<p>
					&nbsp;&nbsp;&nbsp;每天刷知乎，整天看到大家讨论爬虫。于是带着好奇心去了解……
					结果成了半个pythoner,也用了一个月的时间，看着大牛的技术博客
					写了一个算成绩的小程序。当时满满的成就感。
					然而现在看来，当时还是太幼稚了<br/>...
					<br/>&nbsp;&nbsp;&nbsp;
					不过，算是它带着我入了编程的坑！
				</p>
			</div>
			<div class="card">
				<h3>2015.6</h3>
				<p>
					&nbsp;&nbsp;&nbsp;Python虽好，然而关于它的课程实在太少。后来HTML5的概念实在整天炒的很火。 <br/><br/>于是，呆萌的我又开始玩玩htmlcss这样的标签语言。
					当时随便找了本书看，卧槽，就各种标签而已啊，这么简单！
					And~~原来网页是这样写出来的。。。<br/><br/>
					可是考试周到了，好吧，我先应付那些水课。于是初见html后又戛然而止了，那时我也没去w3c,这样的地方学过。所以最后其实什么都不知道。
				</p>
			</div>
			<div class="card">
				<h3>2015.7~8</h3>
				<p>
					&nbsp;&nbsp;&nbsp;暑假来了，哈哈。这儿会我已经算是彻底要做个技术宅了。但是，由于我眼高手低的属性，这会儿还是其实什么都不会。而且我眼花缭乱，什么都想搞，一会儿想做个网站，一会儿想弄个APP,一会儿又折腾着要安装LINUX...<br/><br/>
					暑假结束那会儿，不知怎么，才确定要学java，so~ 这回算是真的开始了吧。
				</p>
			</div>
			<div class="card">
				<h3>2015.9...至今</h3>
				<p>
					&nbsp;&nbsp;&nbsp;GC来了，没错，就是java web~
					直到现在，我还在搞得东西。<br/><br/>
					&nbsp;&nbsp;&nbsp;以前,总在网上看到谁谁精通java。当时好羡慕，可惜入门容易，学精难，
					直到现在，我还只是个copy代码，百度答案来写应用的loser,因为学习的
					过程其实就是在填鸭，也难免枯燥。&nbsp;&nbsp;&nbsp;
					不知何时，我也能时不时造造轮子
					，真的用代码写出心中所想。<br/><br/>
					真的是任重道远啊
				</p>
			</div>
			<div class="card">
				<h3>2016...</h3>
				<p>
					&nbsp;&nbsp;&nbsp;问我现在在干嘛？作为一名独立开发者（这个装逼有8分吧），前后端当然难以分离，所以，我现在又回归前端了。html,css,js,jQuery...喏~你现在看到的页面就是我看着人家的教程撸的。<br/><br/>
					&nbsp;&nbsp;&nbsp;其实，实话还是前端好玩的多，而且我又是女生~
				</p>
			</div>
			<div class="card">
				<h3>Now~</h3>
				<p>
					应该滚去考研了。
				</p>
			</div>
		</div>
	</div>
</div>
<footer>
	<ul class="share-group">
		<li>item1</li>
		<li>item2</li>
		<li>item3</li>
		<li>item4</li>
		<li>item5</li>
	</ul>
	<div class="copy">
		&copy 吴真
	</div>
</footer>
</div>
</body>
</html>
