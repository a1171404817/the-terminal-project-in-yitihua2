
<%@page import="java.text.SimpleDateFormat"%>
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

<body bgcolor="white" >
<form action="readyresultServlet" method="post">



    <table border="1" cellspacing="0">
        <caption>开始考试</caption>
        <tr>
            <th>题目</th>
            <th>答题</th>

                <%
  		ArrayList<ArrayList<String>> als=(ArrayList<ArrayList<String>>)session.getAttribute("als");

  		for(int i=0;i<als.size();i++){
  		ArrayList<String> tmal=(ArrayList<String>) als.get(i);
  		%>

        <tr>

            <td style="width: 240px;text-align: center"><%=tmal.get(0)%></td>
            <td><input type="text" name="fname<%=i%>"  style="width: 120px;" /></td>

        </tr>
        <%
            }

        %>


    </table>
    </br>
    <input type="submit" value="交卷" style=" margin-left:125px;width:150px;height:40px;"/>

</form>


</body>
</html>
