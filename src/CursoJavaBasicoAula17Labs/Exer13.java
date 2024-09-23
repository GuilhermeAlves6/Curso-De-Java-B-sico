package CursoJavaBasicoAula17Labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a base:");
		int base = scan.nextInt();
		
		System.out.println("Entre com a potência:");
		int pot = scan.nextInt();
		
		//2^2 = 2 * 2
		//2^3 = 2 * 2 * 2
		
		int resultado = base;
		
		for (int i=0; i<pot; i++) {
			resultado *= base;
		}
		
		System.out.println("Resultado " + resultado);
	}

}
