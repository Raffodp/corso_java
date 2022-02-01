<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ page errorPage= "divisioneEZ.jsp" %>
<%

       int num = Integer.parseInt(request.getParameter("numero"));
       int div = Integer.parseInt(request.getParameter("divisore"));
       if(num%2 ==0){
    	   if(num >=0){
    		   out.print(num+ " e' pari e positivo e divisibile per "+ div + ".");
    	   } else{
    		   out.print(num+ " e' negativo e divisibile per "+ div + ".");
    	   }
       } else {
    	   if(num >= 0){
    		   out.print(num+ " e' positivo e divisibile per "+ div + ".");
    	   }else {
    		   out.print(num+ " e' negativo e divisibile per "+ div + ".");
    	   }
       }


%>


</body>
</html>