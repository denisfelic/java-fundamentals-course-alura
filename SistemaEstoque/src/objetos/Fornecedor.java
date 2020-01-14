package objetos;
public class Fornecedor {
	private String cnpj;
	private String nomeEmpresa;
	private String nomeResponsavel;
	private Contato[] contato;
	private String ramo;
	private String produtosOferecidos;
	private String idFornecedor;
	
	
	public String getIdFornecedor() {
		return idFornecedor;
	}
	public void setIdFornecedor(String idFornecedor) {
		this.idFornecedor = idFornecedor;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	public String getNomeResponsavel() {
		return nomeResponsavel;
	}
	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}
	public Contato[] getContato() {
		return contato;
	}
	public void setContato(Contato[] contato) {
		this.contato = contato;
	}
	public String getRamo() {
		return ramo;
	}
	public void setRamo(String ramo) {
		this.ramo = ramo;
	}
	public String getProdutosOferecidos() {
		return produtosOferecidos;
	}
	public void setProdutosOferecidos(String produtosOferecidos) {
		this.produtosOferecidos = produtosOferecidos;
	}

		
	
}
