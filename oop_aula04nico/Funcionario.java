package oop_aula04nico;

public abstract class Funcionario extends Pessoa {

	private double salario;
	private  int idFuncionario;
	private static int numeroDeFuncionarios;
	
	
	public Funcionario() {
		numeroDeFuncionarios++;
		this.idFuncionario = numeroDeFuncionarios;
	}
	
	 public abstract double getBonificacao();
	
	
		
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public int getIdFuncionario() {
		return this.idFuncionario;
	}
	
	public double getSalario() {
		return salario;
	}
	public static int getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}
	
	 
}
