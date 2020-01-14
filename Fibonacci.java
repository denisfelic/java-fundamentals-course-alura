
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long anterior = -1;
		long resultado = 1;
		long soma = 0;
		for (int i = 0; i < 100; i++) {
			soma = resultado + anterior;
			System.out.println(soma);
			anterior = resultado;
			resultado = soma;
		}

		System.out.println("Funciona depois do loop" + soma);

		for (int i = 1; i <= 10; i++) {
			System.out.println("Tabuada do " + i);
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
		}

		for (int linha = 10; linha >= 0; linha--) {
			for (int ponto = 0; ponto <= linha; ponto++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int linha2 = 0; linha2 < 10; linha2++) {
			for (int ponto2 = 0; ponto2 <= 10; ponto2++) {
				if (ponto2 == linha2) {
					break;
				}
				System.out.print("*");
				
			}
			System.out.println();
		}

	}
}
