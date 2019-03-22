/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocapitulo7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Gustavo
 */
public class Exercicio05 {
    
    public static void main(String[] args) throws IOException {
        
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("src/ProjetoCapitulo7/arquivoTeste.txt"))) {
        
            StringBuilder conteudo = new StringBuilder();
            String linha = null;
            while ((linha = bufferedReader.readLine()) != null){
                conteudo.append(linha).append("\n");
            }
            System.out.println(conteudo.toString());
        }
        
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    
}
