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
    
    <title>用户更新</title>
	  <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
  </head>
  
  <body>
	  <div class="container" align="center">
		<sf:form method="post" modelAttribute="user">
			<table width="700" align="center" border="1" class="table">
				<tr>
					<td>用户名：</td><td>${user.username}<sf:hidden path="username"/></td>
				</tr>
				<tr>
					<td>用户密码：</td><td><sf:password path="password"/><sf:errors path="password"/></td>
				</tr>
				<tr>
					<td colspan="2">
						<input class="btn btn-primary" type="submit" value="用户更新">
					</td>
				</tr>
			</table>
		</sf:form>
	  </div>
  </body>
</html>
