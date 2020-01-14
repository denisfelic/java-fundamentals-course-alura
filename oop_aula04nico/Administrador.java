package oop_aula04nico;

public class Administrador extends Funcionario implements ObjetosAutenticaveis {

	private Senha senhaUsuario;
	
	
	public Administrador() {
		this.senhaUsuario = new Senha();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getSenha() {
		return this.senhaUsuario.getSenhaInterna();
	}
	
	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setSenha(int senha) {
		this.senhaUsuario.setSenhaInterna(senha);
	}

	@Override
	public boolean verificarLogin() {
		return senhaUsuario.autenticadarUsuario();
	}

}
