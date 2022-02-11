<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Modifica Libro <a href="listaLibri"> Indietro </a>
	<form method="post" action="modificaLibro">
		Id: <input readonly type="number" name="id" value="<%=request.getAttribute("id")%>"><br>
		Titolo: <input type="text" name="titolo" value="<%=request.getAttribute("titolo")%>"><br>
		Prezzo:<input type="text" name="prezzo" value="<%=request.getAttribute("prezzo")%>"><br>
		Pagine:<input type="text" name="pagine" value="<%=request.getAttribute("pagine")%>"><br>
		<input type="submit" value="Salva">
	</form>

</body>
</html>