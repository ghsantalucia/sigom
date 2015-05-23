package model;

public class EquipeSocorro {

	private int id;
	private int ocorrencia;
	private String viatura;
	private String medico_crm;
	private String instituicao;
	private String horario_obito;
	private String data_obito;
	private String observacao;
	
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
	public String getViatura() {
		return viatura;
	}
	public void setViatura(String viatura) {
		this.viatura = viatura;
	}
	public String getMedico_crm() {
		return medico_crm;
	}
	public void setMedico_crm(String medico_crm) {
		this.medico_crm = medico_crm;
	}
	public String getInstituicao() {
		return instituicao;
	}
	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}
	public String getHorario_obito() {
		return horario_obito;
	}
	public void setHorario_obito(String horario_obito) {
		this.horario_obito = horario_obito;
	}
	public String getData_obito() {
		return data_obito;
	}
	public void setData_obito(String data_obito) {
		this.data_obito = data_obito;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
}
