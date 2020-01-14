package br.com.bytebank.banco.modelo;
	/**
	 * Todos os documentarios de seções no software são feitos utilizando comentarios na cor azul.
	 * All documents of sessions in the software are doing by blue comments.
	 * @author Denis Feliciano
	 *
	 */

//new ContaCorrente()
 public class ContaCorrente extends Conta implements Tributavel {
	 protected int teste = 0;
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
        super.saldo += valor;
    }

	@Override
	public double getValorImposto() {	
		return super.saldo * 0.01;
	}
	
}
