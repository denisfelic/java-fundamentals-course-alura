package aula4;

public class Pessoa {

	private TipoDocumento tipoDoc;
	private String numeroDoc;
	
	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Pessoa(TipoDocumento tipoDoc, String numeroDoc) {
		super();
		this.tipoDoc = tipoDoc;
		this.numeroDoc = numeroDoc;
	}
	public TipoDocumento getTipoDoc() {
		return tipoDoc;
	}
	public void setTipoDoc(TipoDocumento tipoDoc) {
		this.tipoDoc = tipoDoc;
	}
	public String getNumeroDoc() {
		return numeroDoc;
	}
	public void setNumeroDoc(String numeroDoc) {
		this.numeroDoc = numeroDoc;
	}

	@Override
	public String toString() {
		return "Pessoa [tipoDoc=" + tipoDoc + ", numeroDoc=" + numeroDoc + "]";
	}
 
	
	
	 
	
}
