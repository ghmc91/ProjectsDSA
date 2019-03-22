/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocapitulo6;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Gustavo
 */
public class Exercicio8 {
    
    public static void main(String[] args) {
        
        HashSet<String> cores = new HashSet<>();
        cores.add("Vermelho");
        cores.add("Azul");
        
        System.out.println("Inseriu amarelo? " + cores.add("Amarelo"));
        System.out.println("Inseriu amarelo? " + cores.add("Amarelo"));
        
        System.out.println(cores + " tem " + cores.size() + " elementos");
        
        for (String cor : cores){
            System.out.println(cor);
        }
        
        System.out.println("-----------");
        
        TreeSet<String> cores2 = new TreeSet<>();
        cores2.add("Branco");
        cores2.add("Preto");
        cores2.add("Cinza");
        cores2.add("Verde");
        
        for (String cor : cores2){
            System.out.println(cor);
        }
        
        System.out.println("--------");
        
        // headset retorna um conjunto de elementos menor
        // que o elemento especificado por parâmetro
        
        SortedSet<String> coresMenorQuePreto = 
                cores2.headSet("Preto");
        
        System.out.println(coresMenorQuePreto);
        
        coresMenorQuePreto = cores2.headSet("Preto", true);
        
        System.out.println(coresMenorQuePreto);
        
         // tailSet retorna um conjunto de elementos maior
        // que o elemento especificado por parâmetro
        
        System.out.println("-----------");
        
        SortedSet<String> coresMaiorOuIgualAPreto = 
                cores2.tailSet("Preto");
        
        System.out.println(coresMaiorOuIgualAPreto);
        
        String primeiraCor = cores2.first();
        System.out.println(primeiraCor);
        
        String ultimaCor = cores2.last();
        System.out.println(ultimaCor);
        
        System.out.println("----------");
        
        SortedSet<String> coresDoMeio = cores2.subSet(primeiraCor, true, ultimaCor, false);
        System.out.println(coresDoMeio);
    }
    
}
