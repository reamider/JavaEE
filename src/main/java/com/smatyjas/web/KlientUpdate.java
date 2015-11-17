package main.java.com.smatyjas.web;

import main.java.com.smatyjas.domain.Klient;
import main.java.com.smatyjas.service.KlientManager;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/updateKlient")  
public class KlientUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L; 
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{
		response.setContentType("text/html");
		int ID = Integer.parseInt(request.getParameter("id_klient"));
        String Imie = request.getParameter("imie");          
        String Nazwisko = request.getParameter("nazwisko");        
        String Numertelefonu = request.getParameter("numertelefonu");
        
        KlientManager klient = (KlientManager)getServletContext().getAttribute("manager");
        for (int i=0; i<klient.pobierzKlientow().size(); i++){
            if (klient.pobierzKlientow().get(i).getId_klient() == ID){
                Klient k = klient.pobierzKlientow().get(i);
                k.setId_klient(ID);
                k.setImie(Imie);
                k.setNazwisko(Nazwisko);
                k.setNumertelefonu(Numertelefonu);
                break;
            }
        }
        this.getServletContext().getRequestDispatcher("/pokazKlientow.jsp").forward(request, response);
	}
}
