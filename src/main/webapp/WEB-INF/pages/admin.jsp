<%--
  Created by IntelliJ IDEA.
  User: Jenya
  Date: 04.03.2019
  Time: 15:13
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Администратор</title>
</head>
<body>
<div align="center"><h1>Страница администратора</h1></div>
<c:url value="/logout" var="logoutUrl" />
<div align="right" ><p>Выйти из учетной записи: <a href="${logoutUrl}">Выход</a></p></div></br>

<div class="123" style="display: flex; justify-content: space-around; ">
<ul>

    <li><a href="/TonirovkaList"><h3>Тонировка авто</h3></a> </li>
    <li><a href="/WindowFilmList"><h3>Оконные пленки</h3></a> </li>
    <li><a href="/PPFList"><h3>Антигравийные пленки</h3></a> </li>
    <li><a href="/DeteylingList"><h3>Детейлинг</h3></a> </li>
    <li><a href="/SaleList"><h3>Продажи</h3></a> </li>
    <li><a href="/MarketingList"><h3>Маркетинг</h3></a> </li>
    <li><a href="/ManagementList"><h3>Менеджмент</h3></a> </li>
    <li><a href="/OneCList"><h3>1С</h3></a> </li>

</ul>
    <ul>
        <li><a href="/userList"><h3>Редактирование пользователей</h3></a> </li>
    </ul>

</div>
<div align="center"><a href="/">главная</a></div>
</body>
</html>
