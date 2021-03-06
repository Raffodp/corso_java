package presentation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.SerieTv;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import controller.SerieTvCtrl;
@WebServlet("/serie")
public class SerieTvMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    private SerieTvCtrl ctrl;  
    
    public SerieTvMVC() {
    	super();
        this.ctrl = new SerieTvCtrl();
        System.out.println("Ho creato la servlet e inizializzato il controller");
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    if (request.getParameter("genere")!= null) {
    	List<SerieTv> serie = new ArrayList<>();
    	for (SerieTv s : this.ctrl.getSerieTv()) {
    		if(s.getGenere().equals(request.getParameter("genere")))
    		serie.add(s);	
		}
    	request.setAttribute("listaSerie", serie);
    } else {
    	request.setAttribute("listaSerie", this.ctrl.getSerieTv());
    }
    request.getRequestDispatcher("elenco.jsp").forward(request, response);
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getParameter("nomeSerieTv") != null && request.getParameter("genere") != null && request.getParameter("descrizione") != null){
			String nome = request.getParameter("nomeSerieTv");
			String genere = request.getParameter("genere");
			String descrizione = request.getParameter("descrizione");
			this.ctrl.addSerieTv(nome, genere, descrizione);
			}
		doGet(request, response);
	}

}
