package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		
		String utente = request.getParameter("sceltaUtente");
		String ai = "";
		double casuale = Math.random();
		
		if(casuale <= 0.3) ai = "s";
	    if(casuale > 0.3 && casuale <= 0.6 ) ai ="c";
		if(casuale > 0.6 ) ai = "f";
	
		
		request.setAttribute("sceltaUtente", utente);
		request.setAttribute("sceltaAI", ai);
		request.getRequestDispatcher("MorraCinese.jsp").include(request, response);
	}

}
