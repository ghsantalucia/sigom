package br.com.mic.controle;

import java.util.List;

import br.com.mic.bean.Pmic;
import br.com.mic.dao.PmicDao;

public class PmicBC {
	public void cadastrar(Pmic c){
		PmicDao cd = new PmicDao();
		cd.insert(c);
	}
	
	public void delete(Pmic c){
		PmicDao cd = new PmicDao();
		cd.delete(c);
	}
	
	public List<Pmic> select(){
		PmicDao cd = new PmicDao();
		return cd.select();
	}
	
	public List<Pmic> search(String busca){
		PmicDao cd = new PmicDao();
		return cd.search(busca);
	}
	
	public Pmic select(Pmic c){
		PmicDao cd = new PmicDao();
		return cd.select(c);
	}
	
	public void update(Pmic c){
		/*
		 * chamada da camada DAO
		 * */
		PmicDao cd = new PmicDao();
		cd.update(c);
	}
}
