package interface_heranca;

public interface BancoMySql extends SqlDCL, SqlDML, SqlDDL {

	 void abrirConexao();

	 void fecharConexao();



}
