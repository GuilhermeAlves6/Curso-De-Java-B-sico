package CursoJavaBasicoAula50;
//(1)Criar a Classe ExceptionGenerica
public class ExceptionGenerica {
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

				
			}
			// (7)Catch vai capturar a nossa excesão com o Exception/getMassage/printStackTrace que retorna a descrição do erro e a linha do erro
			catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			

		}

	}

}
