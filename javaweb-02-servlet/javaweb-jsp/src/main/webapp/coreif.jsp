<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="coreif.jsp">
        <input type="text" name="username" value="${param.username}">
        <input type="submit" value="提交">
    </form>
    <c:if test="${param.username == 'admin'}" var="isAdmin">
        <c:out value="管理员欢迎您"/>
    </c:if>
    ${isAdmin}
</body>
</html>
