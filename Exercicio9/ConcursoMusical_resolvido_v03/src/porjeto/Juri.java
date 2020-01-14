package porjeto;

import java.io.Serializable;

public class Juri implements Serializable {
    private String nome, nomeArtistico, genero;

    public Juri(String nome, String nomeArtistico, String genero) {
        this.nome = nome;
        this.nomeArtistico = nomeArtistico;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return getNome() + ", nome: " + getNomeArtistico() + ", gênero: " + getGenero();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeArtistico() {
        return nomeArtistico;
    }

    public void setNomeArtistico(String nomeArtistico) {
        this.nomeArtistico = nomeArtistico;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
}
