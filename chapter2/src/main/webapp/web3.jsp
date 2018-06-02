<%--
  Created by IntelliJ IDEA.
  User: singk
  Date: 2018/6/2
  Time: 10:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setAttribute("girl","我的天空，可会有湿的泪");
    session.setAttribute("myGirl","九霄云外cry");
    request.getRequestDispatcher("/m3").forward(request,response);
%>
</body>
</html>
