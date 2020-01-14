package exercicio_relacionamento;

public class Email {
	private String nome;
	private String tipoEmail;
	public String getNome() {
		return nome;
	}
	public Email() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Email(String nome, String tipoEmail) {
		super();
		this.nome = nome;
		this.tipoEmail = tipoEmail;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipoEmail() {
		return tipoEmail;
	}
	public void setTipoEmail(String tipoEmail) {
		this.tipoEmail = tipoEmail;
	}
	
	
	

}
