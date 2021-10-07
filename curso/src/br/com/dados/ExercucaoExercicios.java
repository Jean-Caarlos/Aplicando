package br.com.dados;

import java.util.ArrayList;
import java.util.List;

public class ExercucaoExercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Pessoa william = new Pessoa("William", 1000, 10, "Sistemas");
		Pessoa Thallys = new Pessoa("Thallys", 2000, 20, "Sistemas");
		Pessoa Carlos = new Pessoa("Carlos", 100000, 1, "Sistemas");
		Pessoa Jean = new Pessoa("Jean", 50000, 6, "Sistemas");
		Pessoa Morais = new Pessoa("Morais", 500000, 5, "Sistemas");

		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(william);
		pessoas.add(Thallys);
		pessoas.add(Carlos);
		pessoas.add(Jean);
		pessoas.add(Morais);

		for (Pessoa x : pessoas) {
			System.out.println(x.toString());
		}
		
		Fornecedor f = new Fornecedor("Fornecedor 1", "111.111.111-11", Boolean.TRUE, new Endereço(" Rua desembargador amilcar de castro 1", "Estoril", "RJ", "RJ",1));
		Fornecedor g = new Fornecedor("Fornecedor 2", "222.222.222-22", Boolean.TRUE, new Endereço(" Rua desembargador amilcar de castro 2", "Estoril", "SP", "RJ",1));
		Fornecedor j = new Fornecedor("Fornecedor 3", "111.111.111-11", Boolean.TRUE, new Endereço(" Rua desembargador amilcar de castro 3", "Estoril", "RJ", "RJ",1));
		
		List<Fornecedor> Fornecedor = new ArrayList<Fornecedor>();
		Fornecedor.add(f);
		Fornecedor.add(g);
		Fornecedor.add(j);
		
		for (Fornecedor y : Fornecedor) {
			System.out.println(y.toString());
		}
		
	}

	
}
