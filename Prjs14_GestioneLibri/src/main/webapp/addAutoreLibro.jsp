<%@ include file="header.jsp"%>
<%@ include file="bootstrap.html"%>
<%@ include file="navbar.html"%>
	<a href="listaAutoriLibri"> Indietro </a>
	<form method="post" action="aggiungiAutoreLibro">
		Id Autore: <input type="number" name="autoreId"><br>
		Id Libro: <input type="number" name="libroId"><br>
		<input type="submit" value="Salva">
	</form>

<%@ include file="footer.jsp"%>
