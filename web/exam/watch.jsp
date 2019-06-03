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
            margin-left: 350px;
            margin-top: 0px;
        }
    </style>
</head>

<body bgcolor="white">
<form action="showresultServlet" method="post">



    <table border="1" cellspacing="0">
        <caption>查看成绩</caption>
        <tr><th>考生</th>
            <th>题目</th>
            <th>正确答案</th>
            <th>你的答案</th>
            <th>得分</th>
            <th>考试日期</th>
                <%
  		ArrayList<Tiku> tikus=(ArrayList<Tiku>)session.getAttribute("tiku");

  		for(int i=0;i<tikus.size();i++){
  		Tiku tiku=(Tiku) tikus.get(i);
  		%>

        <tr>

            <td><%=tiku.getUsername()%></td>
            <td><%=tiku.getTi()%></td>
            <td><%=tiku.getRightAnwer()%></td>
            <td><%=tiku.getYourAnwer()%></td>
            <td><%=tiku.getMark()%></td>
            <td><%=tiku.getDoDate()%></td>

        </tr>
        <%
            }

        %>

    </table>
    </br>

    <a href="login/success.jsp" style=" margin-left:250px;">返回</a>

</form>






</body>
</html>
