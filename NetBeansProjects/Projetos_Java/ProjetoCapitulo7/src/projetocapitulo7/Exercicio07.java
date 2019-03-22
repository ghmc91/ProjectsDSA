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
public class Exercicio07 {
    
    public static void main(String[] args) {
        
        File f = new File ("src/ProjetoCapitulo7/Tabuada.txt");
        System.out.println(f.exists());
        System.out.println("Excluiu? " + f.delete());
        
        try{
            f.createNewFile();
            System.out.println("Arquivo criado");
        }
        catch (IOException e){
            e.printStackTrace();
        }
        
        File dir = new File("src/ProjetoCapitulo7/exemplo1");
        System.out.println(dir.mkdir());
        
        
        File dir2 = new File("src/ProjetoCapitulo7/exemplo1/nivel1/nivel2/nivel2");
        System.out.println(dir.mkdirs());
    }
    
}
