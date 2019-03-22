package Capitulo8;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo
 */
public class Exercicio3 {
    public static void main(String[] args) {
        
        List<String> nomes = 
                new ArrayList<>(Arrays.asList("Joã", "Maria", "José"));
        //Método 1
        Collections.sort(nomes, new Comparator<String>(){
        @Override
        public int compare(String o1, String o2){return o1.length() - o2.length();}
    });
        System.out.println(nomes);
        System.out.println("-------");
        Collections.shuffle(nomes);
        
        //Método 2
        Collections.sort(nomes, (o1, o2) ->  o1.length() - o2.length());
        System.out.println(nomes);
    }
    
}
