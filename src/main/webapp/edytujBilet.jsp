<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"  import="main.java.com.smatyjas.domain.Bilet"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="style.css" rel="stylesheet" type="text/css">
<title>Edytuj Bilet</title>
</head>

<style rel="stylesheet" type="text/css">
	body{
		background-color: #000000;
		background: url('http://www.tapeta-czarne-linie-tlo.na-telefon.org/tapety/czarne-linie-tlo.jpeg'); 
		background-position: center top; no-repeat;
	}
	.przedrostki{ 
		margin-top: 4cm; 
		margin-left: 15cm; 
		font-size: 24px;
		color: green;
	}
	.zapisz{ 
		margin-left:100px; 
		margin-top: 20px;
	}
	a{ 
		color:green; 
		font-size:24px; 
		font-weight:bold; 
		margin-left: 100px;
		margin-right:auto;
		margin-top: 2cm;
	}
    h1{
    	margin-left: 16cm;
    	color: green; 
    	font-size: 40px; 
    	font-style: italic;
        font-family: "Times-New-Roman"; 
        margin-top: -8cm;
	}
</style>

<body>
	<jsp:useBean id="bilet" class="main.java.com.smatyjas.domain.Bilet" scope="session" />
	<jsp:setProperty name="bilet" property="*" />
	<jsp:useBean id="biletmanager" class="main.java.com.smatyjas.service.BiletManager" scope="application" />
	<%
        String ID = request.getParameter("update");
     	int cena = 0;
    	String  rodzaj = "",  opis = "";
        for (Bilet b : biletmanager.pobierzBilety()){
          if (b.getId_bilet() == Integer.parseInt(ID)){
      		rodzaj = b.getRodzaj();
       		cena = b.getCena();
        	opis = b.getOpis();
        	break;
        	}
        }
   		out.println("<div class = 'przedrostki'><form action='updateBilet'><input type='hidden' name='id' value='" + ID +
		   "' /><tr><td colspan='2'><b>ID Biletu:</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;  &nbsp;&nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp;  " + ID +
		   "</td></tr><br><tr><td><b>Rodzaj: </b> &nbsp; &nbsp; &nbsp;   &nbsp; &nbsp; </td><td><input type='text' name='rodzaj' pattern='[A-Za-z]*' title='Rodzaj powinien składać się tylko z liter' value='" + rodzaj +
		   "' /></td></tr><br><tr><td><b>Cena:</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </td><td><input type='text' name='cena' pattern='[0-9]*' title='Cena powinna składać się tylko z liczb całkowitych' value='" + cena +
		   "' /></td></tr><tr><br><td><b>Opis:</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td><td><input type='text' name='opis' value='" + opis + 
		   "' /></td></tr><tr><br><td colspan='2'><div class='zapisz'><input type='submit' value='ZAPISZ'></div></td></tr></form></div>");
		%>
	<br>
	<a href="index.jsp"><h3><center><font color="green">Powrót do strony głównej</a></h3></center>
	<h1>Edytuj Bilet</h1>
</body>
</html>