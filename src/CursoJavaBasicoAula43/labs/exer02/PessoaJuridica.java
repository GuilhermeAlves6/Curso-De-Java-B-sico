package CursoJavaBasicoAula43.labs.exer02;

//(7) Criar a classe PessoaJuridica e aplicar a herança ao contribuinte com extends
public class PessoaJuridica extends Contribuinte{
	
	//(8)criar o atributo cnpj
	private String cnpj;


	//(9) aplicar o método de encapsulamento dos campos getters and setters
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	//(11) implementação de todos os métodos abstratos de PessoaJuridica
	@Override
	public double calcularImposto() {
		return this.getRendaBruta() * 0.1;
		//return (this.getRendaBruta()/100 *10);

	}
	
	//(17) Gerar um método ToString PessoaJuridica
	@Override
	public String toString() {
		String s = "Pessoa Jurídica[";
		s = super.toString();
		s += " ;cnpj: " + cnpj;
		s += " ;imposto a ser pago: " + calcularImposto();
		s += "]";
		
		return s;
	}
	
}//
