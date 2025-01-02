package CursoJavaBasicoAula43.labs.exer02;

//(2)Criar classe contribuinte e adicionar a abstração de Pessoa física e Jurídica
public abstract class Contribuinte {
	
	private String nome;
	private double rendaBruta;
	
	//(3) Criar os getters and setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getRendaBruta() {
		return rendaBruta;
	}
	public void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}
	
	//(10) Método calcularImposto de 10% da Renda Bruta
	public abstract double calcularImposto();
	
	//(16) Gerar um método ToString Contribuinte
	@Override
	public String toString() {
		String s = "Nome: " + nome;
		s += " ;rendaBruta: " + rendaBruta;
		
		return s;
	}
	
	
}
