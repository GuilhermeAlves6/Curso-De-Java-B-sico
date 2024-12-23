package CursoJavaBasicoAula39;

public class Professor extends Pessoa {
	

	private double salario;
	private String nomeCurso;
	
	public void verificarAcesso() {
		
		this.nomeVisibilidade = "sdasdas";
		super.nomeVisibilidade = "dasdasdas";
		
		super.setNomeVisibilidade("sdasdas");
	}
	
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
	public double calcularSalarioLiquido() {
		return 0;
	}

}
