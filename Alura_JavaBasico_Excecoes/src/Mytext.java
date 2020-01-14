
public class Mytext {
	private static int contadorFeio;
	private static int contadorBonito;

	protected Mytext() {
		// TODO Auto-generated constructor stub

	}

	public void digitartexto() {
		System.out.println("Estou no objeto Mytext, no método void digitarTexto()");
		meioObjetoTexto();
	}

	private void meioObjetoTexto() {
		System.out.println("Estou no metodo void meioObjetoTexto() ainda na classe Mytext");

		System.out.println("Im Beauty? " + imBeautyOrNo());
	}

	private int imBeautyOrNo() {
		System.out.println("Passando por imBeautyOrNo() boolean ");
		int cont = 0;
		while (cont < 10) {
			int res = (int) (Math.random() * 100);
			if (res % 2 == 0) {
				contadorFeio++;
				cont++;
			} else {
				contadorBonito++;
				cont++;
			}
		}
		System.out.println("Numero de vezes que foi chamado de Bonito "+contadorBonito);
		System.out.println("Numero de vezes que foi chamado de Feio "+contadorFeio);
		System.out.println("Probabilidade de eu ser bonito "+ contadorBonito*10+"%");
		System.out.println("Probabilidade de eu ser Feio "+ contadorFeio*10+"%");

		System.out.println();
		return 42;

	}

}
