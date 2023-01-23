<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp" %>

<head>
<meta charset="UTF-8">
<title>Thông tin đơn hàng</title>
</head>
<body>
	
	<div class="span9">
    <ul class="breadcrumb">
		<li><a href="index.html">Trang chủ</a> <span class="divider">/</span></li>
		<li class="active">Giỏ hàng</li>
    </ul>
    <c:forEach var="item" items="${ listOrder }">
	<div class="well well-small">
		<h3>Mã Đơn hàng ${item.id} <small class="pull-right">Tổng tiền <fmt:formatNumber type="number" groupingUsed="true" value="${ item.total }"/> ₫ </small></h3>
	<hr class="soften"/>	

	<table class="table table-bordered table-condensed">
              <thead>
                <tr>
                  <th>Tên người nhận</th>
                  <th>Email</th>
                  <th>Địa chỉ</th>
                  <th>Số điện thoại</th>
                  <th>Ghi chú</th>
                  <th>Ngày đặt</th>
                  <th></th>
				</tr>
              </thead>
              <tbody>
              
				
					<tr>
	                	<td>${item.fullName }</td>
	                	<td>${item.email }</td>
	                	<td>${item.address }</td>
	                	<td>${item.phone }</td>
	                	<td>${item.note }</td>
	                	<td>${item.checkoutDate }</td>
	                </tr>
				
                
				</tbody>
            </table><br/>
			
	<a href='<c:url value="/order/${item.id}/chi-tiet"></c:url>' class="shopBtn btn-large pull-right">Chi tiết đơn hàng <span class="icon-arrow-right"></span></a>
	</br>
</div>
</c:forEach>
</div>

</body>
