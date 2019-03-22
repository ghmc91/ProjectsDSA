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
public class Exercicio11 {

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

            PreparedStatement cmd = (PreparedStatement) con.prepareStatement(
                    "SELECT movie_title, title_year, imdb_score "
                    + "FROM movie_metadata "
                    + "WHERE movie_facebook_likes < 150000"
            );
            
            //executando
            ResultSet rs = cmd.executeQuery();
            
            //Iteração sobre o ResultSet
            while(rs.next()){
                String nome = rs.getString("movie_title");
                int ano = rs.getInt("title_year");
                float nota = rs.getFloat("imdb_score");
                System.out.println("O filme " + nome + " foi lançado em " + ano + " com nota" + nota);
            }
            
            //Fecha o ResultSet
            rs.close();
            
            //Fecha o Statement
            cmd.close();

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
