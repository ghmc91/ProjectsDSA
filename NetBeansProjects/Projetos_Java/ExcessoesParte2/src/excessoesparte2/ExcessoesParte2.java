/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excessoesparte2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class ExcessoesParte2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        try {
            System.out.print("Informe o primero número: ");
            int n1 = reader.nextInt();

            System.out.print("Informe o segundo número: ");
            int n2 = reader.nextInt();

            int resultado = 0;

            resultado = n1 / n2;
            System.out.println("Resultado" + resultado);
        } catch (ArithmeticException ae) {
            System.out.println("Ocorreu um erro na divisão");
        } catch (InputMismatchException ime) {
            System.out.println("Número informado inválido");
        } finally {
            System.out.println("Bloco Finally");
        }

    }

}
