<%--
  Created by IntelliJ IDEA.
  User: jsjx
  Date: 2018/6/20
  Time: 14:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/updateCustomer" method="post">
        顾客名:<input type="tex" value="${customer.username}" id="username" name="username">
        职业:<input type="text" value="${customer.jobs}" id="jobs" name="jobs">
        电话:<input type="text" value="${customer.phone}" id="phone" name="phone">
        <input type="hidden" value="${customer.id}" id="id" name="id">
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
