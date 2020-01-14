package exercicio;

public enum Calculadora {

	SOMA('+'){
		@Override
		public double num(double n1, double n2) {
			Calc calc = new Calc(n1, n2);
			return 	calc.operacao('+');
		}
	}, SUB('-') {
		@Override
		public double num(double n1, double n2) {
			Calc calc = new Calc(n1, n2);
			return 	calc.operacao('-');
		}
	}, DIV('/') {
		@Override
		public double num(double n1, double n2) {
			Calc calc = new Calc(n1, n2);
			return 	calc.operacao('/');
		}
	}, MULTP('*') {
		@Override
		public double num(double n1, double n2) {
			Calc calc = new Calc(n1, n2);
			
			return 	calc.operacao('*');

		}
	};

	char operator;
	private Calculadora(char operator ) {
	this.operator = operator;
	}
	
	public abstract double num(double n1, double n2);
}
