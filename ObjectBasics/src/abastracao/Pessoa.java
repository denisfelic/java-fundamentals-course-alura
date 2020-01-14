package abastracao;

import java.util.Arrays;

public abstract class Pessoa {

	private String nome;
	private String cpf;
	private String rg;
	private String endereco;
	private String[] notas;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public abstract void imprimirEtiquetaEndereco();

	

	
	
}
