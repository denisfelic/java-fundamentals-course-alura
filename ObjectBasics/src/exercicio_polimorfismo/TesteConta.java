package exercicio_polimorfismo;

public class TesteConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContaBancaria cc = new ContaBancaria();
		
		cc.setSaldo(999);
		cc.setNomeCliente("Denis Feliciano");
		cc.setNumConta("2344-44");
		cc.consultarSaldo();
		cc.sacarDinheiro(400.0);
		cc.sacarDinheiro(400.0);
		cc.sacarDinheiro(400.0);
		
		
	
	}

	

}
