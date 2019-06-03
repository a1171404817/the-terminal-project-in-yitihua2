<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>留言板</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body bgcolor="#E3E3E3">
  <center>
  	<form action="addServlet" method="post">
  	<table>
  	<caption>注册</caption>
  		<tr>
  			<td>用户名</td>
  			<td><input type="text" name="username"/></td>
  		</tr>
  		
  		<tr>
  			<td>密码</td>
  			<td><input type="password" name="pwd"/></td>
  		
  		</tr>

		<tr>
			<td>姓名</td>
			<td><input type="text" name="name"/></td>

		</tr>

		<tr>
			<td>性别</td>
			<td><input type="text" name="sex"/></td>

		</tr>

		<tr>
			<td>年龄</td>
			<td><input type="text" name="age"/></td>

		</tr>
  		
  		</table>
  		
  		<input type="submit" value="提交"/>
		<input name="返回" type="button" id="backn1" title="返回" value="返回"  onclick="location.href='login.jsp'" />


  	</table>
  	
  	
  	</form>
  </center>
  
  </body>
</html>
