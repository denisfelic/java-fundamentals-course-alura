package interface_produto;
import java.util.ArrayList;
import java.util.Scanner;

import interace_principal.MenuPrincipal;
import objetos.Contato;
import objetos.Estoque;
import objetos.Fornecedor;
import objetos.Produto;
import objetos.Telefone;
import validadores.Validacao;

public class InterfaceProduto {
	private static Scanner scan = new Scanner(System.in);
	public static ArrayList<Produto> array_produtos = new ArrayList<Produto>();
	
	public static void interfaceProdutos() {
		boolean flag = true;
		while (flag) {
			System.out.println("-----PRODUTOS-------");
			System.out.println("1- Vizualizar produtos cadastrados.");
			System.out.println("2- Cadastrar produtos manualmente.");
			System.out.println("3- Cadastrar produtos apartir de um arquivo.");
			System.out.println("4- Remover produtos.");
			System.out.println("5- Editar um produto.");
			System.out.println("6- Voltar.");
			System.out.println("Escolha uma das opções e pressione ENTER: ");
			int opc = scan.nextInt();
			
			if (Validacao.opcNumerica(1, 6, opc) == true) {
				escolhaMenu1(opc);	
				flag = false;
			} else {
				System.out.println("Opção invalida, digite navemente: ");
				flag = true;
			}
		}
	}
	public static void vizualizarProdutosCadastrados() {
		VizualizarProdutos.vizualizarProdutos(array_produtos);
	}

	private static void escolhaMenu1(int opc) {
		switch (opc) {
		case 1:vizualizarProdutosCadastrados();
			//vizualizarProdutos();
			break;
		case 2:
			cadastrarProdutos();
			break;
		case 3:
			InterfaceCadProdExterno.cadastrarProdutoExterno(); 
			break;
		case 4:
		//	vizualizarProdutos();
			break;
		case 5:
		//	vizualizarProdutos();
			break;
		case 6:
		  MenuPrincipal.interfaceMae();
			break;
		default:
			break;
		}

	}

	//CAD 1 
	private static void cadastrarProdutos() {
		boolean flag = true;
		while (flag == true) {
			System.out.println("Cadastrando produto manualmente.");
			Produto produto = new Produto();
			scan.nextLine(); // limpa jvm scan
			System.out.println("Digite o nome do produto: ");
			String nome = scan.nextLine();
			produto.setNome(nome);

			System.out.println("Digite o marca do produto: ");
			String marca = scan.nextLine();
			produto.setMarca(marca);

			System.out.println("Digite a categoria do produto: ");
			String categoria = scan.nextLine();
			produto.setCategoria(categoria);

			System.out.println("Digite o codigo de barras do produto ");
			int codBarras = scan.nextInt();
			produto.setCodBarras(codBarras);
			scan.nextLine(); // limpa jvm scan

			System.out.println("Digite a data da compra do produto: ");
			String dataCompra = scan.nextLine();
			produto.setDataCompra(dataCompra);

			System.out.println("Digite a descrição do produto: ");
			String descricao = scan.nextLine();
			produto.setDescricao(descricao);

			Contato contato = new Contato();
			cadastrarSacProduto(contato, produto);

		}
	}

	//CAD 2 FINAL
	private static void cadastrarProdutoPt2(Produto produto) {

		System.out.println("Digite o pais de origem do produto: ");
		String paisOrigem = scan.nextLine();
		produto.setPaisOrigem(paisOrigem);

		System.out.println("Digite o preço do produto em R$ (Apenas numeros) Separe por virgula : ");
		double preco = scan.nextDouble();
		produto.setPreco(preco);
		scan.nextLine();
		System.out.println("Digite o tipo do peso liquido do produto (Kilo | Ml| Lt's | Oz | G's | : ");
		String tipoPeso = scan.nextLine();
		produto.setTipoPeso(tipoPeso);

		System.out.println("Digite o peso/quantidade liquido do produto (Apenas numeros): ");
		int peso = scan.nextInt();
		produto.setPeso(peso);

		array_produtos.add(produto);
		System.out.println("Produto cadastrador com sucesso!");
		// validação caso o user ainda queira cadastrar mais produtos.

		String texto = "Deseja cadastrar mais um produto? [S/N]:  ";
		boolean flag = Validacao.validaSimNao(texto);
		if (flag == true) {
			array_produtos.add(produto);
			cadastrarProdutos();
			Estoque estoque = new Estoque();
			estoque.setArrayProdutos(array_produtos);

		} else {
			array_produtos.add(produto);
			Estoque estoque = new Estoque();
			estoque.setArrayProdutos(array_produtos);
			interfaceProdutos();
		}
	}

 

	// SAC
	private static void cadastrarSacProduto(Contato contato, Produto produto) {
		String texto = "Deseja castrar um SAC para o produto? S/N: ";
		boolean sacOpc = Validacao.validaSimNao(texto);

		if (sacOpc) {

			System.out.println("Digite quantos emails do contato SAC deseja cadastrar: ");
			int qtdEmails = scan.nextInt();

			System.out.println("Digite quantos telefones do contato SAC deseja cadastrar: ");
			int qtdTel = scan.nextInt();
			// scan.nextLine();
			String[] emails = new String[qtdEmails];
			for (int i = 0; i < qtdEmails; i++) {
				System.out.println("Digite o email " + (i + 1) + " : ");
				emails[i] = scan.nextLine();
			}

			Telefone[] telefones = new Telefone[qtdTel];
			for (int i = 0; i < qtdTel; i++) {
				scan.nextLine();
				System.out.println("Digite o tipo do telefone " + (i + 1) + " : ");
				String tipoTelefone = scan.nextLine();
	
				System.out.println("Digite o numero do telefone " + (i + 1) + " : ");
				String numero = scan.nextLine();
				Telefone tel = new Telefone();

				tel.setNumero(numero);
				tel.setTipoTelefone(tipoTelefone);
				telefones[i] = tel;
			}

			contato.setEmail(emails);
			contato.setTelefones(telefones);
			System.out.println("Contato SAC cadastrado com sucesso!");
			produto.setSac(contato);
			cadastrarFornecedorProduto(produto);
		} else {
			System.out.println("Retornando contato vazio, pois os dados do contato não foram preenchidos.");
			produto.setSac(contato);
			cadastrarFornecedorProduto(produto);
		}

	}

	// FORNECEDOR
	private static void cadastrarFornecedorProduto(Produto produto) {
		scan.nextLine();
		Fornecedor fornecedor = new Fornecedor();
		System.out.println("Cadastro de Fornecedor");
		System.out.println("Digite o CNPJ do fornecedor: ");
		String cnpj = scan.nextLine();
		fornecedor.setCnpj(cnpj);

		System.out.println("Digite o nome da Empresa/Fornecedor: ");
		String nomeEmpresa = scan.nextLine();
		fornecedor.setNomeEmpresa(nomeEmpresa);

		System.out.println("Digite um ID para o fornecedor: ");
		String idFornecedor = scan.nextLine();
		fornecedor.setIdFornecedor(idFornecedor);

		System.out.println("Digite o nome do responsavel pelo forneceimento: ");
		String nomeResponsavel = scan.nextLine();
		fornecedor.setNomeResponsavel(nomeResponsavel);

		System.out.println("Digite produtos que são oferecidos pelo fornecedor: ");
		String produtosOferecidos = scan.nextLine();
		fornecedor.setProdutosOferecidos(produtosOferecidos);

		produto.setFornecedor(fornecedor);
		cadastrarProdutoPt2(produto);
	}

}
