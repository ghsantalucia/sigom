package model;

public class Isolamento {

	private int id;
	private int endereco;
	private String instituicao;
	private String viatura;
	private String batalhao;
	private String responsaveis;
	private boolean preservacao_contento;
	private boolean isolamento_contento;
	private String observacao_preservacao;
	private String observacao_isolamento;
	private String observacao_geral;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEndereco() {
		return endereco;
	}
	public void setEndereco(int endereco) {
		this.endereco = endereco;
	}
	public String getInstituicao() {
		return instituicao;
	}
	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}
	public String getViatura() {
		return viatura;
	}
	public void setViatura(String viatura) {
		this.viatura = viatura;
	}
	public String getBatalhao() {
		return batalhao;
	}
	public void setBatalhao(String batalhao) {
		this.batalhao = batalhao;
	}
	public String getResponsaveis() {
		return responsaveis;
	}
	public void setResponsaveis(String responsaveis) {
		this.responsaveis = responsaveis;
	}
	public boolean isPreservacao_contento() {
		return preservacao_contento;
	}
	public void setPreservacao_contento(boolean preservacao_contento) {
		this.preservacao_contento = preservacao_contento;
	}
	public boolean isIsolamento_contento() {
		return isolamento_contento;
	}
	public void setIsolamento_contento(boolean isolamento_contento) {
		this.isolamento_contento = isolamento_contento;
	}
	public String getObservacao_preservacao() {
		return observacao_preservacao;
	}
	public void setObservacao_preservacao(String observacao_preservacao) {
		this.observacao_preservacao = observacao_preservacao;
	}
	public String getObservacao_isolamento() {
		return observacao_isolamento;
	}
	public void setObservacao_isolamento(String observacao_isolamento) {
		this.observacao_isolamento = observacao_isolamento;
	}
	public String getObservacao_geral() {
		return observacao_geral;
	}
	public void setObservacao_geral(String observacao_geral) {
		this.observacao_geral = observacao_geral;
	}
	
}
