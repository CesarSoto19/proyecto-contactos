
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="./css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="./css/login.css">
        <title>Login</title>
    </head>
    <body>
        <br>
        <br>
        <div class="login-box">
      <img src="imagenes/usuario.png" class="avatar" alt="Avatar">
      <h1>Login</h1>
      <form>
       
        <label for="nombre">Usuario</label>
        <input type="text" id="user"  placeholder="Ingresar nombre de usuario" required>
        
        <input type="password" id="password" placeholder="Ingresar contraseña" required>
        <a class="btn btn-success btn-lg" href="Controlador?accion=listar">Ingresar</a>
         </body>
</html>
