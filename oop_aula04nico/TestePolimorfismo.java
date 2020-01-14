package oop_aula04nico;

public class TestePolimorfismo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Gerente gerenteDenoca = new Gerente();
		EditorDeVideo editor = new EditorDeVideo();
		
		ContadorDeBonificacoes contador = new ContadorDeBonificacoes();
		
		System.out.println("Valor bonificação Gerente: "+gerenteDenoca.getBonificacao());
		System.out.println("Valor bonificação Editor: "+editor.getBonificacao());
		
		contador.registrarNovaBonificacao(gerenteDenoca);
		contador.registrarNovaBonificacao(editor);
		System.out.println("Total gasto com bonificações: "+contador.getValorTotalBonificacoes());
		System.out.println("Total de funcionarios: "+contador.getNumeroDeFuncionariosQueRecebemAuxilio());
		
		
		Funcionario funcionarioGenerico = gerenteDenoca;
		System.out.println("Teste  :"+funcionarioGenerico.getBonificacao());
	}

}
