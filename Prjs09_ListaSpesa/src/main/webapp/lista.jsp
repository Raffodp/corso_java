<%@page import="model.Prodotto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ include file="header.jsp"%>
<a href="addProdotto.jsp">Aggiungi Prodotto</a>
<table>

	<tr>
		<th>Nome</th>
		<th>Prezzo</th>
		<th>Reparto</th>
		<th>Azioni</th>
	</tr>

	<% List<Prodotto> lista =(List<Prodotto>)request.getAttribute("lista");%>
	<% for (Prodotto p : lista){ %>
	<tr>
		<th><%= p.getNome()%></th>
		<th><%= p.getPrezzo()%></th>
		<th><%= p.getCategoria()%></th>
		<th>
			<form method="post" action="removeProdotto?id=
					<%=p.getId()%>">
				<input type="submit"><i class="fa fa-trash"></i>
			</form>
		</th>
	</tr>
	<% } %>

</table>
<%@ include file="footer.jsp"%>