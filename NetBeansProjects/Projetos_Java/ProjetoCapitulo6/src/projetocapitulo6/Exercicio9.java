/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocapitulo6;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Gustavo
 */
public class Exercicio9 {
    
    public static void main(String[] args) {
        
        Set<Instrutor> instrutores = new TreeSet<>();
        instrutores.add(new Instrutor(1, "Gustavo", 1500));
        instrutores.add(new Instrutor(2, "Gabriel", 2000));
        instrutores.add(new Instrutor(1, "Lucas", 1500));
        
        System.out.println(instrutores.size());
        
        for (Instrutor i : instrutores)
            System.out.println(i.getNome() + " => " + i.getMatricula() + " => " + i.getSalario());
    }
    
}
