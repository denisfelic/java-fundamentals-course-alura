package aula4;

public enum TipoDocumento {
	CPF {
		@Override
		public String geraNumeroTeste() {
			// TODO Auto-generated method stub
			GeraCPF cpf = new GeraCPF();
			return cpf.cpf();
		}
	}, CNPJ {
		@Override
		public String geraNumeroTeste() {
			// TODO Auto-generated method stub
			GeraCPF cnpj = new GeraCPF();

			return cnpj.cnpj();
		}
	};
	
	public abstract String geraNumeroTeste();
}
