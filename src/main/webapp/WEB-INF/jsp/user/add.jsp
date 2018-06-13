<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>用户添加</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	  <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
  </head>
  
  <body>
	  <div class="container" align="center" style="margin-top: 10px">
		<sf:form method="post" modelAttribute="user">
			<table class="table" align="center" border="1">
				<tr>
					<td>用户名：</td><td><sf:input path="username"/><sf:errors path="username"/></td>
				</tr>
				<tr>
					<td>用户密码：</td><td><sf:password path="password"/><sf:errors path="password"/></td>
				</tr>
				<tr>
					<td colspan="2">
						<input class="btn btn-primary" type="submit" value="用户添加">
					</td>
				</tr>
			</table>
		</sf:form>
	  </div>
  </body>
</html>
