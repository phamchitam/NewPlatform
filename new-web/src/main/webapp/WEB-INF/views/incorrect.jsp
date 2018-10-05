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

    <br/> <h1 class = "white">Incorrect Account. Please try again !</h1>
    <br/>
    <br/>
    <span class= "white" > User: </span> &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp; &nbsp;  <input type='text' id = 'username' name='j_username' />
    <br/>
        <span class = "white" > Password: </span> &nbsp; &nbsp;  <input type='password' id = 'password' name='j_password' />
    <br/>
        <div class = "white" > <input name="submit" type="submit" value="submit" /> </div>

</form>
</body>
</html>
