package capitais;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		HashMap<String, String> capitais = new HashMap<>();
		
		capitais.put("Acre", "Rio Branco");
		capitais.put("Alagoas", "Maceió");
		capitais.put("Amapá", "Macapá");
		capitais.put("Amazonas", "Manaus");
		capitais.put("Bahia", "Salvador");
		capitais.put("Ceará", "Fortaleza");
		capitais.put("Espírito Santo", "Vitória");
		capitais.put("Goiás", "Goiânia");
		capitais.put("Maranhão", "São Luís");
		capitais.put("Mato Grosso", "Cuiabá");
		capitais.put("Mato Grosso do Sul", "Campo Grande");
		capitais.put("Minas Gerais", "Belo Horizonte");
		capitais.put("Pará", "Belém");
		capitais.put("Paraíba", "João Pessoa");
		capitais.put("Paraná", "Curitiba");
		capitais.put("Pernambuco", "Recife");
		capitais.put("Piauí", "Teresina");
		capitais.put("Rio de Janeiro", "Rio de Janeiro");
		capitais.put("Rio Grande do Norte", "Natal");
		capitais.put("Rio Grande do Sul", "Porto Alegre");
		capitais.put("Rondônia", "Porto Velho");
		capitais.put("Roraima", "Boa Vista");
		capitais.put("Santa Catarina", "Florianópolis");
		capitais.put("São Paulo", "São Paulo");
		capitais.put("Sergipe", "Aracaju");
		capitais.put("Tocantins", "Palmas");
		capitais.put("Distrito Federal", "Brasília");
		
		for (Map.Entry<String, String> capital: capitais.entrySet()) {
			System.out.printf("Estado: %s%nCapital: %s%n%n", capital.getKey(), capital.getValue());
		}
		
		System.out.println("Informe o estado em que deseja conhecer a capital: ");
		String estado = leia.nextLine();
		
		if (capitais.containsKey(estado)) {
			String capital = capitais.get(estado);
			System.out.printf("Estado: %s%nCapital: %s%n", estado, capital);
		} else {
			System.out.println("Estado não se encontra na lista");
		}
		
		leia.close();

	}

}
