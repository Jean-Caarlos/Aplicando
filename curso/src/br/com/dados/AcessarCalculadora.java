package br.com.dados;

public class AcessarCalculadora {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		
		System.out.println(calc.isPar(10));
		System.out.println(calc.isIgual(10,10));
		System.out.println(calc.incrementar(5));
		System.out.println(calc.decrementar(5));
		System.out.println(calc.isPrimo(4));
		

	}

}
