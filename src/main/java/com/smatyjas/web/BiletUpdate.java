package main.java.com.smatyjas.web;
import main.java.com.smatyjas.domain.Bilet;
import main.java.com.smatyjas.service.BiletManager;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/updateBilet")  
public class BiletUpdate  extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        int ID = Integer.parseInt(request.getParameter("id"));
        String rodzaj = request.getParameter("rodzaj");                
        int cena = Integer.parseInt(request.getParameter("cena")); 
        String opis = request.getParameter("opis");  
        
        BiletManager bm = (BiletManager) getServletContext().getAttribute("biletmanager");

        for (int i=0; i<bm.pobierzBilety().size(); i++){
            if (bm.pobierzBilety().get(i).getId_bilet() == ID){
                Bilet b = bm.pobierzBilety().get(i);
                b.setId_bilet(ID);
                b.setRodzaj(rodzaj);
                b.setCena(cena);
                b.setOpis(opis);
                break;
            }
        }
        this.getServletContext().getRequestDispatcher("/pokazBilety.jsp").forward(request, response);
    }
}