package collections;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Produto> produtos = new ArrayList<>();
		
		produtos.add(new Produto("Chocolate", 4));
		produtos.add(new Produto("Nescau", 7));
		produtos.add(new Produto("Cafe", 8));
		
		System.out.println("\nAdicionando leite ao último índice");
		produtos.add(new Produto("Leite", 4));
		System.out.println(produtos.toString());
		
		System.out.println("\nRemovendo chocolate do indice 0");
		produtos.remove(0);
		System.out.println(produtos.toString());
		
		System.out.println("\nAtualizando o cafe de indice 1 de preço 8 para 4");
		produtos.set(1, new Produto("Cafe", 4));
		System.out.println(produtos.toString());
		
		System.out.println("\nApresentando todos os dados do array");
		System.out.println(produtos.toString());
	
	}

}
