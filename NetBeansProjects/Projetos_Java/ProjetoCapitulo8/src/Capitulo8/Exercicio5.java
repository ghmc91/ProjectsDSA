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
public class Exercicio5 {
    
    public static void main(String[] args) {
        
        IntStream intStream = IntStream.of(1,2,2,3,3,4,5,6,7,8,9,10);
        
        //Operações intermediárias não são executadas enquanto uma operação terminal nãp for invocada
        //System.out.println(intStream.distinct());
        
        //System.out.println(intStream.distinct().count());
        
        //Foreach é uma operação terminal
        intStream.distinct().forEach(i -> System.out.println(i));
    }
}
