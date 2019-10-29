<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${empty review}">
		<h3>회원에 대한 정보가 존재하지 않습니다.</h3>
	</c:if>

	<c:if test="${!empty review}">
		<h3> 해당 회원이 작성한 리뷰 목록입니다. </h3>
		<c:forEach items="${review}" var="review">
			${review.m_no}    ${review.review}  	<br>
		</c:forEach>
	</c:if>
</body>
</html>