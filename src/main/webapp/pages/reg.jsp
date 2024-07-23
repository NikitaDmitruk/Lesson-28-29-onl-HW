<%--
  Created by IntelliJ IDEA.
  User: simonpirko
  Date: 16.07.24
  Time: 9:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<jsp:include page="_bootstrap.jsp"/>
<jsp:include page="_header.jsp"/>
<form action="/reg" method="post">
    <input type="text" name="username" placeholder="Username">
    <input type="text" name="password" placeholder="Password">
    <input type="text" name="email" placeholder="Email">
    <button>Submit</button>
</form>
</body>
</html>
