package exercicio7;

import java.util.*;

public class ListaConvidados {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        ArrayList<String> convidados = new ArrayList<>();

        int opcao;

        do {

            System.out.println("1-Adicionar 2-Alterar 3-Remover 4-Procurar 5-Exibir 6-Sair");
            opcao = Integer.parseInt(leia.nextLine());

            switch (opcao) {

                case 1:
                    System.out.print("Nome do convidado: ");
                    String nome = leia.nextLine();

                    convidados.add(nome);
                    break;

                case 2:
                    System.out.print("Posicao do convidado: ");
                    int posicao = Integer.parseInt(leia.nextLine());

                    System.out.print("Novo nome: ");
                    String novoNome = leia.nextLine();

                    if (posicao >= 0 && posicao < convidados.size()) {
                        convidados.set(posicao, novoNome);
                    } else {
                        System.out.println("Posicao invalida");
                    }
                    break;

                case 3:
                    System.out.print("Nome do convidado: ");
                    String nomeRemover = leia.nextLine();

                    if (convidados.contains(nomeRemover)) {
                        convidados.remove(nomeRemover);
                    } else {
                        System.out.println("Nao encontrado");
                    }
                    break;

                case 4:
                    System.out.print("Nome para procurar: ");
                    String nomeProcurado = leia.nextLine();

                    int posicaoEncontrada = convidados.indexOf(nomeProcurado);

                    if (posicaoEncontrada >= 0) {
                        System.out.println("Posicao: " + posicaoEncontrada);
                    } else {
                        System.out.println("Nao encontrado");
                    }
                    break;

                case 5:
                    System.out.println("Lista de convidados:");

                    for (String convidado : convidados) {
                        System.out.println(convidado);
                    }
                    break;

                case 6:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opcao invalida.");
            }

        } while (opcao != 6);

        leia.close();
    }
}