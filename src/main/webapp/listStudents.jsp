<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 19.04.2017
  Time: 10:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>List</title>
</head>
<body>

<% String message = (String) request.getAttribute( "value" );%>
<h1>

    <%=message%>

</h1>
<form>
    <table>
        <tr>
            <th>ID</th>
            <th>ФИО</th>
            <th>Возраст</th>
            <th>Группа</th>
        </tr>
        <c:forEach items="${requestScope.list}" var="student">

            <tr>
                <td><c:out value="${student.id}"></c:out></td>
                <td><c:out value="${student.name}"></c:out></td>
                <td><c:out value="${student.age}"></c:out></td>
                <td><c:out value="${student.group_id}"></c:out></td>
                <td><input type="button" value="Изменить" onclick="window.location.href='<%=request.getContextPath()%>/edit?id=${student.id}&action=edit';"></td>
                <td><input type="button" value="Удалить" onclick="window.location.href='<%=request.getContextPath()%>/edit?id=${student.id}&action=delete';"></td>
            </tr>
        </c:forEach>
    </table>
    <input type="button" value="Добавить"onclick="window.location.href='<%=request.getContextPath()%>/edit?action=add';">
</form>
</body>
</html>
