<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<head>
<meta charset="UTF-8">
<title>Liên Hệ</title>
</head>
<body>
	<div class="span9">
		<c:if test="${not empty alert  }">
		<div class="alert alert-danger" role="alert">${alert}</div>
		</c:if>
		<hr class="soften">
		<div class="well well-small">
			<h1>Thông tin liên hệ</h1>

			<hr class="soften" />
			<div class="row-fluid">
				<div class="span7 relative">
					<iframe style="width: 100%; height: 350px" frameborder="0"
						scrolling="no" marginheight="0" marginwidth="0"
						src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3919.305213195662!2d106.69480311411658!3d10.78791946193298!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x31752f351fee231d%3A0x7f187870a3cd3ec1!2zMTUwIMSQLiBOZ3V54buFbiBWxINuIFRo4bunLCDEkGEgS2FvLCBRdeG6rW4gMSwgVGjDoG5oIHBo4buRIEjhu5MgQ2jDrSBNaW5oLCBWaeG7h3QgTmFt!5e0!3m2!1svi!2s!4v1674275994828!5m2!1svi!2s"></iframe>

					<div class="absoluteBlk">
						<div class="well wellsmall">
							<h4>Thông tin liên hệ</h4>
							<h5>
								150B Nguyễn Văn Thủ<br /> phường Đakkao <br /> quận 1 TP Hồ
								Chí Minh<br /></br> ﻿Tel 033.631.9544<br />


							</h5>
						</div>
					</div>
				</div>

				<div class="span2">
					<h4>Email Us</h4>
					<form:form action="add-feedBack" method="post"
						modelAttribute="newFeedback" class="form-horizontal">
						<fieldset>
							<div class="control-group">

								<form:input type="text" placeholder="name" class="input-xlarge"
									path="name" />

							</div>
							<div class="control-group">

								<form:input type="text" placeholder="email" class="input-xlarge"
									path="email" />

							</div>
							<div class="control-group">

								<form:input type="text" placeholder="subject"
									class="input-xlarge" path="title" />

							</div>
							<div class="control-group">
								<form:textarea rows="3" id="textarea" class="input-xlarge"
									path="text"></form:textarea>

							</div>

							<button class="shopBtn" type="submit">Send email</button>

						</fieldset>
					</form:form>
				</div>
			</div>


		</div>
	</div>
</body>
