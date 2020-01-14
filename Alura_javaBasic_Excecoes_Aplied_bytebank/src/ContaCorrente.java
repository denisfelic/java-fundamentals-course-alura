

//new ContaCorrente()
public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) throws TransacaoException  {
		double valorASacar = valor + (valor*0.02);
		if(this.getSaldo() < valorASacar) {
			throw new TransacaoException("Saldo insulficiente, não é possivel sacar.");
		}
		else {
			this.saldo -= valorASacar;
		}
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
