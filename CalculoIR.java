
public class CalculoIR {
	public static void main(String[] args) {

		double salario = 4000.0;
		double salario2 = 30000;
		System.out.println(salario);
		System.out.println(salario2);

		/*
		 * sempre colocar o ponto no double para evitar esse tipo de problema.
		 */

		if (salario > 1900 && salario < 2800) {
			salario *= 0.0750;
			System.out.println("7.5% de imposto sobre seu " + "salario, valor: " + salario);
		} else if (salario >= 2800 && salario < 3751) {
			salario *= 0.15;
			System.out.println("15% de imposto sobre seu " + "salario, valor: " + salario);
		} else if (salario >= 3751 && salario < 4664) {
			salario *= 0.225;
			System.out.println("22.5% de imposto sobre seu " + "salario, valor: " + salario);
		}else if ( salario < 1900) {
			System.out.println("Salario não valido");
		}
			else {
				System.out.println("Ganha bem em");
			}
		}

	
		
	}

