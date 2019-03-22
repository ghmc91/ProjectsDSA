/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocapitulo6;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Gustavo
 */
public class Exercicio14 {

    public static void main(String[] args) {

        /**
         * Maps realizam mapeamento chave => valor Um map não pode ter chaves
         * duplicadas Cada chave realiza o mapeamento para um valor Elementos
         * não são ordenados...não recupera por indíce e sim por chave Rápida
         * busca e inserção de dados
         */
        //Define um mapeamento 'Long' - > 'Aluno'
        Map<Long, Aluno> mapPessoas = new HashMap<>();

        //Inserir um objeto no map. Chave é um long e valor é um aluno
        mapPessoas.put(111111111L, new Aluno(5, 1, "Gustavo"));
        mapPessoas.put(222222222L, new Aluno(6, 2, "Gabriel"));
        mapPessoas.put(333333333L, new Aluno(7, 3, "Lucas"));

        //A chave 222222222L já exixte no mapa, portanto passará a mapear um novo aluno
        mapPessoas.put(222222222L, new Aluno(6, 2, "Gabriel Augusto"));
        System.out.println(mapPessoas.get(222222222L).getNome());
        
        System.out.println("Existe a chave 333" + mapPessoas.containsKey(333));
        System.out.println("Existe o aluno Gabirel Augusto: " + mapPessoas.containsValue(new Aluno(5, 4, "Gabriel Augusto")));
        //Implementar método equals
        
        System.out.println(mapPessoas.remove(1));
        
        //Remoçao do mapeamento que possui chave 333333333L, retorna o objeto e remove o elemento
        Aluno alunoRemovido = mapPessoas.remove(333333333L);
        System.out.println(alunoRemovido.getNome() + " Foi removido. Sobraram:  " + mapPessoas.size());
        
        System.out.println("------");
        
        //Percorrendo todo o mapeamento
        for (Long chave : mapPessoas.keySet())
            System.out.println("Aluno " + mapPessoas.get(chave).getNome());
        
        System.out.println("------");
        Collection<Aluno> colecaoAlunos = mapPessoas.values();
        System.out.println("Coleções de alunos " + colecaoAlunos);
        
        //Uma chave pode mapear para aluno
        mapPessoas.put(111111111L, null);
        
        //Limpa o mapeamento
        mapPessoas.clear();
        System.out.println("Mapeamento limpo. " + mapPessoas.size() + " Alunos");
    }
}
