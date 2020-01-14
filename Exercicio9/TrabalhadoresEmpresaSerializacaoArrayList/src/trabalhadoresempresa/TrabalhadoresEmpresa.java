package trabalhadoresempresa;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Vector; //não usada no exemplo
import javax.swing.*;

public class TrabalhadoresEmpresa {
    //Armazenaremos os dados dos trabalhores da empresa em um ArrayList
    private ArrayList trab;
    
    public static void main(String[] args) {
        new TrabalhadoresEmpresa();
    }

    public TrabalhadoresEmpresa () {
        leituraDeDados();
        mostraTrabalhadoresCadastrados();

        //a qualquer momento podemos acrescentar trabalhadores:
        trab.add(new Trabalhador("Beatriz Fernandes", 5500f, 'F')); 

        //para testar o mecanismo de serialização:
        salvar("C:/temp/trabs.dat", trab);
        carregar("C:/temp/trabs.dat", trab);
        mostraTrabalhadoresCadastrados();

        mediaDosSalariosAnuaisDosTrabalhadores();
        mediaDosSalariosAnuaisDosChefes();
    }

    public void leituraDeDados() {
            // para um teste rápido consideraremos dados de quatro trabalhadores fixos:
            trab = new ArrayList();
            trab.add(new Trabalhador("João Lopes", 2000f, 'M'));
            trab.add(new Trabalhador("Lilia Peres", 3000f, 'F'));
            trab.add(new Chefe("Pedro Silva", 4000f, 'M', 450.0f, "diretor RH"));
            trab.add(new Trabalhador("Luis Lima", 5000f, 'M'));
            trab.add(new Chefe("Ana Linares", 6000f, 'F', 670.0f, "chefe Dpto. Sistemas"));
    }

    public void mostraTrabalhadoresCadastrados () {
        String cad = "";
        for (int i=0; i<trab.size(); i++) {
          cad +=  trab.get(i).toString()+ "\n";
        }
        JTextArea outputArea = new JTextArea(15,70);  //15 linhas e 70 colunas
        outputArea.setText(cad);
            JScrollPane rolagem = new JScrollPane(outputArea);
            JOptionPane.showMessageDialog(null,rolagem,"Dados dos trabalhadores cadastrados",
                                JOptionPane.INFORMATION_MESSAGE);
    }

    public boolean salvar (String filename, ArrayList arrlist) {
            //Este método gravará no arquivo filename o conteúdo de arrlist
            try{
                FileOutputStream fos = new FileOutputStream(filename); 
                ObjectOutputStream out = new ObjectOutputStream(fos);
                for (int i=0; i<arrlist.size(); i++) {
                    out.writeObject( arrlist.get(i) );  //gravamos o objeto no arquivo
                }
                out.close();
                fos.close();
            } catch(Exception ex){
                   JOptionPane.showMessageDialog(null, "Erro salvando objetos... " + ex.getMessage());
                   return false; //se deu algum erro, retornaremos false
            }
            return true; //deu tudo certo, retornaremos true
    } //fim do método salvar

    public boolean carregar (String filename, ArrayList arrlist) {
            //Este método carrega os objetos serializados gravados em 'filename' no vetor arrlist
            FileInputStream fis;
            ObjectInputStream in;       
            try{
                fis = new FileInputStream(filename);
                in = new ObjectInputStream(fis);
                arrlist.clear(); //esvaziamos o ArrayList
                boolean sair = false; 
                do {                
                     try {
                         Object info = in.readObject(); // lê um objeto do arquivo
                         arrlist.add(info); // adiciona na lista o objeto lido
                      }
                      catch (EOFException normalEof) { 
                         // EOF (end of file), situação normal => acabaram os objetos
                         sair=true;
                      }            
                } while (!sair);            
                in.close();
                fis.close();
            } catch(Exception e){
                JOptionPane.showMessageDialog(null, "Erro carregando objetos... " + e.getMessage());
                return false;
            }
            return true;     
    } //fim do método carregar

    public void mediaDosSalariosAnuaisDosTrabalhadores() {
        int i; 
        float s=0.0f, media;
        for (i=0; i<trab.size(); i++) {
          s += ((Trabalhador)trab.get(i)).salarioAnual();
        } 
        media = s/trab.size();
        JOptionPane.showMessageDialog(null, 
          "A média dos salários anuais de todos os trabalhadores é R$ " + media);
    }

    public void mediaDosSalariosAnuaisDosChefes() {
        int i, qtdeChefes = 0; 
        float s=0.0f, media;
        for (i=0; i<trab.size(); i++) {
          if(trab.get(i) instanceof Chefe) {
            s += ((Chefe)trab.get(i)).salarioAnual(); //casting com Trabalhador funcionará igual
            qtdeChefes++;
          }
        } 
        media = s/qtdeChefes;
        if(qtdeChefes > 0)
        JOptionPane.showMessageDialog(null, 
          "A média dos salários anuais de todos os chefes é R$ " + media);
    }

}
