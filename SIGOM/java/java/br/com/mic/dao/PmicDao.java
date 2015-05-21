package br.com.mic.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.mic.bean.Pmic;
import br.com.mic.util.Conector;

public class PmicDao {
	
	public void insert(Pmic c) {

		String sql = "insert into tabmic" + " (nome, tipo, local)"
				+ " values (?, ?, ?)";
		try {
			PreparedStatement ps = Conector.getConexao().prepareStatement(sql);
			ps.setString(1, c.getNome());
			ps.setString(2, c.getTipo());
			ps.setString(3, c.getLocal());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void delete(Pmic c) {

		String sql = "delete from tabmic where id = ?";
		try {
			PreparedStatement ps = Conector.getConexao().prepareStatement(sql);
			ps.setInt(1, c.getId());
			ps.execute();
			ps.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Pmic> select() {
		String sql = "select * from tabmic order by id";
		List<Pmic> mics = new ArrayList<Pmic>();
		try {
			PreparedStatement ps = Conector.getConexao().prepareStatement(sql);
			ResultSet result = ps.executeQuery();

			while (result.next()) {
				Pmic c = new Pmic();
				c.setId(result.getInt("id"));
				c.setNome(result.getString("nome"));
				c.setTipo(result.getString("tipo"));
				c.setLocal(result.getString("local"));
				mics.add(c);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return mics;

	}

	public Pmic select(Pmic mic) {
		String sql = "select * from tabmic where id = ?";
		List<Pmic> mics = new ArrayList<Pmic>();
		Pmic c = new Pmic();
		try {
			PreparedStatement ps = Conector.getConexao().prepareStatement(sql);
			ps.setInt(1, mic.getId());
			ResultSet result = ps.executeQuery();
			while (result.next()) {
				c.setId(result.getInt("id"));
				c.setNome(result.getString("nome"));
				c.setTipo(result.getString("tipo"));
				c.setLocal(result.getString("local"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return c;
	}

	public List<Pmic> search(String busca) {
		
		String sql = (busca != "")? "select * from tabmic where nome ilike '%" + busca + "%' order by nome asc" : "select * from tabmic order by nome asc";
		
		List<Pmic> mics = new ArrayList<Pmic>();
		
		try {
			PreparedStatement ps = Conector.getConexao().prepareStatement(sql);
			ResultSet result = ps.executeQuery();
			while (result.next()) {
				Pmic c = new Pmic();
				c.setId(result.getInt("id"));
				c.setNome(result.getString("nome"));
				c.setTipo(result.getString("tipo"));
				c.setLocal(result.getString("local"));
				mics.add(c);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return mics;
	}
	
	
	public void update(Pmic c) {
		/*
		 * monto a sql do update
		 */
		String sql = "update tabmic " + "set nome = ?, tipo = ?, local= ? "
				+ "where id = ? ";
		try {
			// crio o PreparedStatement
			PreparedStatement ps = Conector.getConexao().prepareStatement(sql);
			// setando os valores
			ps.setString(1, c.getNome());
			ps.setString(2, c.getTipo());
			ps.setString(3, c.getLocal());
			ps.setInt(4, c.getId());
			// executo a sql
			ps.execute();
			// fecho a conexão
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
