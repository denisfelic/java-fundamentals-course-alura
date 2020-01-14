
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="Usuario" type="model.Usuario" scope="request"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Welcome</title>
    </head>
    <body>
        <h1>Bem Víndo</h1>
        <hr>
        <p>
            User ID      :<strong> ${Usuario.id} </strong><br>
            User name    :<strong> ${Usuario.name} </strong><br>
            User username:<strong> ${Usuario.fullName} </strong><br>
            User email   :<strong> ${Usuario.email} </strong><br>
        </p>
    </body>
</html>
