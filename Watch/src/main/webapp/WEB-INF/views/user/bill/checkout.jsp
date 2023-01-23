<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp" %>
<head>
<meta charset="UTF-8">
<title>Thanh toán</title>
</head>
<body>
	<div class="span9">
	<div class="well">
		<form:form action="thanh-toan" method="post" class="form-horizontal" modelAttribute="bills">
			<h3>Thanh toán đơn hàng</h3>
			<div class="control-group">
				<label class="control-label">Họ và tên <sup>*</sup></label>
				<div class="controls">
				<form:input type="text" placeholder=" Mời nhập họ và tên" path="fullName"/>
				</div>
			</div>
			<div class="control-group">
				<label class="control-label">Email <sup>*</sup></label>
				<div class="controls">
				<form:input type="text" placeholder=" Mời nhập email" path="email"/>
				</div>
			</div>
			<div class="control-group">
				<label class="control-label">Số điện thoại <sup>*</sup></label>
				<div class="controls">
				<form:input type="text" placeholder=" Mời nhập số điện thoại" path="phone"/>
				</div>
			</div>
			<div class="control-group">
				<label class="control-label">Địa chỉ <sup>*</sup></label>
				<div class="controls">
				<form:textarea path="address"/>
				</div>
			</div>
			<div class="control-group">
				<label class="control-label">Ghi chú <sup>*</sup></label>
				<div class="controls">
				<form:textarea path="note"/>
				</div>
			</div>
		<div class="control-group">
			<div class="controls">
			<input type="submit" name="submitAccount" value="Đặt hàng" class="shopBtn exclusive">
			</div>
		</div>
		</form:form>
	</div>
	</div>
</body>
