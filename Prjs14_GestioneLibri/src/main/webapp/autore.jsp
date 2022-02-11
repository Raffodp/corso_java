<%@page import="model.Autore"%>
<%@page import="java.util.List"%>
 <%@ include file="header.jsp"%>
 <%@ include file="bootstrap.html"%>
 <%@ include file="navbar.html"%>
	<table class="table table-striped">
	<tr> 
		<th class="table-light">ID</th>	
		<th class="table-light">Nome</th>
		<th class="table-light">Cognome</th>
		<th class="table-light">Nazionalità</th>	
		<th class="table-light">Elimina</th>	
		<th class="table-light">Modifica</th>	
	</tr>
 

 		<%	List<Autore> lista = (List<Autore>) request.getAttribute("listaAutori"); %>
		<% if(lista!=null){
			for(Autore l : lista){ %>
				<tr>
				<td><%=l.getId() %></td>
				<td><%=l.getNome() %></td>
				<td><%=l.getCognome() %></td>
				<td><%=l.getNazionalita() %></td>
                <td>
				<form method = "post" action="delAutore?idAutore=<%= l.getId() %>">
				<input type="submit" value="Elimina">
				</form></td>
		        <td>
				<form method ="get" action="modificaAutore">
				<input type="text" hidden name="modificaId" value="<%= l.getId() %>">
				<input type="submit" value="Modifica">
				</form> </td>
				</tr>
		<%	}
		}else{
			out.print("<br> Non ci sono libri in lista <br>");
		}  %>
	</table>
 
	<% 
	String msg=(String)request.getAttribute("avvisoMessaggio");
	if(msg!=null){
		out.print("<script>alert(\""+msg+"\");</script>");
	}
	%>
 <%@ include file="footer.jsp"%>