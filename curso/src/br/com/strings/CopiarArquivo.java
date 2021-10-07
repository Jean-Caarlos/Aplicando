package br.com.strings;

import java.io.*;

public class CopiarArquivo {

	public static void main(String[] args) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			in = new FileInputStream("C:\\ambiente\\novoArquivo.txt");
			out = new FileOutputStream("C:\\ambiente\\novoArquivoCopiado.txt");

			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}

	}

	public void copiarArquivo(String caminhoArquivo, String caminhoDestino) {
		// TODO Auto-generated method stub
		
	}

}


