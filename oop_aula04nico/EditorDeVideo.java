package oop_aula04nico;

public class EditorDeVideo extends Funcionario {


	public EditorDeVideo() {
		super();
	}

	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return (super.getSalario()*0.1) + super.getSalario();
	}

	

}
