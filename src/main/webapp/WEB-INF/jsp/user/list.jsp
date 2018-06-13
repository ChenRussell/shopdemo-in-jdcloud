<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>用户列表</title>
  </head>
  
  <body>
    <a href="user/add">添加用户</a>
    <table width="700" align="center" border="1">
    	<tr>
    		<td>用户标识</td>
    		<td>用户名</td>
    		<td>用户密码</td>
    		<td>操作</td>
    	</tr>
    	<c:forEach items="${users}" var="u">
    		<tr>
    			<td>${u.value.userid}</td>
    			<td><a href="user/${u.value.userid}/show">${u.value.username}</a></td>
    			<td>${u.value.password}</td>
    			<td><a href="user/${u.value.userid}/update">更新</a>&nbsp;<a href="user/${u.value.userid}/delete">删除</a></td>
    		</tr>
    	</c:forEach>
    </table> 
  </body>
</html>
