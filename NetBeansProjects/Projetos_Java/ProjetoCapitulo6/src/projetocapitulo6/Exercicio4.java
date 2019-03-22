/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocapitulo6;

/**
 *
 * @author Gustavo
 */
public class Exercicio4 {
    public static void main(String[] args) {
        System.out.println("Heap size " + Runtime.getRuntime().totalMemory());
        System.out.println("Heap max size " + Runtime.getRuntime().maxMemory());
        
        String resultadoStr = " ";
        for (int i = 0; i<=10000;i++){
            resultadoStr = resultadoStr + " " + i;
            System.out.println("Free memory: " + Runtime.getRuntime().freeMemory());
        }
        
        //Demonstra a intenção de executar o coletor de lixo
        //Não garante que será executado imediatamente
        
        System.gc();
        
        System.out.println("Fim");
    }
}
