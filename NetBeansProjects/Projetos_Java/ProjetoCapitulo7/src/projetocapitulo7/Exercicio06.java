/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocapitulo7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Gustavo
 */
public class Exercicio06 {

    public static void main(String[] args) throws IOException {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/ProjetoCapitulo7/Tabuada.txt"))) {

            int num = 3;

            for (int i = 0; i < 10; i++) {
                bufferedWriter.write(String.format("%d * %d = %d", num, i, num * i));
                bufferedWriter.newLine();
            }
            /**
             * Flush grava no disco. Importante fazer depois de escrever em um arquivo
             */
            bufferedWriter.flush();

        }
        catch (IOException e){
            e.printStackTrace();
    }
}
}
