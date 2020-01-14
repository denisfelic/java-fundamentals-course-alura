package objetos;
public class Venda {
	
	private double valor;
	private Produto[] produtos;
	private Cliente cliente;
	private Funcionario vendedor;
	private int dia;
	private int mes;
	private int ano;
	private int hora;
	private int minutos;
	private String idVenda;
	private String tipoPagamento;
	private double troco= 0;
	private double lucro;
	
	public Venda() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Venda(double valor, Produto[] produtos, Cliente cliente, Funcionario vendedor, int dia, int mes, int ano,
			int hora, int minutos, String idVenda, String tipoPagamento) {
		super();
		this.valor = valor;
		this.produtos = produtos;
		this.cliente = cliente;
		this.vendedor = vendedor;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.hora = hora;
		this.minutos = minutos;
		this.idVenda = idVenda;
		this.tipoPagamento = tipoPagamento;
	}


	public double getLucro() {
		return lucro;
	}


	public void setLucro(double lucro) {
		this.lucro = lucro;
	}


	public void realizarVenda(Cliente cliente, Produto produto, Funcionario vendedor, double valorPago) {
		boolean flag=false;
		if (cliente == null || produto == null || vendedor == null || valorPago <= 0 ) {
			flag = true;
		}
		if (!flag) {
			System.out.println("Transação efetuada.");
		}
		
	}

	
	public String getTipoPagamento() {
		return tipoPagamento;
	}
	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}
	public double getTroco() {
		return troco;
	}
	public void setTroco(double troco) {
		this.troco = troco;
	}
	
	public double pagarTroco(double valor, double valorProduto) {
		 this.troco = valor-valorProduto;
		return troco;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Produto[] getProdutos() {
		return produtos;
	}
	public void setProdutos(Produto[] produtos) {
		this.produtos = produtos;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Funcionario getVendedor() {
		return vendedor;
	}
	public void setVendedor(Funcionario vendedor) {
		this.vendedor = vendedor;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMinutos() {
		return minutos;
	}
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	public String getIdVenda() {
		return idVenda;
	}
	public void setIdVenda(String idVenda) {
		this.idVenda = idVenda;
	}
	
	
	

}
