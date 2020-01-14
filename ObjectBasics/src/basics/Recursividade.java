package basics;

public class Recursividade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calcularFatorial(3));
		System.out.println(fatorial(5));
		olaMundo("Denis");
	}
	

	//metodo não recursivo
	//fatorial
	public static int calcularFatorial(int num) {
		int total =1;
		for (int i=num; i>1; i--) {
			total *= i;
		}
		return total;
	}
	
	public static int fatorial(int num) {
		if (num == 0) {
			return 1;
		}
		return num * fatorial(num-1);
	}
	
	static String olaMundo(String nome) {
		System.out.println("Olá Mundo, meu nome é "+ nome);
		String nomex = nome+"\n";
		
		
		
	
		return olaMundo(nome+nomex);
	}
}
