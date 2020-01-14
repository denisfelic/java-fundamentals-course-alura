package exercicio_relacionamento;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		 
		
		
		String[] nomeEmail = new String[3];
		String[] nomesAgenda = new String[3];
		String [] telefone = new String[3];
		String [] numero = new String[3];
		String[] tipoTelefone = new String[3];
		String[] ddd = new String[3];
		String[] nomeContato = new String[3];
		String[] tipoEmail = new String [3];
		
		for (int i=0; i< 3; i++) {
			System.out.println("Digite o nome da agenda n."+(i+1)+" : ");
			nomesAgenda[i] = scan.nextLine();
			
			System.out.println("Digite o nome da contato: ");
			nomeContato[i] = scan.nextLine();
			
			System.out.println("Digite tipo de Telefone n."+(i+1)+" : ");
			tipoTelefone[i] = scan.nextLine();
			
			
			System.out.println("Digite o DDD do telefone n."+(i+1)+ " : ");
			ddd[i] = scan.nextLine();
			
			System.out.println("Digite o numero do telefone n."+(i+1)+ " : ");
			numero[i] = scan.nextLine();
			
			System.out.println("Digite nome do email n."+(i+1)+ " : ");
			nomeEmail[i] = scan.nextLine();
			System.out.println("Digite tipo do email n."+(i+1)+ " : ");
			tipoEmail[i] = scan.nextLine();
		}

		Telefone[] telefones = new Telefone[3]; 
		Email[] emails = new Email[3];
		Contato[] contatos = new Contato[3];
		Agenda[] agendas = new Agenda[3];
		for (int i=0; i < 3; i++) {
			telefones[i] = new Telefone(tipoTelefone[i], ddd[i], numero[i]);
			emails[i] = new Email(nomeEmail[i], tipoEmail[i]);
		
			
			
			contatos[i] = new Contato( nomeContato[i], telefones, emails);
			
		}

		for (int i=0; i< agendas.length; i++) {
			for (int j=0; j < nomesAgenda.length; j++) {
		agendas[i] = new Agenda(contatos, nomesAgenda[j]);
			}
		}
		
		System.out.println(agendas[1]);

	}

}
