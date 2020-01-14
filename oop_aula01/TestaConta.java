package oop_aula01;

public class TestaConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta primeiraConta = new Conta();
		Conta terceiraConta = new Conta();
		Conta segundaConta = primeiraConta;
		
		System.out.println("Primeira Conta: "+primeiraConta);
		System.out.println("Segunda Conta"+segundaConta);
		System.out.println("Terceira Conta"+terceiraConta);
		System.out.println("Primeira conta == Segunda Conta?");
		System.out.println(primeiraConta == segundaConta);
		System.out.println("Primeira conta == Terceira Conta?");
		System.out.println(primeiraConta == terceiraConta);
		System.out.println("Segunda Conta == Terceira Conta?");
		System.out.println(segundaConta == terceiraConta);
		System.out.println();
		primeiraConta.saldo = 300;
		System.out.println(primeiraConta.saldo);
		segundaConta.saldo += 100;
		System.out.println(segundaConta.saldo);
		System.out.println(primeiraConta.saldo);
		segundaConta.saldo = 50;
		System.out.println(primeiraConta.saldo);
		System.out.println(primeiraConta.agencia);
	}

}
