<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<body>
<h2>Hello World!</h2>

<form action="${pageContext.request.contextPath}/login" method="post">
    <input type="text" name="username">
    <input type="password" name="password">
    <input type="checkbox" name="interest" value="足球">足球
    <input type="checkbox" name="interest" value="乒乓球">乒乓球
    <input type="checkbox" name="interest" value="网球">网球
    <input type="checkbox" name="interest" value="篮球">篮球
    <input type="submit">
</form>

</body>
</html>
