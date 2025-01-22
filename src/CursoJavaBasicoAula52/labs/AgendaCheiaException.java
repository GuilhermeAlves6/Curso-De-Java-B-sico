package CursoJavaBasicoAula52.labs;
//(16)Criar a classe AgendaCheiaException e extender para a classe Exception
public class AgendaCheiaException extends Exception {
	//(17)Adicionar o getMessage retornando uma mensagem
	@Override
	public String getMessage() {
		return "Agenda já está cheia";
		
	}

}
