<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"  import="main.java.com.smatyjas.domain.Klient"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="style.css" rel="stylesheet" type="text/css">
<title>Wszyscy Klienci</title>
</head>

<style rel="stylesheet" type="text/css">
	body{
		background-color: #000000; 
	}
	a{ 
		color: green; 
		font-weight: bold; 
		text-align: center;
	}
 	td{
 		text-align : center;
 		color: green;
 	}
 	th{
 		color: green;
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
	<jsp:useBean id="klientmanager" class="main.java.com.smatyjas.service.KlientManager" scope="application" />
	<div class="row">
	<table style="width:80% " border="1";>
    	<tr>
    		<th>ID Klienta:</th>
        	<th>Imie:</th>
        	<th>Nazwisko:</th>
        	<th>Numer telefonu:</th>
			<th>DZIAŁANIA:</th>
    	</tr>
    	<c:forEach var="klient" items="${klientmanager.pobierzKlientow()}">
    	<tr>
    		<td>${klient.id_klient}</td>
    		<td>${klient.imie}</td>
			<td>${klient.nazwisko}</td>
			<td>${klient.numertelefonu}</td>
            <td>
            	<form action="deleteKlient">
      				<input type='hidden' name='delete' value= ${klient.id_klient} />  
      				<input type='submit' value="USUŃ" />   
      			</form> 
      			<form action="edytujKlienta.jsp">
      				<input type='hidden' name='update'  value= ${klient.id_klient} />
      				<input type='submit' value="EDYTUJ" />
       			</form>
      		</td>     
      	</tr>
	</div>
	</c:forEach>
	<a href="index.jsp"><h3><center><font color="green">Powrót do strony głównej</a></h3></center>
	<a href="pobierzDaneKlienta.jsp"><h3><center><font color="green">Dodaj Klienta</a></h3></center>
</body>
</html>
    	