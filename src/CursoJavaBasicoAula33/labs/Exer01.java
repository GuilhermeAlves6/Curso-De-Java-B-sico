package CursoJavaBasicoAula33.labs;

public class Exer01 {
	
	public static void main(String[] args) {

		Lampada lampada = new Lampada();

		lampada.ligar();

		lampada.mostraEstado();
		
		lampada.desligar();

		lampada.mostraEstado();
		
		lampada.mudarEstado();
		
		lampada.mostraEstado();

	}

}
