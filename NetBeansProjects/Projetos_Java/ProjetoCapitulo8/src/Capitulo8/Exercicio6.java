package Capitulo8;


import java.util.stream.DoubleStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo
 */
public class Exercicio6 {
    
    public static void main(String[] args) {
        
        DoubleStream ds = DoubleStream.of(5.3,2.1,4.7,8.8,9.1,41,-2.3,8.3);
        
        ds.filter(d -> d>=0 && d<=10)//Operação intermediária
                .sorted()//Operação intermediária
                .limit(4)//Operação intermediária
                //.skip(1)//Operação intermediária
                .forEach(d->System.out.println(d));//Operação terminal
    }
    
}
