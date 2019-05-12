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
			<div class="logo">
				<a href="HomeLogin.jsp"> <img class="imgLogo" height="45px"
					width="45px" src="Assets/Img/moneda.png">
				</a>
			</div>

			<div class="links">
				<a href="HomeLogin.jsp">HOME</a> <a href="Wallet.jsp">MI
					CARTERA</a> <a href="MyData.jsp">MIS DATOS</a> <a
					href="Operations.jsp">OPERACIONES</a> <a href="Help.jsp">AYUDA</a>
			</div>

			<div class="userData">
				<a href="/LogoutServlet">Salir</a>
			</div>
		</div>

		<div class="misDatos">

			<h3>Mis Monederos:</h3>
			<c:choose>
				<c:when test="${empty monederos}">
					<h4>No tienes ningún monedero creado</h4>
				</c:when>
				<c:otherwise>
					<table>
						<c:forEach items="${monederos}" var="monedero">
							<tr>
								<td>${monedero.symbol}</td>
								<td>${monedero.saldo}</td>
							</tr>
						</c:forEach>
					</table>
				</c:otherwise>
			</c:choose>
			<form action="CrearMonederoServlet" method="post">
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
			</form>
			<form action="CambiarServlet" method="post">
				<select id="originWallet" name="originWallet">
					<c:choose>
						<c:when test="${empty originList}">
							<option value="1" selected>EUR</option>
						</c:when>
						<c:otherwise>
							<option value="1" ${originList == 1 ? 'selected="selected"' : ''}>EUR</option>
						</c:otherwise>
					</c:choose>
					<option value="1" ${originList == 1 ? 'selected="selected"' : ''}>EUR</option>
					<option value="2" ${originList == 2 ? 'selected="selected"' : ''}>GBP</option>
					<option value="3" ${originList == 3 ? 'selected="selected"' : ''}>USD</option>
					<option value="4" ${originList == 4 ? 'selected="selected"' : ''}>JPY</option>
					<option value="5" ${originList == 5 ? 'selected="selected"' : ''}>AUD</option>
					<option value="6" ${originList == 6 ? 'selected="selected"' : ''}>CAD</option>
					<option value="7" ${originList == 7 ? 'selected="selected"' : ''}>CHF</option>
				</select> <select id="destinyWallet" name="destinyWallet">
					<c:choose>
						<c:when test="${empty destList}">
							<option value="1" selected>EUR</option>
						</c:when>
						<c:otherwise>
							<option value="1" ${destList == 1 ? 'selected="selected"' : ''}>EUR</option>
						</c:otherwise>
					</c:choose>
					<option value="2" ${destList == 2 ? 'selected="selected"' : ''}>GBP</option>
					<option value="3" ${destList == 3 ? 'selected="selected"' : ''}>USD</option>
					<option value="4" ${destList == 4 ? 'selected="selected"' : ''}>JPY</option>
					<option value="5" ${destList == 5 ? 'selected="selected"' : ''}>AUD</option>
					<option value="6" ${destList == 6 ? 'selected="selected"' : ''}>CAD</option>
					<option value="7" ${destList == 7 ? 'selected="selected"' : ''}>CHF</option>
				</select>
				<c:choose>
					<c:when test="${empty moneyChange}">
						<input type="number" step=0.001 id="amountMoney"
							name="amountMoney">
					</c:when>
					<c:otherwise>
						<input type="number" step=0.001 id="amountMoney"
							name="amountMoney" value="${moneyChange}">
					</c:otherwise>
				</c:choose>
				<button name="btnAction" value="calcChange" id="calcChange">Calcular
					Cambio</button>
				<c:choose>
					<c:when test="${empty rateChange}">
						<input type="number" step=0.001 id="rateChange" name="rateChange">
					</c:when>
					<c:otherwise>
						<input type="number" step=0.001 id="rateChange" name="rateChange"
							value="${rateChange}">
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${empty finalChange}">
						<input type="number" step=0.001 id="finalChange"
							name="finalChange">
					</c:when>
					<c:otherwise>
						<input type="number" step=0.001 id="finalChange"
							name="finalChange" value="${finalChange}">
					</c:otherwise>
				</c:choose>
				<button name="btnAction" value="confirmChange" id="confirmChange">Efectuar
					Cambio</button>
			</form>
		</div>
	</shiro:hasRole>
</body>