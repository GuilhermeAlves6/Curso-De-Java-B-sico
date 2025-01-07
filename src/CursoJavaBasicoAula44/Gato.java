package CursoJavaBasicoAula44;

//(4)Criar a classe Gato + Adicionar o Extends(Hierarquia) "Animal -> Mamífero -> Cachorro
public class Gato extends Mamifero{
	
	//(13) Tem somente o atributo Raça
	private String raça;

	//(14)Criar os Métodos Getters and Setters
	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}

	//(18) Foi adicionado o método "Amamentar" que pertence a MAMÍFERO e "EmitirSom" que pertence a classe Animal
	@Override
	public void amamentar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
