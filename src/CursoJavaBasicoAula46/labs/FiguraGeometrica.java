package CursoJavaBasicoAula46.labs;
//(2)Criar a classe abstrata FiguraGeometrica
public abstract class FiguraGeometrica {
	
	//(3)Criar os atributos da classe
	private String nome;
	private String cor;
	
	//(4)Gerar os Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	

}
