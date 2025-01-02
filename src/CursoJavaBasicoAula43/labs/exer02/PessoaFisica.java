package CursoJavaBasicoAula43.labs.exer02;

//(4) Criar a Pessoa física e aplicar a herança a classe contribuinte
public class PessoaFisica extends Contribuinte{
	
	//(5) criar o atributo cpf
	private String cpf;

	//(6) Criar os getters and setters
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	//(12) implementação de todos os métodos abstratos de PessoaFisica
	@Override
	public double calcularImposto() {
		
		//(13)Calculo das faixas sálariais da Renda Bruta,com Alíquotas e Parcelas a Deduzir
		double renda = this.getRendaBruta();
		
		if (renda <= 1400) {
			return 0;
		}
		
		else if (renda > 1400 && renda <= 2100) {
			return (renda * 0.1) - 100;
		}
		
		else if (renda > 2100 && renda <= 2800) {
			return (renda * 0.15) - 270;
		}
		
		else if (renda > 2800 && renda <= 3600) {
			return (renda * 0.25) - 500;
		}
		
		//maior que ( > 3600)
		return (renda * 0.30) - 700;
		
	}

	//(15) Gerar um método ToString Pessoa Física
	@Override
	public String toString() {
		String s = "Pessoa Física[";
		s = super.toString();
		s += " ;cpf: " + cpf;
		s += " ;imposto a ser pago: " + calcularImposto();
		s += "]";
		
		return s;
	}
	
	
	
	
	
	

}
