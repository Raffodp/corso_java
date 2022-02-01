<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%

String sceltaUtente = request.getParameter("sceltaUtente");
String sceltaAI = request.getParameter("sceltaAI");
double casuale = Double.parseDouble(request.getParameter("debugValue"));
out.print(casuale);
if(!sceltaUtente.equals (sceltaAI)) out.print("Pareggio");
else out.print("Pareggio");

%>

</body>
</html>