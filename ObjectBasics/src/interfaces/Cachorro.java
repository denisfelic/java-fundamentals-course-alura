package interfaces;

public class Cachorro extends Mamifero implements AnimalEstimacao, AnimalDomesticado {
	private int tamanho;
	private String raca;
	
	//metodos da herança abstrata
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
	
	// metodos da interface

	@Override
	public void levarPassear() {
		System.out.println("Passeando com "+ super.getNome());
		
	}
	@Override
	public void brincar() {
		// TODO Auto-generated method stub
		System.out.println("Brincando com " + super.getNome());
		
	}
	@Override
	public void levarVeterinario() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		
	//	int x = AnimalEstimacao.ANO;
		int x = ANO;
		System.out.println(x);
	}
	
	
	
	
	
	
	

}
