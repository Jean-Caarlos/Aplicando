package br.com.strings;

import java.io.IOException;
import java.util.Scanner;

public class AcessarManipulacao {

	
	public static void executar (Scanner scanner, int n) throws IOException {
		Scanner scanner1 = new Scanner(System.in);
		System.out.printf("Informe um número da opção: 1 - Copiar, 2-Criar, 3-Deletar, 4-Ler");
		int n1 = scanner1.nextInt();
		//Chamar o metodo copiar
		if(n1 == 1) {
			System.out.printf("Informe o Endereço do Arquivo a copiar : ");
			String caminhoArquivo = scanner1.next();
			System.out.printf("Informe o Endereço para colar o Arquivo: ");
			String caminhoDestino = scanner1.next();
			CopiarArquivo cop = new CopiarArquivo();
			cop.copiarArquivo(caminhoArquivo, caminhoDestino);
		}else if(n1 == 2) {
			
		}else if(n1 == 3) {
			
		}else if(n1 == 4) {
			
		}else {
			System.out.println("Erro na opção ");
		}
	}
}
