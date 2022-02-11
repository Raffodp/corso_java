<%@page import="model.Libro"%>
<%@page import="java.util.List"%>
<%@ include file="header.jsp"%>
<%@ include file="bootstrap.html"%>
<%@ include file="navbar.html"%>
	<table class="table table-striped">
	<tr> 
		<th class="table-light">ID</th>	
		<th class="table-light">Titolo</th>
		<th class="table-light">Prezzo</th>
		<th class="table-light">Pagine</th>	
		<th class="table-light">Elimina</th>	
		<th class="table-light">Modifica</th>	
	</tr>
 

 		<%	List<Libro> lista = (List<Libro>) request.getAttribute("listaLibro"); %>
		<% if(lista!=null){
			for(Libro l : lista){ %>
				<tr>
				<td><%=l.getId() %></td>
				<td><%=l.getTitolo() %></td>
				<td><%=l.getPrezzo() %></td>
				<td><%=l.getPagine() %></td>
                <td>
				<form method = "post" action="cancellaLibro?deleteId=<%= l.getId() %>">
				<input type="submit" value="Elimina">
				</form></td>
		        <td>
				<form method ="get" action="modificaLibro">
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