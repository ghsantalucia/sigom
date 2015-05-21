package br.com.mic.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.mic.bean.Pmic;
import br.com.mic.controle.PmicBC;


@WebServlet("/ExcluirMicS")
public class ExcluirMicS extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id = Integer.parseInt(request.getParameter("id"));
		Pmic c = new Pmic();
		c.setId(id);
		
		PmicBC cbc = new PmicBC();
		cbc.delete(c);
		
		response.sendRedirect("SelectMicS");
	}

	

}
