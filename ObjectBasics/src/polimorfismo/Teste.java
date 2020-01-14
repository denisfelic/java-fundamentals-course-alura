package polimorfismo;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
	
		//UPCASTING
		
		Aluno aluno = new Aluno();
		aluno.getCurso();
		
		Pessoa alunoPessoa0 = aluno; //upcasting
		// é o mesmo que	
		Pessoa alunoPessoa1 = new Aluno(); //upcasting
		// que tbm é o mesmo que
		Pessoa alunoPessoa2 = (Pessoa) new Aluno();//upcasting
		
		// DOWNCASTING
		Object obj1 = "sadad";//objeto rece um obj de  string
		String s1 = (String) obj1;
		System.out.println("Downcast - "+s1);
		
		
		Pessoa pessoaAluno1 = new Pessoa(); 
		//já este exemplo aqui ira dar erro
	//	Aluno aluno1 =  (Aluno) pessoaAluno1;
		
		
		//INSTANCE OFF
		if (pessoaAluno1 instanceof Pessoa) {
			System.out.println("pessoaAluno1 instanceof Pessoa");
		}
		
		if ( alunoPessoa0 instanceof Aluno) {
			System.out.println("alunoPessoa0 instanceof Aluno");
		}
		if ( alunoPessoa0 instanceof Pessoa) {
			System.out.println("alunoPessoa0 instanceof Pessoa");
		}
		if ( alunoPessoa0 instanceof Professor) {
			System.out.println("alunoPessoa0 instanceof Professor");
		}
	}

}
