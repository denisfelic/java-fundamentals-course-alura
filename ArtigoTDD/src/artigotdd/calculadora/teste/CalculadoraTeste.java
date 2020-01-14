package artigotdd.calculadora.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraTeste {
	private Calculadora calculadora = new Calculadora();
	private int valorA = 1;
	private int valorB = 2;
	@Test
	public void deveriaSomarDoisValoresPassados() throws Exception{
	
		// tdd soma
		
		int soma = calculadora.soma(valorA,valorB);
		
		assertEquals(3, soma);
		
	}
	@Test
	public void deveriaSubtrairDoisValoresPassados() throws Exception{
		int subtracao =  calculadora.subracao(valorA, valorB);
		
		//	assertEquals(1, subtracao);
			assertEquals(-1, subtracao);
	}
	
	@Test(expected = ArithmeticException.class)
	public void deveriaDarExcecaoDividirDoisValoresPassados() throws Exception{
		int valorA =6;
		int valorB =0;
		int  divisao = calculadora.dividir(valorA, valorB);
		assertEquals(0, divisao);
		
		
	}
	
	@Test
	public void deveriaMultiplicarDoisValoresPassados() {
		
		int valorA= 4;
		int valorB =2;
		int multiplicacao;
		
		multiplicacao = calculadora.multiplicar(valorA,valorB);
		assertEquals(8, multiplicacao);
	}
	
}

