<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
  content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Mis Datos | Tr$ps</title>

<link href="css/MyData.css" rel="stylesheet" type="text/css">
<link href="css/Nav-Bar.css" rel="stylesheet" type="text/css">

</head>

<body>
<shiro:hasRole name="cliente">
	<div class="topnav">
      <div class ="logo">
        <a href="HomeLogin.jsp">
        	<img class="imgLogo" height="45px" width="45px" src="Assets/Img/moneda.png">         
        </a>
      </div>

      <div class="links">
      	<a href="HomeLogin.jsp" >HOME</a>
        <a href="WalletServlet" >MI CARTERA</a>
        <a href="UserServlet" >MIS DATOS</a>
        <a href="Operations.jsp" >OPERACIONES</a>
        <a href="Contactos.jsp">CONTACTOS</a>
      </div>

      <div class="userData">
      <a href="LogoutServlet">Salir</a>
      </div> 
    </div>

    <img class="imgLogo" height="500px" width="1330px" src="Assets/Img/misdatos.jpg">

<div class ="misDatos">
    <h3>Nombre: ${cliente.nombre}</h3>
    <h3>Apellidos: ${cliente.apellido}</h3>
    <h3>Nº Teléfono: ${cliente.telefono}</h3>
    <h3>DNI/NIF: ${cliente.DNI}</h3>
    <h3>Email: ${cliente.email}</h3>
    <h3>Pais: ${cliente.pais}</h3>
    <h3>Sexo: ${cliente.tratamiento}</h3>
    <h3>Direccion: ${cliente.direccion}</h3>
    <input type="submit" value="Editar">
    
    <h2>Introduce tarjera de crédito</h2>
    <div class="user">
    <h3>introduzca nombre y apellido del titular</h3>
	<input type="text" name="nombre" placeholder="Nombre y Apellidos"/>
	</div>
	<div class="user">
	<h3>introduzca fecha de caducidad</h3>
	<input type="date" name="fecha" placeholder="Fecha de caducidad"/>
	</div>
	<div class="user">
	<h3>introduzca el número de tarjeta</h3>
	<input type="number" name="numeroTarjeta" placeholder="Numero de tarjeta"/>
	</div>
    <input type="submit" value="Introducir">
</div>

</shiro:hasRole>
</body>
</html>