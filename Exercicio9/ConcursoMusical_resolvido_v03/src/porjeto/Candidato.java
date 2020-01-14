package porjeto;

import java.io.Serializable;

public class Candidato implements Serializable {
    
    private String numeroCandidato, cpf, nomeCandidat;
    private int idade;
    private String genero;
    private char sexo;

    public Candidato(String numeroCandidato, String cpf, String nomeCandidat, int idade, String genero, char sexo) {
        this.numeroCandidato = numeroCandidato;
        this.cpf = cpf;
        this.nomeCandidat = nomeCandidat;
        this.idade = idade;
        this.genero = genero;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return getNomeCandidat() + ", gênero: " + getGenero() 
                + ", sexo: " + getSexo() + ", idade: " + getIdade(); 
    }

    public String getNumeroCandidato() {
        return numeroCandidato;
    }

    public void setNumeroCandidato(String numeroCandidato) {
        this.numeroCandidato = numeroCandidato;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomeCandidat() {
        return nomeCandidat;
    }

    public void setNomeCandidat(String nomeCandidat) {
        this.nomeCandidat = nomeCandidat;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    
}
