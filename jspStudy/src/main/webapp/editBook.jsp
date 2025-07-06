<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>도서 수정</title>
<link rel="stylesheet" href="./resources/css/bootstrap.min.css" />
<script type="text/javascript" src="./resources/js/validation.js"></script>
</head>
<body>
	<div class="container py-4">
		<%@ include file="menu.jsp"%>
		<div class="p-5 mb-4 bg-body-tertiary rounded-3">
			<div class="container-fluid py-5">
				<h1 class="display-5 fw-bold">도서 수정</h1>
				<p class="col-md-8 fs-4">EditBook</p>
			</div>
		</div>
		<!-- 중간 타이틀 영역 -->
		<form action="AniUpdateAction.do" method="post">
			
			<input type="hidden" name="bookId" value="${book.bookId}" />

			<div class="mb-3">
				<label for="name" class="form-label">제목</label>
				<div class="col-sm-3">
					<input type="text" class="form-control" id="name" name="name"
						value="${book.name}" required />
			</div>
			<div class="mb-3">
				<label for="unitPrice" class="form-label">가격</label>
				<div class="col-sm-3">
				<input type="number" class="form-control" id="unitPrice"
					name="unitPrice" value="${book.unitPrice}" required />
			</div>
			<div class="mb-3">
				<label for="author" class="form-label">저자</label>
				<div class="col-sm-3">
				<input type="text" class="form-control" id="author" name="author" value="${book.author}" />
			</div>
			<div class="mb-3">
			<label for="description" class="form-label">설명</label>
			<div class="col-sm-3">
			<textarea class="form-control" id="description"
				name="description">${book.description}</textarea>
			</div>
			<div class="mb-3">
			<label for="publisher" class="form-label">출판사</label>
			<div class="col-sm-3">
			<input type="text" class="form-control" id="publisher"
					name="publisher" value="${book.publisher}" />
			</div>
			<div class="mb-3">
			<label for="category" class="form-label">카테고리</label>
			<div class="col-sm-3">
			<input type="text" class="form-control" id="category"
					name="category" value="${book.category}" />
			</div>
			<div class="mb-3">
			<label for="unitsInStock" class="form-label">재고 수량</label>
			<div class="col-sm-3">
			<input type="number" class="form-control" id="unitsInStock"
					name="unitsInStock" value="${book.unitsInStock}" />
			</div>
			<div class="mb-3">
			<label for="releaseDate" class="form-label">출판일</label>
			<div class="col-sm-3">
			<input type="date" class="form-control" id="releaseDate"
					name="releaseDate" value="${book.releaseDate}" />
			</div>
			<div class="mb-3">
			<label for="condition" class="form-label">상태</label>
			<div class="col-sm-3">
			<input type="text" class="form-control" id="condition"
					name="condition" value="${book.condition}" />
			</div>
			<div class="mb-3">
			<label for="quantity" class="form-label">수량</label>
			<div class="col-sm-3">
			<input type="number" class="form-control" id="quantity"
					name="quantity" value="${book.quantity}" />
			</div>
			<div class="mb-3">
			<label for="filename" class="form-label">이미지</label>
			<div class="col-sm-5">
			<input type="file" class="form-control" id="filename"
					name="filename" value="${book.filename}" />
			</div>
			<button type="submit" class="btn btn-primary">수정하기</button>
			
		</form>

		<%@ include file="footer.jsp"%>
	</div>
</body>
</html>
