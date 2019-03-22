/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocapitulo6;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Gustavo
 */
public class Teste {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            System.out.println("Driver carregado");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("erro ao carregar o driver " + e.getMessage());
            return;
        }
        
        Connection con = null;
        
         
}
}
