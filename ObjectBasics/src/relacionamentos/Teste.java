package relacionamentos;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Contato contato = new Contato();
		contato.setNome("Tyrion");
		// contato.setEndereco("Kings Landing");

		Telefone tel = new Telefone();

		tel.setDdd("11");
		tel.setNumero("2313323");
		tel.setTipo("celular");

		Telefone tel1 = new Telefone();

		tel1.setDdd("11");
		tel1.setNumero("111999");
		tel1.setTipo("residencial");

		
		Telefone[] telefones = new Telefone [2];
		telefones[0] = tel;
		telefones[1] = tel1;
		
		contato.setTelefone(telefones);
		

		// criar endereço
		Endereco end = new Endereco();
		end.setNomeRua("Game of Thrones");
		end.setNumero("n/a");
		end.setComplemento("-");
		end.setCidade("Kings Landing");
		end.setEstado("Westeros");
		end.setCep("4325-434");
 

 		contato.setEndereco(end);

		System.out.println(contato.getNome());

		// garante mais segurança
		if (contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade());
		}
		//da pra fazer isso
		Telefone t1 = telefones[0];
		
		if (contato != null && contato.getEndereco() != null) {
			
			
			//aqui utilizamos o for each
			for (Telefone t : telefones) {
				System.out.println(t.getTipo() +" "+t.getDdd() + " "+t.getNumero());
			}
		
		}
		
		
		
		
		
		
		
		

		boolean teste = true;
		// teste
		if (contato != null && teste) {
			System.out.println(teste);
		}
	}

}
