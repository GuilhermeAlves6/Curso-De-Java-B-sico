package CursoJavaBasicoAula50;

import java.util.Scanner;

//(1)Criar a classe Usando Throws
public class UsandoThrows {
     //(2)Criar o public static void main
	public static void main(String[] args) {
		
		//(4)Entrar com um número décimal / Adicionar o tratamento da excessão com Try/Catch
		System.out.println("Entre com um número decimal");
		try {
			double num = leNumero();
			System.out.println("Você digítou " + num);
		} catch (Exception e) {
			System.out.println("Entrada inválida");
			e.printStackTrace();
		} 
	
	}
     //(3)Leitura de número / Utilizar o throws para mostrar excessão
	public static double leNumero() throws Exception{
		Scanner scan = new Scanner (System.in);
		double num = scan.nextDouble();
		return num;
		
	}

}
