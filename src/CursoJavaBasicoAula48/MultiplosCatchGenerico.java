package CursoJavaBasicoAula48;

//(1) Criar a Classe MultiplosCatchGenerico 
public class MultiplosCatchGenerico {
	// (2)Adicionar o Public Static void main
	public static void main(String[] args) {

		// (3)Adicionar vetores com os números
		int[] numeros = { 4, 8, 16, 32, 64, 128 };
		int[] denom = { 2, 0, 4, 8, 0 };

		// (4)Interar esse números usando o FOR Normal
		for (int i = 0; i < numeros.length; i++) {

			// (6)Adicionar o bloco Try para captar e execultar o erro.A parte do programa
			// que pode dar erro.
			try {

				// (5)Calculo para fazer a divisão desses números com o denominador
				System.out.println(numeros[i] + "/" + denom[i] + " = " + (numeros[i] / denom[i]));
			}
			// (7)Catch vai capturar a nossa excesão aritmética,divisão por zero
			catch (ArithmeticException e) {
				System.out.println("Erro ao dividir por zero");
			}
			// (8)Capturar uma Exceptions Genérica com erro genérico,utilizamos a Super
			// Classe "Throwable" que trata todas as excessoes e erros do java
			catch (Throwable exc) {
				System.out.println("Aconteceu um erro");
			}

		}

	}

}
