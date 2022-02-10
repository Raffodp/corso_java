package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Autore;
import model.AutoreLibro;
import model.Libro;

public class Database {

	private static Database instance;

	private Connection con;

	private final static String DB_URL = "jdbc:mysql://localhost:3306/generation";
	private final static String DB_USER = "root";
	private final static String DB_PASSWORD = "V3cch10n3_!";
	private final static String DB_DRIVER = "com.mysql.cj.jdbc.Driver";

	private Database() throws SQLException, ClassNotFoundException {
		Class.forName(DB_DRIVER);
		con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
	}

	public static Database getDatabase() throws ClassNotFoundException, SQLException {
		if (instance == null) {
			instance = new Database();
		}
		return instance;
	}

	public List<Libro> getAllLibri() throws SQLException {
		String sql = "SELECT id, titolo, prezzo, pagine " + " FROM generation.libro ";

		PreparedStatement istruzione = con.prepareStatement(sql);

		// executeQuery si usa per le SELECT
		ResultSet risultatiQuery = istruzione.executeQuery();

		// Monto una lista vuota di studenti
		List<Libro> listaLibri = new ArrayList<>();

		while (risultatiQuery.next()) {
			// Per ogni record che arriva da DB istanzio uno studente
			Libro rstu = new Libro();
			// Ci imposto dentro le varie colonne della sua riga
			rstu.setId(risultatiQuery.getInt("id"));
			rstu.setTitolo(risultatiQuery.getString("titolo"));
			rstu.setPrezzo(risultatiQuery.getDouble("prezzo"));
			rstu.setPagine(risultatiQuery.getInt("pagine"));

			// Lo aggiungo alla lista degli studenti
			listaLibri.add(rstu);
		}

		// Quando ho finito di leggere cosa mi è arrivato dal DB
		// ritorno al chiamante la lista di studenti
		return listaLibri;
	}

	public List<Autore> getAllAutori() throws SQLException {
		String sql = "SELECT id, nome, cognome, nazionalita " + " FROM generation.autore ";

		PreparedStatement istruzione = con.prepareStatement(sql);

		ResultSet risultatiQuery = istruzione.executeQuery();

		List<Autore> listaAutori = new ArrayList<>();

		while (risultatiQuery.next()) {

			Autore rstu = new Autore();
			rstu.setId(risultatiQuery.getInt("id"));
			rstu.setNome(risultatiQuery.getString("nome"));
			rstu.setCognome(risultatiQuery.getString("cognome"));
			rstu.setNazionalita(risultatiQuery.getString("nazionalita"));

			listaAutori.add(rstu);
		}

		return listaAutori;
	}

	public List<AutoreLibro> getAllAutoriLibri() throws SQLException {
		String sql = "SELECT al.autore_id, al.libro_id, a.cognome, l.titolo, l.prezzo"
				+ " FROM generation.autore_libro al" + " JOIN generation.autore a ON (a.id = al.autore_id)"
				+ " JOIN generation.libro l ON (l.id = al.libro_id)";

		PreparedStatement istruzione = con.prepareStatement(sql);

		ResultSet risultatiQuery = istruzione.executeQuery();

		List<AutoreLibro> listaAutoreLibro = new ArrayList<>();

		while (risultatiQuery.next()) {

			AutoreLibro rstu = new AutoreLibro();
			rstu.setAlAutoreId(risultatiQuery.getInt("autore_id"));
			rstu.setAlLibroId(risultatiQuery.getInt("libro_id"));
			rstu.setaCognome(risultatiQuery.getString("cognome"));
			rstu.setlTitolo(risultatiQuery.getString("titolo"));
			rstu.setlPrezzo(risultatiQuery.getDouble("prezzo"));

			listaAutoreLibro.add(rstu);
		}

		return listaAutoreLibro;
	}

	public int getAutoriInAutoriLibri(int idAutore) throws SQLException {
		String sql = "SELECT count(*) as counter " + "FROM generation.autore_libro al" + " WHERE al.autore_id = ?";

		PreparedStatement istruzione = con.prepareStatement(sql);
		istruzione.setInt(1, idAutore);

		ResultSet risultatiQuery = istruzione.executeQuery();
		int counter = 0;
		while (risultatiQuery.next()) {
			counter = risultatiQuery.getInt("counter");

		}
		return counter;
	}

	public int deleteAutore(int idAutore) throws SQLException {
		String sql = "DELETE FROM generation.autore" + " WHERE id = ?";

		PreparedStatement istruzione = con.prepareStatement(sql);
		istruzione.setInt(1, idAutore);
		return istruzione.executeUpdate();
	}
}
