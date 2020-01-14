
public class LacosDois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int linha = 0; linha < 5; linha++) {
			for (int coluna = 0; coluna < 5; coluna++) {
				if (coluna > linha) {
					break;
				}
				System.out.print(coluna+1);
			}
			System.out.println();
		}
	
		for (int linha = 0; linha < 5; linha++) {
			for (int coluna = 0; coluna < 5; coluna++) {
				if (coluna > linha) {
					break;
				}
				System.out.print(++coluna);
			}
			System.out.println();
		}
		
		int num1 = 0;
		int num2 = 0;
		
		System.out.println(num1 +" n1 | n2 "+ num2);
		++num1;
		num2+=1;
		System.out.println(num1 +" n1 | n2 "+ num2);

	
		for (int cont =3; cont < 100; cont++) {
			if (cont % 3 == 0) {
				System.out.println(cont);
			}
		}
		
		for (int div3=3; div3 < 100; div3+=3) {
			System.out.println(div3);
		}
	}
	
	

}
