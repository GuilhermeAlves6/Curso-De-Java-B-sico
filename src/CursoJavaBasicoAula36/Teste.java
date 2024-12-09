package CursoJavaBasicoAula36;

public class Teste {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		contato.setNome("Tyrior");
		//contato.setEndereço("Kings Landing");
		//contato.setTelefone("11 99999-9999");
		
		//relacionamento tem-um  endereço
		Endereco end = new Endereco();
		end.setNomeRua("Rua Game of Thrones");
		end.setNumero("n/a");
		end.setComplemento("-");
		end.setCidade("Kings Landing");
		end.setEstado("Wessteros");
		end.setCep("99999999");
		
		contato.setEndereço(end);
		
		//relacionamento tem-um telefone
		Telefone telefone = new Telefone();
		telefone.setTipo("celular");
		telefone.setDdd("11");
		telefone.setNumero("99999-9999");
		
		Telefone telefone2 = new Telefone();
		telefone2.setTipo("casa");
		telefone2.setDdd("11");
		telefone2.setNumero("88888-8888");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone;
		telefones[1] = telefone;
		
		
		//contato.setTelefone(telefone);
		contato.setTelefones(telefones);
		
		//Teste saída no console
		
		System.out.println(contato.getNome());
		//System.out.println(contato.getTelefone());
		
		if (contato != null && contato.getEndereço() != null) {
			System.out.println(contato.getEndereço().getCidade());
		}
		
		/*if (contato != null && contato.getTelefone() != null) {
			System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());;
		}*/
		
		if (contato != null && contato.getTelefones() != null) {
			for(Telefone t : contato.getTelefones()) {
				System.out.println(t.getDdd() + " " + t.getNumero());;
			}
		}
	}

}
