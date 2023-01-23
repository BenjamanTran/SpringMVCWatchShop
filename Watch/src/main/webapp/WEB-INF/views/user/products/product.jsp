<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>

<head>
<meta charset="UTF-8">
<title>Chi tiết sản phẩm</title>
<style>
.product-content {
	overflow-x: hidden;
}
</style>

</head>
<body>
	
	<div class="row product-content">
		<!-- <div id="sidebar" class="span3">
			<div class="well well-small">
				<ul class="nav nav-list">
					<li><a href="products.html"><span
							class="icon-chevron-right"></span>Fashion</a></li>
					<li><a href="products.html"><span
							class="icon-chevron-right"></span>Watches</a></li>
					<li><a href="products.html"><span
							class="icon-chevron-right"></span>Fine Jewelry</a></li>
					<li><a href="products.html"><span
							class="icon-chevron-right"></span>Fashion Jewelry</a></li>
					<li><a href="products.html"><span
							class="icon-chevron-right"></span>Engagement & Wedding</a></li>
					<li><a href="products.html"><span
							class="icon-chevron-right"></span>Men's Jewelry</a></li>
					<li><a href="products.html"><span
							class="icon-chevron-right"></span>Vintage & Antique</a></li>
					<li><a href="products.html"><span
							class="icon-chevron-right"></span>Loose Diamonds </a></li>
					<li><a href="products.html"><span
							class="icon-chevron-right"></span>Loose Beads</a></li>
					<li><a href="products.html"><span
							class="icon-chevron-right"></span>See All Jewelry & Watches</a></li>
					<li style="border: 0">&nbsp;</li>
					<li><a class="totalInCart" href="cart.html"><strong>Total
								Amount <span class="badge badge-warning pull-right"
								style="line-height: 18px;">$448.42</span>
						</strong></a></li>
				</ul>
			</div>

			<div class="well well-small alert alert-warning cntr">
				<h2>50% Discount</h2>
				<p>
					only valid for online order. <br> <br> <a
						class="defaultBtn" href="#">Click here </a>
				</p>
			</div>
			<div class="well well-small">
				<a href="#"><img src="assets/img/paypal.jpg"
					alt="payment method paypal"></a>
			</div>

			<a class="shopBtn btn-block" href="#">Upcoming products <br>
				<small>Click to view</small></a> <br> <br>
			<ul class="nav nav-list promowrapper">
				<li>
					<div class="thumbnail">
						<a class="zoomTool" href="product_details.html"
							title="add to cart"><span class="icon-search"></span> QUICK
							VIEW</a> <img src="assets/img/bootstrap-ecommerce-templates.png"
							alt="bootstrap ecommerce templates">
						<div class="caption">
							<h4>
								<a class="defaultBtn" href="product_details.html">VIEW</a> <span
									class="pull-right">$22.00</span>
							</h4>
						</div>
					</div>
				</li>
				<li style="border: 0">&nbsp;</li>
				<li>
					<div class="thumbnail">
						<a class="zoomTool" href="product_details.html"
							title="add to cart"><span class="icon-search"></span> QUICK
							VIEW</a> <img src="assets/img/shopping-cart-template.png"
							alt="shopping cart template">
						<div class="caption">
							<h4>
								<a class="defaultBtn" href="product_details.html">VIEW</a> <span
									class="pull-right">$22.00</span>
							</h4>
						</div>
					</div>
				</li>
				<li style="border: 0">&nbsp;</li>
				<li>
					<div class="thumbnail">
						<a class="zoomTool" href="product_details.html"
							title="add to cart"><span class="icon-search"></span> QUICK
							VIEW</a> <img src="assets/img/bootstrap-template.png"
							alt="bootstrap template">
						<div class="caption">
							<h4>
								<a class="defaultBtn" href="product_details.html">VIEW</a> <span
									class="pull-right">$22.00</span>
							</h4>
						</div>
					</div>
				</li>
			</ul>

		</div> -->
		<div class="span9">
			<ul class="breadcrumb">
				<li><a href="index.html">Trang chủ</a> <span class="divider">/</span></li>
				<li><a href="products.html">Sản phẩm</a> <span class="divider">/</span></li>
				<li class="active">Chi tiết sản phẩm</li>
			</ul>
			<div class="well well-small">
				<div class="row-fluid">
					<div class="span5">
						<div id="myCarousel" class="carousel slide cntr">
							<div class="carousel-inner">
								<div class="item active">
									<a href="#"> <img
										src='<c:url value="/assets/user/img/${product.img }"></c:url>'
										alt="" style="width: 100%"></a>
								</div>
							</div>
							<a class="left carousel-control" href="#myCarousel"
								data-slide="prev">‹</a> <a class="right carousel-control"
								href="#myCarousel" data-slide="next">›</a>
						</div>
					</div>
					<div class="span7">
						<h3>${product.name}</h3>
						<hr class="soft" />

						<form class="form-horizontal qtyFrm" method="get"
							action="<c:url value="/AddCart/${product.id_product }"></c:url>">
							<div class="control-group">
								<label class="control-label"><span><fmt:formatNumber
											type="number" groupingUsed="true" value="${product.price }" />
										₫</span></label>
								<!-- <div class="controls">
									<input type="number" min="0" class="span6" value="0">
								</div> -->
							</div>

							<!-- <div class="control-group">
								<label class="control-label"><span>Color</span></label>
								 <div class="controls">
									<select class="span11">
										<option>Red</option>
										<option>Purple</option>
										<option>Pink</option>
										<option>Red</option>
									</select>
								</div> 
							</div> -->
							<!-- <div class="control-group">
								<label class="control-label"><span>Materials</span></label>
								<div class="controls">
									<select class="span11">
										<option>Material 1</option>
										<option>Material 2</option>
										<option>Material 3</option>
										<option>Material 4</option>
									</select>
								</div>
							</div> -->
							<h4>${product.title}</h4>
							<p>
							<p>
								<button type="submit" class="shopBtn">
									<span class=" icon-shopping-cart"></span> Thêm vào giỏ hàng
								</button>
						</form>
					</div>
				</div>
				<hr class="softn clr" />


				<ul id="productDetail" class="nav nav-tabs">
					<li class="active"><a href="#home" data-toggle="tab">Chi
							tiết sản phẩm</a></li>
					<li class=""><a href="#profile" data-toggle="tab">Sản phẩm
							liên quan </a></li>
					<!-- 	<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">Acceseries <b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="#cat1" data-toggle="tab">Category one</a></li>
							<li><a href="#cat2" data-toggle="tab">Category two</a></li>
						</ul></li> -->
				</ul>
				<div id="myTabContent" class="tab-content tabWrapper">
					<div class="tab-pane fade active in" id="home">
						<%-- ${product.detail} --%>

						<h4>${product.name}</h4>
						<table class="table table-striped">
							<tbody>
								<tr class="techSpecRow">
									<td class="techSpecTD1">Color:</td>
									<td class="techSpecTD2">${product.name_color }</td>
								</tr>
								<tr class="techSpecRow">
									<td class="techSpecTD1">Style:</td>
									<td class="techSpecTD2">${product.id_category }</td>
								</tr>
								<!-- <tr class="techSpecRow">
									<td class="techSpecTD1">Season:</td>
									<td class="techSpecTD2">spring/summer</td>
								</tr>
								<tr class="techSpecRow">
									<td class="techSpecTD1">Usage:</td>
									<td class="techSpecTD2">fitness</td>
								</tr>
								<tr class="techSpecRow">
									<td class="techSpecTD1">Sport:</td>
									<td class="techSpecTD2">122855031</td>
								</tr> -->
								<!-- <tr class="techSpecRow">
									<td class="techSpecTD1">Brand:</td>
									<td class="techSpecTD2">Shock Absorber</td>
								</tr> -->
							</tbody>
						</table>
						<iframe width="560" height="315"
							src="${product.detail }"
							title="YouTube video player" frameborder="0"
							allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share"
							allowfullscreen></iframe>
						<!-- 	<p>Raw denim you probably haven't heard of them jean shorts
							Austin. Nesciunt tofu stumptown aliqua, retro synth master
							cleanse. Mustache cliche tempor, williamsburg carles vegan
							helvetica. Reprehenderit butcher retro keffiyeh dreamcatcher
							synth. Cosby sweater eu banh mi, qui irure terry richardson ex
							squid. Aliquip placeat salvia cillum iphone. Seitan aliquip quis
							cardigan american apparel, butcher voluptate nisi qui.</p>
						<p>Raw denim you probably haven't heard of them jean shorts
							Austin. Nesciunt tofu stumptown aliqua, retro synth master
							cleanse. Mustache cliche tempor, williamsburg carles vegan
							helvetica. Reprehenderit butcher retro keffiyeh dreamcatcher
							synth. Cosby sweater eu banh mi, qui irure terry richardson ex
							squid. Aliquip placeat salvia cillum iphone. Seitan aliquip quis
							cardigan american apparel, butcher voluptate nisi qui.</p>
						<p>Raw denim you probably haven't heard of them jean shorts
							Austin. Nesciunt tofu stumptown aliqua, retro synth master
							cleanse. Mustache cliche tempor, williamsburg carles vegan
							helvetica. Reprehenderit butcher retro keffiyeh dreamcatcher
							synth. Cosby sweater eu banh mi, qui irure terry richardson ex
							squid. Aliquip placeat salvia cillum iphone. Seitan aliquip quis
							cardigan american apparel, butcher voluptate nisi qui.</p>
						<p>Raw denim you probably haven't heard of them jean shorts
							Austin. Nesciunt tofu stumptown aliqua, retro synth master
							cleanse. Mustache cliche tempor, williamsburg carles vegan
							helvetica. Reprehenderit butcher retro keffiyeh dreamcatcher
							synth. Cosby sweater eu banh mi, qui irure terry richardson ex
							squid. Aliquip placeat salvia cillum iphone. Seitan aliquip quis
							cardigan american apparel, butcher voluptate nisi qui.</p>
						<p>Raw denim you probably haven't heard of them jean shorts
							Austin. Nesciunt tofu stumptown aliqua, retro synth master
							cleanse. Mustache cliche tempor, williamsburg carles vegan
							helvetica. Reprehenderit butcher retro keffiyeh dreamcatcher
							synth. Cosby sweater eu banh mi, qui irure terry richardson ex
							squid. Aliquip placeat salvia cillum iphone. Seitan aliquip quis
							cardigan american apparel, butcher voluptate nisi qui.</p>
						<p>Raw denim you probably haven't heard of them jean shorts
							Austin. Nesciunt tofu stumptown aliqua, retro synth master
							cleanse. Mustache cliche tempor, williamsburg carles vegan
							helvetica. Reprehenderit butcher retro keffiyeh dreamcatcher
							synth. Cosby sweater eu banh mi, qui irure terry richardson ex
							squid. Aliquip placeat salvia cillum iphone. Seitan aliquip quis
							cardigan american apparel, butcher voluptate nisi qui.</p>
						<p>Raw denim you probably haven't heard of them jean shorts
							Austin. Nesciunt tofu stumptown aliqua, retro synth master
							cleanse. Mustache cliche tempor, williamsburg carles vegan
							helvetica. Reprehenderit butcher retro keffiyeh dreamcatcher
							synth. Cosby sweater eu banh mi, qui irure terry richardson ex
							squid. Aliquip placeat salvia cillum iphone. Seitan aliquip quis
							cardigan american apparel, butcher voluptate nisi qui.</p>
						<p>Raw denim you probably haven't heard of them jean shorts
							Austin. Nesciunt tofu stumptown aliqua, retro synth master
							cleanse. Mustache cliche tempor, williamsburg carles vegan
							helvetica. Reprehenderit butcher retro keffiyeh dreamcatcher
							synth. Cosby sweater eu banh mi, qui irure terry richardson ex
							squid. Aliquip placeat salvia cillum iphone. Seitan aliquip quis
							cardigan american apparel, butcher voluptate nisi qui.</p> -->

					</div>
					<div class="tab-pane fade" id="profile">
						<%-- <c:if test="${same_products.size()>0 }"> --%>
						<c:forEach var="item" items="${same_products}">

							<div class="row-fluid">
								<div class="span2">
									<img src="<c:url value="/assets/user/img/${item.img}"/>" alt="">
								</div>
								<div class="span6">
									<h5>${item.name }</h5>
									<p>${item.title }</p>
								</div>
								<div class="span4 alignR">
									<form class="form-horizontal qtyFrm">
										<h3>
											<fmt:formatNumber type="number" groupingUsed="true"
												value="${item.price }" />
											₫
										</h3>
										<label class="checkbox"> <input type="checkbox">
											Adds product to compair
										</label><br>
										<div class="btn-group">
											<a href="product_details.html" class="defaultBtn"><span
												class=" icon-shopping-cart"></span> Add to cart</a> <a
												href="product_details.html" class="shopBtn">VIEW</a>
										</div>
									</form>
								</div>
							</div>
							<hr class="soft">
						</c:forEach>


						<%-- </c:if>  --%>


						
						
						
						
						
						
					</div>
					<!-- <div class="tab-pane fade" id="cat1">
						<p>Etsy mixtape wayfarers, ethical wes anderson tofu before
							they sold out mcsweeney's organic lomo retro fanny pack lo-fi
							farm-to-table readymade. Messenger bag gentrify pitchfork
							tattooed craft beer, iphone skateboard locavore carles etsy
							salvia banksy hoodie helvetica. DIY synth PBR banksy irony.
							Leggings gentrify squid 8-bit cred pitchfork. Williamsburg banh
							mi whatever gluten-free, carles pitchfork biodiesel fixie etsy
							retro mlkshk vice blog. Scenester cred you probably haven't heard
							of them, vinyl craft beer blog stumptown. Pitchfork sustainable
							tofu synth chambray yr.</p>
						<br> <br>
						<div class="row-fluid">
							<div class="span2">
								<img src="assets/img/b.jpg" alt="">
							</div>
							<div class="span6">
								<h5>Product Name</h5>
								<p>Nowadays the lingerie industry is one of the most
									successful business spheres. We always stay in touch with the
									latest fashion tendencies - that is why our goods are so
									popular..</p>
							</div>
							<div class="span4 alignR">
								<form class="form-horizontal qtyFrm">
									<h3>$140.00</h3>
									<label class="checkbox"> <input type="checkbox">
										Adds product to compair
									</label><br>
									<div class="btn-group">
										<a href="product_details.html" class="defaultBtn"><span
											class=" icon-shopping-cart"></span> Add to cart</a> <a
											href="product_details.html" class="shopBtn">VIEW</a>
									</div>
								</form>
							</div>
						</div>
						<hr class="soften" />
						<div class="row-fluid">
							<div class="span2">
								<img src="assets/img/a.jpg" alt="">
							</div>
							<div class="span6">
								<h5>Product Name</h5>
								<p>Nowadays the lingerie industry is one of the most
									successful business spheres. We always stay in touch with the
									latest fashion tendencies - that is why our goods are so
									popular..</p>
							</div>
							<div class="span4 alignR">
								<form class="form-horizontal qtyFrm">
									<h3>$140.00</h3>
									<label class="checkbox"> <input type="checkbox">
										Adds product to compair
									</label><br>
									<div class="btn-group">
										<a href="product_details.html" class="defaultBtn"><span
											class=" icon-shopping-cart"></span> Add to cart</a> <a
											href="product_details.html" class="shopBtn">VIEW</a>
									</div>
								</form>
							</div>
						</div>
						<hr class="soften" />
					</div> -->
					<!-- <div class="tab-pane fade" id="cat2">

						<div class="row-fluid">
							<div class="span2">
								<img src="assets/img/d.jpg" alt="">
							</div>
							<div class="span6">
								<h5>Product Name</h5>
								<p>Nowadays the lingerie industry is one of the most
									successful business spheres. We always stay in touch with the
									latest fashion tendencies - that is why our goods are so
									popular..</p>
							</div>
							<div class="span4 alignR">
								<form class="form-horizontal qtyFrm">
									<h3>$140.00</h3>
									<label class="checkbox"> <input type="checkbox">
										Adds product to compair
									</label><br>
									<div class="btn-group">
										<a href="product_details.html" class="defaultBtn"><span
											class=" icon-shopping-cart"></span> Add to cart</a> <a
											href="product_details.html" class="shopBtn">VIEW</a>
									</div>
								</form>
							</div>
						</div>
						<hr class="soften" />
						<div class="row-fluid">
							<div class="span2">
								<img src="assets/img/d.jpg" alt="">
							</div>
							<div class="span6">
								<h5>Product Name</h5>
								<p>Nowadays the lingerie industry is one of the most
									successful business spheres. We always stay in touch with the
									latest fashion tendencies - that is why our goods are so
									popular..</p>
							</div>
							<div class="span4 alignR">
								<form class="form-horizontal qtyFrm">
									<h3>$140.00</h3>
									<label class="checkbox"> <input type="checkbox">
										Adds product to compair
									</label><br>
									<div class="btn-group">
										<a href="product_details.html" class="defaultBtn"><span
											class=" icon-shopping-cart"></span> Add to cart</a> <a
											href="product_details.html" class="shopBtn">VIEW</a>
									</div>
								</form>
							</div>
						</div>
						<hr class="soften" />
						<div class="row-fluid">
							<div class="span2">
								<img src="assets/img/d.jpg" alt="">
							</div>
							<div class="span6">
								<h5>Product Name</h5>
								<p>Nowadays the lingerie industry is one of the most
									successful business spheres. We always stay in touch with the
									latest fashion tendencies - that is why our goods are so
									popular..</p>
							</div>
							<div class="span4 alignR">
								<form class="form-horizontal qtyFrm">
									<h3>$140.00</h3>
									<label class="checkbox"> <input type="checkbox">
										Adds product to compair
									</label><br>
									<div class="btn-group">
										<a href="product_details.html" class="defaultBtn"><span
											class=" icon-shopping-cart"></span> Add to cart</a> <a
											href="product_details.html" class="shopBtn">VIEW</a>
									</div>
								</form>
							</div>
						</div>
						<hr class="soften" />
						<div class="row-fluid">
							<div class="span2">
								<img src="assets/img/d.jpg" alt="">
							</div>
							<div class="span6">
								<h5>Product Name</h5>
								<p>Nowadays the lingerie industry is one of the most
									successful business spheres. We always stay in touch with the
									latest fashion tendencies - that is why our goods are so
									popular..</p>
							</div>
							<div class="span4 alignR">
								<form class="form-horizontal qtyFrm">
									<h3>$140.00</h3>
									<label class="checkbox"> <input type="checkbox">
										Adds product to compair
									</label><br>
									<div class="btn-group">
										<a href="product_details.html" class="defaultBtn"><span
											class=" icon-shopping-cart"></span> Add to cart</a> <a
											href="product_details.html" class="shopBtn">VIEW</a>
									</div>
								</form>
							</div>
						</div>
						<hr class="soften" />

					</div> -->
				</div>

			</div>
		</div>
	</div>
</body>