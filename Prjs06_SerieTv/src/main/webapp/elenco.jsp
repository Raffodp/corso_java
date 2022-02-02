<%@ include file ="header.jsp" %>
<%@ include file ="menu.jsp" %>
<%@page import="model.SerieTv"%>
<%@page import="java.util.List"%>


<h1>Elenco Serie TV</h1>
<table>
<tr>
<th>Nome serie TV</th>
<th>Genere</th>
<th>Descrizione</th>
</tr>
<% List<SerieTv> listaSerie = (List<SerieTv>) request.getAttribute("listaSerie");%>
<% for(SerieTv s : listaSerie){ %>
<tr>
<td><a href="?genere=<%= s.getNome() %>"><%= s.getGenere() %><%= s.getDescrizione() %></a></td>

</tr>

<% } %>
</table>
<%@ include file ="footer.jsp" %>