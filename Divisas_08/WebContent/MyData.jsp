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
<link href="css/MyData.css" rel="stylesheet" type="text/css">
<link href="css/Nav-Bar.css" rel="stylesheet" type="text/css">
</head>
<body>
<header class="animated fadeInDown" id="navbar">
    <div class="topnav">
      <div class ="logo">
        <a href="Home.jsp">
        	<img class="imgLogo" height="45px" width="45px" src="./Assets/Img/moneda.png">
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

<div class ="misDatos">
  
    <h3> Nombre: {{ user._name }}</h3>
    <h3>Apellidos: {{ user._surname }}</h3>
    <h3>Nº Teléfono: {{ user._phoneNumber }}</h3>
    <h3>Nº Cuenta: {{ user._account.idAccount }}</h3>
    <h3>DNI/NIF: {{user._dni}}</h3>
    <h3>Email: {{user._email}}</h3>
    <h3>Pais: {{user._country}}</h3>
    <h3>Sexo: {{user._gender}}</h3>
    <h3>Direccion: {{user._address}}</h3>
    <h3>Fecha Nacimiento: {{user._birthDate | date: 'shortDate'}}</h3>
</div>

<div class ="misDatos">
  
      <h3> Mis Monederos:</h3>
        <h4>Monedero 1</h4>
        <h4>Monedero 2</h4>
        <h4>Monedero 3</h4>
        <h4>Monedero 4</h4>
        <h4>Monedero 5</h4>
        <h4>Monedero 6</h4>
        <h4>Monedero 7</h4>
        <h4>Monedero 7</h4>
        <h4>Monedero 7</h4>
        <h4>Monedero 7</h4>
        <h4>Monedero 7</h4>
        <h4>Monedero 7</h4>
        <h4>Monedero 7</h4>
        <h4>Monedero 7</h4>
        <h4>Monedero 7</h4>
        <h4>Monedero 7</h4>
        <h4>Monedero 7</h4>
        <h4>Monedero 7</h4>
        <h4>Monedero 7</h4>
    
</div>
</body>
</html>