package Capitulo8;


import java.util.function.BiConsumer;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.ToIntBiFunction;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo
 */
public class Exercicio2 {
    
    public static void main(String[] args) {
        //Função que recebe dois inteiros e não possui retorno
        BiConsumer<Integer,Integer> somaInteiros =(a,b) -> System.out.println(a+b);
        somaInteiros.accept(2, 5);
        
        //Função que recebe um double e retorna uma String
        DoubleFunction<String> df = d -> String.valueOf(d*d);
        System.out.println(df.apply(3f));
        
        //Função que recebe dois inteiro e retorna um inteiro
        ToIntBiFunction<Integer,Integer> somaInteiros2 = (x,y)->x+y;
        System.out.println(somaInteiros2.applyAsInt(3,4));
        
        //Função que recebe duas Strings e retorna um inteiro
        ToIntBiFunction<String,String> tamanhoString = (a,b)-> a.length() + b.length();
        System.out.println(tamanhoString.applyAsInt("DSA", "Muito bom"));
        
        //Função que recebe uma String e retorna um inteiro
        Function<String,Integer> totalCaracteres = (i)->i.length();
        System.out.println(totalCaracteres.apply("Gustavo"));
        
    }
    
}
