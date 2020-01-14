package exercicio;

public class Calc {
	private double num1, num2, resultado;
	private char ultimaOp;
	
	public Calc(double num1, double num2) {
	 this.num1 = num1;
	 this.num2 = num2;
	}
	
	public Calc() {
		// TODO Auto-generated constructor stub
	}
	
	public double op2(double n1, double n2, char op) {
		this.num1 = n1;
		this.num2 = n2;
		this.ultimaOp = op;
		
		switch (op) {
		case '+':
			this.resultado = num1+num2;
			this.ultimaOp = op;
			return resultado;
		case '-':
			this.resultado = num1-num2;
			this.ultimaOp = op;
			return resultado;
		case '/':
			this.resultado = num1/num2;
			this.ultimaOp = op;
			return resultado;
		case '*':
			this.resultado = num1*num2;
			this.ultimaOp = op;
			return resultado;
			default :
				System.out.println("Operação invalida");
				return 0;
		}
		
		
	}
	
	public double operacao(char op) {
		
		
		switch (op) {
		case '+':
			this.resultado = num1+num2;
			this.ultimaOp = op;
			return resultado;
		case '-':
			this.resultado = num1-num2;
			this.ultimaOp = op;
			return resultado;
		case '/':
			this.resultado = num1/num2;
			this.ultimaOp = op;
			return resultado;
		case '*':
			this.resultado = num1*num2;
			this.ultimaOp = op;
			return resultado;
			default :
				System.out.println("Operação invalida");
				return 0;
		}
		
		
	}
	
	


	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public char getUltimaOp() {
		return ultimaOp;
	}

	public void setUltimaOp(char ultimaOp) {
		this.ultimaOp = ultimaOp;
	}

	@Override
	public String toString() {
		return "Calc [num1=" + num1 + ", num2=" + num2 + ", resultado=" + resultado + ", ultimaOp=" + ultimaOp + "]";
	}
	
	
}
