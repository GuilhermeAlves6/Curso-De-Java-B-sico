package CursoJavaBasicoAula43.labs.exer01;


//(1) Criar a classe ContaBancaria
public class ContaBancaria {
	
	//(2) Criar os atributos privados
	private String nomeCliente;
	private String numConta;
	private double saldo;
	
	
	//(3) Criar os encapsulamentos Getters and Setters
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//(4) Criar o método ToString
	@Override
	public String toString() {
		String s = "ContaBancaria";
		s += " nomeCliente: " + nomeCliente;
		s += "; numConta: " + numConta;
		s += "; saldo: " + saldo;	
		s += "]";
		
		return s;		
	}
	
	//(5) Fazer o método depósitar
	public void depositar(double valor) {
		saldo += valor;
	}
	
	//(6) Fazer o método sacar
	public boolean sacar(double valor) {
		if((saldo-valor)>=0) {
			saldo -= valor;
			return true;
		}
		return false;
	}

}



	
	

