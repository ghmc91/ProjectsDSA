/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulacaoarrays;

import java.util.Arrays;

/**
 *
 * @author Gustavo
 */
public class ManipulacaoArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Inicializando os valores de um array na sua inicialização
        String[] nomes = {"Daniel", "Gustavo", "Didico"};
        int[] idades = {10, 9, 8};

        //Prenche os valore de um array
        Arrays.fill(idades, 10);

        idades[0] = 8;
        idades[1] = 10;
        idades[2] = 9;

        int numeroAprocurar = 9;
        boolean achou = false;
        for (int idade : idades) {
            if (idade == numeroAprocurar) {
                achou = true;
                break;
            }
        }
        //Ordenando um array
        System.out.println("Número " + numeroAprocurar + " está na lista? " + achou);
        Arrays.sort(idades);

        //Fazendo uma busca binária no array
        int pontoIntersecao = Arrays.binarySearch(idades, 9);
        System.out.println(pontoIntersecao);

        //Imprimindo todos os elemento de um array
        for (int idade : idades) {
            System.out.println(idade);
        }

    }

}
