package CursoJavaBasicoAula52.labs;

import java.util.Scanner;
//(6)Criar a classe teste
public class Teste {
	// (7)Criar o public static void main
	public static void main(String[] args) {
		// (8)Scanner é uma classe do Java que permite a leitura de entradas do usuário,
				// como dados digitados no console
		Scanner scan = new Scanner(System.in);	
		Agenda agenda = new Agenda();
		
		int opcao = 1;
		//(41)Enquando a opção for diferente de 3 a gente vai obter  a opção do menu
		while(opcao != 3) {
			// (30)Obter a opção do menu passando o Scanner
			opcao = obterOpcaoMenu(scan);
			//(31) 1 - Consultar contato na agenda
			if (opcao == 1) { 
				consultarContato(scan, agenda);
			//(32) 2 - Adicionar Contato (Removido após alteração)//(33)Sair (Removido após alteração)//(40)Termina o programa - opcional (Removido após alteração)	
			}else if (opcao == 2) {
				adicionarContato(scan, agenda);
	
		    }

		}
		
	}
	//(37)Adicionar contatos na agenda
	public static void adicionarContato(Scanner scan, Agenda agenda) {
		try {
		System.out.println("Criando um contato,entre com as informações");
		String nome = lerInformacaoString(scan, "Entre com o nome do contato");
		String telefone = lerInformacaoString(scan, "Entre com o telefone do contato");
		String email = lerInformacaoString(scan, "Entre com o email do contato");
		//(38)Criar um contato e instanciar o contato
		Contato contato = new Contato();
		contato.setNome(nome);
		contato.setEmail(email);
		contato.setTelefone(telefone);
		
		System.out.println("Contato a ser criado: ");
		System.out.println(contato);
		
		//(39)Agenda adicionar/cheia
			agenda.adicionarContato(contato);
		} catch (AgendaCheiaException e) {
			System.out.println(e.getMessage());
			
			System.out.println("Contatos da agenda");
			System.out.println(agenda);
		}

	}
	
	//(36)Consultar o contato passando scanner scan e jogando try/catch aqui dentro
	public static void consultarContato(Scanner scan, Agenda agenda) {
		
		String nomeContato = lerInformacaoString(scan, "Entre com o nome do contato a ser pesquisado:");
		//(35)Adicionar o try/catch
		try {
			if (agenda.consultaContatoPorNome(nomeContato) >= 0) {
				System.out.println("Contato existe");
			}
		} catch (ContatoNaoExisteException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	//(34)Ler a informação desejada - mensagem ao usuário
	public static String lerInformacaoString(Scanner scan, String msg) {
		System.out.println(msg);
		String entrada = scan.nextLine();
		return entrada;
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
	}////////////////////////
//
}
