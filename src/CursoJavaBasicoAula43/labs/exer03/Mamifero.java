package CursoJavaBasicoAula43.labs.exer03;

//(4) Criar a Classe mamífero e extenda a classe Animal
public class Mamifero extends Animal{
	
	//(10)Criar o atributo "alimento" em separado pois não tem na "classe Animal"é especifíco do Mamífero
	private String alimento;
	
	//(9)Gerar um construtor pois Mamífero tem umas características padrões
	public Mamifero() {
		this.setCor("Castanho");
		this.alimento = "Mel";
	}
	
	//(11)Gerar os getters and setters para esse alimento
	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	//(14)Gerar um ToString exclusivo para características de Mamífero
	@Override
	public String toString() {
		//O super trás as caracteriscas padrãos que temos em animais
		String s = super.toString();
		//agora vamos para adicionar as coisas expecíficas de peixes 
		s += "\nAlimento: " + alimento;
		return s;
	}
}
