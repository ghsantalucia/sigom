package model;

public class Vestigio extends Formulario {

	private int ocorrencia;
	private String referencia;
	private int quantidade;
	private String vestigio;
	private String onde_encontrado;
	private String onde_enviado;
	private boolean exame_local;
	private boolean coletado;
	private String quais_exames;
	private String observacao;


	public int getOcorrencia() {
		return ocorrencia;
	}
	public void setOcorrencia(int ocorrencia) {
		this.ocorrencia = ocorrencia;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getVestigio() {
		return vestigio;
	}
	public void setVestigio(String vestigio) {
		this.vestigio = vestigio;
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
	public boolean isExame_local() {
		return exame_local;
	}
	public void setExame_local(boolean exame_local) {
		this.exame_local = exame_local;
	}
	public boolean isColetado() {
		return coletado;
	}
	public void setColetado(boolean coletado) {
		this.coletado = coletado;
	}
	public String getQuais_exames() {
		return quais_exames;
	}
	public void setQuais_exames(String quais_exames) {
		this.quais_exames = quais_exames;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
}
