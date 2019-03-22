/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrepwhile;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class EstRepWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        System.out.println("Tabuada de qual número?");
        int num = reader.nextInt();
        int i = 0;               
        while (i <= 10){
            System.out.println(num + " x " + i + " = " + num * i);
            i++;
        }
    }
    
}
