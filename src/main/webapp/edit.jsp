<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 20.04.2017
  Time: 13:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    String action = (String) request.getParameter("action");
%>
<html>
<head>
    <title>Editor</title>
</head>
<body>
    <%--<c:if test="${action == 'edit' }"> <h2>Edit</h2> </c:if>--%>
    <c:if test="${requestScope.action == 'edit' }"> <h2>Edit</h2> </c:if>
    <c:if test="${requestScope.action == 'add' }"> <h2>Add</h2> </c:if>

    <%--<%=request.getParameter( "id" )%> - <%=request.getParameter("action")%>--%>


</body>
</html>
