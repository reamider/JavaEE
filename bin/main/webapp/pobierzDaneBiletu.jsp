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
.contentbox{
	margin-top: auto;
    margin-left: 455px;
    width: auto;
    height: 100%;
    overflow: auto; //przewijanie kursora
    font-family: Times-New-Roman;   
    font-size: 24px; 
	}
.pole{
	color:white;  
	font-weight: lighter; 
	}
.potwierdz{ 
	text-align: center;
	}
</style>

<body>
	<jsp:useBean id="bilet" class="main.java.com.smatyjas.domain.Bilet" scope="session" />
	<jsp:setProperty name="bilet" property="*" />
	<jsp:useBean id="biletmanager" class="main.java.com.smatyjas.service.BiletManager" scope="application" />
	<div class="contentbox">
	<form action="dodajBilet.jsp">
	<table class="operationtable">
		<tr class='tableheader'>
			<td class colspan='2'><h1><font color="green"><h2>Dodaj Bilet</font></h2></td>
		</tr>
		<tr>
			<td class = pole> Rodzaj:</td>
			<td><input type="text" name="rodzaj" pattern="[A-Za-z]*" title="Bilet powinien sk³adaæ siê wy³¹cznie z liter" value="" /></td>
		</tr>
		<tr>
			<td class = pole>Cena:</td>
			<td><input type="text" name="cena" pattern="[0-9]*" title="Cena powinno sk³adaæ siê wy³¹cznie z liczb ca³kowitych" value="" /></td>
		</tr>
		<tr>
			<td class = pole>Opis:</td>
			<td><input type="text" name="opis" value="" /></td>
		</tr>
		<tr>
			<td class = potwierdz colspan="2"><input type="submit" value=" DODAJ BILET" align="right"></td>
		</tr>
	</table>
	</form>
	</div>
	<br>
    <center><a href="index.jsp"><h3><font color="green">Strona glowna</h3></center>
</body>
</html>