package bank;

public class Conta {

	private Cliente cliente;
	private int numeroConta;
	private double saldo;
	private static int totalDeContas;

	public Conta(Cliente cliente, double saldo) {
		this(92332); // invoco o construtor que recebe o numero da conta
		this.cliente = cliente;
		this.saldo = saldo;
		Conta.totalDeContas++;
		
	}

	public Conta(Cliente cliente) {
		this(cliente, 499);  //chamo o primeiro construtor utilizando this
		Conta.totalDeContas++;

	}
	public Conta(int numeroConta) {
		this.numeroConta = numeroConta;
		Conta.totalDeContas++;

	}
	
	
	public Cliente getCliente() {
		return cliente;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setNumeroConta(int numeroConta) {
		if (numeroConta >= 0) {
			this.numeroConta = numeroConta;
		}

		else {
			System.out.println("Valor invalido, digite um numero maior ou igual a zero.");
			return;
		}
	}

	public static int getTotalDeContas() {
		return totalDeContas;
	}

}
