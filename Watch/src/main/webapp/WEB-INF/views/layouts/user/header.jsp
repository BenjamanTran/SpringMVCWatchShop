<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp" %>

<header id="header">
	<div class="row">
		<div class="span4">
			<h1>
				<a class="logo" href="<c:url value="/"/>"><span>Twitter Bootstrap
						ecommerce template</span> <img style="width:50% ;height:50%"
					src="<c:url value="/assets/user/img/logoWatchShop.jpg"/>"
					alt="bootstrap sexy shop"> </a>
			</h1>
		</div>
		<div class="span4">
			 <div class="offerNoteWrapper">
				<h1 class="dotmark">
					 <i class="icon-cut"></i> Demo java springMVC project by Benjaman Trần 
				</h1>
			</div> 
		</div>
		<div class="span4 alignR">
			<p>
				<br> <strong> Support (24/7) : 033 631 9544 </strong><br>
				<br>
			</p>
			
			<a href="<c:url value="/ListCart/"/>"><span class="btn btn-mini">[ ${TotalQuantyCart } ] <span
				class="icon-shopping-cart"></span>
		</div>
	</div>
</header>

<!--
Navigation Bar Section 
-->
<div class="navbar">
	<div class="navbar-inner">
		<div class="container">
			<a data-target=".nav-collapse" data-toggle="collapse"
				class="btn btn-navbar"> <span class="icon-bar"></span> <span
				class="icon-bar"></span> <span class="icon-bar"></span>
			</a>
			<div class="nav-collapse">
				<ul class="nav">
					<c:forEach var="item" items="${menus}" varStatus="index">

						<c:if test="${index.first }">
							<li class="active">
						</c:if>
						<c:if test="${not index.first }">
							<li>
						</c:if>

						<a href="${item.url}">${item.name} </a>
						</li>
					</c:forEach>

				</ul>
				<form action="<c:url value="/tim-kiem-san-pham"/>" class="navbar-search pull-left">
					<input type="text" placeholder="Search" class="search-query span2" name="searchString" value="${txtSearch}">
				</form>
				
				<ul class="nav pull-right">
					<li class="dropdown">
					<c:if test="${empty LoginInfo }">
					<a 
						class="dropdown-toggle" href="<c:url value="/dang-nhap"/>"><span class="icon-lock"></span>
							Đăng nhập <b class="caret"></b></a>
					</c:if>
					<c:if test="${not empty LoginInfo }">
					<a data-toggle="dropdown"
						class="dropdown-toggle" href="<c:url value="/order/${LoginInfo.id} }"/>"><span class="icon-lock"></span>
							${LoginInfo.displayName } <b class="caret"></b></a>
							<div class="dropdown-menu">
							<form class="form-horizontal loginFrm">
								
								
								<div class="control-group">
									
									<a href="<c:url value="/dang-xuat"/>" class="shopBtn btn-block">Đăng xuất</a>
								</div>
							</form>
						</div>
					</c:if>
					
							
						</li>
				</ul>
			</div>
		</div>
	</div>
</div>
