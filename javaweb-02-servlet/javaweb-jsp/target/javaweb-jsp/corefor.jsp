<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2021/10/20
  Time: 11:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        ArrayList<Object> arr = new ArrayList<>();
        arr.add("a");
        arr.add("b");
        arr.add("c");
        request.setAttribute("list",arr);
    %>
    <c:forEach var="item" items="${list}">
        <c:out value="${item}"/>
    </c:forEach>
</body>
</html>
