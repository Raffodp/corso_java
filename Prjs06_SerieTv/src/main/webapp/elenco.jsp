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
<% List<SerieTv> serie = (List<SerieTv>) request.getAttribute("listaSerie");%>
<% for(SerieTv s: serie){ %>
<tr>
<td><%=s.getNome() %></td>
<td><a href="?genere=<%= s.getGenere() %>"><%= s.getGenere() %></a></td>
<td><%=s.getDescrizione() %></td>
</tr>

<% } %>
</table>
<%@ include file ="footer.jsp" %>