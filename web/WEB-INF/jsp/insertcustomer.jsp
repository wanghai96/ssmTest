<%--
  Created by IntelliJ IDEA.
  User: jsjx
  Date: 2018/6/20
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/insertCustomer" method="post">
    顾客名:<input type="tex"  id="username" name="username"><br/>
    职业:<input type="text"  id="jobs" name="jobs"><br/>
    电话:<input type="text"  id="phone" name="phone"><br/>
    <input type="submit" value="新增"/>
</form>
</body>
</html>
