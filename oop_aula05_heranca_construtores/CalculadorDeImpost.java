package oop_aula05_heranca_construtores;

public  class CalculadorDeImpost {
	private double impostoTotal;
	
	public CalculadorDeImpost() {
		// TODO Auto-generated constructor stub
	}
	
	public double calcularValorDeImposto(Tributavel objetoTributavel) {
		this.impostoTotal += objetoTributavel.getValorDeImpost(); 
		return this.impostoTotal;
	}
	
	
	public double getImpostoTotal() {
		return impostoTotal;
	}
	
}
