<%--
  Created by IntelliJ IDEA.
  User: Jenya
  Date: 23.05.2019
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
    <title>Редактирование</title>
</head>
<body>
<div class="container">
    <form role="form" class="form-horizontal" action="/sale/update" method="post">
        <h3>Создание подраздела</h3>

        <c:set var="page" value="${Page}"/>
        Название  <input class="form-control form-group" type="text" name="name" value="${page.name}" readonly >
        Заголовок <input class="form-control form-group" type="text" name="title" value="${page.title}">
        Текст <input class="form-control form-group" type="text" name="text" value="${page.text}">
        Ссылка на видео <input class="form-control form-group" type="text" name="video" value="${page.video}">
        Ссылка на word файл<input class="form-control form-group" type="text" name="wordFile" value="${page.wordFile}">
        Ссылка на exel файл<input class="form-control form-group" type="text" name="exelFile" value="${page.exelFile}">
        Ссылка на pdf файл<input class="form-control form-group" type="text" name="pdfFile" value="${page.pdfFile}">


        <input type="submit" class="btn btn-primary" value="Изменить">
    </form>
</div>
</body>
</html>

