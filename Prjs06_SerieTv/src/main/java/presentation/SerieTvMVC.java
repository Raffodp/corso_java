package presentation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.SerieTv;

import java.io.IOException;
import java.util.List;

import controller.SerieTvCtrl;
@WebServlet("/aggiungi")
public class SerieTvMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;
    SerieTvCtrl ctrl;  
    public SerieTvMVC() {
        this.ctrl = new SerieTvCtrl();
        System.out.println("Ho creato la servlet e inizializzato il controller");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		List<SerieTv> listaSerie = ctrl.getSerieTv();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getParameter("nomeSerieTv") != null && request.getParameter("genere") != null && request.getParameter("descrizione") != null){
			String nomeSerie = request.getParameter("nomeSerieTv");
			String genere = request.getParameter("genere");
			String descrizione = request.getParameter("descrizione");
			this.ctrl.addSerieTv(nomeSerie, genere, descrizione);
			}
		
		
		request.setAttribute("listaSerie", this.ctrl.getSerieTv());
		request.getRequestDispatcher("elenco").forward(request,response);
	}

}
