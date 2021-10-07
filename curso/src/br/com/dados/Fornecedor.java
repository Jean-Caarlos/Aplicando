package br.com.dados;

import java.util.List;

public class Fornecedor {

	private String nome;
	private String cpfCnpj;
	private Boolean credenciado;
	private Endere�o endereco;
	
	
	
	public Fornecedor(String nome, String cpfCnpj, Boolean credenciado, Endere�o endereco) {
		super();
		this.nome = nome;
		this.cpfCnpj = cpfCnpj;
		this.credenciado = credenciado;
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpfCnpj() {
		return cpfCnpj;
	}
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	public Boolean getCredenciado() {
		return credenciado;
	}
	public void setCredenciado(Boolean credenciado) {
		this.credenciado = credenciado;
	}
	public Endere�o getEndereco() {
		return endereco;
	}
	public void setEndereco(Endere�o endereco) {
		this.endereco = endereco;
	}
	@Override
	public String toString() {
		return "Fornecedor [nome=" + nome + ", cpfCnpj=" + cpfCnpj + ", credenciado=" + credenciado + ", endereco="
				+ endereco + "]";
	}
	
	
	}

	

