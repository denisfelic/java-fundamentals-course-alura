package objetos;

public class Cliente extends Pessoa {
	
	private Endereco[] enderecos;
	private String senha;
	private String idCliente;
	private Cartao[] cartoes;
	
	
	
	public Endereco[] getEnderecos() {
		return enderecos;
	}
	public void setEnderecos(Endereco[] enderecos) {
		this.enderecos = enderecos;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
	public Cartao[] getCartoes() {
		return cartoes;
	}
	public void setCartoes(Cartao[] cartoes) {
		this.cartoes = cartoes;
	}
	
	
}
