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
		contaPoupacanca.setDiaRendimento(31);
		
		//(23) Fazer o Depósito
		contaPoupacanca.depositar(100);
		
		//(24) Fazer o Saque
		realizarSaque(contaPoupacanca, 50);
		realizarSaque(contaPoupacanca, 70);
		if (contaPoupacanca.calcularNovoSaldo(0.5)) {
			System.out.println("Rendimento,aplicado, novo saldo de " + contaPoupacanca.getSaldo());
		} else {
			System.out.println("Hoje não é dia de rendimento,novo saldo não calculado");
		}
		

		//(25) Teste do ToString
		System.out.println(contaPoupacanca);
		
		//(31)Criar o "Teste ContaEspecial"
        System.out.println("***  Teste ContaEspecial***");
		
        //(32)Criar a ContaEspecial para sacar
        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setNomeCliente("Cliente Conta Especial");
        contaEspecial.setNumConta("33333");
        contaEspecial.setLimite(50);
		
        //(33)Fazer o Depósito
		contaEspecial.depositar(100);
		
		//(34)Fazar saque dos valores
		realizarSaque(contaEspecial, 50);
		realizarSaque(contaEspecial, 70);
		realizarSaque(contaEspecial, 80);
		
		//(35)Imprimir tudo na tela
		System.out.println(contaEspecial);
	
	}
		
	
		
		//(14) método estático "static" para realizar saque
        private static void realizarSaque(ContaBancaria conta, double valor){
		
		if (conta.sacar(valor)) {
			System.out.println("Saque efetuado com sucesso, novo saldo = " + conta.getSaldo());
	    } else {
	    	System.out.println("Saldo insuficiente para saque de " + valor + "; saldo de = " + conta.getSaldo());
	    }
		
	}
	

}
		
      