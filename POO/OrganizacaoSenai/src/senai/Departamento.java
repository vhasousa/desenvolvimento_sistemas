package senai;

import java.util.ArrayList;

public class Departamento {
	int codigo;
	String nome, telefone;
	ArrayList<Funcionario> funcionarios;
	
	public Departamento(int codigo, String nome, String telefone) {
		this.codigo = codigo;
		this.nome = nome;
		this.telefone = telefone;
		this.funcionarios = new ArrayList<>();
	}
	
	public void adicionarFuncionario(Funcionario func) {
		funcionarios.add(func);
	}
	
	public void exibirDados() {
		System.out.println(codigo + " - " + nome + " - " + telefone);
	}
	
	public void listarFuncionarios() {
		for (Funcionario f: funcionarios) {
			f.exibirDados();
		}
	}
	
	
}
