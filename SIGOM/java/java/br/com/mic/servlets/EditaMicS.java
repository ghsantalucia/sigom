package br.com.mic.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.mic.bean.Pmic;
import br.com.mic.controle.PmicBC;

/**
 * Servlet implementation class EditaMicS
 */
@WebServlet("/EditaMicS")
public class EditaMicS extends HttpServlet {
	// uso o metodo do post pois a comunicação é feita via formulário
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		/*
		 * recebo os dados da tela
		 * e guardo em variáveis
		 * */
		Integer id = Integer.parseInt(request.getParameter("id"));
		String nome = request.getParameter("nome");
		String tipo = request.getParameter("tipo");
		String local = request.getParameter("local");

		/*
		 * crio um objeto mic com 
		 * os valores recebidos da tela
		 * */
		Pmic c = new Pmic();
		c.setId(id);
		c.setNome(nome);
		c.setTipo(tipo);
		c.setLocal(local);
		/*
		 * passo a mensagem para o controle realizar o update
		 * 
		 * */
		PmicBC cbc = new PmicBC();
		cbc.update(c);
		
		/*
		 * envio para o servlet  SelectMicS
		 * */
		response.sendRedirect("SelectMicS");
	}

}
