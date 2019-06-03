<%@page import="java.util.logging.SimpleFormatter"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="entity.Ti"%>
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
            margin-left: 400px;
            margin-top: 0px;
        }
    </style>
</head>

<body bgcolor="white">
<form action="traditionaljiaojuanServlet" method="post">



    <table border="1" cellspacing="0">
        <caption>开始考试</caption>
        <tr>
            <th>题号</th>
            <th>题目</th>
            <th>答题</th>

                <%
         ArrayList<Ti> traditionArti=(ArrayList<Ti>)session.getAttribute("traditionArti");

  		for(int i=0;i<5;i++){

  		%>

        <tr>
        <td><%=traditionArti.get(i).getId()%></td>
        <td><%=traditionArti.get(i).getTi()%></td>
        <td><input type="text" name="jiandatianwername<%=i%>" style="height: 50px;width: 300px;"  /></td>

        </tr>
        <%
            }

        %>

    </table>
    </br>
    <input type="submit" value="交卷" style=" margin-left:150px;width:150px;height:40px;"/>
    <a href="login/success.jsp">返回</a>

</form>






</body>
</html>
