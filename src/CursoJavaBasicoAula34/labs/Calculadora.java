package CursoJavaBasicoAula34.labs;

public class Calculadora {
	
	public static int somar(int num1, int num2) {
		return num1 + num2;
	}
	public static int subtrair (int num1,int num2){
		return num1 - num2;
	}
	
	public static int multiplicar (int num1,int num2) {
		return num1 * num2;
	}
	
	public static int dividir (int num1,int num2) {
		return num1 / num2;
	}
	
	
	//x^n
	//x * x * x * x * x (n vezes)
	public static int potencia (int num1,int num2) {
		int total = 2;
		for (int i=1; i<num2; i++) {
			total *= num1;		
		}
		return total;
	}

}


