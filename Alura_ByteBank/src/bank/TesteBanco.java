package bank;

public class TesteBanco {

	public static void main (String[] args) {
		Cliente cliente1 = new Cliente("Denoca", "222.222.222-22", "Programado", 3000.0);
		
		Conta conta1 = new Conta(cliente1, 200);
		System.out.println(conta1.getCliente().getNome());
		System.out.println(cliente1);
		System.out.println(conta1.getCliente());
		System.out.println(conta1);
		
		Conta contaMarcela = new Conta(new Cliente());
		System.out.println(contaMarcela.getSaldo());
		contaMarcela.setCliente(new Cliente());
		contaMarcela.getCliente().setNome("Marcela");						
		System.out.println(contaMarcela.getCliente().getNome());		
		System.out.println(contaMarcela.getCliente().getProfissao());
		
		System.out.println(Conta.getTotalDeContas());
		
		Conta contaTeste = new Conta(new Cliente(), 200);
		System.out.println(contaTeste.getSaldo());
		System.out.println(Conta.getTotalDeContas());
		System.out.println(contaTeste.getTotalDeContas()); //da pr fazer mas não é recomendado, sempre utilize o nome da classe.
		
		
		
		
	}
}
