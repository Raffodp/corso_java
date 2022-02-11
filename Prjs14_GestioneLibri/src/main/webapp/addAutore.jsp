<%@ include file="header.jsp"%>
<%@ include file="bootstrap.html"%>
<%@ include file="navbar.html"%>
	<a href="listaAutori"> Indietro </a>
	<form method="post" action="aggiungiAutore">
		Id: <input type="number" name="autoreId"><br>
		Nome: <input type="text" name="nome"><br>
		Cognome:<input type="text" name="cognome"><br>
		Nazionalita:<input type="text" name="nazionalita"><br>
	    Libro ID:<input type="number" name="libroId"><br>
		<input type="submit" value="Salva">
	</form>

<%@ include file="footer.jsp"%>
