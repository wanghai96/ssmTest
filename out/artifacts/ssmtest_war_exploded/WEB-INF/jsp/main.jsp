<%--
  Created by IntelliJ IDEA.
  User: jsjx
  Date: 2018/6/20
  Time: 10:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table id="customer" border="1">
        <tr><th>序号</th><th>顾客名</th><th>职业</th><th>电话</th><th colspan="2">操作</th></tr>
        <c:forEach var="customer" items="${customerList}">
            <tr>
             <td>${customer.id}</td>
             <td>${customer.username}</td>
             <td>${customer.jobs}</td>
             <td>${customer.phone}</td>
             <td><a href="${pageContext.request.contextPath}/updateCustomerById?id=${customer.id}">修改</a></td>
             <td><a href="${pageContext.request.contextPath}/deleteCustomerById?id=${customer.id}"> 删除</a></td>
            </tr>
        </c:forEach>
    </table>
    <div><a href="${pageContext.request.contextPath}/ahrefinsertCustomer">新增</a></div>
</body>
</html>
