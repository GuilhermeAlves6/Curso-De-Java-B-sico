package CursoJavaBasicoAula27.labs;

public class Exer01 {

	public static void main(String[] args) {

		Lampada lampada = new Lampada();

		lampada.ligar();

		if (lampada.ligada) {
			System.out.println("Lâmpada esta ligada");
		} else {
			System.out.println("Lâmpada está desligada");

		}
		lampada.desligar();

		if (lampada.ligada) {
			System.out.println("Lâmpada esta ligada");
		} else {
			System.out.println("Lâmpada está desligada");

		}

	}
}
