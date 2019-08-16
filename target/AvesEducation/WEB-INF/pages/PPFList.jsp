<%--
  Created by IntelliJ IDEA.
  User: Jenya
  Date: 20.05.2019
  Time: 13:54
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>

    <title>Антигравийная пленка</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
</head>
<body>
<a href="/createPPF">Создать подраздел</a>
<table>
    <button type="button" id="delete_page" >Удалить</button></li>
    <c:forEach items="${pages}" var="page">
        <tr>

            <td><input type="checkbox" name="toDelete[]" value="${page.id}" id="checkbox_${page.id}"/></td>
            <td><a href="/adminPPF/${page.id}">${page.name}</a> </td>

        </tr>

    </c:forEach>
</table><br>
<a href="/admin">назад</a>

<script>
    $('#delete_page').click(function(){
        var data = { 'toDelete[]' : []};
        $(":checked").each(function() {
            data['toDelete[]'].push($(this).val());
        });
        $.post("/adminPPF/delete", data, function(data, status) {
            window.location.reload();
        });
    });
</script>
</body>
</html>
