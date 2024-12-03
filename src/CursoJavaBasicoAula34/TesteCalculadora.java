package CursoJavaBasicoAula34;

public class TesteCalculadora {
	
	static int resultSoma;

	public static void main(String[] args) {
		
		resultSoma = MinhaCalculadora.soma(1, 2);
		
		//MinhaCalculadora calc = new MinhaCalculadora();
		
		//calc.soma(1, 2);
		
		soma2Valors(1, 2);
		
	}
	static int soma2Valors(int num1, int num2) {
		return MinhaCalculadora.soma(num1, num2);
	}

}
