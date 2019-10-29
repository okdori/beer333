<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body style="font-size: 2.5em; padding: 200px 100px 100px 100px;">
	<c:if test="${!empty result}">
		요청이 성공적으로 수행되었습니다.
	</c:if>

	<c:if test="${empty result}">
		사용자의 요청이 정상적으로 이루어지지 않았습니다<br>
	</c:if>
</body>
</html>