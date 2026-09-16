package exercicio3;

import java.util.Scanner;

public class MediaNotas {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double[] notas = new double[4];

        double somaNotas = 0;

        for (int indice = 0; indice < notas.length; indice++) {

            System.out.print("Digite a " + (indice + 1) + "ª nota: ");
            notas[indice] = leia.nextDouble();

            somaNotas += notas[indice];
        }

        System.out.println("\n=== NOTAS INFORMADAS ===");

        for (double nota : notas) {
            System.out.println("Nota: " + nota);
        }

        double media = somaNotas / notas.length;

        System.out.println("\nMédia das notas: " + media);

        leia.close();
    }
}
