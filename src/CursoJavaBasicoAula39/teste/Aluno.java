package CursoJavaBasicoAula39.teste;

import CursoJavaBasicoAula39.Pessoa;

public class Aluno extends Pessoa {

	private String curso;
	private double[] notas;
	
	public void verificarAcesso() {
		this.nomeVisibilidade = "sdasdas";
		super.nomeVisibilidade = "dasdasdas";
		
		this.setNomeVisibilidade("sdasdas");
		
		
	}
	
	
	
	public Aluno() {
		super();
	}

	public Aluno(String nome, String endereco, String telefone,String curso) {
		super(nome, endereco, telefone);
		this.curso = curso;
		
	}

	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double calcularMedia() {
		return 0;
	}
	
	public boolean verificarAprovado() {
		return true;
	}
	
	public void metodoQualquer() {
		super.setCpf("32324234223");
		
		this.setCpf("3234234234234");
	}
	
	
	
	

}

