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
    request.setAttribute("girl","我的中国心");
    request.getRequestDispatcher("/m1").forward(request,response);
%>
</body>
</html>
