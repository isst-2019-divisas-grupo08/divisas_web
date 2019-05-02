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
<link href="css/Nav-Bar.css" rel="stylesheet" type="text/css">
<link href="css/MyDashboard.css" rel="stylesheet" type="text/css">
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
<div class="myDashboard">

    <h1 class="centrado">TRIP$, ¿necesitas cambio?</h1>
    <p class="centrado">Disfruta de la comodidad de una casa de cambios desde tu dispositivo con la menor de las comisiones.</p>
    <p class="centrado">Selecciona las divisas que necesitas para realizar el cambio y el tiempo en el que quieres que se haga efectivo, nosotros nos ocupamos del resto.</p>
    <p class="centrado">¡Comienza ya!</p>
    
    <div>
        <form>
          <div class="cambio">
            <div>
              <label for="cantidad">CANTIDAD A CAMBIAR:  </label>
              <input placeholder="Cantidad" id="cantidad" type="text" class="validate">
              <select>
              <option value="usd">USD</option>
              <option value="cad">CAD</option>
              <option value="aud">AUD</option>
              <option value="eur">EUR</option>
              <option value="gbp">GBP</option>
              <option value="mxn">MXN</option>
              <option value="jpy">JPY</option>
              <option value="chf">CHF</option>
          </select>
          <select>
              <option value="inmmediato">Inmediato</option>
              <option value="3dias">3 días</option>
              <option value="7dias">7 días</option>
          </select>
    
          <button>EFECTUAR CAMBIO</button>
    
            </div>
          </div>
          
        </form>
      </div>
    
    </div>
</body>
</html>