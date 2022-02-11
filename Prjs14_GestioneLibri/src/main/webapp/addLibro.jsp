<%@ include file="header.jsp"%>
<%@ include file="bootstrap.html"%>
<%@ include file="navbar.html"%>
	<a href="listaLibri"> Indietro </a>
	<form method="post" action="aggiungiLibro">
		Id: <input type="number" name="libroId"><br>
		Titolo: <input type="text" name="titolo"><br>
		Prezzo:<input type="number" name="prezzo"><br>
		Pagine:<input type="number" name="pagine"><br>
		<input type="submit" value="Salva">
	</form>
	
<%@ include file="footer.jsp"%>
