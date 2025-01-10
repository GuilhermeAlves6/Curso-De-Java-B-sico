package CursoJavaBasicoAula46;
//(5)Criar a Interface SqlDML
public interface SqlDML {

	//(6)Criar os métodos
	void select(String query);
	void insert(String query);
	void delete(String query);
	void update(String query);
}


