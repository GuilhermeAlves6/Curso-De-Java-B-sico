package CursoJavaBasicoAula44;

//(3)Criar a classe Cachorro + Adicionar o Extends(Hierarquia) "Animal -> Mamífero -> Cachorro. Agora o Cachorro extende a classe mamífero e ele vai implementar um AnimalDomesticado,além de poder adicionar várias interfaces ao mesmo tempo
public class Cachorro extends Mamifero implements AnimalDomesticado,AnimalEstimacao{
	
	//(11)Tem 2 atributos cachorro e raça
	private int tamanho;
	private String raça;
	
	//(12) Criação dos Métodos Getters and Setters
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public String getRaça() {
		return raça;
	}
	public void setRaça(String raça) {
		this.raça = raça;
	}
	
	//(17) Foi adicionado o método "Amamentar" que pertence a MAMÍFERO e "EmitirSom" que pertence a classe Animal
	@Override
	public void amamentar() {
		// TODO Auto-generated method stub
		
	}
	
	//(24)Implementação dos Métodos AnimalDomésticado (levarVeterinario e o EmitirSom) e AnimalEstimação (Brincar e LevarPassear)
	@Override
	public void emitirSom() {
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
	@Override
	public void brincar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void levarPassear() {
		// TODO Auto-generated method stub
		
	}
	
	

}
