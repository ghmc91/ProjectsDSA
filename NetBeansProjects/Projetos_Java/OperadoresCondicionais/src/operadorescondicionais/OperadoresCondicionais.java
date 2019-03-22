/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorescondicionais;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class OperadoresCondicionais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        System.out.println("Qual a sua idade?");
        int idade = reader.nextInt();
        
        if (idade < 0){
            System.out.println("Idade inválida");
            System.out.println("Tente novamente");
        }
        else if (idade<16)
                System.out.println("Não pode votar");
            else if (idade<18 || idade>65)
                    System.out.println("Voto opcional");
                else System.out.println("Voto obrigatório");
                     
    }
    
}
