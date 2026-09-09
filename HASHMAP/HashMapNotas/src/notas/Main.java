package notas;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        HashMap<String, Double> notas = new HashMap<>();

        // Cadastro dos alunos
        notas.put("Carlos", 8.5);
        notas.put("Ana", 6.5);
        notas.put("Pedro", 9.0);
        notas.put("Mariana", 7.5);
        notas.put("Lucas", 5.0);

        double soma = 0;
        double maiorNota = Double.MIN_VALUE;
        double menorNota = Double.MAX_VALUE;

        // Percorrendo o HashMap
        for (Map.Entry<String, Double> aluno : notas.entrySet()) {

            String nome = aluno.getKey();
            double nota = aluno.getValue();

            String situacao;

            if (nota >= 7.0) {
                situacao = "Aprovado";
            } else {
                situacao = "Reprovado";
            }

            System.out.println("Aluno: " + nome);
            System.out.println("Nota: " + nota);
            System.out.println("Situação: " + situacao);
            System.out.println("-------------------");

            soma += nota;

            if (nota > maiorNota) {
                maiorNota = nota;
            }

            if (nota < menorNota) {
                menorNota = nota;
            }
        }

        double media = soma / notas.size();

        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Menor nota: " + menorNota);
        System.out.printf("Média da turma: %.2f%n", media);
    }
}