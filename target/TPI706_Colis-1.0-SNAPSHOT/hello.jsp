<%--
  Created by IntelliJ IDEA.
  User: kosmie
  Date: 24/09/2021
  Time: 11:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p> Hello <%= request.getParameter("name") %> !</p>
<p> Hello ${param.name} !</p>
</body>
</html>
