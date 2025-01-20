package CursoJavaBasicoAula52;
//(1)Criar a Classe UsandoMinhaException
public class UsandoMinhaException {
	//(2)Criar o public static void main
	public static void main(String[] args) {
		
		//(10)adicionar o Try / Catch através de teste :com a divisão não exata
			try {
				teste();
			} catch (DivisãoNaoExata e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}
	//(9)Adicionar a Excessão através do Método Throwable
	public static void teste() throws DivisãoNaoExata {
		
		//(3)Adicionar vetores com os números
				int[] numeros = { 4, 8, 5, 16, 32, 21, 64, 128 };
				int[] demon = { 2, 0, 4, 8, 0, 2, 4 };

				//(4)Interar esse números usando o FOR Normal
				for (int i = 0; i < numeros.length; i++) {
					//(6)Adicionar o bloco Try para captar e execultar o erro.A parte do programa que pode dar erro.
					try {
						//(8)Sempre que um número for ímpar nos queremos lançar a nossa própria excessão
						if (numeros[i] % 2 != 0) {
							//(9)Lançar a exception aqui
							throw new DivisãoNaoExata(numeros[i], demon[i]);
						}
						//(5)Calculo para fazer a divisão desses números com o denominador
						System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i] / demon[i]));
						//(7)Catch vai capturar a nossa excesão aritmética,divisão por zero ou a nossa excesão vazia,pois posição do Arrey é inválida
					} catch (ArithmeticException | ArrayIndexOutOfBoundsException  e) {
						System.out.println("Aconteceu um erro");
						e.printStackTrace();
						
					}

				}
		
	}
}
