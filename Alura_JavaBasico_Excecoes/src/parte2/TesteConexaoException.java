package parte2;

public class TesteConexaoException {

	public static void main(String[] args) {

		//TRY WITH RESOURCES
		try(ConexaoDB conexao = new ConexaoDB()){
			conexao.leDados();
			conexao.close();
		}
		catch (IllegalStateException e) {
			e.printStackTrace();
		}
		System.out.println("Continuação try with resources");
		
//		ConexaoDB conexao = null;
//		try {
//			conexao = new ConexaoDB();
//
//			conexao.leDados();
//
//		} catch (IllegalStateException e) {
//			e.printStackTrace();
//		} finally {
//			System.out.println("Finally");
//			if (conexao != null) {
//				conexao.close();
//			}
//		}
	}

}
