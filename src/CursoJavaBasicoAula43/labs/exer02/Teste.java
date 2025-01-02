package CursoJavaBasicoAula43.labs.exer02;

//(1) Criar a classe Teste
public class Teste {
	
	
	//(14) Gerar o Public static void main para fazer output
	public static void main(String[] args) {
		
		//(18) Três pessoas físicas e trêspessoas jurídicas
		PessoaFisica p1 = new PessoaFisica();
		p1.setNome("Contribuinte 01");
		p1.setRendaBruta(1000);
		p1.setCpf("800.893.560-04");
		
		PessoaJuridica p2 = new PessoaJuridica();
		p2.setNome("Contribuinte 02");
		p2.setRendaBruta(5000);
		p2.setCnpj("25.023.610/0001-31");
		
		PessoaFisica p3 = new PessoaFisica();
		p3.setNome("Contribuinte 03");
		p3.setRendaBruta(2000);
		p3.setCpf("090.871.310-03");
		
		PessoaJuridica p4 = new PessoaJuridica();
		p4.setNome("Contrinuinte 04");
		p4.setRendaBruta(3000);
		p4.setCnpj("87.714.864/0001-53");
		
		PessoaFisica p5 = new PessoaFisica();
		p5.setNome("Contribuinte 05");
		p5.setRendaBruta(3700);
		p5.setCpf("382.834.560-32");
		
		PessoaJuridica p6 = new PessoaJuridica();
		p6.setNome("Contribuinte 06");
		p6.setRendaBruta(4000);
		p6.setCnpj("63.838.274/0001-74");
		
		
		//(19) Polimorfismo de arrays de contribuintes
		Contribuinte[] contribuintes = new Contribuinte[6];
		contribuintes[0] = p1;
		contribuintes[1] = p2;
		contribuintes[2] = p3;
		contribuintes[3] = p4;
		contribuintes[4] = p5;
		contribuintes[5] = p6;
		
		//(20)for melhorado
		for (Contribuinte c : contribuintes) {
			System.out.println(c.toString());
		}
		
		
	}

}
