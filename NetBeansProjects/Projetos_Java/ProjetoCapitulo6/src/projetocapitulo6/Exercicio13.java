/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocapitulo6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Gustavo
 */
public class Exercicio13 {
    
    public static void main(String[] args) {

        //A notação tem que ser lista de "Classe"...não podes ser tipo primitivo
        List<Integer> nums = new ArrayList<>();
        
        Random random = new Random(42);//Parâmetro seed para produzir os mesmos resultados
        for (int i = 0; i <= 10; i++) {
            nums.add(random.nextInt(100));//bound = 100 retorna um número entre 0 a 99
        }
        
        System.out.println(nums);

        // Ordenação
        Collections.sort(nums);
        System.out.println(nums);

        //Embaralha
        Collections.shuffle(nums);
        System.out.println(nums);
        
        //Inverte
        Collections.reverse(nums);
        System.out.println(nums);
        
        System.out.println("Maior número: " + Collections.max(nums));
        System.out.println("Menor número: " + Collections.min(nums));
        
        Collections.fill(nums, 10);
        System.out.println(nums);
        
        System.out.println("-----");
        
        List<Integer> nums2 = new ArrayList<>();
        for (int i = 0; i <= 20; i++){
            nums2.add(i);
        }
            //Atenção: o primeiro parâmetro é o destino o segundo é a origem
            //O tamanho da lista de destino deverá ser maior ou igual ao de origem
            //Se a lista de destino for menor que a origem, uma exceção é lançada(IndexOutOfBoundException)
            
            Collections.copy(nums2, nums);
            System.out.println(nums2);
        
        
        //Frequência
        int quantidadeDeNumeros10 = Collections.frequency(nums2, 10);
        System.out.println("Quantidade de vezes que o núemro 10 apareceu: " + quantidadeDeNumeros10);
        
        //Collections.disjoint retorna true se as listas Não tem elementos em comum
        System.out.println("As listas possuem elementos comuns? " + !Collections.disjoint(nums2, nums));
        
        
    }
}
