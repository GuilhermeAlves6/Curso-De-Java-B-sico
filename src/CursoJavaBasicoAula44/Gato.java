package CursoJavaBasicoAula44;

//(4)Criar a classe Gato + Adicionar o Extends(Hierarquia) "Animal -> Mamífero -> Cachorro. Agora o Gato extende a classe mamífero e ele vai implementar um AnimalDomesticado,além de poder adicionar várias interfaces ao mesmo tempo
public class Gato extends Mamifero implements AnimalDomesticado,AnimalEstimacao{
	
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

	//(25)Implementação dos Métodos AnimalDomésticado (levarVeterinario e o EmitirSom) e AnimalEstimação (Brincar e LevarPassear)
	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void brincar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void levarPassear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void levarVeterinario() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
