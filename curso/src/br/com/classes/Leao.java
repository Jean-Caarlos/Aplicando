package br.com.classes;

public class Leao extends Animal {

	@Override
	public void emitirSom() {
		super.emitirSom();
		System.out.println("O Leao ruje");

	}

	public void move() {
		System.out.println("sobre 4 patas");
	}

	public String comer() {
		setCarnivoro(Boolean.TRUE);
		return super.comer();
	}
}
