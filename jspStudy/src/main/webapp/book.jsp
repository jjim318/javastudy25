<%@page import="mvc.model.aniBook"%>
<%@page import="mvc.model.aniDAO"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>상세페이지</title>
<link rel="stylesheet" href="./resources/css/bootstrap.min.css" />
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO"
	crossorigin="anonymous"></script>
</head>
<body>

	<div class="container py-4">
		<%@ include file="menu.jsp"%>

		<div class="p-5 mb-4 bg-body-tertiary rounded-3">
			<div class="container-fluid py-5">
				<h1 class="display-5 fw-bold">상세페이지</h1>
				<p class="col-md-8 fs-4">BookList</p>
			</div>
		</div>
		<div class="row text-center">
			<img src="./resources/images/${book.filename}"
								style="width: 100%">
			<table class="table table-striped table-bordered">
				<thead class="table-dark">

					<tr>
						<th>제목</th>
						<th>가격</th>
						<th>저자</th>
						<th>출판사</th>
						<th>카테고리</th>
						<th>재고 수량</th>
						<th>출판일</th>
						<th>상태</th>
					</tr>
				</thead>
				<tbody>
					
						<tr>
							<td><c:out value="${book.name}" /></td>
							<td><c:out value="${book.unitPrice}" /></td>
							<td><c:out value="${book.author}" /></td>
							<td><c:out value="${book.publisher}" /></td>
							<td><c:out value="${book.category}" /></td>
							<td><c:out value="${book.unitsInStock}" /></td>
							<td><c:out value="${book.releaseDate}" /></td>
							<td><c:out value="${book.condition}" /></td>
							
							<td><a href="AniDeleteForm.do?bookId=${book.bookId}"
								class="btn btn-outline-primary btn-sm">삭제</a></td>
							<td><a href="AniUpdateForm.do?bookId=${book.bookId}"
								class="btn btn-outline-primary btn-sm">수정</a></td>
						</tr>
				</tbody>
			</table>
		</div>
	</div>

	<%@ include file="footer.jsp"%>
</body>
</html>
