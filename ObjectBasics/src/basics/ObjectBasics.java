package basics;

import java.util.ArrayList;
import java.util.Scanner;

public class ObjectBasics {
	static int cont =0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello World!");

	
		int [] num = new int [10];
		num[5] = 2;
		Carro.carro(num);
		
		ArrayList x = new ArrayList();
		ArrayList y = new ArrayList();
		
		System.out.println("-------");
		int somaStatic = Carro.calcular(1, 2);
		System.out.println(somaStatic);
		cont++;
	}
	
	int contador() {
		cont++;
		return 1;
	}

}
