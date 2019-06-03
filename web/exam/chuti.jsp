<%@page import="java.util.logging.SimpleFormatter"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="entity.Tiku"%>
<%@page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>My JSP 'main.jsp' starting page</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->

    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <style type="text/css">
        body {
            background-color: #E3E3E3;
            background-repeat: repeat;
            margin-left: 450px;
            margin-top: 0px;
        }
    </style>
</head>

<body bgcolor="white">
<form action="chutiServlet" method="post">



    <table border="1" cellspacing="0">
        <caption>出题</caption>
        <tr>
            <th>题目</th>

                <%


  		for(int i=0;i<5;i++){

  		%>

        <tr>

        <td><input type="textarea" name="tiname<%=i%>" style="height: 50px;width: 300px;"  /></td>

        </tr>
        <%
            }

        %>

    </table>
    </br>
    <input type="submit" value="提交" style=" margin-left:75px;width:150px;height:40px;"/>
    <a href="login/success_teacher.jsp">返回</a>

</form>






</body>
</html>
