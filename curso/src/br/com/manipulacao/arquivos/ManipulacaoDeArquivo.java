package br.com.manipulacao.arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ManipulacaoDeArquivo {
	public static void copiarArquivo(String caminhoArquivo, String caminhoDestino) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			in = new FileInputStream(caminhoArquivo);
			out = new FileOutputStream(caminhoDestino);

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

	public static void CriarArquivo(String caminhoArquivo) {
		File file = new File("caminhoArquivo");
		boolean result;
		try {
			result = file.createNewFile();
			if (result) {
				System.out.println("file created " + file.getCanonicalPath());
			} else {
				System.out.println("File already exist at location: " + file.getCanonicalPath());
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void LerArquivo(String CaminhoArquivoler) {
			
			try {
				InputStream is = new FileInputStream(CaminhoArquivoler);
				int size = is.available();
				
				for(int i = 0; i < size; i++) {
						System.out.println((char) is.read() + " ");
				}
				is.close();
			} catch (IOException e) {
				System.out.println("Exception");
			}
	}

	public static void DeletarArquivo(String CaminhhoDeletarArquivo) {
				
				try {
					File file = new File(CaminhhoDeletarArquivo); 
					file.delete();
				} catch (Exception e) {
					System.out.print("Não conseguimos excluir");
				}
	}
	
  }

