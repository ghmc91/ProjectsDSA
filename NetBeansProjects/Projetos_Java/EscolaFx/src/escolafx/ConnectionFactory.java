/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escolafx;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




/**
 *
 * @author Gustavo
 */
public class ConnectionFactory {
    
    public Connection getConnection(){
        
        String url = "jdbc:mysql://localhost:3306/escola";
        try {
            return (Connection) DriverManager.getConnection(url,"root", "GUstavo08!");
        }catch(SQLException ex){
            System.out.println("Problemas na conexão " + ex.getMessage());
            return null;
            }
    }
    
}
