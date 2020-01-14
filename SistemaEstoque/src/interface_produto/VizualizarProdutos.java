package interface_produto;

import java.util.ArrayList;
import java.util.Scanner;

import objetos.Produto;
import validadores.Validacao;

public class VizualizarProdutos {
	private static Scanner scan = new Scanner(System.in);

	public static void vizualizarProdutos(ArrayList arrayListProdutos) {
		Produto[] produtos = new Produto[arrayListProdutos.size()];

		if (arrayListProdutos.size() != 0) {

			boolean flag = true;
			while (flag) {
				/*
				 * private double preco; private String dataCompra; private String categoria;
				 * private String nome; private String descricao; private String marca; private
				 * String idProduto; private int codBarras; private String paisOrigem; private
				 * Contato sac; private double peso; private String tipoPeso; private Fornecedor
				 * fornecedor;
				 */
				System.out.println("1- Vizualizar por Nome");
				System.out.println("2- Vizualizar por Categoria");
				System.out.println("3- Vizualizar por Marca");
				System.out.println("4- Vizualizar por ID do produto");
				System.out.println("5- Vizualizar por Codigo de barras");
				System.out.println("6- Vizualizar por Fornecedor");
				System.out.println("7- Vizualizar por Pais de origem");
				System.out.println("8- Vizualizar todos os Produtos.");
				System.out.println("9- Voltar");
				System.out.println("Digite uma das opções : ");
				int opcAtual = scan.nextInt();

				if (Validacao.opcNumerica(1, 9, opcAtual)) {
						opcoesVizualizacao(opcAtual, arrayListProdutos);
						// chama o metodo opções

					
				} else {
					flag = true;
				}
			}
		} else {
			System.out.println("Nenhum produto cadastrado até o momento. \nPressione alguma tecla para retornar: ");
			scan.nextLine();
			InterfaceProduto.interfaceProdutos();
		}
	}

	private static void opcoesVizualizacao(int opc, ArrayList arrayListProdutos) {
		switch (opc) {
		case 1: vizulizarTodosProdutos(arrayListProdutos); // chama

			break;

		default:
			break;
		}
	}

	private static void produtosPorNome(Produto[] produtos) {
		String nomesProdutos = "PRODUTOS POR NOME\n";
		for (int i = 0; i < produtos.length; i++) {
			nomesProdutos += (i + 1) + " - NOME:  " + produtos[i].getNome() + " | CODIGO: "
					+ produtos[i].getCodBarras();
		}
		System.out.println(nomesProdutos);
		scan.nextLine();

	}

	 static void vizulizarTodosProdutos(ArrayList arrayProdutos) {
		System.out.println("Produtos Cadastrados: | ");
		String prodNome="";
		Produto prod = new Produto();
		for (int i = 0; i < arrayProdutos.size(); i++) {
			if (arrayProdutos.get(i) instanceof Produto) {
				prod = (Produto) arrayProdutos.get(i);
				System.out.println("Produto -"+(i+1));
				prodNome += (i+1)+"-"+ prod.getNome() +" | Marca: "+prod.getMarca()+" | Categoria: " +prod.getCategoria()+" | ID: "+prod.getIdProduto()+
						 " | DataCompra: "+""+prod.getDataCompra()+" | Cod Barra: "+prod.getCodBarras()+"\n";
				  
			}
		}
		System.out.println(prodNome);
		scan.nextInt();
	}
}
