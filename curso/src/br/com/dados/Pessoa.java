package br.com.dados;

public class Pessoa {

	private String nome;
	private double salario;
	private Integer ramal;
	private String departamento;

	public String getNome() {
		return nome;
	}

	public Pessoa(String nome, double salario, Integer ramal, String departamento) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.ramal = ramal;
		this.departamento = departamento;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Integer getRamal() {
		return ramal;
	}

	public void setRamal(Integer ramal) {
		this.ramal = ramal;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", salario=" + salario + ", ramal=" + ramal + ", departamento=" + departamento
				+ "]";
	}

}
