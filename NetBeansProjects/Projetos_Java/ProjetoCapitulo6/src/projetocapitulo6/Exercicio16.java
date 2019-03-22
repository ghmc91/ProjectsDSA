/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocapitulo6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Gustavo
 */
public class Exercicio16 {

    public static void main(String[] args) {

        /**
         * O Iterator permite remover um elemento de uma coleção durante um loop
         */
        List<String> cores = new ArrayList<>(Arrays.asList("Amarelo", "Azul", "Vermelho", "Rosa"));

        //Remover as cores que começam com a letra A
        //Ocorrerá uma exceção: ConcurrentModificationException
        /*for (String colors : cores) {
            if (colors.startsWith("A")) {
                cores.remove(colors);
            }
        }
         */
        
        Iterator<String> i = cores.iterator();
        while (i.hasNext()) {
            String cor = i.next();
            if (cor.startsWith("A"))
                i.remove();
        }
        
        System.out.println(cores);
    }

}
