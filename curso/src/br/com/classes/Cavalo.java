package br.com.classes;

public class Cavalo  {
	private String Nome;
	private Integer Idade;
	private Integer Altura;
	
	
	public Cavalo() {
		super();
		Nome = getNome();
		Idade = getIdade();
		Altura = getAltura();
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		this.Nome=nome;
	}
	public Integer getIdade() {
		return Idade;
	}
	public void setIdade(Integer idade) {
		Idade = idade;
	}
	public Integer getAltura() {
		return Altura;
	}
	public void setAltura(Integer altura) {
		Altura = altura;
	}
	@Override
	public String toString() {
		return "Cachorro [getNome()=" + getNome() + ", getIdade()=" + getIdade() + ", getAltura()=" + getAltura() + "]";	}

	}
