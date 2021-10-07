package br.com.modificadores;

public class AcessarCalculadora {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		System.out.println(calc.somar(10, 10));
		System.out.println(calc.subtrair(10, 10));
		System.out.println(calc.multiplicar(10,10));
		//System.out.println(calc.dividir(10,10));
		
	}
	
}
