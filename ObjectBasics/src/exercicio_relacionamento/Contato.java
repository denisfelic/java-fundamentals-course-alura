package exercicio_relacionamento;

import java.util.Arrays;

public class Contato {
	private String nome;
	private Telefone[] telefone;
	private Email[] email;
	
	
	
	public Contato(String nome, Telefone[] telefone, Email[] email) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}
	
	public Contato() {
		// TODO Auto-generated constructor stub
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Telefone[] getTelefone() {
		return telefone;
	}
	public void setTelefone(Telefone[] telefone) {
		this.telefone = telefone;
	}
	public Email[] getEmail() {
		return email;
	}
	public void setEmail(Email[] email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", telefone=" + Arrays.toString(telefone) + ", email=" + Arrays.toString(email)
				+ "]";
	}
	
	
	
}
