package br.com.classes;

import java.math.BigDecimal;
import br.com.interfases.Carnivoro;
import br.com.interfases.Herbivoro;

public class Animal implements Carnivoro, Herbivoro {

	private String especie;
	private BigDecimal tamanho;
	private String cor;
	private BigDecimal peso;
	private Integer qtdepatas;
	private Boolean carnivoro;

	public String comer() {
		if (carnivoro) {
			return comerCarne();
		} else {
			return comerCapim();
		}

	}

	public Boolean getCarnivoro() {
		return carnivoro;
	}

	public void setCarnivoro(Boolean carnivoro) {
		this.carnivoro = carnivoro;
	}

	public void dorme() {
	}

	public void move() {
		System.out.println("Se move Nadando");
	}

	public void emitirSom() {
		System.out.println("Emite algum SOM");
	}

	public void nadar() {
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public BigDecimal getTamanho() {
		return tamanho;
	}

	public void setTamanho(BigDecimal tamanho) {
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public BigDecimal getPeso() {
		return peso;
	}

	public void setPeso(BigDecimal peso) {
		this.peso = peso;
	}

	public Integer getQtdepatas() {
		return qtdepatas;
	}

	public void setQtdepatas(Integer qtdepatas) {
		this.qtdepatas = qtdepatas;
	}

	@Override
	public String comerCarne() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String comerCapim() {
		// TODO Auto-generated method stub
		return null;
	}
}
