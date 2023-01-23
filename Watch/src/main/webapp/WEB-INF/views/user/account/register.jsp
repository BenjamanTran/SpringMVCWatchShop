<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<head>
<meta charset="UTF-8">
<title>Đăng ký</title>
</head>
<body>
	<div class="span9">
		<ul class="breadcrumb">
			<li><a href='<c:url value="trang-chu"></c:url>'>Trang chủ</a> <span
				class="divider">/</span></li>
			<li class="active">Đăng ký</li>
		</ul>
		<h3>Tạo tài khoản</h3>
		<hr class="soft" />
		<div class="well" style="display: flex; justify-content: center;">
			<form:form action="dang-ky" method="post" modelAttribute="account">
				<h3>Tạo tài khoản</h3>

				<div class="control-group">
					<label class="control-label" for="user">Email <sup>*</sup></label>
					<div class="controls">

						<form:input type="email" path="user" class="span3"
							placeholder="Mời nhập Email" />
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" for="password">Mật khẩu <sup>*</sup></label>
					<div class="controls">
						<!--  <input type="password" id="password" placeholder="Mời nhập mật khẩu"> -->
						<form:input type="password" path="password" class="span3"
							placeholder="Mời nhập mật khẩu" />
					</div>
				</div>
				<!-- <div class="control-group">
			<label class="control-label" for="password2">Điền lại mật khẩu <sup>*</sup></label>
			<div class="controls">
			  <input type="password" id="password2" placeholder="Điền lại mật khẩu">
			</div>
		 </div> -->
				<div class="control-group">
					<label class="control-label" for="displayName">Họ và tên <sup>*</sup></label>
					<div class="controls">
						<!-- <input type="text" placeholder="Họ và tên"> -->
						<form:input type="text" path="displayName" class="span3"
							placeholder="Mời nhập họ và tên" />
					</div>
				</div>
				<div class="control-group">
					<label class="control-label">Địa chỉ <sup>*</sup></label>
					<div class="controls">
						<!-- <input type="text" placeholder="Địa chỉ"> -->
						<form:input type="text" path="address" class="span3"
							placeholder="Mời nhập địa chỉ" />
					</div>
				</div>

				<div class="control-group">
					<div class="controls">
						<input type="submit" name="submitAccount" value="Đăng Ký"
							class="exclusive shopBtn">
					</div>
				</div>
			</form:form>
		</div>







	</div>
</body>
