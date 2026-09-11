package alunos;

public class Aluno {
	private String nome;
	private String curso;
	private double nota;
	
	public Aluno(String nome, String curso, double nota) {
		super();
		this.nome = nome;
		this.curso = curso;
		this.nota = nota;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	public String verificarSituacao() {
		return getNota() >= 7 ? "Aprovado" : "Reprovado";
	}
	
	public void exibirDados() {
		System.out.printf("Nome: %s | Curso: %s | Nota: %.1f | Situação: %s%n%n", 
				getNome(), getCurso(), getNota(), verificarSituacao());
	}
}
