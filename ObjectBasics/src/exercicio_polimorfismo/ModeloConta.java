package exercicio_polimorfismo;

public abstract class ModeloConta {
	 String nomeCliente;
	 String numConta;
	 double saldo = 0;
	 
	 abstract void sacarDinheiro(Double valor);
	 abstract void consultarSaldo();
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	 
	 
}
