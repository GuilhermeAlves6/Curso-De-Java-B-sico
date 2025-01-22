package CursoJavaBasicoAula52.labs;

import java.util.Scanner;
//(6)Criar a classe teste
public class Teste {
	// (7)Criar o public static void main
	public static void main(String[] args) {
		// (8)Scanner é uma classe do Java que permite a leitura de entradas do usuário,
				// como dados digitados no console
		Scanner scan = new Scanner(System.in);	
		// (30)Obter a opção do menu passando o Scanner
		int opcao =  obterOpcaoMenu(scan);
	}
	// (24)pedir as opções ao usuário
	public static int obterOpcaoMenu(Scanner scan) {
		// (25)adicionar um while quanto a entrada não for válida agente continua
				// colocando o System
		boolean entradaValida = false;
		
		int opcao = 3;
		
		while(!entradaValida) {
			
			System.out.println("Digite a opção desejada:");
			System.out.println("1: Consultar contato");
			System.out.println("2: Adicionar contato:");
			System.out.println("3: Sair");
			// (27)adicionar o try/catch para tratar o erro/excessão
			try {
				// (31)Vamos ler uma linha inteira do teclado e ver o que o usuário dígitou na
				// entrada e a gente vai transformar essa entrada em um número que a gente quer
				// aonde vamos pegar a opção e vamos transformar essa string em um inteiro,aonde
				// a entrada é execultada
				String entrada= scan.nextLine();
				opcao = Integer.parseInt(entrada);
				// (28)Caso a opção não seja 1,2 ou 3//aonde o Throw vai capturar a Exception
				if (opcao == 1 || opcao == 2 || opcao == 3) {
					entradaValida = true;
				}else {
					// (29)Então essa entrada se torna válida e a gente saí desse loop
					// (while)infinito e o que foi dígitado retorna
					throw new Exception("Entrada inválida");
				}
			}
			catch (Exception e) {
				System.out.println("Entrada inválida,dígite novamente\n");
			}
			
			
		}

		return opcao;
	}

}
