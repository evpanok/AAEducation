<%--
  Created by IntelliJ IDEA.
  User: Jenya
  Date: 08.05.2019
  Time: 15:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
    <title>Создание странице</title>
</head>
<body>
<div class="container">
    <form role="form" class="form-horizontal" action="/user/add" method="post">
        <h3>Создание подраздела</h3>

        <input class="form-control form-group" type="text" name="login" required placeholder="логин">
        <input class="form-control form-group" type="text" name="password" required placeholder="пароль">


        <input type="submit" class="btn btn-primary" value="Создать">
    </form>
</div>
</body>
</html>