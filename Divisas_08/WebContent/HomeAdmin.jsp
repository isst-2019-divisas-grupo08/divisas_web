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
	
<shiro:hasRole name="admin">
	<div class="topnav">
      <div class ="logo">
        <a href="Home.jsp">
        	<img class="imgLogo" height="45px" width="45px" src="Assets/Img/moneda.png">         
        </a>
      </div>

      <div class="links">
        <a href="DataAdmin.jsp" >MIS DATOS</a>
        <a href="Clients.jsp" >GESTIÓN DE CLIENTES</a>
        <a href="AdminClients.jsp" >ADMINISTRACIÓN DE CLIENTES</a>
      </div>

      <div class="userData">
      <a href="LogoutServlet">Salir</a>
      </div>
    </div>
    
   </shiro:hasRole>
</body>
</html>