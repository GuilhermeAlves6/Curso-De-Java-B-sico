package CursoJavaBasicoAula46;
//(1)Criar a Interface SqlDCL
public interface SqlDCL {

	//(2)Criar os métodos da interface
	void grant(String access);
	void revoke(String acess);
}
