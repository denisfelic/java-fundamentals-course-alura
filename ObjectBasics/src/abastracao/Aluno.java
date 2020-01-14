package abastracao;

public class Aluno extends Pessoa {

	private String curso;
	private String rgm;
	private String notas;

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getRgm() {
		return rgm;
	}

	public void setRgm(String rgm) {
		this.rgm = rgm;
	}

	public String getNotas() {
		return notas;
	}

	public void setNotas(String notas) {
		this.notas = notas;
	}

	public String getEndereco() {
		String endr = "Endereço do Aluno: ";
		endr += super.getEndereco();
		return endr;
	}

	@Override
	public void imprimirEtiquetaEndereco() {
		// TODO Auto-generated method stub
		System.out.println("Imprimindo etiqueta do Aluno.");
		System.out.println(getEndereco());
	}
	
	

}
