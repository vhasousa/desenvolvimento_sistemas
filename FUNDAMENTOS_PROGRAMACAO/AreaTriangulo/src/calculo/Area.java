package calculo;

import java.util.Scanner;

public class Area {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double base, altura;
		
		do {
			System.out.println("Informe a base do triângulo: ");
			base = leia.nextDouble();
			
			System.out.println("Informe a altura do triângulo: ");
			altura = leia.nextDouble();
			
			if (base <= 0 || altura <= 0) {
				System.out.println("Base ou altura inválidos");
			}
		} while (base <= 0 || altura <= 0);
		
		System.out.println("Área do triângulo: " + (base * altura)/2);
		
	}
}
