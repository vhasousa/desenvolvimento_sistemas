package biblioteca;

public class LivroLivraria extends Livro {
	private double preco;
	private int quantidadeEstoque;
	
	public LivroLivraria(String titulo, String autor, String editora, int numeroPaginas, int anoPublicacao,
			double preco, int quantidadeEstoque) {
		super(titulo, autor, editora, numeroPaginas, anoPublicacao);
		this.preco = preco;
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	@Override
	public void exibirDados() {
		super.exibirDados();
		System.out.printf("Preço: R$%.2f%n", preco);
		System.out.println("Quantidade em estoque: "+ quantidadeEstoque);
	}
	
	
	
}
