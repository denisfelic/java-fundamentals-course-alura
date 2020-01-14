package heranca;

public class Cachorro extends Mamifero {
	private int tamanho;
	private String raca;
	
	@Override
	public String amamentar() {
		// TODO Auto-generated method stub
		return "Cachorro amamentando";
	}
	@Override
	public String emitirSom() {
		// TODO Auto-generated method stub
		return "Cachorro "+super.getNome()+" : huff huff";
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	

}
