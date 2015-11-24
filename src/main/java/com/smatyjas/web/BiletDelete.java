package main.java.com.smatyjas.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import main.java.com.smatyjas.service.BiletManager;
import java.io.IOException;

@WebServlet(urlPatterns = "/deleteBilet")
public class BiletDelete extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        int index = -1;
        int ID = Integer.parseInt(request.getParameter("delete"));
        BiletManager bm = (BiletManager) getServletContext().getAttribute("biletmanager");
        for (int i=0; i<bm.pobierzBilety().size(); i++){
            if (bm.pobierzBilety().get(i).getId_bilet() == ID){
                index = i;
                break;
            }
        }
        if (index != -1){
            bm.pobierzBilety().remove(index);
        }
        this.getServletContext().getRequestDispatcher("/pokazBilety.jsp").forward(request, response);
    }
}