<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profilo Utente</title>
</head>
<body>
	<%

       String nome = (String) request.getAttribute("nome");
       String cognome = (String) request.getAttribute("cognome");
       out.print("Ciao "+ nome + " " + cognome + ", benvenuto nel nostro sito!<br>");
       
       out.print("Autenticato con: "+request.getSession().getAttribute("email"));

    %>

</body>
</html>