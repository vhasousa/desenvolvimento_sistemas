package operacoes;

import java.util.Scanner;

public class OperacoesMatematicas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero1, numero2, opcao;
		
		System.out.println("1 - Calcular a média dos números;\n"
				+ "2 - Subtrair o menor número do maior;\n"
				+ "3 - Multiplicar os números;\n"
				+ "4 - Dividir o primeiro número pelo segundo");
		opcao = leia.nextInt();
		
		System.out.println("Informe o primeiro número: ");
		numero1 = leia.nextInt();
		
		System.out.println("Informe o segundo número: ");
		numero2 = leia.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.println("Média: " + (numero1 + numero2) / 2);
			break;
		case 2:
			if (numero1 > numero2) {
				System.out.println("Subtração: " + (numero1 - numero2));
			} else {
				System.out.println("Subtração: " + (numero2 - numero1));
				
			}
			break;
		case 3:
			System.out.println("Multiplicação: " + (numero1 * numero2));
			break;
		case 4:
			if (numero2 != 0) {
				System.out.println("Divisão: " + numero1 / numero2);
			} else {
				System.out.println("Não foi possível dividir");
			}
			
			break;
			
		default:
			System.out.println();
			
		}

	}

}
