package model;

public class Pertence extends Formulario {

	private int vitima;
	private String tipo;
	private String nome;
	private String onde_encontrado;
	private String onde_enviado;
	private String observacao;
	

	public int getVitima() {
		return vitima;
	}
	public void setVitima(int vitima) {
		this.vitima = vitima;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getOnde_encontrado() {
		return onde_encontrado;
	}
	public void setOnde_encontrado(String onde_encontrado) {
		this.onde_encontrado = onde_encontrado;
	}
	public String getOnde_enviado() {
		return onde_enviado;
	}
	public void setOnde_enviado(String onde_enviado) {
		this.onde_enviado = onde_enviado;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

}
