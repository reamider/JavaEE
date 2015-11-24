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
public class KlientUpdate  extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        int ID = Integer.parseInt(request.getParameter("id"));
        String imie = request.getParameter("imie");          
        String nazwisko = request.getParameter("nazwisko");        
        int numertelefonu = Integer.parseInt(request.getParameter("numertelefonu"));  
        
        KlientManager km = (KlientManager) getServletContext().getAttribute("klientmanager");

        for (int i=0; i<km.pobierzKlientow().size(); i++){
            if (km.pobierzKlientow().get(i).getId_klient() == ID){
                Klient k = km.pobierzKlientow().get(i);
                k.setId_klient(ID);
                k.setImie(imie);
                k.setNazwisko(nazwisko);
                k.setNumertelefonu(numertelefonu);
                break;
            }
        }
        this.getServletContext().getRequestDispatcher("/pokazKlientow.jsp").forward(request, response);
    }
}