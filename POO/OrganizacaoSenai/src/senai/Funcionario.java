package senai;

public class Funcionario {
	int codigo;
	String nome, funcao;
	double salario;
	Departamento departamento;

	public Funcionario(int codigo, String nome, String funcao, double salario) {
		this.codigo = codigo;
		this.nome = nome;
		this.funcao = funcao;
		this.salario = salario;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void exibirDados() {
		System.out.printf("%d - %s - %s - R$%.2f", codigo, nome, funcao, salario);
	}
	
	
}
