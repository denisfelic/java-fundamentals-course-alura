package oop_aula05_heranca_construtores;

import oop_aula05_heranca_construtores.Conta;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
		// TODO Auto-generated constructor stub
	}

	 public ContaPoupanca() {
		 
	 }
	 
	 @Override
	public boolean saca(double valor) {
		double valorComAcressimo = valor+0.2;
		return (super.saca(valorComAcressimo));
	}
	 
	

}
