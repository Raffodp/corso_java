<%@ include file="header.jsp" %>

<h1>Aggiungi Serie TV</h1>

<form action="serie" method="post">

<input type="text" name= "nomeSerie" placeholder="Scrivi il nome della serie tv">
<input type="text" name= "nomeGenere" placeholder="Scrivi il nome del genere">
<input type="text" name= "descrizione" placeholder="Scrivi una descrizione">
<input type="submit" value= "Add Serie">
</form>


<%@ include file="footer.jsp" %>