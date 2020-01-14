package oop_aula04nico;

public class Senha {

	private final int SENHA = 222;
	private int senhaUsuarioCriado = 0;

	public Senha() {
		// TODO Auto-generated constructor stub
	}
	public boolean autenticadarUsuario() { 	 
		if (this.senhaUsuarioCriado == this.SENHA) {
			return true;
		} else {
			return false;
		}
	}
	
	public int getSenhaInterna() {
		return senhaUsuarioCriado;
	}
	public void setSenhaInterna(int senhaInterna) {
		this.senhaUsuarioCriado = senhaInterna;
	}
	

	
}
