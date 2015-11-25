<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="style.css" rel="stylesheet" type="text/css">
<title>Dodaj Klienta</title>
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
    overflow: auto; 
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
	<jsp:useBean id="klient" class="main.java.com.smatyjas.domain.Klient" scope="session" />
	<jsp:setProperty name="klient" property="*" />
	<jsp:useBean id="klientmanager" class="main.java.com.smatyjas.service.KlientManager" scope="application" />
	<div class="contentbox">
	<form action="dodajKlienta.jsp">
	<table class="operationtable">
		<tr class='tableheader'>
			<td class colspan='2'><h1><font color="green"><h2>Dodaj Klienta</font></h2></td>
		</tr>
		<tr>
			<td class = pole> Imie:</td>
			<td><input type="text" name="imie" pattern="[A-Za-z]*" title="Imie powinno składać się wyłącznie z liter" value="" /></td>
		</tr>
		<tr>
			<td class = pole>Nazwisko:</td>
			<td><input type="text" name="nazwisko" pattern="[A-Za-z]*" title="Nazwisko powinno składać się wyłącznie z liter" value="" /></td>
		</tr>
		<tr>
			<td class = pole>Numer telefonu:</td>
			<td ><input type="text" name="numertelefonu" pattern="[0-9]*" title="Numer telefonu powinien składać się wyłącznie z cyfr" value="" /></td>
		</tr>
		<tr>
			<td class = potwierdz colspan="2"><input type="submit" value=" DODAJ KLIENTA" align="right"></td>
		</tr>
	</table>
	</form>
	</div>
	<br>
    <center><a href="index.jsp"><h3><font color="green">Strona główna</h3></center>
</body>
</html>