package CursoJavaBasicoAula46.labs;
//(9)Criar a classe Triangulo que vai extender a Figura2D
public class Triangulo extends Figura2D{
	
	//(17)Adicionar Base e Altura para medir o Triângulo
	private double base;
	private double altura;
	
	//(18)Gerar os Getters and Setters de Base e Altura de Triângulo
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	

}
