package CursoJavaBasicoAula46.labs;
//(11)Criar a classe Cilindro que vai extender a Figura3D
public class Cilindro extends Figura3D{
	
	//(21)Adicionar Altura e raio para medição
	private int altura;
	private int raio;
	
	//(22)Gerar os Getters and Setters de altura e Raio
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getRaio() {
		return raio;
	}
	public void setRaio(int raio) {
		this.raio = raio;
	}
	
	//(34)Criar todos os métodos
	@Override
	public double calcularArea() {
		
		double areaBase = Math.PI * (raio*raio);
		double areaLateral = 2 * Math.PI * raio * altura;
		double areaTotal = (2*areaBase) + areaLateral;
				
		return areaTotal;
	}
	@Override
	public double calcularVolume() {
		return Math.PI * (raio * raio) * altura;
	}
	
	
	


}
