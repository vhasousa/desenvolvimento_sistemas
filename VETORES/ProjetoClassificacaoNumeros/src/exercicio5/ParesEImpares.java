package exercicio5;

import java.util.Scanner;

public class ParesEImpares {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int[] numeros = new int[8];

        int quantidadePares = 0;
        int quantidadeImpares = 0;

        for (int indice = 0; indice < numeros.length; indice++) {

            System.out.print("Digite o " + (indice + 1) + "º número: ");
            numeros[indice] = leia.nextInt();
        }

        System.out.println("\n=== RESULTADO ===");

        for (int numero : numeros) {

            if (numero % 2 == 0) {

                System.out.println(numero + " é par.");
                quantidadePares++;

            } else {

                System.out.println(numero + " é ímpar.");
                quantidadeImpares++;
            }
        }

        System.out.println("\nQuantidade de números pares: " + quantidadePares);
        System.out.println("Quantidade de números ímpares: " + quantidadeImpares);

        leia.close();
    }
}
