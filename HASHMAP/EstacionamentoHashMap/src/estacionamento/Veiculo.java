package estacionamento;

public class Veiculo {
	private String placa;
	private String modelo;
	private String proprietario;
	private int ano;
	
	public Veiculo(String placa, String modelo, String proprietario, int ano) {
		super();
		this.placa = placa;
		this.modelo = modelo;
		this.proprietario = proprietario;
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void exibirDados() {
		System.out.printf("Veículo: %s | Placa: %s | Proprietário: %s | Ano: %d", 
				getModelo(), getPlaca(), getProprietario(), getAno());
	}
	
	
}
