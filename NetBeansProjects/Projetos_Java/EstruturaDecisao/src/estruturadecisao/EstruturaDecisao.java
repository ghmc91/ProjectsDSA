/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadecisao;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class EstruturaDecisao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        System.out.println("Qual a sua idade?");
        int idade = reader.nextInt();
        
        if (idade<0){
            System.out.println("Idade inválidade");
            System.out.println("Tente novamente");
        }
        else
            System.out.println("ok, faltam " + (100 - idade) + " anos para você chegar aos 100 anos!!!" );
        
         
    }
    
}
