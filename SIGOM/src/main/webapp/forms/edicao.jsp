<%@ page import="java.io.*,java.util.*" %>

<%
	
	//REGISTRA EDIÇÃO FEITA NO FORMULÁRIO
	

	//REDIRECIONAMENTO DE PÁGINA
	String site = new String(request.getParameter("r"));
	out.print("Redirecionando para: " + site);
	response.sendRedirect(site);

%>