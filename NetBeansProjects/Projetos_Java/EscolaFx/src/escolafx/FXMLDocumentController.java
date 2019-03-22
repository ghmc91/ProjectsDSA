/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escolafx;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author Gustavo
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws SQLException {
        System.out.println("You clicked me!");
        try (Connection con = new ConnectionFactory().getConnection()){
            label.setText("Conexão é " + con.isValid(0));
        }catch (SQLException ex){
            label.setText(ex.getMessage());
        }
    }
    
    @FXML
    private void evtCadastrarAluno(ActionEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FXMLCadastrarAluno.fxml"));
        Parent raiz = (Parent) fxmlLoader.load();
        Stage palco = new Stage();
        palco.setScene(new Scene(raiz));
        palco.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
