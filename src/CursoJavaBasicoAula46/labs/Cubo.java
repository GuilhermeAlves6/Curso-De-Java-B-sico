package CursoJavaBasicoAula46.labs;
//(10)Criar a classe Cubo que vai extender a Figura3D
public class Cubo extends Figura3D{
	
	//(19)adiconar lado ou aresta para medição
	private int lado;

	//(20)Gerar os Getters and Setters
	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	//(33)Implementar todos os métodos
	@Override
	public double calcularArea() {
		return 6 * (lado*lado);
	}

	@Override
	public double calcularVolume() {
		return lado * lado * lado;
		//return Math.pow(lado, 3);
	}
	
	

}
