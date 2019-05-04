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

<title>Home | Tr$ps</title>

<link href="css/Nav-Bar.css" rel="stylesheet" type="text/css">
<link href="css/Home.css" rel="stylesheet" type="text/css">

</head>

<body>

	<div class="topnav">
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
    </div>
    
    
    <div class= selectors>
    
	    <div class="select">
	     <input id="selectCurrency" type="number" placeholder="Cambia" onChange="getCambio(this)">
	     	<select class="selectCurrency" id="selectCurrencyType" onChange="getCambio(this)">
	  			<option value="selectEUR" selected>EUR</option>
	  			<option value="selectGBP">GBP</option>
	  			<option value="selectUSD">USD</option>
	  			<option value="selectJPY">JPY</option>
	  			<option value="obtainAUD">AUD</option>
	  			<option value="obtainCAD">CAD</option>
	  			<option value="obtainCHF">CHF</option>
	  	 	</select>
	    </div>
	    
		
		
	     <div class="obtain">
	     <input class="obtainCurrency" id="obtainCurrency" type="number" placeholder="Obtén" readonly>
	     	<select class="obtainCurrency" id="obtainCurrencyType" onChange="getCambio(this)">
	  			<option value="obtainEUR">EUR</option>
	  			<option value="obtainGBP">GBP</option>
	  			<option value="obtainUSD" selected>USD</option>
	  			<option value="obtainJPY">JPY</option>
	  			<option value="obtainAUD">AUD</option>
	  			<option value="obtainCAD">CAD</option>
	  			<option value="obtainCHF">CHF</option>
	  	 	</select>
	    </div>
 
    </div>
    
    <div class="Calculator">
        
	    <div class="divisa">
	    <label class="nombre">Euros</label>
	    <input class="valor" type="number" value="1" data-cambio="1" step="0.25" onChange="valorCambiado(this)"/>
	  </div>
	
	  <div class="divisa">
	    <label class="nombre">Dólares</label>
	    <input class="valor" type="number" value="1" id="USD" step="0.25" onChange="valorCambiado(this)"/>
	  </div>
	
	  <div class="divisa">
	    <label class="nombre">Libras</label>
	    <input class="valor" type="number" value="1" id="GBP" step="0.25" onChange="valorCambiado(this)"/>
	  </div>
	
	  <div class="divisa">
	    <label class="nombre">Yenes</label>
	    <input class="valor" type="number" value="1" id="JPY" onChange="valorCambiado(this)"/> 
	  </div>

	</div>
	
  <script src="scripts.js" ></script>
      
</body>
</html>