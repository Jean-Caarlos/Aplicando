package br.com.dados;

import java.util.List;

public class Fornecedor {

	private String nome;
	private String cpfCnpj;
	private Boolean credenciado;
	private Endereço endereco;
	
	
	
	public Fornecedor(String nome, String cpfCnpj, Boolean credenciado, Endereço endereco) {
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
	public Endereço getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereço endereco) {
		this.endereco = endereco;
	}
	@Override
	public String toString() {
		return "Fornecedor [nome=" + nome + ", cpfCnpj=" + cpfCnpj + ", credenciado=" + credenciado + ", endereco="
				+ endereco + "]";
	}
	
	
	}

	

