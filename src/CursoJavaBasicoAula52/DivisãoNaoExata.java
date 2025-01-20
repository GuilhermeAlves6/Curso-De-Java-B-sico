package CursoJavaBasicoAula52;
//(1)Criar a classe DivisãoNãoExata
public class DivisãoNaoExata extends Exception{
	//(2)Fazer a lógica que queremos
	private int num;
	private int dem;
	
	//(3)Criar um construtor com campos
	public DivisãoNaoExata(int num, int dem) {
		super();
		this.num = num;
		this.dem = dem;
	}
	//(4)Gerer o ToString 
	@Override
	public String toString() {
		return "Resultado de " + num + "/" + dem+ " não é um inteiro!";
	}
	
	
	

}
