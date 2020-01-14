package aula02_bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conta contaDenis = new Conta("Denis");
		System.out.println(contaDenis.consultarInfoConta());
		System.out.println(contaDenis.consultarSaldo());
		System.out.println("Tentando sacar R$-99");
		System.out.println("Consegui sacar? "+contaDenis.saca(-99));
		System.out.println("Saldo: "+contaDenis.consultarSaldo());
		 
		System.out.println("Depositando um valor de -99\n"+ "A transação ocorreu tudo certo? "+contaDenis.deposita(-99));
		System.out.println(contaDenis.consultarSaldo());
		
		System.out.println("Depositando um valor de 20\n"+ "A transação ocorreu tudo certo? "+contaDenis.deposita(20));
		System.out.println(contaDenis.consultarSaldo());
		
		Conta contaDois = new Conta("Usuario2");
		System.out.println("########");
		System.out.println("Conta 2 - "+contaDois.consultarInfoConta());
		System.out.println("Saldo Conta 2"+contaDois.consultarSaldo());
		System.out.println("Transação Ok? "+contaDenis.transfereirDinheiro(contaDois, 15));
		System.out.println("Conta 2 - Saldo: "+ contaDois.consultarSaldo());
		System.out.println("Conta Denis - Saldo: "+ contaDenis.consultarSaldo());
		
	}

}
