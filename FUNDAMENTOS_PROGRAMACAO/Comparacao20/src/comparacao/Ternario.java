package comparacao;

public class Ternario {

	public static void main(String[] args) {
		boolean estaMatriculado = false;

		// ternário

		if (estaMatriculado)
			System.out.println("O aluno está matriculado");
		else 
			System.out.println("O aluno não está matriculado");
		

		System.out.println("Aluno matriculado: " + (estaMatriculado ? "sim" : "não"));

	}
}
