package CursoJavaBasicoAula45;
//(8)Criar mais uma classe chamada Teste2
public class Teste2 {
	//(9)public static void main (String[] args) 
		public static void main (String[] args) {
			
			//(11)Objeto vai chamar "Obter String"
			Object obj1 = obterString();
			//(12)Agora vamos fazer um DOWNCASTING,a gente sabe que a classe OBJECT é a "Super Classe" de todas as classes do java então a classe STRING é uma subclasse de Object + "adicionar o CAST (conversão)MANUALMENTE"
			String s1 = (String) obj1;
			//NÃO DA ERRO DE COMPILAÇÃO E TAMBÉ NÃO DA ERRO DE TEMPO DE EXECUÇÃO
			
			//(13)Fazendo agora um UPCASTING
			Object obj2 = "Minha String";
			//(14)Fazendo agora um DOWNCASTING,porque o objeto está referenciando uma string diretamente + "adicionar o CAST (conversão)MANUALMENTE"
			String s2 = (String) obj2;
			
			//(15)Outro Exemplo Objeto qualquer e instanciar a superclasse java tentar fazer o CAST(conversão) MANUALMENTE
			Object obj3 = new Object();
			String s3 = (String) obj3;
			//Esse objeto não fazer referência a nenhuma String (não pode ser convertido)
			
			//(17)Declarar  um objeto 4 + cast (conversão) manual
			Object obj4 = obterinteiro();
			String s4 = (String) obj4;
		}
		
		//(10)Método Obter Minha String que retorna "Minha String",e ele será utilizado dentro do método main e foi declarado como estático
		public static String obterString() {
			return "minha String";
		}
		
		//(16)Método Obter inteiro "INT" que retorna "1",e ele será utilizado dentro do método main e foi declarado como estático
		public static int obterinteiro() {
			return 1;
		}
}
