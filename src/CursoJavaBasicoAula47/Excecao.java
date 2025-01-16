package CursoJavaBasicoAula47;

//(1)Criar a classe Excecao
public class Excecao {

	// (6)Tratando a Exceção/Erro,com 2 blocos de Códigos Try(Bloco Monitorados para
	// erros/significa Tente Execultar esse código

	// (2)Adicionar Public Static Void Main
	public static void Main(String[] args) {

		try {

			// (3)Declarando um vetor de inteiros
			int[] vetor = new int[4];

			// (4)Sysout para ver em que momento a Exceção vai ocorrer
			System.out.println("Antes da exception");

			// (5)Código que vai gerar uma Exceção
			vetor[4] = 1;

			System.out.println("Esse texto não será impresso");
			// (7)e em baixo é o catch a gente passa o tipo da excessão e uma variavel
			// excessão/Tente exercutar esse código e caso ocura o erro captura a excessão e
			// trate o erro

		} catch (ArrayIndexOutOfBoundsException exception) {

			// (8)Exceção ao acessar um índice do vetor que não existe
			System.out.println("Exceção ao acessar um índice do vetor que não existe");

		}

		// (9)Vai continuar sendo execultado
		System.out.println("Esse texto será impresso a exception");

	}
}
