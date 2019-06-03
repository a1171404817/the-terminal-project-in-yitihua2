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

  <form action="showteacherresultServlet" method="post">
      <input type= "submit" value="自定出题判卷模式-成绩总览" style=" margin-left:125px;width:250px;height:40px;"/>
  </form>
  <form action="showteacherdetailresultServlet" method="post">
      <input type= "submit" value="自定出题判卷模式-题目细览" style=" margin-left:125px;width:250px;height:40px;"/>
  </form>

  <form action="exam/setting.jsp" method="post">
      <input type= "submit" value="自定出题判卷模式-参数设置" style=" margin-left:125px;width:250px;height:40px;"/>
  </form>

  <form action="exam/chuti.jsp" method="post">
      <input type= "submit" value="传统模式-出题" style=" margin-left:125px;width:250px;height:40px;"/>
  </form>

  <form action="traditionteacheryuejuanServlet" method="post">
      <input type= "submit" value="传统模式-阅卷" style=" margin-left:125px;width:250px;height:40px;"/>
  </form>

  <div style="margin-left: 162px">
      登陆成功<a href="login/welcome.jsp" >这里</a>返回主界面。
  </div>


</html>
