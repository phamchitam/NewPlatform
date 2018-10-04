<%--
  Created by IntelliJ IDEA.
  User: RGB
  Date: 04/10/2018
  Time: 8:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>

</head>
<body>
<form name='loginForm' action="/j_spring_security_check" method='POST'>


    User: &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp; &nbsp;  <input type='text' id = 'username' name='j_username' />
    <br/>
    Password:&nbsp; &nbsp;  <input type='password' id = 'password' name='j_password' />
    <br/>
    <input name="submit" type="submit" value="submit" />

</form>
</body>
</html>
