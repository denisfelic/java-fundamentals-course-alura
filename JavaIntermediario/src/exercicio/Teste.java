package exercicio;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//forma 1
		double resultado = Calculadora.MULTP.num(10, 5);
		System.out.println(resultado);
		
		
		
		//forma 2
		double n1 = 5;
		double n2 = 3;
		
		for (FuncoesEnum op : FuncoesEnum.values()) {
			System.out.println(n1+" " +op.getOp()+" "+n2+" = "+op.multp(n1, n2));
		}
		FuncoesEnum oper = FuncoesEnum.DIV;
		System.out.println(oper);
		System.out.println("teste"+ oper.multp(n1, n2));
	}

}
