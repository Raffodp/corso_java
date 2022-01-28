<%@page import="model.Libro"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>CIAOOOO</h1>
<%
	String s  = "Ciao da Java";
    List<String> note = new ArrayList<>();
    note.add("do");
    note.add("re");
    note.add("mi");
    note.add("fa");
    note.add("sol");
    note.add("la");
    note.add("si");
    
    Libro L = new Libro("buongiorno");
    

	   out.print("<ul>");
   for(int i=0; i<note.size(); i++){
	   out.print("<li>"+note.get(i)+"</li>");
   }
	   out.print("</ul>");
  

%>
<h2><%= s %></h2>
<script src="dino.js"></script>

</body>
</html>