/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysmultidimensionais;

/**
 *
 * @author Gustavo
 */
public class ArraysMultidimensionais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Cada elemento do array é outro array
        //Ou seja, temos arrays de arrays para representar matrizes

        int[][] matriz;
        matriz = new int[3][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = i + j;
            }
        }
        //Inicializando uma matriz
        int[][] matriz2 = {{10, 20}, {30, 40, 50}};
            int numeroCinquenta = matriz2[1][2];
            System.out.println(numeroCinquenta);
    }
}
