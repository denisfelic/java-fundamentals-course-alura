package aula02_bytebank;

public class Conta {

	private String titular;
	private int idConta;
	private double saldo;

	public Conta(String nomeTitularConta) {
		this.titular = nomeTitularConta;
		this.idConta = (int) (Math.random() * 10);
	}

	public boolean deposita(double valorDeposito) {
		if (valorDeposito > 0) {
			this.saldo += valorDeposito;
			return true;
		} else {
			return false;
		}
	}

	public boolean saca(double valorSaque) {
		if (this.saldo >= valorSaque && valorSaque > 0) {
			this.saldo -= valorSaque;
			return true;
		}
		return false;
	}

	public double consultarSaldo() {
		return this.saldo;
	}

	public String consultarInfoConta() {
		String infoConta = "Titular " + this.titular + "\nId: " + this.idConta + "\n";
		return infoConta;
	}
	
	public boolean transfereirDinheiro(Conta contaDestino, double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			contaDestino.deposita(valor);
			return true;
		}
		return false;
	}
}
