package exercicio2;

import java.util.Scanner;

public class CadastroNumeros {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int indice = 0; indice < numeros.length; indice++) {

            System.out.print("Digite o " + (indice + 1) + "º número: ");
            numeros[indice] = leia.nextInt();
        }

        System.out.println("\n=== NÚMEROS CADASTRADOS ===");

        for (int numero : numeros) {
            System.out.println("Número: " + numero);
        }

        leia.close();
    }
}
