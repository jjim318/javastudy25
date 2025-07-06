<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="./resources/css/bootstrap.min.css" />
<!-- 부트스트랩 설치 -->
<meta charset="UTF-8">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO"
	crossorigin="anonymous"></script>
<title>WelcomeAniBook</title>
</head>
<body>

	<div class="cintainer py-4">
		<%@ include file="menu.jsp"%>

		<%!String greeting = "WELCOME TO BOOK SHOPPING MALL";
	String tagline = "Welcome to Web Market!";%>

		<div class="p-5 mb-4 bg-body-tertiary rounded-3">
			<div class="container-fluid py-5">
				<h1 class="display-5 fw-bold"><%=greeting%></h1>
				<p class="col-md-8 fs-4">BookMarket</p>
			</div>
		</div>
		<!-- 중간 타이틀 영역 -->
		<div class="row align=items-md-stretch text-center">
			<div class="col-md-12">
				<div class="h-100 p-5">
					<h3><%=tagline%></h3>
					<%
					response.setIntHeader("Refresh", 5);//자동 갱신 내장 객체 넣음
					Date day = new Date();
					String am_pm;
					int hour = day.getHours();
					int minute = day.getMinutes();
					int secoud = day.getSeconds();
					if (hour / 12 == 0) {
						am_pm = "AM";
					} else {
						am_pm = "PM";
						hour = hour - 12;
					}
					String CT = hour + ":" + minute + ":" + secoud + " " + am_pm;
					out.println("현재 접속 시각:" + CT + "\n");
					%>
				</div>
			</div>
		</div>
		<!-- 본문 영역 -->
	</div>
	<%@include file="footer.jsp"%>

</html>