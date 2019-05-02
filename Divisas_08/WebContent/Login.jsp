<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Iniciar Sesión</title>

<link href="css/Login.css" rel="stylesheet" type="text/css">
<link href="css/Nav-Bar.css" rel="stylesheet" type="text/css">

</head>
<body>

    <nav class="topnav">
      <div class ="logo">
        <a href="Home.jsp">
        	<img class="imgLogo" height="45px" width="45px" src="Assets/Img/moneda.png">          
        </a>
      </div>

      <div class="links">
        <a href="Login.jsp" >MI CARTERA</a>
        <a href="MyData.jsp" >MIS DATOS</a>
        <a href="operations" >OPERACIONES</a>
        <a href="help">AYUDA</a>
      </div>

      <div class="userData">
          <a href="Register.jsp" >REGISTRATE</a>
          <a href="Login.jsp" >INICIA SESION</a>
      </div>
      
    </nav>


<div class= "frontbody">
  Inicia sesión para acceder a tu cuenta
  </div>

<div class= "loginButtons">
  <button>Iniciar Sesión de Pedro Álvarez</button>
  <button>Iniciar Sesión de Cristina López</button>
  <button>Cerrar Sesión de Usuario</button>
</div>

</body>
</html>