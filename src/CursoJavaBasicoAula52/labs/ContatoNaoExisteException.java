package CursoJavaBasicoAula52.labs;
//(20) Criar a classe ContatoNaoExisteException e extender para Exception
public class ContatoNaoExisteException extends Exception{
	//(21)adicionar os contatos
	private String nomeContato;
	//(22)adicionar a Classe ContatoNaoExisteException
	public ContatoNaoExisteException(String nomeContato) {
		this.nomeContato = nomeContato;
	}
	//(23)Adicionar a classe getMessage
	@Override
	public String getMessage() {
		
		return "Contato " + nomeContato + " não existe na agenda";
	}
	
	

}
