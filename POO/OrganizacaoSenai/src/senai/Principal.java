package senai;

public class Principal {
	public static void main(String[] args) {
		UnidadeSenai u = new UnidadeSenai("SENAI Valença");
		
		Departamento ti = new Departamento(
				1, "Tecnologia da Informação", "(24)1111-1111");
		Departamento ad = new Departamento(
				2, "Administração", "(24)2222-2222");
		
		Funcionario func1 = new Funcionario(1, "Ana", "Desenvolvedora", 3500);
		Funcionario func2 = new Funcionario(2, "Bruno", "Suporte", 2800);
		Funcionario func3 = new Funcionario(3, "Carla", "Analista", 3200);
		Funcionario func4 = new Funcionario(4, "Diego", "Assistente", 2200);
		
		u.adicionarDepartamento(ad);
		u.adicionarDepartamento(ti);
		
		ti.adicionarFuncionario(func1);
		ti.adicionarFuncionario(func2);
		
		ad.adicionarFuncionario(func3);
		ad.adicionarFuncionario(func4);
		
		u.exibirEstrutura();
		func1.setSalario(4800);
		u.exibirEstrutura();
		
	}
}
