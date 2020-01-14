package aula3;

import aula2.DiaSemana;

public class TestEnum3 {
	 public static void main(String[] args) {
		DiaSemana[] diaSemanas= DiaSemana.values();
		//.values retorna os valores em forma de array
		
/*		for (int i=0;i<diaSemanas.length;i++) {
			System.out.println(diaSemanas[i]);
		}*/
		
		System.out.println("For melhorado");
		for (DiaSemana dia: DiaSemana.values()) {
			System.out.println(dia);
		
		}
		
		System.out.println("-----------------------------");
		System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));
		DiaSemana sexta = Enum.valueOf(DiaSemana.class, "SEXTA");
		System.out.println(sexta);
		
	}
}
