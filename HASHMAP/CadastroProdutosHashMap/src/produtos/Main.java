package produtos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		HashMap<Integer, Produto> produtos = new HashMap<>();
		
		produtos.put(101, new Produto("Coca-Cola", 12.90, 100));
		produtos.put(102, new Produto("Milka", 19.90, 10));
		produtos.put(103, new Produto("Toblerone", 25.90, 5));
		produtos.put(104, new Produto("Lindt", 21.90, 15));
		
		for(Map.Entry<Integer, Produto> produto: produtos.entrySet()) {
			produto.getValue().exibirDados();;
		}
		
		System.out.println("Informe o código do produto desejado: ");
		int codigo = Integer.parseInt(leia.nextLine());
		
		if (produtos.containsKey(codigo)) {
			produtos.get(codigo).exibirDados();
		} else {
			System.out.println("Produto não encontrado");
		}
		
		leia.close();
	}

}
