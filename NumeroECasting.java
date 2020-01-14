import com.sun.javadoc.Type;

public class NumeroECasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Olá Mundo!");
	
		double doublow = 1;
		int inteiro = 2;
		float floati = 3;
		long longo =0;
		
		doublow = floati;
	//	floati = doublow; erro
	//	inteiro = floati; erro
		doublow = floati;
		
		doublow = longo;
		short curta = 0;
		doublow = curta;
		
	//	longo = doublow; erro
		
		/*dara valor errado, (2.0) e não (2.5) pois ele primeiro efetua a conta(no modo "tipo inteiro "
		e só depois que atribui ao tipo double) fazendo  com que o valor dê o mesmo que de um tipo inteiro.*/
		double resultadoDivisao = 5 /2;
		System.out.println(resultadoDivisao);
		float resultadoDivisaoDois = 5/2;
		System.out.println(resultadoDivisaoDois);
		
		
		// Fazendo desta forma já não temos esse tipo de problema
		double x = 2;
		double y = 5;
		System.out.println("Resultado conta double : "+ (y/x));
		
		// ou assim;
		double resultadoContaCorretaDouble =  5.0 / 2;
		System.out.println("Resultado correto double 2 : "+ resultadoContaCorretaDouble);
		
		long numeroLong = 2424224242424323230l;
		
		double valor1 = 0.1;
		double valor2 = 0.2;
		System.out.println(valor1+valor2);
		
		double numeroDouble = 3.35;
		int numeroInteiro = 2;
		System.out.println("Valores normais D: "+numeroDouble+ ", I: "+numeroInteiro);
		numeroInteiro = (int) numeroDouble;
		
		System.out.println("Numero tipo double convertido para inteiro: "+ numeroInteiro);
		System.out.println("Numero tipo double convertido para inteiro: "+numeroInteiro);
		numeroDouble =  numeroInteiro;
		System.out.println("Numero tipo inteiro convertido para double: "+numeroDouble);
		
		System.out.println("############################################");
		 double salario = 1270.50;
	        int valor = 3;
	        valor += (int) salario;
	        System.out.println(valor);
	        
	        
	        float valorFloat1 = 0.1f;
	        float valorFloat2 = 0.2f;
	        float resultadoSomaFloat = valorFloat1+valorFloat2;
	        System.out.println(resultadoSomaFloat);
	}

}
