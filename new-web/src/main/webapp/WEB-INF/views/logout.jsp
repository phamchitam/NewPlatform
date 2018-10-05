<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Logout Page</title>

</head>
<body>
<h1>See you !!!</h1>
<br/>
<form name='loginForm' action="/j_spring_security_check" method='POST'>

    <br/>
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
