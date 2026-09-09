package agenda;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> agenda = new HashMap<>();

        int opcao;
        String nome;
        String telefone;

        do {
            System.out.println("\n=== AGENDA TELEFÔNICA ===");
            System.out.println("1 - Cadastrar contato");
            System.out.println("2 - Pesquisar contato");
            System.out.println("3 - Alterar telefone");
            System.out.println("4 - Remover contato");
            System.out.println("5 - Listar contatos");
            System.out.println("0 - Encerrar");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Digite o nome do contato: ");
                    nome = scanner.nextLine();

                    if (agenda.containsKey(nome)) {
                        System.out.println("Contato já cadastrado.");
                    } else {
                        System.out.print("Digite o telefone: ");
                        telefone = scanner.nextLine();

                        agenda.put(nome, telefone);

                        System.out.println("Contato cadastrado com sucesso.");
                    }
                    break;

                case 2:
                    System.out.print("Digite o nome do contato: ");
                    nome = scanner.nextLine();

                    if (agenda.containsKey(nome)) {
                        System.out.println("Telefone: " + agenda.get(nome));
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome do contato: ");
                    nome = scanner.nextLine();

                    if (agenda.containsKey(nome)) {
                        System.out.print("Digite o novo telefone: ");
                        telefone = scanner.nextLine();

                        agenda.put(nome, telefone);

                        System.out.println("Telefone alterado com sucesso.");
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Digite o nome do contato: ");
                    nome = scanner.nextLine();

                    if (agenda.containsKey(nome)) {
                        agenda.remove(nome);

                        System.out.println("Contato removido com sucesso.");
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 5:
                    if (agenda.isEmpty()) {
                        System.out.println("Nenhum contato cadastrado.");
                    } else {
                        System.out.println("\n=== CONTATOS ===");

                        for (Map.Entry<String, String> contato : agenda.entrySet()) {
                            System.out.println(
                                "Nome: " + contato.getKey()
                                + " | Telefone: " + contato.getValue()
                            );
                        }
                    }
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}