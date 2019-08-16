<%--
  Created by IntelliJ IDEA.
  User: Jenya
  Date: 08.05.2019
  Time: 12:09
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>

    <title>Список пользователей</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
</head>
<body>
<a href="/createUser">Создать пользователя</a><br>
<table>

    <button type="button" id="delete_user" >Удалить</button></li>
    <c:forEach items="${users}" var="user">
        <tr>

            <td><input type="checkbox" name="toDelete[]" value="${user.id}" id="checkbox_${user.id}"/></td>
            <td>${user.login}</td>

        </tr>

    </c:forEach>
</table>
<br>
<a href="/admin">назад</a>

<script>
    $('#delete_user').click(function(){
        var data = { 'toDelete[]' : []};
        $(":checked").each(function() {
            data['toDelete[]'].push($(this).val());
        });
        $.post("/adminUsers/delete", data, function(data, status) {
            window.location.reload();
        });
    });
</script>
</body>
</html>
