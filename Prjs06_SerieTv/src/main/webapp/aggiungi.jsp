<%@ include file ="header.jsp" %>
<%@ include file ="menu.jsp" %>
<h1>Aggiungi Serie Tv</h1>

<form action="serie" method="post">

<label>Titolo Serie TV</label><input type="text" name="nomeSerieTv">
<label>Genere</label><input type="text" name="genere">
<label>Descrizione</label><input type="text" name= "descrizione">
<input type="submit" value= "aggiungi serie tv">
</form>
<%@ include file ="footer.jsp" %>