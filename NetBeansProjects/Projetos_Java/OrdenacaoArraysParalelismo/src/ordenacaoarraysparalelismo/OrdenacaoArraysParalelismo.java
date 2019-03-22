/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacaoarraysparalelismo;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Gustavo
 */
public class OrdenacaoArraysParalelismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Random rn = new Random();

        int[] array1 = new int[100000000];
        int[] array2 = new int[100000000];

        for (int i = 0; i < array1.length; i++) {
            //alimenta a posição do array com um valor entre o e 99
            array1[i] = rn.nextInt(100);
            array2[i] = array1[i];
        }

        long inicioTarefa = System.currentTimeMillis();
        Arrays.sort(array1);
        long fimTarefa = System.currentTimeMillis();
        System.out.println("Tempo para ordenação: " + (fimTarefa - inicioTarefa));
        
        inicioTarefa = System.currentTimeMillis();
        Arrays.parallelSort(array2);
        fimTarefa = System.currentTimeMillis();
        System.out.println("Tempo para ordenação: " + (fimTarefa - inicioTarefa));
 

    }

}
