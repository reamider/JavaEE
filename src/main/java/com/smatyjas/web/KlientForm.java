package main.java.com.smatyjas.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/dodaj")
public class KlientForm extends HttpServlet{
		private static final long serialVersionUID = 1L; 
		@Override
		
		protected void doGet(HttpServletRequest request,HttpServletResponse response)
		throws ServletException, IOException{
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			
			out.println("<html><body ><h2>Dodaj Aktora</h2>"
					+ "<form method='post' action='dodajKlienta.jsp'>"
					+ "Imie: &nbsp;<input type='text' name='imie' /> <br/>"
					+ "Nazwisko: <input type='text' name='nazwisko' /> <br />"
					+ "Numer telefonu: <input type='text' name='numertelefonu' /> <br />"
					+ "<input type='submit' value=' OK ' />" + "</form>"
					+ "</body></html>"
					+ "<p><a href='index.jsp'>Strona glowna</a></p>");
			out.close();
		}
}
