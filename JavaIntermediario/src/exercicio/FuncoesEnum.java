package exercicio;

public enum FuncoesEnum {

	SOMA('+') {
		@Override
		double multp(double n1, double n2) {
			// TODO Auto-generated method stub
			return n1+n2;
		}
	}, SUB('-') {
		@Override
		double multp(double n1, double n2) {
			// TODO Auto-generated method stub
			return n1-n2;
		}
	}, DIV('/') {
		@Override
		double multp(double n1, double n2) {
			// TODO Auto-generated method stub
			return n1/n2;
		}
	}, MULTP('*') {
		@Override
		double multp(double n1, double n2) {
			// TODO Auto-generated method stub
			return n1*n2;
		}
	};
	
	 FuncoesEnum(char op) {
		this.op = op;
	}
	 
	 private char op;
	 
	 public char getOp(){
		 return op;
	 }
	 
	abstract double multp (double n1, double n2);  
}
