package parte2;

public class ConexaoDB implements AutoCloseable{
	    public ConexaoDB() {
	        System.out.println("Abrindo conexao");
	        //throw new IllegalStateException();
	       // throw new IllegalStateException();

	    }

	    public void leDados() {
	        System.out.println("Recebendo dados");
	        throw new IllegalStateException("Erro ao ler dados");
	    }

	    @Override
	    public void close() {
	        System.out.println("Fechando conexao");
	    }
	
}
