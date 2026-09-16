package exercicio4;

import java.util.Scanner;

public class AnaliseTemperaturas {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double[] temperaturas = new double[7];

        for (int indice = 0; indice < temperaturas.length; indice++) {

            System.out.print("Digite a temperatura do " + (indice + 1) + "º dia: ");
            temperaturas[indice] = leia.nextDouble();
        }

        double maiorTemperatura = temperaturas[0];
        double menorTemperatura = temperaturas[0];

        System.out.println("\n=== TEMPERATURAS INFORMADAS ===");

        for (double temperatura : temperaturas) {

            System.out.println("Temperatura: " + temperatura + " °C");

            if (temperatura > maiorTemperatura) {
                maiorTemperatura = temperatura;
            }

            if (temperatura < menorTemperatura) {
                menorTemperatura = temperatura;
            }
        }

        System.out.println("\nMaior temperatura: " + maiorTemperatura + " °C");
        System.out.println("Menor temperatura: " + menorTemperatura + " °C");

        leia.close();
    }
}
