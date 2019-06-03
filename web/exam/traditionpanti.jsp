<%@page import="java.util.logging.SimpleFormatter"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="entity.Ti_anwer"%>
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
            margin-left: 250px;
            margin-top: 0px;
        }
    </style>
</head>

<body bgcolor="white" >
<form action="traditionteacheryuejuanendServlet" method="post">



    <table border="1" cellspacing="0">
        <caption>阅卷</caption>
        <tr>
            <th>考生</th>
            <th>题目</th>
            <th>考生回答</th>
            <th>考试日期</th>
            <th>教师给分</th>

                <%
         ArrayList<Ti_anwer>traditionArti_anwer=(ArrayList<Ti_anwer>)session.getAttribute("traditionArti_anwer");
        if(traditionArti_anwer!=null){
  		for(int i=0;i<traditionArti_anwer.size();i++){

  		%>

        <tr>
            <td><%=traditionArti_anwer.get(i).getUsername()%></td>
            <td><%=traditionArti_anwer.get(i).getTi()%></td>
            <td><%=traditionArti_anwer.get(i).getYouranwer()%></td>
            <td><%=traditionArti_anwer.get(i).getdodate()%></td>
             <td><input type="text" name="markn<%=i%>" style="height: 50px;width: 100px;"  /></td>

        </tr>
        <%
            }
            }
            else {
                %>答题数为空<a href="login/success_teacher.jsp">这里</a>返回主界面。<%
            }
        %>

    </table>
    </br>
    <input type="submit" value="确定" style=" margin-left:275px;width:150px;height:40px;"/>
    <a href="login/success_teacher.jsp">返回</a>

</form>






</body>
</html>
