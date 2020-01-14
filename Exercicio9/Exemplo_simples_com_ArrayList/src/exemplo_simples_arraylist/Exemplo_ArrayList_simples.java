package exemplo_simples_arraylist;

import java.util.ArrayList;

/**
 * @author mfpledon
 */
public class Exemplo_ArrayList_simples {
    public static void main(String[] args) {
       new ProcessamentoDeVetores();
    }    
}

class ProcessamentoDeVetores {
    
    private ArrayList vetA = new ArrayList();
    private ArrayList vetB = new ArrayList();
    private int N = 20;
    
    public ProcessamentoDeVetores() {
        
        for(int i=0; i < N; i++) {
            vetA.add( i+1 );  //adiciona em vetA objetos inteiros (classe Integer) 
            vetB.add( (i+1) * 2.0f); //adiciona em vetB objetos reais (classe Float)
        }
        
        String str = "";
        for(int i=0; i < N; i++) {
            str += vetA.get(i) + " - " + vetA.get(i).getClass();
            str += "\t" + vetB.get(i) + " - " + vetB.get(i).getClass() + "\n";
        }
        /*
        Visualizará:
            1 - class java.lang.Integer     2.0 - class java.lang.Float
            2 - class java.lang.Integer     4.0 - class java.lang.Float
            3 - class java.lang.Integer     6.0 - class java.lang.Float
            ...
            19 - class java.lang.Integer    38.0 - class java.lang.Float
            20 - class java.lang.Integer    40.0 - class java.lang.Float        
        */        
        System.out.println(str);
        
        //Vamos calcular a média dos valores em vetB:
        float S = 0.0f;
        for(int i=0; i < vetB.size(); i++) {
            S += Float.parseFloat(vetB.get(i).toString());
        }
        System.out.println("A média dos valores guardados em vetB é " + S/vetB.size() + " (a soma é " + S +") \n");

    }
}
