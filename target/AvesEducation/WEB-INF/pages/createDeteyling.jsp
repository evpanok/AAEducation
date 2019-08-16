<%--
  Created by IntelliJ IDEA.
  User: Jenya
  Date: 20.05.2019
  Time: 16:23
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
    <form role="form" class="form-horizontal" action="/deteyling/add" method="post">
        <h3>Создание подраздела</h3>

        <input class="form-control form-group" type="text" name="name"  placeholder="Название подраздела">
        <input class="form-control form-group" type="text" name="title"  placeholder="Заголовок">
        <input class="form-control form-group" type="text" name="text"  placeholder="Текст">
        <input class="form-control form-group" type="text" name="video"  placeholder="ссылка на видео https://...">
        <input class="form-control form-group" type="text" name="wordFile"  placeholder="ссылка на файл https://...">
        <input class="form-control form-group" type="text" name="exelFile"  placeholder="ссылка на файл https://...">
        <input class="form-control form-group" type="text" name="pdfFile"  placeholder="ссылка на файл https://...">


        <input type="submit" class="btn btn-primary" value="Создать">
    </form>
</div>
</body>
</html>

