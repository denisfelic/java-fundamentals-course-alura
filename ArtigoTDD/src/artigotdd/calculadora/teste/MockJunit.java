package artigotdd.calculadora.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MockJunit {
	@Test
	public void deveriaCriarUmLogQuandoUmaPessoaForExcluida() throws Exception{
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Denis");
		
		LogMock nossoLogMock = new LogMock();
		
		PessoaController pessoaController = new PessoaController(nossoLogMock);
		pessoaController.exclui(pessoa);
		
		assertEquals(pessoa.getNome(), nossoLogMock.getNome());
	}
}
