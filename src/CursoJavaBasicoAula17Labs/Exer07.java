package CursoJavaBasicoAula17Labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int num;
		int maior = Integer.MIN_VALUE;
		
		for (int i=0; i<5; i++) {
			
			System.out.println("Entre com o um número:");
			num = scan.nextInt();
			
			
			if ( num > maior) {
				maior = num;
				System.out.println("O número maior mudou: " + maior);
			}
		}
		
		System.out.println("O maior número digitado foi: " + maior);

	}

}
