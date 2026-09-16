package exercicio1;

public class ListaCidades {
	public static void main(String[] args) {
		String[] cidades = { "Valenca", "Rio de Janeiro", "Sao Paulo", "Salvador", "Curitiba" };
		
		for (int i = 0; i < cidades.length; i++)
			System.out.println("Posicao " + i + ": " + cidades[i]);
	}
}
