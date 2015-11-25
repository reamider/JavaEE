<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"  import="main.java.com.smatyjas.domain.Klient"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="style.css" rel="stylesheet" type="text/css">
<title>Edytuj Klienta</title>
</head>

<style rel="stylesheet" type="text/css">
	body{
		background-color: #000000;
		background: url('http://zapodaj.net/images/d1bbac5508d59.jpg'); 
		background-position: center top; no-repeat;
	}
	.przedrostki{ 
		margin-top: 5cm; 
		margin-left: 15cm; 
		font-size: 24px;
		color: white;
	}
	.zapisz{ 
		margin-left:100px; 
		margin-top: 20px;
	}
	a{ 
		color:green; 
		font-size:24px; 
		font-weight:bold; 
		margin-left: 120px;
		margin-right:auto;
		margin-top: 1cm;
	}
    h1{
    	color: green; 
    	font-size: 40px; 
    	font-style: italic;
        font-family: "Times-New-Roman"; 
        margin-top: -11cm;
		margin-left: 16cm;
	}
</style>

<body>
	<jsp:useBean id="klient" class="main.java.com.smatyjas.domain.Klient" scope="session" />
	<jsp:setProperty name="klient" property="*" />
	<jsp:useBean id="klientmanager" class="main.java.com.smatyjas.service.KlientManager" scope="application" />
	<%
        String ID = request.getParameter("update");
     	int numertelefonu = 0;
    	String  imie = "",  nazwisko = "";
        for (Klient k : klientmanager.pobierzKlientow()){
          if (k.getId_klient() == Integer.parseInt(ID)){
      		imie = k.getImie();
       		nazwisko = k.getNazwisko();
        	numertelefonu = k.getNumertelefonu();
        	break;
        	}
        }
		%>
   		<div class = 'przedrostki'>
		<form action='updateKlient'><input type='hidden' name='id' value='" + ID + "' />
		<tr>
		<td colspan='2'><b>ID Klienta:</b>&nbsp; &nbsp;  " + ID + "</td></tr>
		<br>
		<tr><td><b>Imie: </b> &nbsp;&nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;   &nbsp; &nbsp; </td><td><input type='text' name='imie' pattern='[A-Za-z]*' title='Imie powinno składać się tylko z liter' value='" + imie + "' /></td></tr>
		<br>
		<tr><td><b>Nazwisko:</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </td><td><input type='text' name='nazwisko' pattern='[A-Za-z]*' title='Nazwisko powinno składać sie tylko z liter' value='" + nazwisko + "' /></td></tr>
		<tr>
		<br>
		<td><b>Numer telefonu:</b></td><td><input type='text' name='numertelefonu'  pattern='[0-9]*' title='Numer telefonu powinien składać się tylko z liczb' value='" + numertelefonu + "' /></td></tr>
		<tr>
		<br><td colspan='2'><div class='zapisz'><input type='submit' value='ZAPISZ'></div></td>
		</tr>
		</form>
		</div>
	<br>
	<a href="index.jsp"><h3><center><font color="green">Powrót do strony głównej</a></h3></center>
	<h1>Edytuj Klienta</h1>
</body>
</html>