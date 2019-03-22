/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author Gustavo
 */
public class Array {

    
    public static void main(String[] args) {
            
        //Declarando um array de String

        double[] salarios;
        
        //Instanciando um array com 5 posições
        //Importante: Uma vez que o tamanho do array é definido ele não poderá ser alterado


        salarios = new double[5];
        
        //Escrevendo uma posição do array
        //O indice dos arrays sempre deverão ser números inteiros
        salarios[3] = 10000;
        salarios[4] = 2000;
        System.out.println(salarios.length);
        
        
        //iterando para escrever um array
        // Primeira posição do array é zero
        
        for (int i = 0; i < salarios.length;i++){
            salarios[i] = i * 1000;
        }
        
        // iterando e acumulando o valor de todos os salários
        double totalSalarios = 0;
        for (double salario : salarios){
            totalSalarios += salario;
        }
        
        double mediaSalarios = totalSalarios/salarios.length;
        System.out.println(String.format("Médial salarial: %f", mediaSalarios));
        
        
        
        
    }
    
}
