package Capitulo8;


import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo
 */
public class Exercicio4 {

    public static void main(String[] args) {
        
        DoubleStream intStream = DoubleStream.of(1,2,3,4,5,6,7,8,9,10);
        //System.out.println("Total de elementos: " + intStream.count());
        
        //CUIDADO: Uma IntStream não pode ser reutilizada
        //System.out.println("Média: " + intStream.average().getAsDouble());
        
        
        OptionalDouble od = intStream.max();
        if (!od.isPresent()){
            System.out.println("Não há máximo");
        }else{
            System.out.println(od.getAsDouble());
        }
        //System.out.println("Máximo: " + intStream.max().getAsInt());
        
        /*OptionalInt oi = intStream.min();
        if(!oi.isPresent()){
            System.out.println("Não há número mínimo");
        }
        else{
            System.out.println(oi.getAsInt());
        }
        */
    }
    
}
