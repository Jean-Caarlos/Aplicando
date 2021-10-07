package br.com.pontodecisao;

public class ControleLoolFor {
	public static void main(String args[]) {
		
		//Contador
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		//for aninhado Contador 
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <=3; j++) {
				System.out.println(i+ "" + j);
			}
		}
		
		
		int [] numbers = {10, 20, 30, 40, 50};
		
		 for(int x : numbers ) {
			 System.out.print( x );
			 System.out.print(",");
		 }
		 System.out.print("/n");
		// String [] names = {"James"
	}

}
