<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>用户[${user.nickname}]详细信息</title>
   

  </head>
  
  <body>
	    <table width="700" align="center" border="1">
	    	<tr>
	    		<td>用户标识：</td><td>${user.id}</td>
	    	</tr>
	    	<tr>
	    		<td>用户名：</td><td>${user.username}</td>
	    	</tr>
	    	<tr>
	    		<td>用户密码：</td><td>${user.password}</td>
	    	</tr>
	    	<tr>
	    		<td>用户昵称：</td><td>${user.nickname}</td>
	    	</tr>
	    	<tr>
	    		<td>用户邮箱：</td><td>${user.email}</td>
	    	</tr>
	    </table>
  </body>
</html>
