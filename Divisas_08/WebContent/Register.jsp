<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
  content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">


<title>Registro | Tr$ps</title>

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
        <a href="Wallet.jsp" >MI CARTERA</a>
        <a href="MyData.jsp" >MIS DATOS</a>
        <a href="Operations.jsp" >OPERACIONES</a>
        <a href="Help.jsp">AYUDA</a>
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

<div class="user">
	<input type="email" name="email" placeholder="Email">
</div>

<div class="pass">
<input type="password" name="password" placeholder="Contraseña"/>
</div>

<div class="pass">
<input type="password" name="password" placeholder="Confirmar contraseña"/>
</div>



<!-- 

 <select name="tratamiento">
<option>Don</option>
<option>Doña</option>
<option>Sr</option>
<option>Sra</option>
</select>

<input type="text" name="nombre" placeholder="Nombre"/>

<input type="text" name="apellido" placeholder="Apellidos"/>

<input type="text" name="dni" placeholder="DNI/NIF"/>

<input type="text" name="pais" placeholder="País"/>

 
 <select name="transporte">
<option>Hombre</option>
<option>Mujer</option>
<option>Otro</option>
</select>

<input type="number" name="telefono" placeholder="Introduzca su nº de teléfono"/>

 -->
 

<input type="submit" value="Continuar">

</form>


</body>
</html>