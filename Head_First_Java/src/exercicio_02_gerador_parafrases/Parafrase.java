
package exercicio_02_gerador_parafrases;

public class Parafrase {

	public static void main(String[] args) {

		String[] substantivos = { "carro", "tomada", "mochila", "pizza", "batom", "fogão", "praia", "coca-cola" };
		String[] verbos = { "dirigi", "tomei", "comi", "bebi", "pilotei", "limpei", "fiz", "ensinei" };
		String[] pronomes = { "eu", "voce", "ela", "nós", "eles", "elas", "ele" };

		System.out.println("As frases formadas foram: ");

		for (int i = 1; i < 23; i++) {
			int tamanhoPalavraUm = (int) (substantivos.length * Math.random());
			int tamanhoPalavraDois = (int) (verbos.length * Math.random());
			int tamanhoPalavraTres = (int) (pronomes.length * Math.random());
			String palavra1 = substantivos[tamanhoPalavraUm];
			String palavra2 = verbos[tamanhoPalavraDois];
			String palavra3 = pronomes[tamanhoPalavraTres];
			System.out.println(palavra1 +" "+ palavra2 +" "+ palavra3);
			for (int j = 1; j < 23; j++) {
				tamanhoPalavraUm = (int) (substantivos.length * Math.random());
				tamanhoPalavraDois = (int) (verbos.length * Math.random());
				tamanhoPalavraTres = (int) (pronomes.length * Math.random());
				palavra1 = substantivos[tamanhoPalavraUm];
				palavra2 = verbos[tamanhoPalavraDois];
				palavra3 = pronomes[tamanhoPalavraTres];
				System.out.println(palavra1 +" "+ palavra3 +" "+ palavra2);
				for (int k = 1; k < 23; k++) {
					tamanhoPalavraUm = (int) (substantivos.length * Math.random());
					tamanhoPalavraDois = (int) (verbos.length * Math.random());
					tamanhoPalavraTres = (int) (pronomes.length * Math.random());
					palavra1 = substantivos[tamanhoPalavraUm];
					palavra2 = verbos[tamanhoPalavraDois];
					palavra3 = pronomes[tamanhoPalavraTres];
					System.out.println(palavra2 +" "+ palavra1 +" "+ palavra3);
					for (int l = 1; l < 23; l++) {
						tamanhoPalavraUm = (int) (substantivos.length * Math.random());
						tamanhoPalavraDois = (int) (verbos.length * Math.random());
						tamanhoPalavraTres = (int) (pronomes.length * Math.random());
						palavra1 = substantivos[tamanhoPalavraUm];
						palavra2 = verbos[tamanhoPalavraDois];
						palavra3 = pronomes[tamanhoPalavraTres];
						System.out.println(palavra2 +" "+ palavra3 +" "+ palavra1);
						for (int m = 1; m < 23; m++) {
							tamanhoPalavraUm = (int) (substantivos.length * Math.random());
							tamanhoPalavraDois = (int) (verbos.length * Math.random());
							tamanhoPalavraTres = (int) (pronomes.length * Math.random());
							palavra1 = substantivos[tamanhoPalavraUm];
							palavra2 = verbos[tamanhoPalavraDois];
							palavra3 = pronomes[tamanhoPalavraTres];
							System.out.println(palavra3 + " "+ palavra1 + " "+ palavra2);
							for (int n = 1; n < 23; n++) {
								tamanhoPalavraUm = (int) (substantivos.length * Math.random());
								tamanhoPalavraDois = (int) (verbos.length * Math.random());
								tamanhoPalavraTres = (int) (pronomes.length * Math.random());
								palavra1 = substantivos[tamanhoPalavraUm];
								palavra2 = verbos[tamanhoPalavraDois];
								palavra3 = pronomes[tamanhoPalavraTres];
								System.out.println(palavra3+" " + palavra2 +" "+ palavra1);

							}
						}
					}
				}
			}
		}

	}

}
