/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrepdowhile;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class EstRepDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int idade;
         
         do {
             Scanner reader = new Scanner(System.in);
             System.out.println("Qual sua idade?");
             idade = reader.nextInt();
         } while (idade<0);
         
         System.out.println(idade);
    }    
}

    

