package br.com.strings;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LerArquivo {

	public static void main(String[] args) {
		
		try {
			InputStream is = new FileInputStream("C:\\ambiente\\novoArquivo.txt");
			int size = is.available();
			
			for(int i = 0; i < size; i++) {
					System.out.println((char) is.read() + " ");
			}
			is.close();
		} catch (IOException e) {
			System.out.println("Exception");
		}

	}

}

