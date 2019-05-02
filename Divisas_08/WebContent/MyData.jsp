<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mis Datos</title>

<link href="css/MyData.css" rel="stylesheet" type="text/css">
<link href="css/Nav-Bar.css" rel="stylesheet" type="text/css">

</head>

<body>

    <div class="topnav">
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
      
    </div>


<div class ="misDatos">
  
    <h3> Nombre: {{ user._name }}</h3>
    <h3>Apellidos: {{ user._surname }}</h3>
    <h3>N� Tel�fono: {{ user._phoneNumber }}</h3>
    <h3>N� Cuenta: {{ user._account.idAccount }}</h3>
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