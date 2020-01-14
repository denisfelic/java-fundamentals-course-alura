package aula1;

public class EnumMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		imprimirDiaSemana(Enum.SEGUNDA);
		imprimirDiaSemana(Enum.TERCA);
		imprimirDiaSemana(Enum.QUARTA);
		imprimirDiaSemana(Enum.QUINTA);
		imprimirDiaSemana(Enum.SEXTA);
		imprimirDiaSemana(Enum.SABADO);
		imprimirDiaSemana(Enum.DOMINGO);

	}
	
	
	public static void imprimirDiaSemana(Enum dia) {
		switch (dia) {
		case SEGUNDA:
			System.out.println("Segunda-feira");
			break;
		case TERCA:
			System.out.println("Terca-feira");
			break;
		case QUARTA:
			System.out.println("Quarta-feira");
			break;
		case QUINTA:
			System.out.println("Quinta-feira");
			break;
		case SEXTA:
			System.out.println("Sexta-feira");
			break;
		case SABADO:
			System.out.println("Sabado");
			break;
		case DOMINGO:
			System.out.println("Domingo");
			break;
		}
	}
	
	private static void usandoEnum() {
		Enum segunda = Enum.SEGUNDA;
		Enum terca = Enum.TERCA;
		Enum quarta = Enum.QUARTA;
		Enum quinta = Enum.QUINTA;
		Enum sexta = Enum.SEXTA;
		Enum sabado = Enum.SABADO;
		Enum domingo = Enum.DOMINGO;

	}

}
