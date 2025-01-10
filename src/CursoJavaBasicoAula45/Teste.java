package CursoJavaBasicoAula45;
//(1) Criar a classe Teste
public class Teste {
	
	
	
	//(7)public static void main (String[] args) 
	public static void main (String[] args) {
		
		/*//(5)Adicionando o metodo UPCASTING (estamos transformando uma classe menor em um tipo de uma classe maior)
		Aluno aluno = new Aluno();
		Pessoa pessoaAluno = aluno; //upcasting
		
		Pessoa aluno2 = (Pessoa) new Aluno();
		
		//(6)Adicionando o metodo DOWNCASTING (É o contrário declarando uma váriavel um objeto de uma superclasse que está maior na hierarquia e a gente vai tentar transformar essa variavel/instância em um tipo de uma classe que está menor na hierarquia + "adIcionar o CAST (conversão) MANUALMENTE")
		Pessoa aluno3 = new Pessoa();
		Aluno aluno4 = (Aluno) aluno3;*/
		
		//(18)INSTANCE OF - Operador na hora de fazer a chamada de método ou a gente fazer CAST(conversão)é verificar qual classe que é a instância daquele objeto usando as classe Aluno,Pessoa e Professor para fazer esse exemplo.
		Pessoa pessoa = new Pessoa();
		Aluno aluno = new Aluno();
		Professor prof = new Professor();
		
		if (pessoa instanceof Pessoa ) {
			System.out.println("Objeto do tipo Pessoa");
		}
		if (aluno instanceof Aluno ) {
			System.out.println("Objeto do tipo Aluno");
		}
		if (prof instanceof Professor) {
			System.out.println("Objeto do tipo Professor");
		}
		
	}
}
