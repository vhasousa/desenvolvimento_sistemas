package compras;

public class Lampada {
	private String marca;
	private double preco;
	private int quantidadeEstoque;
	private boolean estaLigada;
	
	public Lampada() {
	}

	public Lampada(String marca, double preco, int quantidadeEstoque, boolean estaLigada) {
		this.marca = marca;
		this.preco = preco;
		this.quantidadeEstoque = quantidadeEstoque;
		this.estaLigada = estaLigada;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
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

	public boolean isEstaLigada() {
		return estaLigada;
	}

	public void setEstaLigada(boolean estaLigada) {
		this.estaLigada = estaLigada;
	}
	
	public void ligar() {
		this.estaLigada = true;
	}
	
	public void desligar() {
		this.estaLigada = false;
	}
	
	public void mostrarEstado() {
		System.out.println("Marca: " + marca);
		System.out.printf("Preço: R$%.2f%n", preco);
		System.out.println("Quantidade em estoque: " + quantidadeEstoque);
		System.out.println("Estado: " + (isEstaLigada() ? "ligada" : "desligada"));
	}
}
