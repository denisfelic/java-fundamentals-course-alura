package exercicio_relacionamento;

import java.util.Arrays;

public class Agenda {
	private Contato [] contatos;
	private String nome;
	
	public Agenda() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Agenda(Contato[] contatos, String nome) {
		super();
		this.contatos = contatos;
		this.nome = nome;
	}



	public Contato[] getContatos() {
		return contatos;
	}



	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	@Override
	public String toString() {
		return "Agenda [contatos=" + Arrays.toString(contatos) + ", nome=" + nome + "]";
	}
	
	

}
