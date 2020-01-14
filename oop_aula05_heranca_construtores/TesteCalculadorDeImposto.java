package oop_aula05_heranca_construtores;

public class TesteCalculadorDeImposto {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();
		
		
		System.out.println(cc.getValorDeImpost());
		
		CalculadorDeImpost calculadorDeImpostos = new CalculadorDeImpost();
		
		System.out.println(calculadorDeImpostos.getImpostoTotal());
		calculadorDeImpostos.calcularValorDeImposto(cc);
		System.out.println(calculadorDeImpostos.getImpostoTotal());
				
		calculadorDeImpostos.calcularValorDeImposto(new SeguroVida());
		System.out.println(calculadorDeImpostos.getImpostoTotal());
		calculadorDeImpostos.calcularValorDeImposto(new AcaoBolsa());
		System.out.println(calculadorDeImpostos.getImpostoTotal());

		 int fatorial = 1;
		 for (int n = 1; n <= 10; n++) {
			 System.out.println("Fatorial de "+n+" é : "+(n * (n-1) * (n-2)));

		 }
		
	}
	
}
