package aula2;

public class Formulario {
	
	enum Genero {
		FEMININO('F') , MASCULINO('M');
		
		private char valor;
		
		Genero(char valor){
			this.valor = valor;
		}
		
		 public char getValor() {
			 return this.valor;
		 }
	}
	
	private String nome;
	private Genero genero;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	public Formulario() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
