<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>CIAOOO</h1>
<ul>
<li> Codici OK - 2XX</li>
<li> Codici che rappresentano una risposta dal server che non è stato in gradi di 
<li> Codici di K.O. - 5XX </li>
</ul>

<form action="utente.jsp">
<label>Nome:</label><input type="text" name="nome">
<input type="submit">
</form>
<form action="redirect.jsp"><input type="submit"></form>

<form action="divisione.jsp">
Numero1: <input type="text" name="num1"/><br>
Numero2: <input type="text" name="num2"/><br>
<input type="submit" value="Dividi!"/>
</form>
</body>
</html>