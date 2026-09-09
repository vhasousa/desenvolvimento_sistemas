package estoque;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		HashMap<String, Integer> estoque = new HashMap<>();
		
		estoque.put("Teclado", 10);
		estoque.put("Mouse", 15);
		estoque.put("Monitor", 6);
		estoque.put("Notebook", 4);
		
		for(Map.Entry<String, Integer> item: estoque.entrySet()) {
			System.out.printf("Produto: %s%nQuantidade: %d%n%n", item.getKey(), item.getValue());
		}
		
		System.out.println("Busca estoque pelo produto: ");
		String produto = leia.nextLine();
		
		if(estoque.containsKey(produto)) {
			int qtdEstoque = estoque.get(produto);
			
			System.out.printf("Produto buscado: %s%nEstoque: %s%n%n", produto, qtdEstoque);
		}
		
		System.out.println("Informe a nova quantidade em estoque para o produto encontrado:");
		int novaQtd = Integer.parseInt(leia.nextLine());
		
		estoque.put(produto, novaQtd);
		
		System.out.println("Produto a ser removido: ");
		produto = leia.nextLine();
		
		estoque.remove(produto);
		
		for(Map.Entry<String, Integer> item: estoque.entrySet()) {
			System.out.printf("Produto: %s%nQuantidade: %d%n%n", item.getKey(), item.getValue());
		}
		
		leia.close();

	}

}
