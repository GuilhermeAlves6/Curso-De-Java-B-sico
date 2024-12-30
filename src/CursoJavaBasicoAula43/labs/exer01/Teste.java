package CursoJavaBasicoAula43.labs.exer01;

//(7) Criar a classe Teste
public class Teste {
	
	//8) Criar o "public static void main"
	public static void main (String[]args) {

		//(9)Criar o "Teste ContaBancaria"
		System.out.println("*** Teste ContaBancaria***");
		
		//(10)Criar a "Conta Simples"
		ContaBancaria contaSimples = new ContaBancaria();
		contaSimples.setNomeCliente("Cliente Conta Simples");
		contaSimples.setNumConta("11111");
		
		//(12) Fazer o Depósito
		contaSimples.depositar(100);
		
		//(13) Fazer o Saque
		realizarSaque(contaSimples, 50);
		realizarSaque(contaSimples, 70);

		//(11) Teste do ToString
		System.out.println(contaSimples);
		
		//(21)Criar o "Teste ContaPoupança"
        System.out.println("*** Teste ContaPoupança***");
		
		//(22)Criar a "Conta Poupança"
		ContaPoupanca contaPoupacanca = new ContaPoupanca();
		contaPoupacanca.setNomeCliente("Cliente Conta Poupanca");
		contaPoupacanca.setNumConta("22222");
		
		//(23) Fazer o Depósito
		contaPoupacanca.depositar(100);
		
		//(24) Fazer o Saque
		realizarSaque(contaPoupacanca, 50);
		realizarSaque(contaPoupacanca, 70);
		

		//(25) Teste do ToString
		System.out.println(contaPoupacanca);
		
	}
		
		//(14) método estático "static" para realizar saque
		private static void realizarSaque(ContaBancaria conta, double valor) {
			if (conta.sacar(valor)) {
				System.out.println("Saque efetuado com sucesso, novo saldo = " + conta.getSaldo());
			}else {
				System.out.println("Saldo insuficiente para saque de " + valor + "; saldo de = " + conta.getSaldo()); 
			}
		
		
		
	}
}
		
        /*System.out.println("***  Teste ContaBancaria***");
		
        ContaBancaria contaSimples = new ContaBancaria();
        contaSimples.setNomeCliente("Cliente Conta Simples");
		contaSimples.setNumConta("11111");
		
		contaSimples.depositar(100);
		
		realizarSaque(contaSimples, 50);
		
		realizarSaque(contaSimples, 70);
		
		System.out.println(contaSimples);
		
		System.out.println("***  Teste ContaPoupança***");
		
		ContaPoupanca contaPoupacanca = new ContaPoupanca();
		contaPoupacanca.setNomeCliente("Cliente Conta Poupança");
		contaPoupacanca.setNumConta("22222");
		contaPoupacanca.setDiaRendimento(27);
		
		contaPoupacanca.depositar(100);
		
		realizarSaque(contaPoupacanca, 50);
		
		realizarSaque(contaPoupacanca, 70);
		
		if (contaPoupacanca.calcularNovoSaldo(0.5)) {
			System.out.println("Rendimento aplicado, novo saldo é de = " + contaPoupacanca.getSaldo());
		}else {
			System.out.println("Hoje não é dia de rendimento,novo saldo não calculado");
		}
		
		System.out.println(contaPoupacanca);
		
        System.out.println("***  Teste ContaEspecial***");
		
        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setNomeCliente("Cliente Conta Especial");
        contaEspecial.setNumConta("33333");
        contaEspecial.setLimite(50);
		
		contaEspecial.depositar(100);
		
		realizarSaque(contaEspecial, 50);
		
		realizarSaque(contaEspecial, 70);
		
		realizarSaque(contaEspecial, 80);
		
		System.out.println(contaEspecial);
	
	}
	
	private static void realizarSaque(ContaBancaria conta, double valor){
		
		if (conta.sacar(valor)) {
			System.out.println("Saque efetuado com sucesso, novo saldo = " + conta.getSaldo());
	    } else {
	    	System.out.println("Saldo insuficiente para saque de " + valor + "; saldo de = " + conta.getSaldo());
	    }
		
	}
	

}*/
