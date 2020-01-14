package validadores;
import java.util.Scanner;

public class Validacao {

	static Scanner scan = new Scanner(System.in);

	public final static boolean validaSimNao(String texto) {
		boolean flagOpc = true;
		boolean flag=true;
		while (flagOpc) {
			System.out.println(texto);
			String opc = scan.nextLine();
			if (opc != null) {
				if (opc.equalsIgnoreCase("s")) {
					flag = true; // ele ira cadastrar mais um produto
					flagOpc = false;
				} else if (opc.equalsIgnoreCase("n")) {
					flag = false;
					flagOpc = false;
				} else {
					System.out.println("Opção invalida digite novamente.");
					flagOpc = true; // ira ficar nesse loop
				}
			}
	
		}
		return flag;
	}
	
	public final static boolean opcNumerica(int OpcMin, int OpcMax, int opcAtual) {
		boolean opcValida=false;
		
		if ( opcAtual <= OpcMax && opcAtual >= OpcMin) {
			opcValida = true;
		}
		return opcValida;
	}
	
	

}
