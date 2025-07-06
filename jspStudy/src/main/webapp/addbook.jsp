<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <title>도서 추가</title>
    <link rel="stylesheet" href="./resources/css/bootstrap.min.css" />
    <script type="text/javascript" src="./resources/js/validation.js"></script>
</head>
<body>
<div class="container py-4">
    <%@ include file="menu.jsp" %>
<div class="p-5 mb-4 bg-body-tertiary rounded-3">
			<div class="container-fluid py-5">
				<h1 class="display-5 fw-bold">도서 추가</h1>
				<p class="col-md-8 fs-4">AddBook</p>
			</div>
		</div>
		<!-- 중간 타이틀 영역 -->
		
    <form action="AddBook.do" method="post">
        <div class="mb-3">
            <label for="bookId" class="form-label">도서 ID</label>
            <input type="text" class="form-control" id="bookId" name="bookId" required />
        </div>
        <div class="mb-3">
            <label for="name" class="form-label">제목</label>
            <input type="text" class="form-control" id="name" name="name" required />
        </div>
        <div class="mb-3">
            <label for="unitPrice" class="form-label">가격</label>
            <input type="number" class="form-control" id="unitPrice" name="unitPrice" required />
        </div>
        <div class="mb-3">
            <label for="author" class="form-label">저자</label>
            <input type="text" class="form-control" id="author" name="author" />
        </div>
        <div class="mb-3">
            <label for="description" class="form-label">설명</label>
            <textarea class="form-control" id="description" name="description"></textarea>
        </div>
        <div class="mb-3">
            <label for="publisher" class="form-label">출판사</label>
            <input type="text" class="form-control" id="publisher" name="publisher" />
        </div>
        <div class="mb-3">
            <label for="category" class="form-label">카테고리</label>
            <input type="text" class="form-control" id="category" name="category" />
        </div>
        <div class="mb-3">
            <label for="unitsInStock" class="form-label">재고 수량</label>
            <input type="number" class="form-control" id="unitsInStock" name="unitsInStock" />
        </div>
        <div class="mb-3">
            <label for="releaseDate" class="form-label">출판일</label>
            <input type="date" class="form-control" id="releaseDate" name="releaseDate" />
        </div>
        <div class="mb-3">
            <label for="condition" class="form-label">상태</label>
            <input type="text" class="form-control" id="condition" name="condition" />
        </div>
        <div class="mb-3">
            <label for="quantity" class="form-label">수량</label>
            <input type="number" class="form-control" id="quantity" name="quantity" />
        </div>
        <div class="mb-3">
            <label for="filename" class="form-label">이미지</label>
            <div class="col-sm-5">
            <input type="file" class="form-control" id="filename" name="filename" />
        </div>
        <button type="submit" class="btn btn-primary">추가하기</button>
    </form>

    <%@ include file="footer.jsp" %>
</div>
</body>
</html>
