package CursoJavaBasicoAula33.labs;

public class Aluno {

	private String nome;
	private String matricula;
	private String nomeCurso;
	private String[] nomeDisciplinas = new String[3];
	private double[][] notasDisciplinas = new double[3][4];
	
	public Aluno() {
	}
	
	public Aluno(String nome,String matricula,String nomeCurso) {
		this.nome = nome;
		this.matricula = matricula;
		this.nomeCurso = nomeCurso;
	}
}
