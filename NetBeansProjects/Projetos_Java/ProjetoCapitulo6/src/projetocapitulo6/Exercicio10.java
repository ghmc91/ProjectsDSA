/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocapitulo6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Gustavo
 */
public class Exercicio10 {
    
    public static void main(String[] args) {
        
        List<Instrutor> instrutores = new ArrayList<>();
        instrutores.add(new Instrutor(3, "Gustavo", 1000));
        instrutores.add(new Instrutor(2, "Gabriel", 2000));
        instrutores.add(new Instrutor(1, "Lucas", 4000));
        
        Collections.sort(instrutores);
        
        for (Instrutor i : instrutores){
            System.out.println(i.getNome() + " => " + i.getSalario());
        }
        
        System.out.println("------");
        
        //ordenação padrão será pela matrícula, pois utiliza o compareTo da classe instrutor
        Collections.sort(instrutores, new Comparator<Instrutor>(){
        @Override
        public int compare(Instrutor o1, Instrutor o2){
        return o1.getNome().compareTo(o2.getNome());
    }
   });
        
        for (Instrutor i : instrutores){
            System.out.println(i.getNome() + " => " + i.getSalario());
        }
        
    
}

}