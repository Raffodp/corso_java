<%@page import="model.SerieTv"%>
<%@page import="java.util.List"%>
<%@ include file="header.jsp"%>
<%@ include file="menu.jsp"%>

<table>

	<tr>
		<th>Genere</th>
		<th>Nome</th>
		<th>Descrizione</th>
		<th>Foto</th>
	</tr>
	<% List<SerieTv> listaDettaglio =(List<SerieTv>)request.getAttribute("dettaglio"); %>
	<% for (SerieTv s : listaDettaglio){ %>
	<tr>
		<td><%=s.getNome()%></td>
		<td><%=s.getGenere()%></td>
		<td><%=s.getDescrizione()%></td>
		<td><a href="?id=<%= s.getId() %>"><%= s.getId() %></a></td>	
	</tr>
	<% } %>

</table>
<%@ include file="footer.jsp"%>
