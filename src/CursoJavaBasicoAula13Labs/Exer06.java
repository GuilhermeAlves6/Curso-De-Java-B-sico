package CursoJavaBasicoAula13Labs;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o raio do círculo:");
		double raio = scan.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("A aréa do circulo é: " + area);

	}

}
