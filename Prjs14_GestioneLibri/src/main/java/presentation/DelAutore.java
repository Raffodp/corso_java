package presentation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

import controller.AutoreController;

@WebServlet("/delAutore")
public class DelAutore extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AutoreController controller;

	public DelAutore() throws ClassNotFoundException, SQLException {
		controller = AutoreController.getController();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int idAutore = Integer.parseInt(request.getParameter("idAutore"));
		try {
			boolean AutoreCancellati = controller.deleteAutore(idAutore);
			if (AutoreCancellati == true)
				request.setAttribute("avvisoMessaggio", "autore cancellato con successo");
			else
				request.setAttribute("avvisoMessaggio", "Anomalia, autore cancellato = " + AutoreCancellati);
		} catch (SQLException e) {
			request.setAttribute("errorMessage", e.getMessage());

		}
		request.getRequestDispatcher("listaAutori").forward(request, response);
	}
}