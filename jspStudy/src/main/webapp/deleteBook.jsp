<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <title>도서 삭제</title>
    <link rel="stylesheet" href="./resources/css/bootstrap.min.css" />
</head>
<body>
<div class="container py-4">
    <%@ include file="menu.jsp" %>

    <h2>도서 삭제</h2>
    <p>정말 이 도서를 삭제하시겠습니까?</p>
    <form action="AniDeleteAction.do" method="post">
        <input type="hidden" name="bookId" value="${bookId}" />

        <button type="submit" class="btn btn-danger">삭제하기</button>
        <a href="AniListAction.do" class="btn btn-secondary">취소</a>
    </form>

    <%@ include file="footer.jsp" %>
</div>
</body>
</html>
