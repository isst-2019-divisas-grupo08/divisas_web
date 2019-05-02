<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrarse</title>

<link href="css/Register.css" rel="stylesheet" type="text/css">
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
	¡Regístrate para disfrutar de Tr$ps!
</div>


<form class="registerForm" action="RegistroServlet">

<input type="email" name="email" placeholder="Introduzca su email">
<input type="password" name="password" placeholder="Introduzca su contraseña"/>
 
 <select name="tratamiento">
<option>Don</option>
<option>Doña</option>
<option>Sr</option>
<option>Sra</option>
</select>

<input type="text" name="nombre" placeholder="Introduzca su nombre"/>
<input type="text" name="apellido" placeholder="Introduzca sus apellidos"/>
<input type="text" name="dni" placeholder="Introduzca su DNI/NIF"/>
<input type="text" name="pais" placeholder="Introduzca su país"/>

<input type="text" name="direccion" placeholder="Introduzca su contraseña"/>
 
 <select name="transporte">
<option>Hombre</option>
<option>Mujer</option>
<option>Otro</option>
</select>

<input type="number" name="telefono" placeholder="Introduzca su nº de teléfono"/>
<input type="text" name="cuenta" placeholder="Introduzca su cuenta"/>



<button type="submit">Registrarse</button>

</form>


</body>
</html>