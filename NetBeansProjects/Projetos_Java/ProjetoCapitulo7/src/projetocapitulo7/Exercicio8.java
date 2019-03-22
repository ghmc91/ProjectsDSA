/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocapitulo7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import models.Curso;
import models.Instrutor;

/**
 *
 * @author Gustavo
 */
public class Exercicio8 {

    public static void main(String[] args) {
        
        Instrutor instrutor = new Instrutor(1, "Gustavo", 2000);
        Curso curso = new Curso(1, "Git", instrutor, 200);
        
        //Serializando um objeto
        try{
            FileOutputStream fileOut = new FileOutputStream("curs.ser");
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(curso);
            objOut.close();
            fileOut.close();
            System.out.println("Objeto serializado");
        }catch (IOException i){
            i.printStackTrace();
        }
    }
    
}
