//12 - Faça uma classe JAVA que leia o arquivo basedados.txt e leia cada linha organizando os dados (OBJETO PESSOA) da seguinte forma:
//ID_PESSOA,ID_ASSOCIADO,NOME_PESSOA,SEXO,ID_SITUACAO,NOME_SITUACAO,ANO_NASCIMENTO,ID_EMPRESA 
//Após isso o sistema tem que ter para os usuários as seguintes Opções:
//	1-Lista o Calculo de quantas pessoas são M(Masculino) e Quantas pessoas são F(Feminino).
//	2-Lista o Calculo de quantas pessoas Tem em cada situação
//	3-Lista o Calculo de quantas pessoas M ou F tem por cada situação
//	4-Lista o Calculo da Idade de todo mundo baseado no ano.
//	5-Lista qual ano tem a maior quantidade de pessoas F(Feminino) e M(Masculino)
//	6-Listar a(s) pessoa(s) mais velhas e mais novas.
//	7-Listar somente os nomes das 100 primeiras pessoas
//	8-Listar as pessoas 10 primeiras pessoas ordenada pelo Nome
//	9-Listar todas as pessoas que nasceram em 1987
//	10-Listar as quantidade de pessoas existem por empresa
//	11-Listar as quantidade de pessoas existem por empresa e sexo
//	12-Listar as quantidade de pessoas existem por empresa e sexo e situação


package br.com.dados;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) throws FileNotFoundException {
		String path = null;
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String line = "";
		try {
			  Scanner in = new Scanner(new FileReader("C:\\ambiente\\curso/basedados.txt"));
			while (in.hasNextLine()) {
		      line += in.nextLine()+"\n";
		}
		 System.out.println(line);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
