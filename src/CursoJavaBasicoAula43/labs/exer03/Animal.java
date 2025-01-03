package CursoJavaBasicoAula43.labs.exer03;

//(2) Criar a Classe Animal
public class Animal {
	
	//(5)caracteristica do Animal: Nome,$comprimento,$patas,$ambiente,$velocidade
	private String nome;
	private int comprimento;
	private int patas;
	private String cor;
	private String ambiente;
	private int velocidade;
	
	
	//(6)gerar os getters and setters de Animal
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getComprimento() {
		return comprimento;
	}
	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	//(12)Gerar um ToString para Camelo
	@Override
	public String toString() {
		String s = "Animal: " + nome;
		s += "\nComprimento: " + comprimento + " cm";
		s += "\nPatas: " + patas;
		s += "\nCor: " + cor;
		s += "\nAmbiente: " + ambiente;
		s += "\nVelocidade: " + velocidade + " m/s";
		
		return s;
	}
	
	
	
	

}
