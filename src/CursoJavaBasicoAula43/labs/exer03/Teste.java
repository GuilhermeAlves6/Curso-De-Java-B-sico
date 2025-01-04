package CursoJavaBasicoAula43.labs.exer03;

//(1)Criar a classe teste com o public static void main
public class Teste {
	
	public static void main(String[] args) {
		
		//(15)Fazer o teste criando 3 animais
		Animal camelo = new Animal();
		camelo.setNome("Camelo");
		camelo.setComprimento(150);
		//camelo.setPatas(4);
		camelo.setCor("Amarelo");
		camelo.setAmbiente("Terra");
		camelo.setVelocidade(2.0);
		
		Peixe tubarao = new Peixe();
		tubarao.setNome("Tubarão");
		tubarao.setComprimento(300);
		tubarao.setVelocidade(1.5);

		Mamifero urso = new Mamifero();
		urso.setNome("Urso-do-Canadá");
		urso.setComprimento(180);
		urso.setCor("Vermelho");
		urso.setVelocidade(0.5);
		
		//(17)Criar um ARRAY de animal com Peixe,mampifero extendendo a classe animal
		Animal[] animais = new Animal[3];
		animais[0] = camelo;
		animais[1] = tubarao;
		animais[2] = urso;
		
		//(18)Criando Sysout de SAÍDA da Informação e Criando o FOR MELHORADO passando animal 
		System.out.println("----------------------------------");
		for (Animal animal : animais) {
			System.out.println(animal);
			System.out.println("----------------------------------");
		}
		
	}

}
