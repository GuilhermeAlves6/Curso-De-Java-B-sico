package CursoJavaBasicoAula46.labs;
//(12)Criar a classe Piramide que vai extender a Figura3D
public class Piramide extends Figura3D{
	
	//(23)Adicionar Altura,ArestaBase e apotema
	private double altura;
	private double arestaBase;
	private double apotema;
	
	//(24) Base sendo uma figura2D(ou base de triângulo ou base de quadrado)
	private Figura2D Base;
	
	
	//(25)Gerar os Getters and Setters 
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getArestaBase() {
		return arestaBase;
	}

	public void setArestaBase(double arestaBase) {
		this.arestaBase = arestaBase;
	}

	public double getApotema() {
		return apotema;
	}

	public void setApotema(double apotema) {
		this.apotema = apotema;
	}

	public Figura2D getBase() {
		return Base;
	}

	public void setBase(Figura2D base) {
		Base = base;
	}//
	
	

}
