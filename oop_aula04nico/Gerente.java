package oop_aula04nico;

public class Gerente extends Funcionario implements ObjetosAutenticaveis {

	private Senha senhaUsuario;
	
	public Gerente() {
		senhaUsuario = new Senha();
	}

	/*
	 * UTILIZANDO COMO PROTECTED FICARIA ASSIM
	 * 
	 * @Override public double getBonificacao() { return
	 * super.getBonificacao()+(super.salario*0.25); }
	 */

	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return super.getSalario() + (super.getSalario() * 0.20);
	}


	@Override
	public void setSenha(int senha) {
		this.senhaUsuario.setSenhaInterna(senha);
		// TODO Auto-generated method stub

	}

	@Override
	public int getSenha() {
		return this.senhaUsuario.getSenhaInterna();
	}

	@Override
	public boolean verificarLogin() {
		return senhaUsuario.autenticadarUsuario();
	}

}
