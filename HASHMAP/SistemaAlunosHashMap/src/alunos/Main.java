package alunos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		HashMap<Integer, Aluno> alunos = new HashMap<>();

		int opcao, codigo = 1;
		String nome, curso;
		double nota;

		do {
			System.out.println("\n1 - Cadastrar aluno\n" + "2 - Pesquisar aluno\n" + "3 - Listar alunos\n"
					+ "4 - Alterar nota\n" + "5 - Remover aluno\n" + "0 - Encerrar");

			System.out.println("Escolha uma opção: ");
			opcao = Integer.parseInt(leia.nextLine());

			switch (opcao) {
			case 1:
				System.out.println("Nome do aluno: ");
				nome = leia.nextLine();

				System.out.println("Curso: ");
				curso = leia.nextLine();

				System.out.println("Nota: ");
				nota = Double.parseDouble(leia.nextLine());

				alunos.put(codigo, new Aluno(nome, curso, nota));

				codigo++;
				break;
			
			case 2:
				System.out.println("\n=== Pesquisa ===\n");
				System.out.println("Código do aluno: ");
				int codBusca = Integer.parseInt(leia.nextLine());
				
				if (alunos.containsKey(codBusca))
					alunos.get(codBusca).exibirDados();
				else 
					System.out.println("Aluno não encontrado!");
				
				break;

			case 3:
				for(Map.Entry<Integer, Aluno> aluno : alunos.entrySet()) {
					aluno.getValue().exibirDados();
				}
				
				break;
				
			case 4:
				System.out.println("\n=== Atualizar nota ===\n");
				System.out.println("Código do aluno: ");
				codBusca = Integer.parseInt(leia.nextLine());
				
				if (alunos.containsKey(codBusca)) {
					Aluno aluno = alunos.get(codBusca);
					
					System.out.println("Nova nota: ");
					aluno.setNota(Double.parseDouble(leia.nextLine()));
				} else {
					System.out.println("Aluno não encontrado!");
				}
				
				break;
			case 5:
				System.out.println("\n=== Remover aluno ===\n");
				System.out.println("Código do aluno: ");
				codBusca = Integer.parseInt(leia.nextLine());
				
				if (alunos.containsKey(codBusca)) {
					alunos.remove(codBusca);
				} else {
					System.out.println("Aluno não encontrado!");
				}
				
				break;
			case 0:
				
			}
			
		} while (opcao != 0);
		
		leia.close();
	}
}
