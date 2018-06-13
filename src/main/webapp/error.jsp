<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>err_page</title>
</head>
<body>
	<center>
		<c:if test="${not empty errCode}">
			<h1>${errCode}:Custom Errors</h1>
		</c:if>
		
		<c:if test="${empty errCode}">
			<h1>System Errors</h1>
		</c:if>
		
		<c:if test="${not empty errMsg}">
			<h2>${errMsg} </h2>
		</c:if>
	</center>
</body>
</html>