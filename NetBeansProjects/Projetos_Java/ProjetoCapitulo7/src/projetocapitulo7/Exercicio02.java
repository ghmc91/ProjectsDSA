/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocapitulo7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Gustavo
 */
public class Exercicio02 {

    public static void main(String[] args) throws IOException {

        try {
            FileReader fr = new FileReader("C:\\Users\\Gustavo\\Downloads\\tcc");
            int data = fr.read();
            while (data != -1) {
                System.out.println(data + " " + (char) data);
                data = fr.read();
            }
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
