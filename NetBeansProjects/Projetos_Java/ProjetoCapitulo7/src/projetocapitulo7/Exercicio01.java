/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocapitulo7;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Gustavo
 */
public class Exercicio01 {

    public static void main(String[] args) {

        //Manipulação de diretórios
        File fdir = new File("src");
        System.out.println("src já existe?" + fdir.exists());
        System.out.println("src é um diretório? " + fdir.isDirectory());
        System.out.println("src é um arquivo? " + fdir.isFile());

        try {
            System.out.println("Path de src: " + fdir.getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String nomeArquivo : fdir.list()) {
            System.out.println("Arquivo do diretório: " + nomeArquivo);
        }

        System.out.println("-----");

        // Manipulação de arquivos
        String pathName = "src" + File.separator + "ProjetoCapitulo7" + File.separator + "Exercicio01.java";
        File fOrigem = new File(pathName);
        System.out.println("Arquivo de origem existe? " + fOrigem.exists());
        System.out.println("Tamanho: " + fOrigem.length());
        System.out.println("Posso ler? " + fOrigem.canRead());
        System.out.println("Posso escrever? " + fOrigem.canWrite());
        System.out.println("Posso executar? " + fOrigem.canExecute());
    }

}
