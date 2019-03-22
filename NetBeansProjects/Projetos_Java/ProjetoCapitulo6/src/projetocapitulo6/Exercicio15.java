/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocapitulo6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Gustavo
 */
public class Exercicio15 {

    public static void main(String[] args) {

        //Forma de Inserção
        Map<Instrutor, Set<Aluno>> map = new HashMap<>();
        Instrutor Daniel = new Instrutor(1, "Daniel", 2000);
        Aluno Roberta = new Aluno(1, 10, "Roberta");
        Aluno Carlos = new Aluno(2, 20, "Carlos");
        Set<Aluno> turmaDaniel = new HashSet<>();
        turmaDaniel.add(Roberta);
        turmaDaniel.add(Carlos);
        map.put(Daniel, turmaDaniel);

        // Outra forma de inserção
        map.put(
                new Instrutor(2, "Pedro", 3000),
                new HashSet<Aluno>(
                        Arrays.asList(
                                new Aluno(10, 1, "Gustavo"),
                                new Aluno(20, 3, "Gabriel")))
        );
        
        for(Instrutor i : map.keySet()){
            for (Aluno a : map.get(i)){
                System.out.println(a.getNome() + " é aluno de " + i.getNome());
            }
        }
    }

}
