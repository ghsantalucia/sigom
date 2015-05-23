package model;

public class Laudo {
	
	private int id;
	private int ocorrencia;
	private String data_laudo;
	private int dia_laudo;
	private String mes_laudo;
	private int ano_laudo;
	private String historico_laudo;
	private String solicitante_laudo;
	private int num_fotos;
	private String conclusao;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOcorrencia() {
		return ocorrencia;
	}
	public void setOcorrencia(int ocorrencia) {
		this.ocorrencia = ocorrencia;
	}
	public String getData_laudo() {
		return data_laudo;
	}
	public void setData_laudo(String data_laudo) {
		this.data_laudo = data_laudo;
	}
	public int getDia_laudo() {
		return dia_laudo;
	}
	public void setDia_laudo(int dia_laudo) {
		this.dia_laudo = dia_laudo;
	}
	public String getMes_laudo() {
		return mes_laudo;
	}
	public void setMes_laudo(String mes_laudo) {
		this.mes_laudo = mes_laudo;
	}
	public int getAno_laudo() {
		return ano_laudo;
	}
	public void setAno_laudo(int ano_laudo) {
		this.ano_laudo = ano_laudo;
	}
	public String getHistorico_laudo() {
		return historico_laudo;
	}
	public void setHistorico_laudo(String historico_laudo) {
		this.historico_laudo = historico_laudo;
	}
	public String getSolicitante_laudo() {
		return solicitante_laudo;
	}
	public void setSolicitante_laudo(String solicitante_laudo) {
		this.solicitante_laudo = solicitante_laudo;
	}
	public int getNum_fotos() {
		return num_fotos;
	}
	public void setNum_fotos(int num_fotos) {
		this.num_fotos = num_fotos;
	}
	public String getConclusao() {
		return conclusao;
	}
	public void setConclusao(String conclusao) {
		this.conclusao = conclusao;
	}
	
}
