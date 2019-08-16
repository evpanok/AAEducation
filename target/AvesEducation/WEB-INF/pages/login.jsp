<%--
  Created by IntelliJ IDEA.
  User: Jenya
  Date: 25.02.2019
  Time: 17:22
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Авторизация</title>
    <link rel="stylesheet" href="<c:url value="ress/css/normalize.css" />">
    <link rel="stylesheet" href="<c:url value="ress/css/style.css" />">
    <link href="https://fonts.googleapis.com/css?family=PT+Sans+Narrow:400,700&amp;subset=cyrillic" rel="stylesheet">

</head>
<body>
<c:url value="/j_spring_security_check" var="loginUrl"/>


<div class="container">
    <div class="index-logo">
        <img  src="<c:url value="ress/static/AvesLogo.png"/>" alt="main-logo" width=140 height=140>
        <p>Вход на сайт</p>
    </div>
    <form action="${loginUrl}" class="main-form" method="POST">
        <div class="field">
            <label for="input-login">Логин</label>
            <input type="text" name="j_login" placeholder="Имя пользователя" id="input-login">
        </div>
        <div class="field">
            <label for="input-pass">Пароль</label>
            <input type="password" name="j_password" placeholder="Пароль" id="input-pass">
        </div>
        <input type="submit" value="Войти">

        <div align="center"><c:if test="${param.error ne null}">
            <p>Неверный логин или пароль</p>
        </c:if>

            <c:if test="${param.logout ne null}">
                <p>Пока=)</p>
            </c:if></div>
    </form>
</div>


</div>
</body>
</html>
