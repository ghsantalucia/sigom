package br.com.mic.controle;

import br.com.mic.bean.Usuario;

public class UsuarioBC {
	
	/*
	 * l�gica de negocio
	 * */
	public Boolean login(Usuario u){
		return u.getSenha().equals("123") 
				&& u.getLogin().equals("daniel");
	}
}
