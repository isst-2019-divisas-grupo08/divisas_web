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
        <a href="${pageContext.request.contextPath}/WalletServlet">MI CARTERA</a>
        <a href="MyData.jsp" >MIS DATOS</a>
        <a href="Operations.jsp" >OPERACIONES</a>
        <a href="Help.jsp">AYUDA</a>
      </div>

      <div class="userData">
      <a href="/LogoutServlet">Salir</a>
      </div> 
    </div>


<div class ="misDatos">
    <h3>Nombre: ${cliente.nombre}</h3>
    <h3>Apellidos: ${cliente.apellido}</h3>
    <h3>Nº Teléfono: ${cliente.telefono}</h3>
    <h3>DNI/NIF: ${cliente.DNI}</h3>
    <h3>Email: ${cliente.email}</h3>
    <h3>Pais: ${cliente.pais}</h3>
    <h3>Sexo: ${cliente.tratamiento}</h3>
    <h3>Direccion: ${cliente.direccion}</h3>
    
</div>

</shiro:hasRole>
</body>
</html>