<%--
  Created by IntelliJ IDEA.
  User: singk
  Date: 2018/6/2
  Time: 11:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>ognl应用三：简单对象的使用</title>
</head>
<body>
    <s:iterator value="students" var="obj">
        <s:property value="#obj.name"/>
    </s:iterator>
${haha}
</body>
</html>
