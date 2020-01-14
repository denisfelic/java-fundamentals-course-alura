package interace_principal;
import java.util.Scanner;

import interface_produto.InterfaceProduto;
import objetos.Estoque;
import validadores.Validacao;

public class MenuPrincipal {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estoque estoque = new Estoque();

		interfaceMae();

	}

	public static void interfaceMae() {
		boolean flag = true;
		while (flag) {
			System.out.println("-----SISTEMA DE ESTOQUE-------");
			System.out.println("1- Produtos");
			System.out.println("2- Vendas");
			System.out.println("3- Clientes");
			System.out.println("4- Fornecedores");
			System.out.println("5- Ajuda");
			System.out.println("6- Sair");
			System.out.println("Escolha uma das opções e pressione ENTER: ");
			int opc = scan.nextInt();

			if (Validacao.opcNumerica(1, 7, opc) == true) {
				escolhaMenuPrincipal(opc);
			} else {
				System.out.println("Opção invalida, digite navemente: ");
				flag = true;
			}
		}
	}

	private static void escolhaMenuPrincipal(int opc) {
		if (opc >= 1 && opc < 7) {
			switch (opc) {
			case 1:
				InterfaceProduto.interfaceProdutos();

				break;

			default:
				break;
			}
		}
	}

}
