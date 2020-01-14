package abastracao;

import java.util.Scanner;


public class Abstract_Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		//Pessoa pessoa = new Pessoa();
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		String[] etiquetas = new String[2];
		
		
	/*	for (int i=0; i< etiquetas.length; i++) {
			System.out.println("Digite o CPF da pessoa "+(i+1));
			pessoa.setCpf(scan.nextLine());
			etiquetas[i] = "CPF: " +pessoa.getCpf();
			
			System.out.println("Digite o nome da pessoa "+(i+1));
			pessoa.setNome(scan.nextLine());
			etiquetas[i] += "\nNome: "+pessoa.getNome();
			
		}
		
		System.out.println(	pessoa.getNome());
		System.out.println(pessoa.getEndereco());
		System.out.println("------PESSOAS-----");
		

		for (String pess : etiquetas ) {
			System.out.println(pess);
		}*/
		
		
		//pessoa.setEndereco("Rua 23");
		aluno.setEndereco("Rua 43");
		professor.setEndereco("Av 323");
		
		//System.out.println(pessoa.getEndereco());
		
		aluno.imprimirEtiquetaEndereco();
		professor.imprimirEtiquetaEndereco();
		
		Pessoa p = new Aluno();
		p.imprimirEtiquetaEndereco(); 
		
		System.out.println(Constantes.NOME_SITE);
	}

}
