package presentation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Database;
import model.SerieTv;

import java.io.IOException;
import java.util.List;

@WebServlet("/dettaglio")
public class DettaglioMVC extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Database db = Database.getDatabase();
		List<SerieTv> lista = db.getLista();
	
		for (SerieTv s : lista) {
			if (s.getId() == id) {
				lista.add(s);
				break;
			}
		}
		request.setAttribute("dettaglio",lista);
		request.getRequestDispatcher("dettaglio.jsp").forward(request, response);
	}
}