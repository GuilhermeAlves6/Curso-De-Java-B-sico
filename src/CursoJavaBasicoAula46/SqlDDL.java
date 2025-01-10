package CursoJavaBasicoAula46;
//(3)Criar a Interface SqlDDL
public interface SqlDDL {

	//(4)Criar os métodos
	void create(String query);
	void alter(String query);
	void drop(String query);
}
