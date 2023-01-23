<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>

<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<div class="span9">
    <ul class="breadcrumb">
		<li><a href="index.html">Home</a> <span class="divider">/</span></li>
		<li class="active">Login</li>
    </ul>
	<h3> Login</h3>	
	<h3>${status }</h3>
	<hr class="soft"/>
	
	<div class="row">
		
		
		<div class="span9"  style="display: flex; justify-content: center;">
			<div class="well">
			<h5>ALREADY REGISTERED ?</h5>
			<form:form action="/dang-nhap" method="post" modelAttribute="account">
			  <div class="control-group">
				<label class="control-label" for="inputEmail">Email</label>
				<div class="controls">
				  <form:input type="email" path="user" class="span3"
							placeholder="Mời nhập Email" />
				</div>
			  </div>
			  <div class="control-group">
				<label class="control-label" for="inputPassword">Password</label>
				<div class="controls">
				  <form:input type="password" path="password" class="span3"
							placeholder="Mời nhập mật khẩu" />
				</div>
			  </div>
			  <div class="control-group">
				<div class="controls">
				  <button type="submit" class="defaultBtn">Sign in</button> <a href="#">Forget password?</a>
				</div>
			  </div>
			</form:form>
		</div>
		</div>
	</div>	
	
</div>
</body>
