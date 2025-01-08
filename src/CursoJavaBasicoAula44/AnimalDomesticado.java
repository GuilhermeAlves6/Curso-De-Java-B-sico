package CursoJavaBasicoAula44;
//(22)Criar a classe animalDomesticado e adicionar a abstração. Depois tirar a abstração e adicionar aINTERFACE
public interface AnimalDomesticado {
	
	//(28)Atributos Dentro de INTERFACES não tem atributos,e todos os atributos são do tipo "Public Final"
	public final int ANO = 2025;
	
	
	
	//(27)não consigo imprimir nome pois é classe abstrata e a cada método adicionado tem que adicionar nas outras classes
	//void imprimirNome();
	
	
	//(23)Adicionar alguns métodos
	void levarVeterinario();
	void alimentar();
	

}
