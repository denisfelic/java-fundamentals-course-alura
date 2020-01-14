package exercicio_01_beer_bottles;

public class BeerBottles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String palavra = "garrafas";

		for (int i = 99; i > -1; i--) {

			if (i == 1) {
				palavra = "garrafa";
			}

			System.out.println("Há " + i + " " + palavra + " de cerveja na prateleira.");
			System.out.println("Mê vê uma dessas cervejas ai porfavor!");

			if (i == 0) {
				System.out.println("Sinto muito, mas não há mais nenhuma garrafa disponivel.");
				System.out.println("Okey tudo bem, tchau");
			}
		}

		System.out.println("Fim do programa.");
	}

}
