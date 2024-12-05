package CursoJavaBasicoAula35;

public class Calculadora {
	
	//5! = 5 * 4 * 3 * 2 * 1 = 120
		//0! = 1
		public static int fatorialNaoRecursivo(int num) {
			
			if (num == 0) {
				return 1;
			}
			int total = 1;
			for (int i=num; i>1; i--) {
				total *= i;
			}
			return total;
		}
		//fatoria(5) = 5 * fatorial(4)
		//fatoria(4) = 4 * fatorial(3)
		//fatoria(3) = 3 * fatorial(2)
		//fatoria(2) = 2 * fatorial(1)
		//fatoria(1) = 1 * fatorial(0)
		//fatoria(5) = 1;
		public static int fatorial(int num) {
			
			if (num == 0) {
				return 1;
			}
			return num * fatorial(num-1);
		}


}
