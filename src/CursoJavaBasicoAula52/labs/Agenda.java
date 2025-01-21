package CursoJavaBasicoAula52.labs;

import java.util.Arrays;

//(9)Criar a classe Agenda
public class Agenda {
//(10)A classe agenda vai ter os seguintes arrays de contatos

	private Contato[] contatos;

	// (11)Criar um construtor Agenda com capacidade de 5
	public Agenda() {
		contatos = new Contato[5];

	}

	// (14)adicionar um public adicionar contato,para verificar se ela está completa
	// verificar as posições,diferente de null não tem espaço./E vamos adicionar um
	// throws que vai ser adicionado aqui na assinatura do método
	public void adicionarContato(Contato c) throws AgendaCheiaException {

		boolean cheia = true;
		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i] != null) {
				contatos[i] = c;
				cheia = false;

			}

		}
		// (15)Se a agenda estiver cheia a gente precisa lançar um excessão aqui atráves
		// de mensagem,"AgendaCheiaException"
		if (cheia) {
			// (18)Lancando uma exceção porém não vamos captura-lá aqui,nos vamos captura
			// essa exceção na classe de teste
			throw new AgendaCheiaException();
		}
	}

	// (18)vamos consultar para ver se o contato já existe
	public int consultaContatoPorNome(String nome) {

		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i] != null) {
				if (contatos[i].getNome().equalsIgnoreCase(nome))
					return i;
			}
		}

		// (19)lançar exception contato não existe
		return -1;

	}

	// (13)Criar o método ToString de contato
	@Override
	public String toString() {
		String s = "";
		for (Contato c : contatos) {
			s += c.toString() + "\n";

		}
		return s;
	}

}
