package CursoJavaBasicoAula52.labs;
//(1)Criar a classe contato
public class Contato {
	//(3)Identificador chamado contador
	private static int contador = 0;
	//(2)A classe Contato contém os seguintes campos e o Id para banco de dados
	private int id;
	private String nome;
	private String telefone;
	private String email;
	
	//(5)Gerar um construtor de contato
	public Contato() {
		contador++;
		id = contador;
		
	}
	//(4)Encapsular todos os campos Getters and Setters,excato o contador,setID também
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	//(12)Criar o método ToString
	@Override
	public String toString() {
		String s= "[";
		s += "Id: " + id; 
		s += ", Nome: " + nome; 
		s += ", Telefone: " + telefone; 
		s += ", Email: " + email; 
		s += "]";
		return s;
	}
	
	
}
