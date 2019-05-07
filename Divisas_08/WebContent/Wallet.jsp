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
        <a href="Wallet.jsp" >MI CARTERA</a>
        <a href="MyData.jsp" >MIS DATOS</a>
        <a href="Operations.jsp" >OPERACIONES</a>
        <a href="Help.jsp">AYUDA</a>
      </div>

      <div class="userData">
      <a href="/LogoutServlet">Salir</a>
      </div> 
    </div>

<div class ="misDatos">
  
      <h3> Mis Monederos:</h3>
      <c:choose>
	    <c:when test="${cliente.cuenta==null}">
	        <h4>No tienes ningún monedero creado</h4>
	    </c:when>    
	    <c:otherwise>
      <c:forEach items="${cliente.cuenta.monederos}" var="monedero">
    	<tr>      
        	<td>${monedero.symbol}</td>
	        <td>${monedero.saldo}</td>
	    </tr>
		</c:forEach>
	    </c:otherwise>
	</c:choose>
	<form action="/CrearMonedero" method="post">
	<select id="currency" name="currency">
		  <option value="1" selected>EUR</option>
		  <option value="2">GBP</option>
		  <option value="3">USD</option>
		  <option value="4">JPY</option>
		  <option value="5">AUD</option>
		  <option value="6">CAD</option>
		  <option value="7">CHF</option>	
	</select>
	<button action="submit">Crear</button>
</div>
</shiro:hasRole>