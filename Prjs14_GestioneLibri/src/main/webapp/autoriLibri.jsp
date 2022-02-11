<%@page import="model.AutoreLibro"%>
<%@page import="java.util.List"%>
<%@ include file="header.jsp"%>
<%@ include file="bootstrap.html"%>
<%@ include file="navbar.html"%>
	<table class="table table-striped">
	<tr> 
		<th class="table-light">ID Autore</th>	
		<th class="table-light">ID Libro</th>
		<th class="table-light">Cognome</th>
		<th class="table-light">Titolo</th>	
		<th class="table-light">Prezzo</th>	
		<th class="table-light">Elimina</th>	
		<th class="table-light">Modifica</th>	
	</tr>
 

 		<%	List<AutoreLibro> lista = (List<AutoreLibro>) request.getAttribute("listaAutoriLibri"); %>
		<% if(lista!=null){
			for(AutoreLibro al : lista){ %>
				<tr>
				<td><%=al.getAlAutoreId() %></td>
				<td><%=al.getAlLibroId() %></td>
				<td><%=al.getaCognome() %></td>
				<td><%=al.getlTitolo() %></td>
				<td><%=al.getlPrezzo() %></td>
                <td>
				<form method = "post" action="cancellaAutoreLibro?deleteId=<%= al.getAlLibroId()%>">
				<input type="submit" value="Elimina">
				</form></td>
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