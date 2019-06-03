<%@page import="java.util.logging.SimpleFormatter"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="entity.marksbar"%>
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
<form action="showresultServlet" method="post">



    <table border="1" cellspacing="0">
        <caption>成绩总览</caption>
        <tr><th>考生</th>
            <th>考试日期</th>
            <th>总分</th>

                <%
  		ArrayList<marksbar> marksbars=(ArrayList<marksbar>)session.getAttribute("marksbars");

  		for(int i=0;i<marksbars.size();i++){
  		marksbar markbar=(marksbar) marksbars.get(i);
  		%>

        <tr>

            <td><%=markbar.getUsername()%></td>
            <td><%=markbar.getsdate()%></td>
            <td><%=markbar.getmark()%></td>


        </tr>
        <%
            }

        %>

    </table>
    </br>

    <a href="login/success_teacher.jsp" style=" margin-left:120px;">返回</a>

</form>






</body>
</html>
