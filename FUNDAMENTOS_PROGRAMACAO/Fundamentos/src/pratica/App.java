package pratica;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a idade: ");
		int idade = Integer.parseInt(leia.nextLine());
		
		System.out.println("Digite seu nome: ");
		String nome = leia.nextLine();
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);

	}

}
