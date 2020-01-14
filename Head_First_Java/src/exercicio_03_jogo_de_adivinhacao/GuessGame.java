package exercicio_03_jogo_de_adivinhacao;

public class GuessGame {
	private Player p1 = new Player();
	private Player p2 = new Player();
	private Player p3 = new Player();
	private boolean rodando = true;
	private boolean aprovadoParaIniciar = false;

	public GuessGame() {
		// TODO Auto-generated constructor stub
	}
	public GuessGame(String nome1, String nome2, String nome3) {
		if (nome1 != null && nome2 != null && nome3 != null) {
		this.p1.setNome(nome1);
		this.p2.setNome(nome2);
		this.p3.setNome(nome3);
		this.aprovadoParaIniciar = true;
		}
	
	
	}

	public void startGame() {
		if (this.aprovadoParaIniciar) {
			boolean game = true;
			while (game) {
				p1.setPalpite((int) (Math.random() * 9));
				p2.setPalpite((int) (Math.random() * 9));
				p3.setPalpite((int) (Math.random() * 9));
				int numeroGerado = (int) (Math.random() * 9);
				String vencedor = verificaVencedor(p1, p2, p3, numeroGerado);
				System.out.println(vencedor);
				game = rodando;
			}

		} else {
			System.out.println("Todos os nomes dos player devem ser validos para que possa iniciar o jogo.\n ");
		}
	}

	private String verificaVencedor(Player pl1, Player pl2, Player pl3, int numeroGerado) {
		String palpites = "Nome: " + pl1.getNome() + "Palpite: " + p1.getPalpite();
		palpites += "\nNome: " + pl2.getNome() + "Palpite: " + p2.getPalpite();
		palpites += "\nNome: " + pl3.getNome() + "Palpite: " + p3.getPalpite();
		boolean houveVendedor = false;
		int numeroDeVencedores = 0;
		String vencedor = "";
		String fraseVencedores;
		
		if (pl1.getPalpite() == numeroGerado) {
			vencedor +=  pl1.getNome() + " Palpite: " + pl1.getPalpite()+"\n";
			houveVendedor = true;
			numeroDeVencedores++;
		}
		if (pl2.getPalpite() == numeroGerado) {
			vencedor +=  pl2.getNome() + " Palpite: " + pl2.getPalpite()+"\n";
			houveVendedor = true;
			numeroDeVencedores++;

		}
		if (pl3.getPalpite() == numeroGerado) {
			vencedor += pl3.getNome() + " Palpite: " + pl3.getPalpite()+"\n";
			houveVendedor = true;
			numeroDeVencedores++;

		}
		if (houveVendedor == false) {
			fraseVencedores = "\n#########################\nNumero gerado: "+numeroGerado+"\nNenhum dos participantes acertaram!!!\n" + palpites + "\nPalpitem novamente.";
		} else if (numeroDeVencedores > 1) {
			fraseVencedores = "\n#########################\nNumero gerado: "+numeroGerado+"\nTemos um empate, ambos jogares acertaram: \n" + vencedor + "" + "\n" + palpites+"\nPalpitem novamente.";
		} else {
			fraseVencedores = "\n#########################\nNumero gerado: "+numeroGerado+"\nTemos um vencedor " + vencedor + "\n" + palpites+"\nFim do jogo.";
			this.rodando = false;
		}

		return fraseVencedores;
	}

	
}
