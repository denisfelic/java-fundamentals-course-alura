package oop_aula05_heranca_construtores;

public class ContaCorrente  extends Conta implements Tributavel{

	public ContaCorrente() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getValorDeImpost() {
		// TODO Auto-generated method stub
		return 0.2;
	}
}
