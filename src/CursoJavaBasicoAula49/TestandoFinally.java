package CursoJavaBasicoAula49;
//(1)Criar a classe TestandoFinally
public class TestandoFinally {
    //(2)adcionar o public static void main
	public static void main(String[] args) {
		
		//(3)Adicionar vetores com os números
				int[]numeros = {4, 8, 16, 32, 64,128};
				int[] denom = {2,0,4,8,0};
				
				//(4)Interar esse números usando o FOR Normal
				for (int i=0; i<numeros.length; i++) {
					
					//(6)Adicionar o bloco Try para captar e execultar o erro.A parte do programa que pode dar erro.
					try {
						
						//(5)Calculo para fazer a divisão desses números com o denominador
						System.out.println(numeros[i] + "/" + denom[i] + " = " + (numeros[i]/denom[i]));
					}
					//(7)Catch vai capturar a nossa excesão aritmética,divisão por zero
					catch (ArithmeticException e) {
						System.out.println("Erro ao dividir por zero");	
					}
					//(8)Cópia do bloco Catch vai capturar a nossa excesão vazia,pois posição do Arrey é inválida
					catch (ArrayIndexOutOfBoundsException e) {
						System.out.println("Posição do Array inválida");	
					}
					//(9)Adicionar o Bloco Finally após o Try ou o Catch
					finally {
						System.out.println("Essa linha é impressa sempre após o try ou catch");
					}
					
				}
		

	}

}
