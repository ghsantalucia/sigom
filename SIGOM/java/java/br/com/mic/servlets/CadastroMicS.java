package br.com.mic.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.mic.bean.Pmic;
import br.com.mic.controle.PmicBC;

@WebServlet("/CadastroMicS")
public class CadastroMicS extends HttpServlet {

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String nome = request.getParameter("nome");
		String tipo = request.getParameter("tipo");
		String local = request.getParameter("local");

		Pmic c = new Pmic();
		c.setNome(nome);
		c.setTipo(tipo);
		c.setLocal(local);

		PmicBC cbc = new PmicBC();
		cbc.cadastrar(c);

		response.sendRedirect("SelectMicS");

	}

}
