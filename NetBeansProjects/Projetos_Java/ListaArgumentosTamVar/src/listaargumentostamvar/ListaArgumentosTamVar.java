/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaargumentostamvar;

/**
 *
 * @author Gustavo
 */
public class ListaArgumentosTamVar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Calculando lista de números
        System.out.println(somaNumeros(10, 20, 30, 30));
        /**
         *
         * @param numeros lista de números
         * @return
         */
    }

    /**
     *
     * @param numeros lista de números
     * @return
     */
    public static int somaNumeros(int... numeros) {
        int total = 0;
        for (int num : numeros) {
            total += num;
        }
        return total;
    }
}
