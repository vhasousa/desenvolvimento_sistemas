package senai;

import java.util.ArrayList;

public class UnidadeSenai {
	String nome;
	ArrayList<Departamento> departamentos;
	
	public UnidadeSenai(String nome) {
		this.nome = nome;
		this.departamentos = new ArrayList<>();
	}
	
	public void adicionarDepartamento(Departamento dpto) {
		departamentos.add(dpto);
	}
	
	public void exibirEstrutura() {
		System.out.println(nome);
		for (Departamento dpto: departamentos) {
			dpto.exibirDados();
			dpto.listarFuncionarios();
		}
	}
	
	
}
