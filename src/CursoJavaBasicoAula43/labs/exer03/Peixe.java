package CursoJavaBasicoAula43.labs.exer03;

//(3) Criar a Classe Peixe e extenda da classe animal
public class Peixe  extends Animal{
	
	//(8)Caracteristica padrão para peixe
	private String caracteristicas;
	
	//(7) Adicionar construtor para as caracteristica padrões do peixe 
	public Peixe() {
		this.setPatas(0);
		this.setAmbiente("Mar");
		this.setCor("Cinzenta");
		this.caracteristicas = "Barbatanas e Calda";
	}

	//(8) gerar os getters and setters do Peixe
	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	//(13)Gerar um ToString exclusivo para características de Peixe
	@Override
	public String toString() {
		//O super trás as caracteriscas padrãos que temos em animais
		String s = super.toString();
		//agora vamos para adicionar as coisas expecíficas de peixes 
		s += "\nCaracteristicas: " + caracteristicas;
		return s;
	}
	
	
	
	
	

}
