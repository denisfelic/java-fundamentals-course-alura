package oop_aula04nico;

public class TestaClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gerente gerente1 = new Gerente();
		System.out.println(gerente1.getIdFuncionario());
		Gerente gerente2 = new Gerente();
		System.out.println(gerente2.getIdFuncionario());

		gerente1.setSalario(1000.0);
		System.out.println(gerente1.getBonificacao());

		EditorDeVideo editor2 = new EditorDeVideo();
		editor2.setSalario(1000.0);
		System.out.println(editor2.getBonificacao());

		Funcionario g1 = new Gerente();
		Gerente g2 = (Gerente) g1;
		g1.setNome("Denoca");
		System.out.println("Nome Funcionario: " + g1.getNome());
		System.out.println("Referencia: " + g1);
		g1 = new EditorDeVideo();
		System.out.println("###############");
		System.out.println("Nome Gerente: " + g1.getNome());
		System.out.println("Referencia: " + g1);
		g1 = new Gerente();
		System.out.println("Outra referencia " + g1);
		g1 = g2;
		System.out.println("Another  referencia " + g1);

		int[] numero = new int[10];
		numero[9] = 7;
		int[] contador = new int[11];
		for (int x = 1; x <= 10; x++) {

			for (int i = 1; i <= 10; i++) {
				if (contador[9] < 3) {
					if (numero[9] % i == 0) {
						System.out.println(i);
						contador[9]++;
					}
				} else {
					continue;
				}
			}
		}
		System.out.println("Contador "+contador[9]);
	}

}
