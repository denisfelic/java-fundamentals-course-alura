
public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

	@Override
	public void saca(double valor) throws TransacaoException {
		if (this.saldo < valor) {
			throw new TransacaoException("Saldo insulficiente, não é possivel sacar.");
		} else {
			double valorAdicional = valor+(valor*0.02);
			this.saldo -= valor;
		}
	}

}
