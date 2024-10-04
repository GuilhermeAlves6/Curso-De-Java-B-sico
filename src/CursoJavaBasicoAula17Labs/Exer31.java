package CursoJavaBasicoAula17Labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer31 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double salario = 1000; //ano de 1995
		
		double percentual = 1.5; //ano de 1996
		
		DecimalFormat format = new DecimalFormat("###,###.##");
		
		salario += (salario / 100) * 1.5; //ano de 1996
		
		for (int i=1997; i<=2025; i++) {
			
			percentual *= 2;
			
			salario += (salario/100) * percentual;
			
			System.out.println(i + " = " + format.format(salario) + " - " + percentual + "%");
		}

	}

}
