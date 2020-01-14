package objetos;

public class Telefone {

	private String numero;
	private String tipoTelefone;
	
	public Telefone() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Telefone(String numero, String tipoTelefone) {
		this.numero = numero;
		this.tipoTelefone = tipoTelefone;
	}



	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTipoTelefone() {
		return tipoTelefone;
	}
	public void setTipoTelefone(String tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}

	
}
