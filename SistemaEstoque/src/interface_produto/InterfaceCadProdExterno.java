package interface_produto;

import java.util.Scanner;

import leituras_arquivos_externos.LeituraJson;
import validadores.Validacao;

public class InterfaceCadProdExterno {

	public static void cadastrarProdutoExterno() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Selecione o tipo de arquivo que deseja carregar.");
		System.out.println("1 - JSON");
		System.out.println("2 - XML");
		System.out.println("3 - Voltar");
		int opc = scan.nextInt();
		boolean flag = Validacao.opcNumerica(1, 3, opc);
		if (!flag) {
			System.out.println("Opção invalida, digite novamente");
		} else {
			switch (opc) {
			case 1:
				carregarJSON();

				break;
			case 2:
				System.out.println("XML em construção");
				System.exit(0);
				break;
			case 3:
				InterfaceProduto.interfaceProdutos();

			default:
				break;
			}
		}
	}
	
	public static void carregarJSON() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Você escolheu carregar arquivo apartir de um arquivo .JSON");
		System.out.println("Informe o caminho do arquivo Ex.(\"d:/Users/Desktop/produtos.json\" )");
		System.out.println("Digite : ");
		String caminho = scan.nextLine();
		if (caminho != null) {
			LeituraJson.lerProdutoJSON(caminho);
		}

	}
}
