package compras;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Lampada lampada1 = new Lampada("Phillips", 10.99, 10, false);
		
		lampada1.ligar();
		
		lampada1.mostrarEstado();
		
		Lampada lampada2 = new Lampada();
		
		System.out.println("Informe a marca da lâmpada: ");
		lampada2.setMarca(leia.nextLine());
		
		System.out.println("Informe o preço: ");
		lampada2.setPreco(Double.parseDouble(leia.nextLine()));
		
		System.out.println("Informe a quantidade em estoque: ");
		lampada2.setQuantidadeEstoque(Integer.parseInt(leia.nextLine()));
		
		lampada2.ligar();
		
		lampada2.mostrarEstado();
		
		leia.close();
		
		
	}

}
