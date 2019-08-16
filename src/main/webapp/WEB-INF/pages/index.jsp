<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Главная страница</title>

    <link rel="stylesheet" href="<c:url value="ress/css/normalize.css" />">
    <link rel="stylesheet" href="<c:url value="ress/css/page.css" />">
    <link href="https://fonts.googleapis.com/css?family=PT+Sans+Narrow:400,700&amp;subset=cyrillic" rel="stylesheet">
</head>
<body>
<header>
    <div class="nav_menu">
        <button class="nav_button">Menu</button>
        <div class="nav_button-content">
            <a href="/pageTonirovka">Тонировка авто</a>
            <a href="/pageWindowFilm">Оконные пленки</a>
            <a href="/pagePPF">Антигравийные пленки</a>
            <a href="/pageDeteyling">Детелинг</a>
            <a href="/pageSale">Продажи</a>
            <a href="/pageMarketing">Маркетинг</a>
            <a href="/pageManagement">Менеджмент</a>
            <a href="/pageOneC">1C</a>
            <a href="#">Link</a>
            <a href="#">Link</a>
        </div>
    </div>
        <img src="<c:url value="ress/static/logo.png"/>" alt="logo" class="index-logo" width=120>
        <div class="nav_registry">
            <span>Вы авторизованы как ${login}</span><br>
            <span>
                <c:url value="/logout" var="logoutUrl" />
                Выйти с учетной записи: <a class="user_href" href="${logoutUrl}">Выход</a></span>
        </div>


</header>
<footer>
    <a href="https://avesauto.ua" class="module-info_site">www.avesauto.ua</a>
</footer>





</body>
</html>
