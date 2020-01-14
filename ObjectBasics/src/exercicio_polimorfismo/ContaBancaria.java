package exercicio_polimorfismo;

public  class ContaBancaria extends ModeloConta {

 

	public  void sacarDinheiro(Double valor) {
		boolean flag = true;
		if (valor <= 0 ) {
			flag=false;
		}
	
		 if (super.saldo <= 0 ) {
			flag = false;
			System.out.println("Saldo negativo, verifique seu saldo e tente novamente.");
			consultarSaldo();
		}
		
		 if (super.nomeCliente == null ) {
			 flag =false;
			 System.out.println("Não conseguimos encontrar o nome da conta, por favor verifique o nome da conta e tente novamente mais tarde.");
		 }
		
		 if (super.numConta == null) {
			 flag=false;
			 System.out.println("Numero da conta digitado incorreto ou inexistente, porfavor verifique e tente novamente.");
		 }
		 
		 if (valor > super.saldo) {
			 flag = false;
			 System.out.println("Você não tem saldo o sulficiente para realizar esta transação.");
			 consultarSaldo();
		 }
		 if (valor <= 0) {
			 System.out.println("Digite um valor maior que 0.");
			 flag=false;
		 }
		 
		
		 
		 if (flag==true) {
			 this.saldo -= valor;
			 System.out.println("Transação aprovada com sucesso.\nNovo saldo: R$"+saldo);
		 }
		 else {
			 System.out.println("Não foi possivel realizar a transação.");
		 }
		 

	}

	
	
	public void consultarSaldo() {
		System.out.println("Saldo atual: R$" + saldo);
	}



	


}
