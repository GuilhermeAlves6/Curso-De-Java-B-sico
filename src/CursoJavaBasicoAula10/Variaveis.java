package CursoJavaBasicoAula10;

public class Variaveis {

	public static void main(String[] args) {
		
		//convenção Java
		int idade = 20;
		String nome = "Guilherme";
		String nomeDoMeuCachorro = "Zeus";
		String ano2024 = "2024";
		
		//aceito mas não utilizado
		int _idade;
		int $idade;
		
		//não é convenção Java
		String nome_do_meu_cachorro;
		String NomeDoMeuCachorr;
		String nomeMeucachorro;
		
		idade = 25;
		
		System.out.println("Idade = " + idade);
		System.out.println("Nome = " + nome);
		
		// má prática (Não colocar nome na variável)
		int a = 10;
		String b = "Guilherme";


	}

}
