/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocapitulo7;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Gustavo
 */
public class Exercicio12 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            System.out.println("Driver carregado");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("erro ao carregar o driver " + e.getMessage());
            return;
        }

        Connection con = null;
        try {
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost/movie?" + "user=root&password=GUstavo08!&serverTimezone=UTC");
            System.out.println("Conexão estabelecida");

            PreparedStatement cmdCreate = (PreparedStatement) con.prepareStatement(
            "CREATE TABLE Alunos (" + 
            "id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY," +
            "nome VARCHAR(30) NOT NULL," +
            "sobrenome VARCHAR(30) NOT NULL," + 
            "pontuacao INT(2) NOT NULL" +
            ")"
            );
                    
            cmdCreate.executeUpdate();
            cmdCreate.close();
            
            
            String sqlInsert = "INSERT INTO Alunos(nome, sobrenome, pontuacao) VALUES (?,?,?)";
            PreparedStatement cmdInsert = (PreparedStatement) con.prepareStatement(sqlInsert);
            cmdInsert.setString(1, "Gustavo");
            cmdInsert.setString(2, "Costa");
            cmdInsert.setInt(3, 100);
            
            int totalDeLinhasAfetadas = cmdInsert.executeUpdate();
            System.out.println("Total de linhas afetadas pelo INSERT: " + totalDeLinhasAfetadas);
            cmdInsert.close();
            
            //Excluindo todos os filmes que possuem nota abaixo da média
            String sqlDelete = "DELETE FROM movie_metadata WHERE color <> 'Color'";
            PreparedStatement cmdDelete = (PreparedStatement) con.prepareStatement(sqlDelete);
            System.out.println("Total de filmes excluídos: " + cmdDelete.executeUpdate());
            cmdDelete.close();
            
            
        } catch (SQLException s) {
            System.out.println("SQLException: " + s.getMessage());
        }
          finally {
            try{
                con.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }

    }
}


    
