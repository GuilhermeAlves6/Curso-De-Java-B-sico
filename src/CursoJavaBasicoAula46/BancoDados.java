package CursoJavaBasicoAula46;
//(7)Criar a Interface BancoDados e extender quantas interfaces forem praciso ex:SqlDCL,SqlDML,SqlDDL
public interface BancoDados extends SqlDCL,SqlDML,SqlDDL{
	
	//(8)Criar os métodos 
	void abrirConexao();
	void fecharConexao();

}
