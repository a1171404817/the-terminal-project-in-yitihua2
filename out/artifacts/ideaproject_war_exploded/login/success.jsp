<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'success.jsp' starting page</title>
    
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
  <form action="mainYunSuanServlet" method="post">
      <input type= "submit" value="自动出题判卷模式-开始考试" style=" margin-left:125px;width:250px;height:40px;"/>
  </form>

  <form action="showresultServlet" method="post">
      <input type= "submit" value="自动出题判卷模式-查看成绩" style=" margin-left:125px;width:250px;height:40px;"/>
  </form>

  <form action="traditionalshowresultServlet" method="post">
      <input type= "submit" value="传统模式-开始考试" style=" margin-left:125px;width:250px;height:40px;"/>
  </form>

  <form action="traditionstudentwatchServlet" method="post">
      <input type= "submit" value="传统模式-查看成绩" style=" margin-left:125px;width:250px;height:40px;"/>
  </form>
    <div style="margin-left: 162px">
    登陆成功<a href="login/welcome.jsp" >这里</a>返回主界面。
    </div>
  </body>
</html>
