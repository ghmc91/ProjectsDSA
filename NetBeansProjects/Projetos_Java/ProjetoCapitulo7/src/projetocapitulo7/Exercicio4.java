/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocapitulo7;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author Gustavo
 */
public class Exercicio4 {

    public static void main(String[] args) {

        Path path = Paths.get("src", "ProjetoCapitulo7", "arquivoTeste.txt");
        Charset charset = Charset.forName("UTF-8");

        try {
            List<String> lines = Files.readAllLines(path, charset);
            System.out.println(lines);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        
    }

}
