package interfaces;

public class Gato extends Mamifero{
	private String raca;
	
	@Override
	public String amamentar() {
		// TODO Auto-generated method stub
		return "Gato: Amamentando.";
	}

	@Override
	public String emitirSom() {
		// TODO Auto-generated method stub
		return "Gato: Miau Miau!";
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;

	}

	
}
