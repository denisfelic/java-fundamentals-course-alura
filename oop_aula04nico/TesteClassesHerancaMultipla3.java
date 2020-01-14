package oop_aula04nico;

public class TesteClassesHerancaMultipla3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Gerente g = new Gerente(11111);
//		System.out.println(g.getSalario());
//		g.setSenha(44);
//		g.setSenha(2343);
//		System.out.println(g.autentificaUser(2343));
//		System.out.println(g.autentificaUser(99999));
//		
//		
//		Autentifica aut = new Gerente(2220);
//		aut.setSenha(99);
//		System.out.println(aut.autentificaUser(9));//senha errada da false
//		
//		Autentifica autentico = new Administrador(0);
//		autentico.setSenha(111); 
//		System.out.println(autentico.autentificaUser(111)); // senha correta da true
//		

		Gerente gerente = new Gerente();
		gerente.setSenha(1234);
		
		System.out.println(gerente.getSenha());
		System.out.println(gerente.verificarLogin());
		
		gerente.setSenha(222);
		System.out.println(gerente.verificarLogin());
		System.out.println("###############");
		
		Administrador admin = new Administrador();
		admin.setSenha(1234);
		
		System.out.println(admin.getSenha());
		System.out.println(admin.verificarLogin());
		
		admin.setSenha(222);
		System.out.println(admin.verificarLogin());
	
	}

}
