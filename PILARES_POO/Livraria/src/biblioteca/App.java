package biblioteca;

public class App {

	public static void main(String[] args) {
		Livro livro1 = new Livro("Livro 1", "Autor qualquer", "Editora teste", 100, 2026);
		
		livro1.exibirDados();
		
		System.out.println();
		
		LivroLivraria livroLivraria1 = new LivroLivraria("Livro Livraria 1", "Autor qualquer", "Editora teste", 100, 2026, 10.99, 200);
		livroLivraria1.exibirDados();
	}

}
