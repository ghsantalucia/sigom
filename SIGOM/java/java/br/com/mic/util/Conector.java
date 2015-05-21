package br.com.mic.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conector {
	
	private static String url = "jdbc:postgresql://localhost:5432/mic";
	private static String usuario = "postgres";
	private static String senha = "root";
	private static Connection con;
	
	public static Connection getConexao() throws SQLException  {

		try {
			Class.forName("org.postgresql.Driver");
			if (con == null) {
				con = DriverManager.getConnection(url, usuario, senha);
			}
			return con;
		} catch (ClassNotFoundException e) {
			throw new SQLException(e.getMessage());
		}
	}

	public static String getSenha(){
		return senha;
	}

}
