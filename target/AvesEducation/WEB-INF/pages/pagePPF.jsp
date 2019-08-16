<%--
  Created by IntelliJ IDEA.
  User: Jenya
  Date: 20.05.2019
  Time: 12:53
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Антигравийная пленка</title>
    <link rel="stylesheet" href="<c:url value="ress/css/normalize.css" />">
    <link rel="stylesheet" href="<c:url value="ress/css/page.css" />">
    <link href="https://fonts.googleapis.com/css?family=PT+Sans+Narrow:400,700&amp;subset=cyrillic" rel="stylesheet">
</head>
<body>
<header>

    <a href="/"><img src="<c:url value="ress/static/home.png"/>" alt="home" class="nav_menu_home"></a>

    <img src="<c:url value="ress/static/logo.png"/>" alt="logo" class="index-logo" width=120>

    <div class="nav_registry">
        <span>Вы авторизованы как ${login}</span><br>
        <span>
                <c:url value="/logout" var="logoutUrl" />
                Выйти с учетной записи: <a class="user_href" href="${logoutUrl}">Выход</a></span>
    </div>
</header>

<c:forEach items="${pages}" var="page">

    <a href="/ppf/${page.name}">${page.name}</a><br>

</c:forEach>
<footer>
    <a href="https://avesauto.ua" class="module-info_site">www.avesauto.ua</a>
</footer>


</body>
</html>
