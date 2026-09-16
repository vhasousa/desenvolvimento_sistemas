package comparacao;

import java.util.Scanner;

public class Comparacao {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int numero = leia.nextInt();

		System.out.println("O número " + numero + (numero > 20 ? " é maior que 20" : numero == 20 ? " é igual a 20": " é menor que 20"));

	}

}
