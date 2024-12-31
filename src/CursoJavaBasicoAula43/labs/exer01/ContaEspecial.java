package CursoJavaBasicoAula43.labs.exer01;

//(26) Criar a classe Conta Especial e estender a conta Bancária
public class ContaEspecial  extends ContaBancaria{
	
	//(27) Criar o private "Limite"
	private double limite;

	//(28) Gerar os Getters and Setters de Limite
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	//(29) Fazer o método ToString
	@Override
	public String toString() {
		String s = "ContaEspecial{";
		s += " limite: " + limite;
		s += "; " + super.toString();
		s += "]" ;
		return s;
	}

	//(30)Sobre escrever o método Sacar
	public boolean sacar (double valor) {
		
		double saldoComLimite = this.getSaldo() + limite;
		
		if ((saldoComLimite - valor) >=0) {
			this.setSaldo(this.getSaldo()-valor);
			return true;
		}
		
		return false;
	}
	
	

}
