package TryCatchFinally;

public class TryCatchFinally {

	public static void main(String[] args) {
		
		int[] numeros = { 4, 8, 16, 32, 64, 128 };
		int[] denominadores = { 2, 0, 4, 8, 0 };

		
		for (int i = 0; i < numeros.length; i++) {
			try {

				System.out.println(numeros[i] + " / " + denominadores[i] + " = " + numeros[i] / denominadores[i]);

			} catch (ArithmeticException e) {
			//	System.exit(0);
				System.out.println("Erro ao divir por zero");
				e.printStackTrace();
			} catch (Exception ee) {
				System.out.println("Aconteceu algum erro." + ee.getMessage());
				System.exit(0);
			}
			finally {

				System.out.println("Está linha é sempre impressa apos o try ou o catch");
			}
		}
	}
}
