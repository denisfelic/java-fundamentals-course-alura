/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expetion;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Denis
 */
public class Expetion {

    public Casa c1 = new Casa();
    public ArrayList arrayObj = new ArrayList();
    public ArrayList arrayObj2 = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Expetion expetion = new Expetion();
    }

    public Expetion() {
     //   criarObjeto();
      //  serializar();
      descerealizar();
        mostra();

    }

    public void criarObjeto() {

        c1.setCep("ANALISTA DE SISTEMAS");
        c1.setCor("TESTE DE SERIALIZAÇÃO");
        c1.setDono("DENIS FELICIANO DA SILVA");
        c1.setId(21978867);
        arrayObj.add(c1);
        arrayObj.add(new Casa("CASA", "JARDIM ST ANTONIO", "11959750397", 11));
        salvar("C:/Users/denis/Desktop/denis.dat", arrayObj);
    }

    public void serializar() {

        /*   try {     //metodo simples
            ObjectOutputStream encoder = new ObjectOutputStream(
                    new FileOutputStream("C:/Users/denis/Desktop/arquivo.dat"));
            encoder.writeObject(c1);
            encoder.close();
            System.out.println("Objeto gravado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao salvar o arquivo.");
            e.printStackTrace();
        }
         */
    }

    public void salvar(String nomeArquivo, ArrayList arrlist) {
        //Este método gravará no arquivo filename o conteúdo de arrlist
        try {
            FileOutputStream arquivo = new FileOutputStream(nomeArquivo);
            ObjectOutputStream serializa = new ObjectOutputStream(arquivo);
            for (int i = 0; i < arrlist.size(); i++) {
                serializa.writeObject(arrlist.get(i));  //gravamos o objeto no arquivo
            }
            serializa.close();
            arquivo.close();
            System.out.println("Objeto salvo");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro salvando objetos... " + ex.getMessage());
            //     return false; //se deu algum erro, retornaremos false
        }
        // return true; //deu tudo certo, retornaremos true
    }

    public void descerealizar() {
        //Este método carrega os objetos serializados gravados em 'filename' no vetor arrlist
        FileInputStream fis;
        ObjectInputStream obj;
        try {
            fis = new FileInputStream("C:/Users/denis/Desktop/denis.dat"); //Ex: (C:/Usuarios/Denis/Desktop/arquivo.dat)
            obj = new ObjectInputStream(fis);
            arrayObj2.clear(); //esvaziamos o ArrayList
            boolean sair = false;
            do {
                try {
                    
                    Object info1 = obj.readObject(); // lê um objeto do arquivo
                    arrayObj2.add(info1); // adiciona na lista o objeto lido
                    System.out.println("Objeto Lido");
                } catch (EOFException normalEof) {
                    // EOF (end of file), situação normal => acabaram os objetos
                    sair = true;
                    System.out.println("Sem objetos");
                }
            } while (!sair);
            obj.close();
            fis.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro carregando objetos... " + e.getMessage());
        }
    } //fim do método carregar
    
    public void  mostra(){
         
         try {
          System.out.println("Array2 depois: \n"+arrayObj2.get(0));

        } catch (Exception e) {
             System.out.println("Erro: " + e.toString());
        }
    }

}
