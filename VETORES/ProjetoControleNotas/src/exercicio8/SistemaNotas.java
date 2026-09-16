package exercicio8;

import java.util.*;

public class SistemaNotas {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        ArrayList<String> alunos = new ArrayList<>();
        ArrayList<Double> notas = new ArrayList<>();

        int opcao;

        do {

            System.out.println("\n=== SISTEMA DE NOTAS ===");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Listar alunos e notas");
            System.out.println("3 - Procurar aluno");
            System.out.println("4 - Alterar nota");
            System.out.println("5 - Remover aluno");
            System.out.println("6 - Calcular média da turma");
            System.out.println("7 - Mostrar maior e menor nota");
            System.out.println("8 - Mostrar situação dos alunos");
            System.out.println("9 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = Integer.parseInt(leia.nextLine());

            if (opcao == 1) {

                System.out.print("Digite o nome do aluno: ");
                alunos.add(leia.nextLine());

                System.out.print("Digite a nota do aluno: ");
                notas.add(Double.parseDouble(leia.nextLine()));

                System.out.println("Aluno cadastrado com sucesso.");

            } else if (opcao == 2) {

                if (alunos.isEmpty()) {
                    System.out.println("Nenhum aluno cadastrado.");
                } else {
                    System.out.println("\n=== ALUNOS CADASTRADOS ===");

                    for (int indice = 0; indice < alunos.size(); indice++) {
                        System.out.println(
                                "Posição " + indice
                                + " - Aluno: " + alunos.get(indice)
                                + " - Nota: " + notas.get(indice)
                        );
                    }
                }

            } else if (opcao == 3) {

                System.out.print("Digite o nome do aluno que deseja procurar: ");
                String nomeAluno = leia.nextLine();

                int posicao = alunos.indexOf(nomeAluno);

                if (posicao < 0) {
                    System.out.println("Aluno não encontrado.");
                } else {
                    System.out.println("Aluno encontrado na posição: " + posicao);
                    System.out.println("Nota: " + notas.get(posicao));
                }

            } else if (opcao == 4) {

                System.out.print("Digite o nome do aluno: ");
                String nomeAluno = leia.nextLine();

                int posicao = alunos.indexOf(nomeAluno);

                if (posicao >= 0) {

                    System.out.print("Digite a nova nota: ");
                    double novaNota = Double.parseDouble(leia.nextLine());

                    notas.set(posicao, novaNota);

                    System.out.println("Nota alterada com sucesso.");

                } else {
                    System.out.println("Aluno não encontrado.");
                }

            } else if (opcao == 5) {

                System.out.print("Digite o nome do aluno que deseja remover: ");
                String nomeAluno = leia.nextLine();

                int posicao = alunos.indexOf(nomeAluno);

                if (posicao >= 0) {

                    alunos.remove(posicao);
                    notas.remove(posicao);

                    System.out.println("Aluno removido com sucesso.");

                } else {
                    System.out.println("Aluno não encontrado.");
                }

            } else if (opcao == 6) {

                if (notas.isEmpty()) {

                    System.out.println("Não há notas cadastradas.");

                } else {

                    double somaNotas = 0;

                    for (double nota : notas) {
                        somaNotas += nota;
                    }

                    double mediaTurma = somaNotas / notas.size();

                    System.out.println("Média da turma: " + mediaTurma);
                }

            } else if (opcao == 7) {

                if (notas.isEmpty()) {

                    System.out.println("Não há notas cadastradas.");

                } else {

                    double maiorNota = notas.get(0);
                    double menorNota = notas.get(0);

                    for (double nota : notas) {

                        if (nota > maiorNota) {
                            maiorNota = nota;
                        }

                        if (nota < menorNota) {
                            menorNota = nota;
                        }
                    }

                    System.out.println("Maior nota: " + maiorNota);
                    System.out.println("Menor nota: " + menorNota);
                }

            } else if (opcao == 8) {

                if (alunos.isEmpty()) {

                    System.out.println("Nenhum aluno cadastrado.");

                } else {

                    System.out.println("\n=== SITUAÇÃO DOS ALUNOS ===");

                    for (int indice = 0; indice < alunos.size(); indice++) {

                        String situacao;

                        if (notas.get(indice) >= 7) {
                            situacao = "Aprovado";
                        } else if (notas.get(indice) >= 5) {
                            situacao = "Recuperação";
                        } else {
                            situacao = "Reprovado";
                        }

                        System.out.println(
                                alunos.get(indice)
                                + " - Nota: " + notas.get(indice)
                                + " - Situação: " + situacao
                        );
                    }
                }

            } else if (opcao != 9) {

                System.out.println("Opção inválida.");
            }

        } while (opcao != 9);

        System.out.print("Deseja apagar todos os dados cadastrados? (s/n): ");

        String resposta = leia.nextLine();

        if (resposta.equalsIgnoreCase("s")) {
            alunos.clear();
            notas.clear();

            System.out.println("Dados apagados.");
        }

        System.out.println("Programa encerrado.");

        leia.close();
    }
}

