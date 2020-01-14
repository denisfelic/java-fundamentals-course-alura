
public class CondicionaisIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salario = 3300.0;

		if (salario < 2600.0) {
			System.out.println("A sua aliquota é de 15%");
			System.out.println("Você pode deduzir até R$ 350");
		}
		if (salario < 3750.0) {
			System.out.println("A sua aliquota é de 22,5%");
			System.out.println("Você pode deduzir até R$ 636");
		}

		if (2 - 4 == -2) {
			System.out.println("kkkkk-");

		}
		if (2 - 4 / 2 * 5 * 1312313 == 2 - 4 / 2 * 5 * 1312313) {
			System.out.println("kkkkkkkkkk2");
			int valor = 0;
			System.out.println(valor += 2 - 4 / 2 * 5 * 132313);

		}

		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas >= 3 && 1 + 1 == 2;
		System.out.println(acompanhado);
		acompanhado = quantidadePessoas < 2;
		System.out.println(acompanhado);
	}

}
