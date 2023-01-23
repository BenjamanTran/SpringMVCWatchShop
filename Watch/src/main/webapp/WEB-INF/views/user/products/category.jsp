<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>

<title>Sản-phẩm</title>
<head>
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
	<%-- <h1>${ProductsOfPage.size()}</h1>
	<h1>${quantyOfPages}</h1>
 --%>
	 <!-- test file -->
	<div class="span9">
		<div class="well well-small">
		 <div class="row">
			<span style="margin-left: 25px">Danh sách sản phẩm </span> <select
				class="pull-right">
				<option>A - Z</option>
				<option>Cao - Thấp</option>
			</select>
		</div> 
			<hr class="soften" />
			<div class="row-fluid">
				<c:if test="${ProductsOfPage.size()>0}">
					<div class="row-fluid">
						<ul class="thumbnails">
							<c:forEach var="item" items="${ProductsOfPage }"
								varStatus="loop">
								<li class="span4">
									<div class="thumbnail">
										<a class="zoomTool" href="<c:url value="/chi-tiet-san-pham/${item.id_product }"/>"
											title="add to cart"><span class="icon-search"></span>
											QUICK VIEW</a> <a href="<c:url value="/chi-tiet-san-pham/${item.id_product }"/>"><img
											src="<c:url value="/assets/user/img/${item.img }"/>" alt=""></a>
										<div class="caption">
											<h5>${item.name }</h5>
											<h4>
												<a class="defaultBtn" href="<c:url value="/chi-tiet-san-pham/${item.id_product }"/>"
													title="Click to view"><span class="icon-zoom-in"></span></a>
												<a class="shopBtn" href="<c:url value="/AddCart/${item.id_product }"></c:url>" title="add to cart"><span
													class="icon-plus"></span></a> <span class="pull-right">
													<fmt:formatNumber type="number" groupingUsed="true"
														value="${item.price }" /> ₫
												</span>
											</h4>
										</div>
									</div>
								</li>
								<c:if
									test="${(loop.index+1)%3==0 ||(loop.index+1)==ProductsOfPage.size() }">
						</ul>
					</div>
					<c:if test="${(loop.index+1)<ProductsOfPage.size() }">
						<div class="row-fluid">
							<ul class="thumbnails">
					</c:if>
				</c:if>
				</c:forEach>
				</c:if>




			</div>
		</div>
		 <div class="center">
			<div class="pagination">
				<a href="#">&laquo;</a>
				<c:forEach var="item" begin="1" end="${quantyOfPages }"
					varStatus="loop">
					<c:if test="${loop.index==currentPage}">
						<a
							href="<c:url value="/san-pham/${idCategory}/${loop.index}" />"
							class="active"> ${loop.index} </a>
					</c:if>
					<c:if test="${loop.index!=currentPage  }">
						<a
							href="<c:url value="/san-pham/${idCategory}/${loop.index}" />">
							${loop.index} </a>
					</c:if>
				</c:forEach>
				<a href="#">&raquo;</a>
			</div>
		</div> 
	</div>
	
	<!-- test file -->
 

</body>
