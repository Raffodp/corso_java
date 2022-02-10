package controller;
 
import java.sql.SQLException;
import java.util.List;
 
import model.Autore;
import model.Libro;
import repository.Database;
 
public class LibroController {
 
	private static LibroController instance;
 
	private Database db;
 
	public LibroController() throws ClassNotFoundException, SQLException {
		db = Database.getDatabase();
	}
 
	public static LibroController getController() throws ClassNotFoundException, SQLException {
		if (instance == null) {
			instance = new LibroController();
		}
		return instance;
	}	
 
	public List<Libro> getAllLibri() throws SQLException{
		return db.getAllLibri();
	}
}