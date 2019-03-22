/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocapitulo7;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import models.Curso;

/**
 *
 * @author Gustavo
 */
public class Exercicio09 {
    
    public static void main(String[] args) {
        
        Curso curso = null;
        
        try{
            FileInputStream fileIn = new FileInputStream("curso.ser");
            ObjectInputStream objIn = new ObjectInputStream(fileIn);
            curso = (Curso) objIn.readObject();
            objIn.close();
            fileIn.close();            
        }catch(IOException i){
            i.printStackTrace();
        }catch (ClassNotFoundException c){
            System.out.println("Objeto não pertence a classe");
            c.printStackTrace();
        }
        
        System.out.println("Objeto desselarizado!");
        System.out.println("Curso: " + curso.getNome() );
        System.out.println("Valor: " + curso.getValor());
    }
    
}
