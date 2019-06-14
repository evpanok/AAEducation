<%--
  Created by IntelliJ IDEA.
  User: Jenya
  Date: 04.03.2019
  Time: 11:59
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>не авторизирован</title>
</head>
<body>
<div align="center">
    <h1>Нет прав доступа для ${login}!</h1>

    <c:url value="/logout" var="logoutUrl" />
    <p><a href="${logoutUrl}">Выйти</a></p>
</div>
</body>
</html>
