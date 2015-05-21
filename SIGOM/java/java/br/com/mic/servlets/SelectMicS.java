package br.com.mic.servlets;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.mic.bean.Pmic;
import br.com.mic.controle.PmicBC;
import br.com.mic.dao.PmicDao;
import br.com.mic.util.Conector;

/**
 * Servlet implementation class SelectMicS
 */
@WebServlet("/SelectMicS")
public class SelectMicS extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PmicBC cbc = new PmicBC();
		List<Pmic> mics = cbc.select();
		
		request.setAttribute("mics", mics);
		
		RequestDispatcher view = request.getRequestDispatcher("cadastrar_mic.jsp");
		view.forward(request, response);
	}
}
