package CursoJavaBasicoAula17Labs;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		
		System.out.println("Entre com o n-ésimo termo da série de fibonacci:");
		int n = scan.nextInt();
		
		int primeiro = 1;
		int segundo = 1;
		int proximo;
		
		System.out.println(primeiro);
		System.out.println(segundo);
		
		
		//1,1,2,3,5
		//primeiro = 1
		//segundo = 1
		//proximo = 2
		
		for (int i=3; i<=n; i++) {
			
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			
			System.out.println(proximo);
		}
		
	 }

}
