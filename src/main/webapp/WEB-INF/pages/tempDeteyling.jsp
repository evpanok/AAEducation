<%--
  Created by IntelliJ IDEA.
  User: Jenya
  Date: 20.05.2019
  Time: 17:44
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title><c:out value="${Page.title}"/></title>
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

<div class="module-subsection-page">
    <span class="module-subsection-page_name"><c:out value="${Page.name}"/></span>

    <div class="module-subsection-page_video">
        <video width="600" height="400" controls="controls" autoplay="autoplay">
            <source src="${Page.video}" type="video/mp4" />
            Your browser does not support HTML5 video.
        </video>
    </div>
    <div class="module-subsection-page"> <c:out value="${Page.text}"/></div>

    <div class="module-subsection-page_loading">
        <span class="module-subsection-page_loading_text">Файлы для скачки :</span>
        <a href="<c:out value="${Page.wordFile}"/> "  download>скачать</a>
        <a href="<c:out value="${Page.exelFile}"/>" download>скачать</a>
        <a href="<c:out value="${Page.pdfFile}"/>" target="_blank" download>скачать</a>

    </div>

</div>

<footer>
    <a href="https://avesauto.ua" class="module-info_site">www.avesauto.ua</a>
</footer>

</body>
</html>