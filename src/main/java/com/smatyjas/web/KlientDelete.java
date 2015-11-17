package main.java.com.smatyjas.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import main.java.com.smatyjas.service.KlientManager;
import java.io.IOException;
import javax.servlet.annotation.*;

@WebServlet(urlPatterns = "/deleteKlient")
public class KlientDelete extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		 response.setContentType("text/html");
		 int index = -1;
	     int ID = Integer.parseInt(request.getParameter("delete"));
	}
}
