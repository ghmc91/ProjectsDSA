package Capitulo8;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo
 */
public class Exercicio1 {
    public static void main(String[] args) {
        
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Código executado dentro da thread");    
            }
        }).start();
        
        //Utilizando expressões lambdas
        new Thread(()->System.out.println("Código executado dentro da thread")).start();
    }
}
