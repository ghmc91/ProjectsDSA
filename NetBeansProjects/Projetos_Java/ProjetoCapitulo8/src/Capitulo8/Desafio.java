package Capitulo8;


import java.util.stream.IntStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo
 */
public class Desafio {
    
    public static void main(String[] args) {
        
        IntStream intStream = IntStream.of(1,2,2,4,4,4,7,8,9,10);
        //intStream.distinct().filter(i -> i%2 == 0).map(i -> i*i ).forEach(i -> System.out.println(i));
        
        intStream
                .distinct()
                .filter(i -> {
                    System.out.println("Filtrando " +i );
                    return i%2==0;
                })
                .map(i -> {
                    System.out.println("Mapeando " +i);
                    return i*i;
                })
                .forEach(i-> System.out.println(i));
    }
}
