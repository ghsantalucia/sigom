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

@WebServlet("/PrepararEdicao")
public class PrepararEdicaoS extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// pegando o ID da visão
		Integer id = Integer.parseInt(request.getParameter("id"));
		// criando um objeto mic
		Pmic c = new Pmic();
		// setando o valor do id do mic
		c.setId(id);
		// pede para camada de controle consultar um mic com o id desejado
		PmicBC cbc = new PmicBC();
		c = cbc.select(c);
		List<Pmic> mics = cbc.select();

		// enviando os dados para a camada de visão
		request.setAttribute("mic", c);
		request.setAttribute("mics", mics);

		// redirecionando para o JSP desejado
		RequestDispatcher view = request
				.getRequestDispatcher("editar_mic.jsp");
		view.forward(request, response);
	}

}
