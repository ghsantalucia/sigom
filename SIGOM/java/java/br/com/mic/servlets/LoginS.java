package br.com.mic.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.mic.bean.Usuario;
import br.com.mic.controle.UsuarioBC;
/*
 * a nota��o webservlet serve para mapear 
 * o servlet no caso com o nome LoginS
 * */
@WebServlet("/LoginS")
public class LoginS extends HttpServlet {
	
	/*
	 * recebe as requisi��es POST
	 * */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		/* 
		 * capturando as informa��es do foruml�rio
		 */
		String senha = request.getParameter("senha");
		String login = request.getParameter("login");
				
		
		/*
		 * transformando as vari�veis em objetos
		 * */
		Usuario u = new Usuario();
		u.setLogin(login);
		u.setSenha(senha);
		
		/*
		 * acessando a camada de controle
		 * */
		UsuarioBC ubc = new UsuarioBC();
		
				
		if(ubc.login(u)){
			
			request.setAttribute("resposta", "seja bem vindo "+u.getLogin());
			
			response.sendRedirect("SelectMicS");			
			
		} else {
			RequestDispatcher view = request.getRequestDispatcher("login.jsp");
			
			request.setAttribute("resposta", "usu�rio ou senha inv�lidos");
			
			view.forward(request, response);
		}
	}
}
