<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>

<head>
<meta charset="UTF-8">
<title>Tìm kiếm sản phẩm</title>
<style>
.center {
	text-align: center;
}

.pagination {
	display: inline-block;
}

.pagination a {
	color: black;
	float: left;
	padding: 8px 16px;
	text-decoration: none;
	transition: background-color .3s;
	border: 1px solid #ddd;
	margin: 0 4px;
}

.pagination a.active {
	background-color: #4CAF50;
	color: white;
	border: 1px solid #4CAF50;
}
.pagination

 

a


:hover


:not

 

(
.active

 

)
{
background-color


:

 

#ddd


;
}
</style>
</head>
<body>
<%-- <h1>${search_list_products.size()}</h1> --%>
<div class="span9">
<div class="well well-small">
	 <c:if test="${search_list_products.size()==0}">
		<h3>Không tìm thấy sản phẩm nào</h3>
	</c:if>
	
		<c:forEach var="item" items="${search_list_products }">
			<div class="row-fluid">	  
		<div class="span2">
			<img src='<c:url value="/assets/user/img/${item.img }"></c:url>' alt="">
		</div>
		<div class="span6">
			<h5>${item.name } </h5>
			<p>
			${item.title }
			</p>
		</div>
		<div class="span4 alignR">
		<form class="form-horizontal qtyFrm">
		<h3> <fmt:formatNumber type="number" groupingUsed="true" value="${item.price }" /> ₫</h3>
		<!-- <label class="checkbox">
			<input type="checkbox">  
		</label> -->
		<div class="btn-group">
		  <a href="product_details.html" class="defaultBtn"><span class=" icon-shopping-cart"></span> Thêm vào giỏ hàng</a>
		  <br>
		  <a href="product_details.html" class="shopBtn">Xem chi tiết</a>
		 </div>
			</form>
		</div>
	</div>
	<hr class="soften">
		</c:forEach>
	
	 
	
</div>
	<c:if test="${quantyOfPages>0 }">
		 <div class="center">
			<div class="pagination">
				<a href="#">&laquo;</a>
				
				<c:forEach var="item" begin="1" end="${quantyOfPages }"
					varStatus="loop">
					<c:if test="${loop.index==currentPage}">
						<a
							href="<c:url value="/xem-them/${styleProduct}/${loop.index}" />"
							class="active"> ${loop.index} </a>
					</c:if>
					<c:if test="${loop.index!=currentPage  }">
						<a
							href="<c:url value="/xem-them/${styleProduct}/${loop.index}" />">
							${loop.index} </a>
					</c:if>
				</c:forEach>
				<a href="#">&raquo;</a>
			</div>
		</div> 
		</c:if>
</div>
</body>
