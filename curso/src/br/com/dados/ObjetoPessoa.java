package br.com.dados;

public class ObjetoPessoa {
	
	private Integer ID_ASSOCIADO;
	private String NOME_PESSOA;
	private String SEXO;
	private String ID_SITUACAO;
	private String NOME_SITUACAO;
	private Integer ANO_NASCIMENTO;
	private Integer ID_EMPRESA; 
	private Integer ID_PESSOA;

	 
	
	public ObjetoPessoa(Integer iD_ASSOCIADO, String nOME_PESSOA, String sEXO, String iD_SITUACAO, String nOME_SITUACAO,
			Integer aNO_NASCIMENTO, Integer iD_EMPRESA, Integer iD_PESSOA) {
		super();
		ID_ASSOCIADO = iD_ASSOCIADO;
		NOME_PESSOA = nOME_PESSOA;
		SEXO = sEXO;
		ID_SITUACAO = iD_SITUACAO;
		NOME_SITUACAO = nOME_SITUACAO;
		ANO_NASCIMENTO = aNO_NASCIMENTO;
		ID_EMPRESA = iD_EMPRESA;
		ID_PESSOA = iD_PESSOA;
	}
	public Integer getID_PESSOA() {
		return ID_PESSOA;
	}
	public void setID_PESSOA(Integer iD_PESSOA) {
		ID_PESSOA = iD_PESSOA;
	}
	public Integer getID_ASSOCIADO() {
		return ID_ASSOCIADO;
	}
	public void setID_ASSOCIADO(Integer iD_ASSOCIADO) {
		ID_ASSOCIADO = iD_ASSOCIADO;
	}
	public String getNOME_PESSOA() {
		return NOME_PESSOA;
	}
	public void setNOME_PESSOA(String nOME_PESSOA) {
		NOME_PESSOA = nOME_PESSOA;
	}
	public String getSEXO() {
		return SEXO;
	}
	public void setSEXO(String sEXO) {
		SEXO = sEXO;
	}
	public String getID_SITUACAO() {
		return ID_SITUACAO;
	}
	public void setID_SITUACAO(String iD_SITUACAO) {
		ID_SITUACAO = iD_SITUACAO;
	}
	public String getNOME_SITUACAO() {
		return NOME_SITUACAO;
	}
	public void setNOME_SITUACAO(String nOME_SITUACAO) {
		NOME_SITUACAO = nOME_SITUACAO;
	}
	public Integer getANO_NASCIMENTO() {
		return ANO_NASCIMENTO;
	}
	public void setANO_NASCIMENTO(Integer aNO_NASCIMENTO) {
		ANO_NASCIMENTO = aNO_NASCIMENTO;
	}
	public Integer getID_EMPRESA() {
		return ID_EMPRESA;
	}
	public void setID_EMPRESA(Integer iD_EMPRESA) {
		ID_EMPRESA = iD_EMPRESA;
	}
	

}
