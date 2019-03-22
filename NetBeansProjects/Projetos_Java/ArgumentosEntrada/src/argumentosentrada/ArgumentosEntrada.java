/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package argumentosentrada;

/**
 *
 * @author Gustavo
 */
public class ArgumentosEntrada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Obtém uma lista de números, soma e executa
        int total = 0;
        for (String arg : args){
            total += Integer.parseInt(arg);
        }
        
        System.out.println("Quantidade de parâmetros: " + args.length);
        System.out.println("Média" + total/args.length);
        
    }
    
}
