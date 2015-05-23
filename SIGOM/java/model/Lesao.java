package model;

public class Lesao {
	
	private int vitima;
	private int dia_lesoes;
	private String tipo_lesao;
	private String causa;
	private String localizacao_lesao;
	private String descricao;
	private int quantidade;
	private int num_lesao;
	private String arma_usada;
	private String observacao;
	
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getVitima() {
		return vitima;
	}
	public void setVitima(int vitima) {
		this.vitima = vitima;
	}
	public int getDia_lesoes() {
		return dia_lesoes;
	}
	public void setDia_lesoes(int dia_lesoes) {
		this.dia_lesoes = dia_lesoes;
	}
	public String getTipo_lesao() {
		return tipo_lesao;
	}
	public void setTipo_lesao(String tipo_lesao) {
		this.tipo_lesao = tipo_lesao;
	}
	public String getCausa() {
		return causa;
	}
	public void setCausa(String causa) {
		this.causa = causa;
	}
	public String getLocalizacao_lesao() {
		return localizacao_lesao;
	}
	public void setLocalizacao_lesao(String localizacao_lesao) {
		this.localizacao_lesao = localizacao_lesao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public int getNum_lesao() {
		return num_lesao;
	}
	public void setNum_lesao(int num_lesao) {
		this.num_lesao = num_lesao;
	}
	public String getArma_usada() {
		return arma_usada;
	}
	public void setArma_usada(String arma_usada) {
		this.arma_usada = arma_usada;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

}
