package objetos;

import java.util.ArrayList;

public  class Estoque {
	private Funcionario[] funcionarios;
	private Cliente[] clientes;
	private Produto[] produtos;
	private Venda[] vendas;
	private int capacidadeMax;
	private int capacidadeAtual;
	private boolean statusOperando;
	private double valorDeEstoque;
	private int qtdProdutos = 0;
	private String responsavel;
	private int numeroVendas;
	private String[] categorias;
	private int numeroCategorias;
	private ArrayList arrayProdutos;

	
	public ArrayList getArrayProdutos() {
		return arrayProdutos;
	}

	public void setArrayProdutos(ArrayList arrayProdutos) {
		this.arrayProdutos = arrayProdutos;
	}

	public Funcionario[] getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Funcionario[] funcionarios) {
		this.funcionarios = funcionarios;
	}

	public Cliente[] getClientes() {
		return clientes;
	}

	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}

	public Produto[] getProdutos() {
		return produtos;
	}

	public void setProdutos(Produto[] produtos) {
		this.produtos = produtos;
	}

	public Venda[] getVendas() {
		return vendas;
	}

	public void setVendas(Venda[] vendas) {
		this.vendas = vendas;
	}

	public int getCapacidadeMax() {
		return capacidadeMax;
	}

	public void setCapacidadeMax(int capacidadeMax) {
		this.capacidadeMax = capacidadeMax;
	}

	public int getCapacidadeAtual() {
		return capacidadeAtual;
	}

	public void setCapacidadeAtual(int capacidadeAtual) {
		this.capacidadeAtual = capacidadeAtual;
	}

	public boolean isStatusOperando() {
		return statusOperando;
	}

	public void setStatusOperando(boolean statusOperando) {
		this.statusOperando = statusOperando;
	}

	public double getValorDeEstoque() {
		return valorDeEstoque;
	}

	public void setValorDeEstoque(double valorDeEstoque) {
		this.valorDeEstoque = valorDeEstoque;
	}

	public int getQtdProdutos() {
		if (produtos.length >= 0 || produtos != null) {
			for (int i = 0; i < produtos.length; i++) {
				this.qtdProdutos += i;
			}
		} else {
			qtdProdutos = 0;
		}
		return qtdProdutos;
	}

	public void setQtdProdutos(int qtdProdutos) {
		this.qtdProdutos = qtdProdutos;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public int getNumeroVendas() {
		return numeroVendas;
	}

	public void setNumeroVendas(int numeroVendas) {
		this.numeroVendas = numeroVendas;
	}

	public String[] getCategorias() {
		return categorias;
	}

	public void setCategorias(String[] categorias) {
		this.categorias = categorias;
	}

	public int getNumeroCategorias() {
		return numeroCategorias;
	}

	public void setNumeroCategorias(int numeroCategorias) {
		this.numeroCategorias = numeroCategorias;
	}
	
	

}
