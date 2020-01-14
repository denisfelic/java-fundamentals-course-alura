package oop_aula05_heranca_construtores;

public class TestaConta2 {

	public static void main(String[] args) {
		
		
		ContaPoupanca contap = new ContaPoupanca();
		System.out.println(	contap.getTotal());
		System.out.println(Conta.getTotal());
		
		ContaPoupanca contap2 = new ContaPoupanca(3123, 312);
		System.out.println(	contap.getTotal());
		System.out.println(contap2.getTotal());
		System.out.println(Conta.getTotal());
		
		contap.deposita(1000.0);
		System.out.println(contap.getSaldo());
		System.out.println("Sacando 500 : "+contap.saca(500));
		System.out.println(contap.getSaldo());

	}
}
