/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escopovariaveis;

/**
 *
 * @author Gustavo
 */
public class EscopoVariaveis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int idade = 70;
        float preco = 100;
        
        if (idade>65){
            float precocomdesconto = preco / 100 * 90;
            System.out.println("Desconto de: " + (preco - precocomdesconto));
            preco = precocomdesconto;
        }
        
        exibirprecofinal(preco);
        
        }

    private static void exibirprecofinal(float preco) {
        System.out.println("Preço: " + preco);
    }
    
}
