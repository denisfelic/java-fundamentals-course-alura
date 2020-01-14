package enigmaatletasartistas;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class EnigmaAtletasArtistas {

    private ArrayList arrayObj = new ArrayList();

    public static void main(String[] args) {
        new EnigmaAtletasArtistas();

    }

    public EnigmaAtletasArtistas() {
        carregarArquivo("D://Faculdade//POO//Exercicio9/EnigmaPessoas.dat");    // mudar diretorio do arquivo para o seu local.
        mostrarPessoasCadastradas();
        separarArtistas();
    }

    public void mostrarPessoasCadastradas() {
        String obj = "";
        for (int i = 0; i < arrayObj.size(); i++) {
            obj += arrayObj.get(i).toString() + "\n";
        }
        System.out.println("Pessoas cadastradas:\n" + obj);
    }

    public void carregarArquivo(String arquivo) {
        //Este método carrega os objetos serializados gravados em 'filename' no vetor arrlist
        FileInputStream file;
        ObjectInputStream objDecode;
        try {
            file = new FileInputStream(arquivo); //Ex: (C:/Usuarios/Denis/Desktop/arquivo.dat)
            objDecode = new ObjectInputStream(file);
            arrayObj.clear(); //esvaziamos o ArrayList
            boolean sair = false;
            do {
                try {

                    Object info1 = objDecode.readObject(); // lê um objeto do arquivo
                    arrayObj.add(info1); // adiciona na lista o objeto lido
                } catch (EOFException normalEof) {
                    // EOF (end of file), situação normal => acabaram os objetos
                    sair = true;
                    System.out.println("Sem objetos");
                }
            } while (!sair);
            objDecode.close();
            file.close();
            System.out.println("Objeto lido com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar objetos: " + e.getMessage());

        }

    }

    public void separarArtistas() {       
        String artistaRock = "";
        String artistaSertanejo = "";
        for (int i = 0; i < arrayObj.size(); i++) {
            if (arrayObj.get(i) instanceof Artista) {
                Artista gen = (Artista) arrayObj.get(i);
                if (gen.getGeneroprincipal().equalsIgnoreCase("rock")) {
                    artistaRock += gen.getNomeartistico() + "\n";
                } else if (gen.getGeneroprincipal().equalsIgnoreCase("sertanejo")) {
                    artistaSertanejo += gen.getNomeartistico() + "\n";
                }
            }
        }
        if (artistaRock.length() == 0) {
            System.out.println("Nenhum artista do genero Rock foi encontrado");
        } else if (artistaSertanejo.length() == 0) {
            System.out.println("Nenhum artista do genero Sertanejo foi encontrado");
        } else {
            System.out.println("Artistas & Bandas do Sertanejo: \n" + artistaSertanejo);
            System.out.println("Artistas & Bandas do Rock: \n" + artistaRock);

        }
    }

}
