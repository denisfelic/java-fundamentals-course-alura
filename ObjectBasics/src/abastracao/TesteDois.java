package abastracao;

import java.util.Arrays;

public class TesteDois {

	public static void main(String[] args) {
		Aluno aluno2 = new Aluno();
		Aluno aluno1 = new Aluno();
		System.out.println(aluno2.equals(aluno1));
		System.out.println();
		String[] notas = new String[3];
		notas[0] = "teste";
		System.out.println(Arrays.toString(notas));
	}

}
