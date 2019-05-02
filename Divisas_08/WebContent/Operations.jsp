<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
  content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<title>Trip$</title>
<link href="css/Operations.css" rel="stylesheet" type="text/css">
<link href="css/Nav-Bar.css" rel="stylesheet" type="text/css">
</head>
<body>
<header class="animated fadeInDown" id="navbar">
    <div class="topnav">
      <div class ="logo">
        <a href="Home.jsp">
          <img class="imgLogo" height="45px" width="45px" src="./img/moneda.png">
          <h1 class="name">Trip$</h1>           
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
      
    </div>
      
</header>
<div class="myTransaction">

    <h1>
        LISTA DE TRANSACCIONES REALIZADAS
    </h1>
    
    <ul>
      <li>CONCEPTO: Solicitud de cambio de 200EUR a GBP</li><p>ESTADO: Procesando</p>
      <li>CONCEPTO: Solicitud de cambio de 350GBP a EUR</li><p>ESTADO: Completado</p>
      <li>CONCEPTO: Solicitud de cambio de 350GBP a EUR</li><p>ESTADO: Cancelado</p>
      <li>CONCEPTO: Ingreso de 350 GBP</li><p>ESTADO: Completado</p>
    </ul>
    
</div>
</body>
</html>