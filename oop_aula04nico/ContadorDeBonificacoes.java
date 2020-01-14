package oop_aula04nico;

public class ContadorDeBonificacoes {

	private double valorTotalDasBonificacoes;
	private int numeroDeFuncionariosQueRecebemAuxilio;
	
	public ContadorDeBonificacoes() {
		// TODO Auto-generated constructor stub
	}
	
	public void registrarNovaBonificacao(Funcionario qualquerObjetoFuncionario) {
		this.valorTotalDasBonificacoes+= qualquerObjetoFuncionario.getBonificacao();
		this.numeroDeFuncionariosQueRecebemAuxilio++;
	}
	
	public double getValorTotalBonificacoes() {
		return this.valorTotalDasBonificacoes;
	}
	
	public int getNumeroDeFuncionariosQueRecebemAuxilio() {
		return numeroDeFuncionariosQueRecebemAuxilio;
	}
}
