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

	  <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
  </head>
  
  <body>
  <div class="container">
  	<a href="order/${userid}/add" class="btn btn-primary" style="margin-top: 10px">下订单</a>
    <table class="table table-striped" align="center" border="1" style="margin-top: 10px">
    	<tr>
    		<td>订单标识</td>
    		<td>订单编号</td>
    		<td>下单时间</td>
    		<td>订单信息</td>
    		<td>备注</td>
    		<td>操作</td>
    	</tr>
    	<c:forEach items="${orders}" var="o">
    		<tr>
    			<td>${o.orderId}</td>
    			<td>${o.orderNum}</a></td>
    			<td>${o.time}</td>
    			<td>${o.product}</td>
    			<td>${o.remark}</td>
    			<td><a href="order/${o.userId}/${o.orderId}/delete">删除</a></td>
    		</tr>
    	</c:forEach>
    </table>
  </div>
  </body>

  <script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdn.bootcss.com/bootstrap/4.0.0-beta.3/js/bootstrap.min.js"></script>
</html>
