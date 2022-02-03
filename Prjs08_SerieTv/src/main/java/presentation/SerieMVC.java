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

import controller.SerieCtrl;

@WebServlet ("/serie")
public class SerieMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private SerieCtrl ctrl;
	
    public SerieMVC() {
        super();
        this.ctrl = new SerieCtrl();
        System.out.println("Ho creato la servlet e inizializzato il controller dei piatti");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if (request.getParameter("genere")!= null) {
			List <SerieTv> serie = new ArrayList<>();
			for(SerieTv s : this.ctrl.getSerie()){
				if(s.getGenere().equals(request.getParameter("genere")))
					serie.add(s);
			}
			request.setAttribute("elencoSerie", serie);
			
		} else {
		request.setAttribute("elencoSerie", this.ctrl.getSerie());
		}

		request.getRequestDispatcher("elenco.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getParameter("nomeSerie")!=null && request.getParameter("nomeGenere")!= null && request.getParameter("descrizione") != null) {
		   String nome = request.getParameter("nomeSerie");
		   String genere = request.getParameter("nomeGenere");
		   String descrizione = request.getParameter("descrizione");
		   this.ctrl.addSerie(nome, genere, descrizione);
		}
		   
		doGet(request, response);
	}

}
