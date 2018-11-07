<%--
  Created by IntelliJ IDEA.
  User: jsjx
  Date: 2018/6/14
  Time: 9:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>用户管理系统</title>
    <script language="javascript" type="application/javascript">
      function check()
      {
        if(document.getElementById("username").value=="")
        {
          alert("请输入用户名!");
          return false;
        }
        if(document.getElementById("password").value=="")
        {
          alert("请输入密码!");
          return false;
        }
        return true;
      }
    </script>
  </head>
  <body>
    <form action="${pageContext.request.contextPath}/findUserByUsername" method="post" onsubmit="return check()">
      用户名：<input type="text" id="username" name="username"><br/>
      密码：<input type="password" id="password" name="password"><br/>
      <input type="submit" value="提交">
    </form>
  </body>
</html>
