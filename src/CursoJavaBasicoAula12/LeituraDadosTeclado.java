package CursoJavaBasicoAula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Dígite seu nome completo:");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto);
		
		System.out.println("Dígite seu primeiro nome:");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome é: " + primeiroNome);*/
		
		/*System.out.println("Dígite a sua idade:");
		int idade = scan.nextInt();
		System.out.println("Sua idade é: " + idade);
		
		System.out.println("Dígite sua altura:");
		double altura = scan.nextDouble();
		System.out.println("Sua altura é: " + altura);*/
		
		System.out.println("Dígite o seu primeiro nome, idade, quantidade de filhos, altura e se tem bicho de estimação:");
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		float altura = scan.nextFloat();
		boolean temPet = scan.nextBoolean();
		
		System.out.println("Você dígitou os seguintes valores:");
		System.out.println("Primeiro Nome: " + primeiroNome);
		System.out.println("Idade: " + idade);
		System.out.println("Quantidade de filhos: " + qtdFilhos);
		System.out.println("Altura: " + altura);
		System.out.println("Tem Bicho de estimação? " + temPet);

	}

}
