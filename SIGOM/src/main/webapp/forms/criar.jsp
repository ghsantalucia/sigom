<%@ page import="java.io.*,java.util.*" %>

<%
	
	// COLETA VARIAVEIS POR GET
		String dependencia = "";
		String id_dependencia = "";
		String dependencia_url = "";
		String formulario = request.getParameter("form").toString();
		String ocorrencia = request.getParameter("oc").toString();
		String novo = "";
		int id_novo = 0;

		if(request.getParameterMap().containsKey("dp") != false) {
			dependencia = request.getParameter("dp").toString();
			id_dependencia = request.getParameter("id").toString();
			dependencia_url = "&" + dependencia.substring(0, 3) + "=" + id_dependencia;
		}

		if(formulario.equals("ocorrencia")){
			novo = "oc";
		} else {
			novo = formulario.substring(0, 3);
		}


	// CRIA NOVA INSTANCIA DO FORMULARIO
		//id_novo = ;



	// REDIRECIONA PARA A PAGINA RESPECTIVA
		String site = formulario + ".jsp?oc=" + ocorrencia + dependencia_url + "&" + novo + "=" + id_novo;
		out.print("Redirecionando para: <a href='"+site+"'>" + site + "</a>");
		//response.sendRedirect(site);

%>