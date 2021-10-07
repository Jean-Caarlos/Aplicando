package br.com.modificadores;

public class Calculadora {
	public long somar (long a, long b) {
     return a + b;
}
	 long subtrair (long a, long b) {
		return a - b;
	}
	
	protected long multiplicar (long a, long b) {
		return a * b;
	}
	
	private long dividir (long a, long b) {
		if(b != 0) {
		return a / b;
		}else
			return 0;
	}
	
}