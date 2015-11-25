<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="style.css" rel="stylesheet" type="text/css">
<title>Dodaj Bilet</title>
</head>

<style rel="stylesheet" type="text/css">
	body{
		background-color: #000000;
		background: url('http://zapodaj.net/images/d1bbac5508d59.jpg'); 
		background-position: center top; no-repeat;
	}
	table{
		border-collapse: collapse;
		width: 300px; 
	    margin-top: auto;
     	margin-left: 530px;
    }
	td{
		border: 2px solid green;
		color: white;
		padding: 5px;
	}
	.ramka{
    	font-weight: bold;
    	margin-left: 455px;
    }
</style>
 
<body>
	<jsp:useBean id="bilet" class="main.java.com.smatyjas.domain.Bilet" scope="session" />
	<jsp:setProperty name="bilet" property="*" />
	<jsp:useBean id="biletmanager" class="main.java.com.smatyjas.service.BiletManager" scope="application" />
	<%
		biletmanager.dodajBilet(bilet);
	%>
	<div class="dodaj">
	<h1><center><font color="green">Dodano następujący Bilet:</font></center></h1>
<table>
	<tr class = "ramka">
		<td>Rodzaj:</td>
		<td>Cena:</td>
		<td>Opis:</td>
	</tr>
	<tr>
		<td><jsp:getProperty name="bilet" property="rodzaj"></jsp:getProperty></td>
		<td><jsp:getProperty name="bilet" property="cena"></jsp:getProperty></td>
		<td><jsp:getProperty name="bilet" property="opis"></jsp:getProperty></td>
	</tr>
</table>
<br>
	<a href="index.jsp"><h3><center><font color="green">Powrót do strony głównej</a></h3></center>
	<a href="pobierzDaneBiletu.jsp"><h3><center><font color="green">Dodaj następny Bilet</a></h3></center>
	<a href="pokazBilety.jsp"><h3><center><font color="green">Pokaż wszystkie bilety</a></h3></center>
</div>
</body>
</html>