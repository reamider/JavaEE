<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"  import="main.java.com.smatyjas.domain.Bilet"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="style.css" rel="stylesheet" type="text/css">
<title>Wszystkie Bilety</title>
</head>

<style rel="stylesheet" type="text/css">
	body{
		background-color: #000000;
		background: url('http://zapodaj.net/images/d1bbac5508d59.jpg'); 
		background-position: center top; no-repeat;
	}
	a{ 
		color: green; 
		font-weight: bold; 
		text-align: center;
	}
 	td{
 		text-align : center;
 		color: white;
 	}
 	th{
 		color: orange;
 	}
    p{
    	margin-left: 12cm;
    	color: green;
    }
    table{
    	margin-left: 140px;
    }                  
</style>

<body>
	<jsp:useBean id="biletmanager" class="main.java.com.smatyjas.service.BiletManager" scope="application" />
	<div class="row">
	<table style="width:80% " border="1";>
    	<tr>
    		<th>ID Biletu:</th>
        	<th>Rodzaj:</th>
        	<th>Cena:</th>
        	<th>Opis:</th>
			<th>DZIAŁANIA:</th>
    	</tr>
    	<c:forEach var="bilet" items="${biletmanager.pobierzBilety()}">
    	<tr>
    		<td>${bilet.id_bilet}</td>
    		<td>${bilet.rodzaj}</td>
			<td>${bilet.cena}</td>
			<td>${bilet.opis}</td>
            <td>
            	<form action="deleteBilet">
      				<input type='hidden' name='delete' value= ${bilet.id_bilet} />  
      				<input type='submit' value="USUŃ" />   
      			</form> 
      			<form action="edytujBilet.jsp">
      				<input type='hidden' name='update'  value= ${bilet.id_bilet} />
      				<input type='submit' value="EDYTUJ" />
       			</form>
      		</td>     
      	</tr>
	</div>
	</c:forEach>
	<a href="index.jsp"><h3><center><font color="green">Powrót do strony głównej</a></h3></center>
	<a href="pobierzDaneBiletu.jsp"><h3><center><font color="green">Dodaj Bilet</a></h3></center>
</body>
</html>
    	