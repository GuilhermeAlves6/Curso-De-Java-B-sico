package CursoJavaBasicoAula20Labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		String[][] compromissos = new String[31][24];
		
		boolean sair = false;
		int opcao;
		while (!sair) {
			
			System.out.println("Dígite 1 para adicionar compromisso.");
			System.out.println("Dígite 2 para verificar compromisso.");
			System.out.println("Dígite 0 para sair.");
			
			opcao = scan.nextByte();
			
			if(opcao == 1 ) { //adicionar compromisso
				
				boolean diaValido = false;
				int dia = 0;
				while (!diaValido) {
					System.out.println("Entre com o dia do mês");
					dia = scan.nextInt();
					if (dia > 0 && dia <=31) {
						diaValido = true;
					}else {
						System.out.println("Dia inválido, digite novamente");
					}
				}
				
				boolean horaValida = false;
				int hora = 0;
				while (!horaValida) {
					System.out.println("Entre com a hora do compromisso");
					hora = scan.nextInt();
					if (hora >= 0 && hora <=24) {
						horaValida = true;
					}else {
						System.out.println("Hora inválido, digite novamente");
					}
				}
				
				dia--;
				System.out.println("Dígite o compromisso");
				compromissos[dia][hora] = scan.next();
				
			}else if (opcao == 2) {//verificar compromisso
				
				boolean diaValido = false;
				int dia = 0;
				while (!diaValido) {
					System.out.println("Entre com o dia do mês");
					dia = scan.nextInt();
					if (dia > 0 && dia <=31) {
						diaValido = true;
					}else {
						System.out.println("Dia inválido, digite novamente");
					}
				}
				
				boolean horaValida = false;
				int hora = 0;
				while (!horaValida) {
					System.out.println("Entre com a hora do compromisso");
					hora = scan.nextInt();
					if (hora >= 0 && hora <=24) {
						horaValida = true;
					}else {
						System.out.println("Hora inválido, digite novamente");
					}
				}
				dia--;
				System.out.println("O compromisso agendado é:");
				System.out.println(compromissos[dia][hora]);
				
			}else if (opcao == 0) {
				sair = true;
			}else {
				System.out.println("Opção inválida digite novamente");
			}
		}

	}

}
