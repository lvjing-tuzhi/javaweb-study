<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2021/10/20
  Time: 9:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    pageContext.setAttribute("name1","吕竟1");
    request.setAttribute("name2","吕竟2");
    session.setAttribute("name3","吕竟3");
    application.setAttribute("name4","吕竟4");
%>

<%
    String name1 = (String) pageContext.findAttribute("name1");
    String name2 = (String) pageContext.findAttribute("name2");
    String name3 = (String) pageContext.findAttribute("name3");
    String name4 = (String) pageContext.findAttribute("name4");
    String name5 = (String) pageContext.findAttribute("name5");
%>

<h1>
    ${name1}
    ${name2}
    ${name3}
    ${name4}
    ${name5}
    <%=name5%>
</h1>

</body>
</html>
