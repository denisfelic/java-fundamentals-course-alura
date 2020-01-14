/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author denis
 */
public class NetbeansIsBetter {
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int x = 2;
        String[] letras = new String[27];
        
        for (int i=0;i<27;i++){
            letras[i]= String.valueOf(x*Math.random());
            System.out.println("O numero atual é: "+letras[i]);
        }
    }
    
}
