/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.caelum.leilao.dominio;

/**
 *
 * @author root
 */
public class Main {

    public static void main(String args[]) {
        //parte 1: cenario
        Usuario u0 = new Usuario(0, "João");
        Usuario u1 = new Usuario(1, "Jose");
        Usuario u2 = new Usuario(2, "Maria");
       
        Leilao leilao = new Leilao("Playstation 3");
        leilao.propoe(new Lance(u0, 250.0));
        leilao.propoe(new Lance(u1, 300.0));
        leilao.propoe(new Lance(u2, 400.0));
 
        //parte 2: ação 
        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);
        
        //parte 3: validacao
        double maiorEsperado = 400;
        double menorEsperado = 250;
        System.out.println(maiorEsperado == leiloeiro.getMaiorLance());
        System.out.println(menorEsperado == leiloeiro.getMenorDeTodos());
    }
}
