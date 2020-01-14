
public class TesteContas {

	public static void main(String[] args) {
					
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);
		
		 
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());

		try {
			cc.saca(97);
		} catch (TransacaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(cc.getSaldo());

	}

}
