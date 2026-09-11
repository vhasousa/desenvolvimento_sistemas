package estacionamento;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		HashMap<Integer, Veiculo> veiculos = new HashMap<>();

		int opcao, codigo = 1;
		int codBusca, ano;
		String placa, modelo, proprietario;

		do {
			System.out.println("\n1 - Registrar entrada de veículo\n"
					+ "2 - Pesquisar veículo\n"
					+ "3 - Listar veículos\n"
					+ "4 - Alterar proprietário\n"
					+ "5 - Registrar saída\n"
					+ "0 - Encerrar");

			System.out.println("Escolha uma opção: ");
			opcao = Integer.parseInt(leia.nextLine());

			switch (opcao) {
			case 1:
				System.out.println("Placa: ");
				placa = leia.nextLine();

				System.out.println("Modelo: ");
				modelo = leia.nextLine();

				System.out.println("Proprietário: ");
				proprietario = leia.nextLine();

				System.out.println("Ano: ");
				ano = Integer.parseInt(leia.nextLine());

				veiculos.put(codigo, new Veiculo(placa, modelo, proprietario, ano));

				System.out.println("Veículo cadastrado!");
				System.out.println("Código: " + codigo);

				codigo++;
				break;

			case 2:
				System.out.println("\n=== Pesquisa ===\n");
				System.out.println("Código do veículo: ");
				codBusca = Integer.parseInt(leia.nextLine());

				if (veiculos.containsKey(codBusca))
					veiculos.get(codBusca).exibirDados();
				else
					System.out.println("Veículo não encontrado!");

				break;

			case 3:
				System.out.println("\n=== Veículos cadastrados ===\n");

				for (Map.Entry<Integer, Veiculo> veiculo : veiculos.entrySet()) {
					System.out.println("Código: " + veiculo.getKey());
					veiculo.getValue().exibirDados();
				}

				break;

			case 4:
				System.out.println("\n=== Alterar proprietário ===\n");
				System.out.println("Código do veículo: ");
				codBusca = Integer.parseInt(leia.nextLine());

				if (veiculos.containsKey(codBusca)) {
					Veiculo veiculo = veiculos.get(codBusca);

					System.out.println("Novo proprietário: ");
					veiculo.setProprietario(leia.nextLine());

				} else {
					System.out.println("Veículo não encontrado!");
				}

				break;

			case 5:
				System.out.println("\n=== Registrar saída ===\n");
				System.out.println("Código do veículo: ");
				codBusca = Integer.parseInt(leia.nextLine());

				if (veiculos.containsKey(codBusca)) {
					veiculos.remove(codBusca);
					System.out.println("Saída registrada com sucesso!");
				} else {
					System.out.println("Veículo não encontrado!");
				}

				break;

			case 0:
				System.out.println("Sistema encerrado.");
				break;

			default:
				System.out.println("Opção inválida!");
			}

		} while (opcao != 0);

		leia.close();
	}
}