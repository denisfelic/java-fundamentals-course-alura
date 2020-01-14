package interfaces;

public abstract class Animal {

	 private String nome;
	
	abstract String emitirSom();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Animal [nome=" + nome + ", emitirSom()=" + emitirSom() + ", getNome()=" + getNome() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
