package bank;

public class Cliente {

	private String cpf;
	private String nome;
	private String profissao;
	private double salario;
	
	public Cliente(String nome, String cpf, String profissao, Double salario) {
		this.cpf = cpf;
		this.nome = nome;
		this.profissao = profissao;
		this.salario = salario;
	}
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getProfissao() {
		return profissao;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
