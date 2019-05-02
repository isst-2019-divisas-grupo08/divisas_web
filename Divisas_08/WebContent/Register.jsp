<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
�Reg�strate para disfrutar de Tr$ps!
  </div>
  
  <div class="registerForm">
    <form action="RegistroServlet">

<input type="email" name="email" placeholder="Introduzca su email" style="margin-left:25%"/>
<input type="password" name="password" placeholder="Introduzca su contrase�a"/>
 
 <select name="tratamiento">
<option>Don</option>
<option>Do�a</option>
<option>Sr</option>
<option>Sra</option>
</select>

<input type="text" name="nombre" placeholder="Introduzca su nombre" style="margin-left:25%"/>
<input type="text" name="apellido" placeholder="Introduzca sus apellidos"/>
<input type="text" name="dni" placeholder="Introduzca su DNI/NIF" style="margin-left:25%"/>
<input type="text" name="pais" placeholder="Introduzca su pa�s"/>

<input type="text" name="direccion" placeholder="Introduzca su contrase�a"/>
 
 <select name="transporte">
<option>Hombre</option>
<option>Mujer</option>
<option>Otro</option>
</select>

<input type="number" name="telefono" placeholder="Introduzca su n� de tel�fono"/>
<input type="text" name="cuenta" placeholder="Introduzca su cuenta"/>



<button type="submit">Registrarse</button>

</form>
  
  </div>

</body>
</html>