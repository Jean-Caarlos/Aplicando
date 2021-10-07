package br.com.dados;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import br.com.classes.Cavalo;

public class Calculadora {
	Scanner teclado = new Scanner(System.in);
	String IO;
	List<Integer> numeros;

	public boolean isPar(long numero) {

		return numero % 2 == 0;
	}
	public boolean isImpar(long numero) {

		return numero % 2 != 0;
	}

	public Boolean isIgual(long numero1, long numero2) {
		return numero1 == numero2;
	}

	public long incrementar(long numero) {
		return ++numero;
	}

	public long decrementar(long numero) {
		return --numero;
	}

	public Boolean isPrimo(long numero) {
		for (long i = 2; i < numero; i++) {
			if (numero % i == 0) {
				return false;
			}
		}
		return true;
	}
	// 9 - Faça uma classe em JAVA que receba vários numeros até que o usuário
	// digite sair. (Usar Scanner)
	// - Após sair o sistema vai Listar todos os numeros no console.
	// - Depois vai executar todas as operações matematicas da Classe Calculadora.

	/*
	 * public void recebNu() { for(long i = 0; i <= i; i++) {
	 * System.out.println("digite um numero ou sair,para sair da classe "); IO =
	 * teclado.next(); if(IO.equals("sair")) { System.out.println(+calc); break; }
	 * else { numeros.add(IO.hashCode());
	 * 
	 * } } }
	 */

	// 10 - Faça uma classe em JAVA que receba os seguintes dados de um Cachorro
	// Nome, Idade, Altura até que o usuário digite sair. (Usar Scanner)
	// - Após sair o sistema vai Listar todos os cachorros.
	// - Depois calcule o cachorro com o maior qtde de caracteres no nome, Maior
	// idade, Maior Altura.
	// - Mostre os animais com idade impar
	// - Mostre a média das alturas das cachorro.

	/*
	 * public static void main(String[] args) { Scanner teclado = new
	 * Scanner(System.in); String tex; List<Integer> caracteristicas = new
	 * ArrayList<Integer>();
	 * 
	 * 
	 * do { Cachorro dog = new Cachorro();
	 * 
	 * System.out.println("Digite o nome: "); String nome = (teclado.next());
	 * dog.setNome(teclado.next()); System.out.println("Digite a idade: "); String
	 * idade = teclado.next(); dog.setIdade(Integer.valueOf(idade));
	 * System.out.println("Digite a altura"); String altura = teclado.next();
	 * dog.setAltura(Integer.valueOf(altura)); caracteristicas.add(dog);
	 * System.out.println("Deseja sair ou continuar "); tex = teclado.next();
	 * 
	 * } while (!tex.equalsIgnoreCase("Sair"));
	 * 
	 * 
	 * for(Integer dog : caracteristicas) {
	 * 
	 * }
	 * 
	 * }
	 * 
	 * private static void Cachorro() { // TODO Auto-generated method stub
	 * 
	 * 
	 * 
	 * 
	 * public static void main1(String[] args) {
	 * 
	 * Scanner scanner = new Scanner(System.in); String texto; List<Cachorro>
	 * matilha = new ArrayList<Cachorro>(); do { Cachorro novoCachorro = new
	 * Cachorro(); System.out.println("Digite o Nome do Cachorro: "); texto =
	 * scanner.next(); if(!texto.equalsIgnoreCase("sair")) {
	 * novoCachorro.setNome(texto);
	 * 
	 * System.out.println("Digite o Nome do Idade: "); texto = scanner.next();
	 * novoCachorro.setIdade((Integer.valueOf(texto)));
	 * 
	 * System.out.println("Digite o Nome do Altura: "); texto = scanner.next();
	 * novoCachorro.setAltura(Integer.valueOf(texto));
	 * 
	 * matilha.add(novoCachorro); } } while (!texto.equalsIgnoreCase("Sair"));
	 * 
	 * if (matilha != null) { Integer totalIdade = 0; HashMap<String, Integer>
	 * valores = new HashMap<>(); List<String> nomeAnimaisIdadeImpar = new
	 * ArrayList<String>(); Calculadora calc = new Calculadora(); for (Cachorro
	 * cachorro : matilha) { if (cachorro.getNome() != null && cachorro.getAltura()
	 * != null && cachorro.getIdade() != null) { System.out.println("Cachorro:" +
	 * cachorro.getNome());
	 * 
	 * verificarMaiorNome(valores, cachorro);
	 * 
	 * if (valores.containsKey("idadeMaxima")) { Integer qtde =
	 * valores.get("idadeMaxima"); if (cachorro.getIdade() > qtde) {
	 * valores.put("idadeMaxima", cachorro.getIdade()); } } else {
	 * valores.put("idadeMaxima", cachorro.getIdade()); }
	 * 
	 * veirificarMaiorAltura(valores, cachorro);
	 * 
	 * totalIdade += cachorro.getIdade();
	 * 
	 * if (cachorro.getIdade() != null && !calc.isPar(cachorro.getIdade())) {
	 * nomeAnimaisIdadeImpar.add(cachorro.getNome()); } } }
	 * System.out.println("Maior Nome:" + valores.get("qtdCaracter"));
	 * System.out.println("Maior Idade:" + valores.get("idadeMaxima"));
	 * System.out.println("Maior Altura:" + valores.get("alturaMaxima"));
	 * System.out.println("Animais com idade Impar: "+nomeAnimaisIdadeImpar.toString
	 * ()); System.out.println("A média de idade é: " + totalIdade /
	 * matilha.size()); } }
	 * 
	 * private static void veirificarMaiorAltura(HashMap<String, Integer> valores,
	 * Cachorro cachorro) { if (valores.containsKey("alturaMaxima")) { Integer qtde
	 * = valores.get("alturaMaxima"); if (cachorro.getAltura() > qtde) {
	 * valores.put("alturaMaxima", cachorro.getAltura()); } } else {
	 * valores.put("alturaMaxima", cachorro.getAltura()); } }
	 * 
	 * private static void verificarMaiorNome(HashMap<String, Integer> valores,
	 * Cachorro cachorro) { if (valores.containsKey("qtdCaracter")) { Integer qtde =
	 * valores.get("qtdCaracter"); if (cachorro.getNome().length() > qtde) {
	 * valores.put("qtdCaracter", cachorro.getNome().length()); } } else {
	 * valores.put("qtdCaracter", cachorro.getNome().length()); } }
	 */

	/*
	 * 11 - Faça uma classe em JAVA que receba os dados de vários animais com os seguintes dados: cachorro/cavalo se ele for um cachoro perguntar o tipo de comida que ele come ração/carne. Se ele for um cavalo perguntar se ele é um cavalo de corrida ou de carga. Após isso para todos os animais pedir nome, altura e idade. Clicar em sair para o sistema para de receber informações. 
Digite 1 ou 2 para:
1 - Listar os cachorros com os seguintes dados:
        - Depois calcule os Cachorros com o maior qtde de caracteres no nome, Maior idade, Maior Altura.
		- Mostre os cachorros que tem idade impar	
		- O cachorro com maior idade.
		- O cachorro com menor idade.
		- Mostrar a qtde de cachorros de ração e de carne
 	 
2 - Listar os cavalos com os seguintes dados:		
		- Depois calcule o Cavalo com o maior qtde de caracteres no nome, Maior idade, Maior Altura.
		- Mostre os cavalos que tem idade par	
		- Mostre a média das alturas dos cavalos.
		- Mostrar a qtde de cavalo de corrida e de carga 

	 */
	public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			String teclado;
			int qtdecachorrosração = 0;
			int qtdecachorroscarne = 0;
			int qtdecavalocorrida = 0;
			int qtdecavalocarga = 0;
			List<String> qtdecaracteresnome = new ArrayList<String>();
			List<Cachorro> matilha = new ArrayList<Cachorro>();
			List<Cavalo> cavalos = new ArrayList<Cavalo>();
			do {
				Cachorro novoCachorro = new Cachorro();
				Cavalo novoCavalo =  new Cavalo();
				System.out.println("Digite se é Cachorro ou Cavalo: ");
				teclado = scanner.next();
				if(teclado.equalsIgnoreCase("Cachorro")) {
					System.out.println("O tipo de comida que ele come, ração/carne?");
					teclado = scanner.next();
					if (teclado.equalsIgnoreCase("ração")) {
						qtdecachorrosração++;
					}
					else if (teclado.equalsIgnoreCase("carne")) {
						qtdecachorroscarne++;
					}

					System.out.println("Digite o nome: ");
					teclado = scanner.next();
					novoCachorro.setNome(teclado);
					
					System.out.println("Digite a Idade: ");
					teclado = scanner.next();
					novoCachorro.setIdade((Integer.valueOf(teclado)));
					
					System.out.println("Digite a Altura: ");
					teclado = scanner.next();
					novoCachorro.setAltura(Integer.valueOf(teclado));
					
					matilha.add(novoCachorro);
				}else if(teclado.equalsIgnoreCase("Cavalo")){
					System.out.println("de corrida ou de carga?");
					teclado = scanner.next();
					if (teclado.equalsIgnoreCase("corrida")) {
					qtdecavalocorrida++;
					
					}else if (teclado.equalsIgnoreCase("carga")) {
					qtdecavalocarga++;
					}
					
					System.out.println("Digite o nome: ");
					teclado = scanner.next();
					novoCavalo.setNome(teclado);
					
					System.out.println("Digite a Idade: ");
					teclado = scanner.next();
					novoCavalo.setIdade((Integer.valueOf(teclado)));
					
					System.out.println("Digite a Altura: ");
					teclado = scanner.next();
					novoCavalo.setAltura(Integer.valueOf(teclado));
				
					cavalos.add(novoCavalo);
				}
			} while (!teclado.equalsIgnoreCase("Sair"));
				
			Integer totalAlt = 0;
			HashMap<String, Integer> valor = new HashMap<>();
			List<String> nomeAnimaisIdadeImpar = new ArrayList<String>();
			List<String> nomeAnimaisIdadePar = new ArrayList<String>();
			Calculadora calcular = new Calculadora();
		
			System.out.println("Digite 1 ou 2:");
			teclado = scanner.next();
			
			if(teclado.equals("1")) {
					
					 for (Cachorro cachorro : matilha) {
						if (cachorro.getNome() != null && cachorro.getAltura() != null && cachorro.getIdade() != null) {
							System.out.println("Cachorro:" + cachorro.getNome());
							
							verificarMaiorNome(valor, cachorro);
							
							if (valor.containsKey("idadeMaxima")) {
								Integer qtde = valor.get("idadeMaxima");
								if (cachorro.getIdade() > qtde) {
									valor.put("idadeMaxima", cachorro.getIdade());
								}
							} else {
								valor.put("idadeMaxima", cachorro.getIdade());
							}
							
							veirificarMaiorAltura(valor, cachorro);
							
							totalAlt += cachorro.getAltura();
							
							if (cachorro.getIdade() != null && calcular.isImpar(cachorro.getIdade())) {
								nomeAnimaisIdadeImpar.add(cachorro.getNome());
							}
						}
					}
					System.out.println("Maior Nome:" + valor.get("qtdCaracter"));
					System.out.println("Maior Idade:" + valor.get("idadeMaxima"));
					System.out.println("Maior Altura:" + valor.get("alturaMaxima"));
					System.out.println("Cachorro com idade Impar: "+nomeAnimaisIdadeImpar.toString());
					System.out.println("A qtdecachorrosração: " + qtdecachorrosração);
					System.out.println("A qtdecachorroscarne: " + qtdecachorroscarne);
				} else { 
					
					 for (Cavalo cavalo : cavalos) {
							if (cavalo.getNome() != null && cavalo.getAltura() != null && cavalo.getIdade() != null) {
								System.out.println("Cachorro:" + cavalo.getNome());
								
								verificarMaiorNom(valor, cavalo);
								
								if (valor.containsKey("idadeMaxima")) {
									Integer qtde = valor.get("idadeMaxima");
									if (cavalo.getIdade() > qtde) {
										valor.put("idadeMaxima", cavalo.getIdade());
									}
								} else {
									valor.put("idadeMaxima", cavalo.getIdade());
								}
								
								veirificarMaiorAltur(valor, cavalo);
								
								totalAlt += cavalo.getAltura();
								
								if (cavalo.getIdade() != null && calcular.isPar(cavalo.getIdade())) {
									nomeAnimaisIdadePar.add(cavalo.getNome());
								}
							}
						}
						System.out.println("Maior Nome:" + valor.get("qtdCaracter"));
						System.out.println("Maior Idade:" + valor.get("idadeMaxima"));
						System.out.println("Maior Altura:" + valor.get("alturaMaxima"));
						System.out.println("Cavalo com idade Par: "+nomeAnimaisIdadePar.toString());
						System.out.println("A media das alturas: " + totalAlt / cavalos.size());
						System.out.println("A qtdecavalocorrida: " + qtdecavalocorrida);
						System.out.println("A qtdecavalocarga: " + qtdecavalocarga);
				}
				}
			

	private static void veirificarMaiorAltura(HashMap<String, Integer> valores, Cachorro cachorro) {
		if (valores.containsKey("alturaMaxima")) {
			Integer qtde = valores.get("alturaMaxima");
			if (cachorro.getAltura() > qtde) {
				valores.put("alturaMaxima", cachorro.getAltura());
			}
		} else {
			valores.put("alturaMaxima", cachorro.getAltura());
		}
	}

	private static void verificarMaiorNome(HashMap<String, Integer> valores, Cachorro cachorro) {
		if (valores.containsKey("qtdCaracter")) {
			Integer qtde = valores.get("qtdCaracter");
			if (cachorro.getNome().length() > qtde) {
				valores.put("qtdCaracter", cachorro.getNome().length()); 
			}
		} else {
			valores.put("qtdCaracter", cachorro.getNome().length());

		}
	}
		
		private static void veirificarMaiorAltur(HashMap<String, Integer> valores, Cavalo cavalo) {
			if (valores.containsKey("alturaMaxima")) {
				Integer qtde = valores.get("alturaMaxima");
				if (cavalo.getAltura() > qtde) {
					valores.put("alturaMaxima", cavalo.getAltura());
				}
			} else {
				valores.put("alturaMaxima", cavalo.getAltura());
			}
		}

		private static void verificarMaiorNom(HashMap<String, Integer> valores, Cavalo cavalo) {
			if (valores.containsKey("qtdCaracter")) {
				Integer qtde = valores.get("qtdCaracter");
				if (cavalo.getNome().length() > qtde) {
					valores.put("qtdCaracter", cavalo.getNome().length()); 
				}
			} else {
				valores.put("qtdCaracter", cavalo.getNome().length());

			}
	}
}