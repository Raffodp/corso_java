package presentation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

import controller.AutoreLibroController;

@WebServlet("/cancellaAutoreLibro")
public class DelAutoreLibro extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private AutoreLibroController ctrl;
	
	public DelAutoreLibro() throws ClassNotFoundException, SQLException {
		ctrl = new AutoreLibroController();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			int idLibro=Integer.parseInt(request.getParameter("deleteId"));
			int nRecordCancellati=ctrl.deleteAutoreLibro(idLibro);
			if(nRecordCancellati==1)
				request.setAttribute("avvisoMessaggio", "Relazione Autore-Libro cancellata con successo");
			else
				request.setAttribute("avvisoMessaggio", "Anomalia, non è stata cancellata alcuna relazione");
			
		}catch(Exception e) {
			e.printStackTrace();
			request.setAttribute("avvisoMessaggio", e.getMessage());
		}
		
		request.getRequestDispatcher("listaAutoriLibri").forward(request, response);
	}

}
