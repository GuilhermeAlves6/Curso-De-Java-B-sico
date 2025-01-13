package CursoJavaBasicoAula46.labs;
//(8)Criar a classe Quadrado que vai extender a Figura2D
public class Quadrado extends Figura2D{
	
	//(13)Lados do quadrado
	private int lado;

	//(14)Gerar os Getters and Setters para lados do quadrado
	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	//(30)Implementar todos os Métodos
	@Override
	public double calcularArea() {
		
		return lado * lado;
		//return Math.pow(lado, 2);
	}
	
	

}
