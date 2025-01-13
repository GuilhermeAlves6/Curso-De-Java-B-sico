package CursoJavaBasicoAula46.labs;

//(12)Criar a classe Piramide que vai extender a Figura3D
public class Piramide extends Figura3D {

	// (23)Adicionar Altura,ArestaBase e apotema
	private double altura;
	private double arestaBase;
	private double apotema;
	private int numPolibase;

	// (24) Base sendo uma figura2D(ou base de triângulo ou base de quadrado)
	private Figura2D Base;
	
	
	//(36)Criar métodos Getters and Setters De Polibase

	public int getNumPolibase() {
		return numPolibase;
	}

	public void setNumPolibase(int numPolibase) {
		this.numPolibase = numPolibase;
	}

	// (25)Gerar os Getters and Setters
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
	}

	// (35)Criar todos os métodos
	@Override
	public double calcularArea() {
		if (Base != null) {
			return (numPolibase * ((arestaBase*apotema)/2) + Base.calcularArea());
				
			}
			return 0;
		}

	@Override
	public double calcularVolume() {
		if (Base != null) {
			return (Base.calcularArea() * altura) / 3;
		}
			return 0;
	}
}
