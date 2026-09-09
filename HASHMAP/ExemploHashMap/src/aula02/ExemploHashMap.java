package aula02;

import java.util.HashMap;
import java.util.Scanner;

public class ExemploHashMap {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HashMap<Integer, String> alunos = new HashMap<>();

        // Cadastro dos alunos
        alunos.put(101, "Ana");
        alunos.put(102, "Bruno");
        alunos.put(103, "Carlos");

        System.out.print("Digite a matrícula que deseja remover: ");
        int matricula = input.nextInt();

        // Verifica se a matrícula existe
        if (alunos.containsKey(matricula)) {

            String nomeRemovido = alunos.remove(matricula);

            System.out.println("Aluno removido: " + nomeRemovido);

        } else {
            System.out.println("Matrícula não encontrada.");
        }

        input.close();
    }
}