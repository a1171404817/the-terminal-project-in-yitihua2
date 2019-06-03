<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>My JSP 'login.jsp' starting page</title>

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
            margin-left: 500px;
        }
    </style>
</head>

<body bgcolor="#E3E3E3">
<form action="mainteacherServlet" method="post">
    <table>
        <caption>
            教师登陆
        </caption>

        <tr>
            <td>用户名：</td>
            <td><input type="text" name="username" size="25"/></td>
        </tr>

        <tr>
            <td>密码：</td>
            <td><input type="password" name="pwd" size="26"/></td>
        </tr>




    </table>

    <input type="submit" value="登陆"   style=" width:250px;height:40px;">


</form>
</body>
</html>
