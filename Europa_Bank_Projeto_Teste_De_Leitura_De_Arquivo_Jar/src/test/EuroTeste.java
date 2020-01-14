package test;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class EuroTeste {

	public static void main(String[] args) {
		ContaCorrente conta = new  ContaCorrente(19, 99);
		
		System.out.println("Hellow Jar");
		conta.deposita(400);
		System.out.println(conta.getSaldo());
	}
}
