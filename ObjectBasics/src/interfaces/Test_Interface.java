package interfaces;

public class Test_Interface {
	
	public static void main(String[] args) {
		Cachorro dog = new Cachorro();
		
		dog.setNome("Bob");
		dog.setRaca("Beogle");
		dog.setTamanho(20);
		System.out.println(dog.getNome());
		System.out.println(dog.getRaca());
		System.out.println(dog.emitirSom());
		dog.brincar();
		dog.levarVeterinario();
		
		Papagaio papagaio = new Papagaio();
		System.out.println(	papagaio.voar());
		System.out.println(dog.ANO);
		dog.alimentar();
	}
	
	
}
