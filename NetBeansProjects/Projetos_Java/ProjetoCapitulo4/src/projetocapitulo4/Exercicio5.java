/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocapitulo4;

import projetocapitulo4.dsa.Conta;

/**
 *
 * @author Gustavo
 */
public class Exercicio5 {
    
    public static void main(String[] args) {
        
        Conta c = new Conta();
        c.titular = "Gustavo";
        
        c.deposita(100);
        c.saca(20);
        
        System.out.println(c.getSaldo());
    }
    
}
