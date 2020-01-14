package basics;

public class Carro {

	protected String marca;

	private Carro(String carro) {
		this.marca = carro;
	}
	
	public Carro(){
		this("Carro");
	}
	
	public static void carro(int[] vetorInteiros) {
		for (int num : vetorInteiros) {
			System.out.println(num);
		}
	}
	
	public static int calcular(int a, int b) {
		return a+b;
	}
}
