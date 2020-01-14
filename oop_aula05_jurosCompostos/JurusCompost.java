package oop_aula05_jurosCompostos;

import java.util.Scanner;

public class JurusCompost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//double x = 2.0 / 1000.0;
		//System.out.println(x);
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o valor do capital: ");
		double c = scan.nextDouble();
		System.out.print("Agora digite o valor da taxa de Juros em %, Ex:(2) equivalente a 2%: ");
		double i =  scan.nextDouble();
		 i = i/1000.0;
		System.out.print("Digite o numero de parcelas ou periodos: ");
		int n = scan.nextInt();
		double m = c * (Math.pow((1+i), n));
		// C = Capital
		// I = Taxa de Juros
		// N = Número de periodos
		// M = Montante ou resultado
		System.out.println("O resultado final dara: "+m);
		System.out.println("Valor pago de juros: R$"+(m-c));
//		
	
	}

}
