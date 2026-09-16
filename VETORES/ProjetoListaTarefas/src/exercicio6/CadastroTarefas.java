package exercicio6;

import java.util.*;

public class CadastroTarefas {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        ArrayList<String> tarefas = new ArrayList<>();

        String resposta;

        do {

            System.out.print("Digite uma tarefa: ");
            tarefas.add(leia.nextLine());

            System.out.print("Deseja cadastrar outra tarefa? (s/n): ");
            resposta = leia.nextLine();

        } while (resposta.equalsIgnoreCase("s"));

        System.out.println("\nTarefas cadastradas:");

        for (String tarefa : tarefas) {
            System.out.println("- " + tarefa);
        }

        System.out.println("\nQuantidade de tarefas cadastradas: " + tarefas.size());

        leia.close();
    }
}