/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expetion;

/**
 *
 * @author Denis
 */
public class Casa implements java.io.Serializable {
    private String cor,dono,cep;
    private int id;

    public Casa() {
    }

    public Casa(String cor, String dono, String cep, int id) {
        this.cor = cor;
        this.dono = dono;
        this.cep = cep;
        this.id = id;
    }
    
    

    @Override
    public String toString() {
        return "Casa{" + "cor=" + getCor() + ", dono=" + getDono() + ", cep=" + getCep() + ", id=" + getId() + '}';
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   

    
    
}
