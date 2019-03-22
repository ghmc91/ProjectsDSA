/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorcondicional;

/**
 *
 * @author Gustavo
 */
public class OperadorCondicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nota1 = 4; int nota2 = 7;
        /*float media = (nota1 + nota2)/2;
        
        if (media>=6)
            System.out.println("Aprovado");
        else
            System.out.println("Reprovado");
        */
        
        String situacao = ((nota1 + nota2)/2 >= 6) ? "Aprovado":"Reprovado";
        System.out.println(situacao);
    }
    
}
