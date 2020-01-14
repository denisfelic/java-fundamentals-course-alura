package porjeto;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Concurso {

    //vamos utilizar um único ArrayLista para guardar
    //todos os candidatos e juri:
    private ArrayList todos = new ArrayList();

    public Concurso() {
        //inicialmente tirar estes dois comentários:
        //leituraDeDados();
        //salvar("c:/temp/concurso.dat",todos);

        //finalmente, pedir para carregar os dadoso do arquivo existente:
        carregar("c:/temp/concurso.dat", todos);
        mostraDadosCadastrados();
        listarCandidatos_e_Juris_de_um_genero_musical();
        //contarMulheres();
        //contarHomens();
        visualizarCandidatasEntre21e25();
    }

    public void leituraDeDados() {
        todos.add(new Candidato("101", "123.777.789-00", "Luiz Peres", 23, "Rock", 'M'));
        todos.add(new Candidato("102", "442.951.789-00", "Beth Alves", 34, "MPB", 'F'));
        todos.add(new Candidato("103", "921.991.789-00", "Manuela Pereira", 23, "Rap-Acustico", 'F'));
        todos.add(new Candidato("104", "321.726.789-00", "Endrew Bole", 22, "Rap", 'M'));
        todos.add(new Candidato("105", "215.926.789-00", "Samuel Jason", 19, "Pop", 'M'));
        todos.add(new Candidato("106", "613.756.789-00", "Victor Tilheri", 20, "Funk", 'M'));
        todos.add(new Candidato("107", "953.126.789-00", "Ana Carolina Vieira", 24, "Rock", 'F'));
        todos.add(new Candidato("108", "313.493.789-00", "Thiago Diniz", 18, "Axé", 'M'));
        todos.add(new Candidato("109", "991.431.789-00", "Douglas Costa", 33, "Funk", 'M'));

        todos.add(new Juri("Ivete Angalo", "Ivete", "Axé"));
        todos.add(new Juri("João Benedan", "João Gordo", "Rock"));
        todos.add(new Juri("Rafael Moreira", "Lil Raff", "Rap"));
        todos.add(new Juri("Larissa Macedo", "Anitta", "Pop"));
        todos.add(new Juri("Kevin Kawan", "MC Kevinho", "Funk"));
        todos.add(new Juri("Caio Nog", "Nog", "Rap-Acustico"));
        todos.add(new Juri("Francisco Buarque", "Chico Buarque", "MPB"));
    }

    public void listarCandidatos_e_Juris_de_um_genero_musical() {
        String qualGenero = JOptionPane.showInputDialog("Digite o gênero a buscar: ");
        System.out.println("\nCandidatos do gênero solicitado:");
        for (int i = 0; i < todos.size(); i++) {  //para percorrer o ArrayList dos candidatos
            if (todos.get(i) instanceof Candidato) {
                if (((Candidato) todos.get(i)).getGenero().equalsIgnoreCase(qualGenero)) {
                    System.out.println(todos.get(i).toString());
                }
            }
        }
        System.out.println("Juris do gênero solicitado:");
        for (int i = 0; i < todos.size(); i++) {  //para percorrer o ArrayList dos juri
            if (todos.get(i) instanceof Juri) {
                Juri jur = (Juri) todos.get(i);
                if (jur.getGenero().equalsIgnoreCase(qualGenero)) {
                    System.out.println(jur.toString());
                }
            }
        }

    }

    public boolean salvar(String filename, ArrayList arr) {
        //Este método gravará no arquivo filename o conteúdo do vetor de objetos
        try {
            FileOutputStream fos = new FileOutputStream(filename);
            //veja outros construtores, como: FileOutputStream(String name, boolean append) 
            ObjectOutputStream out = new ObjectOutputStream(fos);
            for (int i = 0; i < arr.size(); i++) {
                out.writeObject(arr.get(i));  //gravamos o objeto no arquivo
            }
            out.close();
            fos.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro salvando objetos... " + ex.getMessage());
            return false; //se deu algum erro, retornaremos false
        }
        return true; //deu tudo certo, retornaremos true
    } //fim do método salvar

    public boolean carregar(String filename, ArrayList arr) {
        //Este método carrega os objetos serializados gravados em 'filename' no vetor arr.
        FileInputStream fis;
        ObjectInputStream in;
        try {
            fis = new FileInputStream(filename);
            in = new ObjectInputStream(fis);
            arr.clear(); //esvaziamos o ArrayList
            boolean sair = false;
            do {
                try {
                    Object info = in.readObject(); // lê um objeto do arquivo
                    arr.add(info); // adiciona na lista o objeto lido; supondo memória suficiente
                } catch (EOFException normalEof) {
                    // EOF (end of file), situação normal => acabaram os objetos
                    sair = true;
                }
            } while (!sair);
            in.close();
            fis.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro carregando objetos... " + e.getMessage());
            return false;
        }
        return true;
    } //fim do método carregar    

    public void mostraDadosCadastrados() {
        String cad = "";
        for (int i = 0; i < todos.size(); i++) {
            cad += todos.get(i).toString() + "\n";
        }
        JTextArea outputArea = new JTextArea(15, 50);  //15 linhas e 50 colunas
        outputArea.setText(cad);
        JScrollPane rolagem = new JScrollPane(outputArea);
        JOptionPane.showMessageDialog(null, rolagem, "Dados dos candidatos e juri cadastrados",
                JOptionPane.INFORMATION_MESSAGE);
    }

    /*
    
    //Estes dois métodos precisariam verificar a classe do objeto, com
    //um if( ... instanceof ... ) antes de efetuar o casting (conversão de tipo)
    
    public void contarMulheres(){
        int qtdMulher = 0;
        for(int i = 0; i < todos.size(); i++){
            Candidato cad = (Candidato)todos.get(i);
            if(cad.getSexo() == 'F'){
                qtdMulher++;
            }
        }      
        System.out.println("A quantidade de mulheres candidatas é:" + qtdMulher + "\n");
    }
    
    public void contarHomens(){
        int qtdHomem = 0;
        for(int i = 0; i < todos.size(); i++){
            Candidato cad = (Candidato)todos.get(i);
            if(cad.getSexo() == 'M'){
                qtdHomem++;
            }
        }
        System.out.println("\nA quantidade de candidatos homens é: " + qtdHomem + "\n");
    }
     */
    
    //Elabore um método que liste os candidatos com idades entre 21 e 25 anos, do sexo F.
    public void visualizarCandidatasEntre21e25() {
        System.out.println("\nCandidatos com idades entre 21 e 25 anos, do sexo F: ");
        for (int i = 0; i < todos.size(); i++) {
            if (todos.get(i) instanceof Candidato) {
                Candidato cad = (Candidato) todos.get(i);
                if (cad.getSexo() == 'F' && cad.getIdade() >= 21 && cad.getIdade() <= 25) {
                    System.out.println(cad.toString());
                }
            }
        }
    }

}
