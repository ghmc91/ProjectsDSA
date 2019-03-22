/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroprimo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Gustavo
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
      @FXML
    private Button btnTeste;

    @FXML
    void evtButtonTeste(ActionEvent event) {
        String nome;
        nome = txtEdt.getText();
        label.setText(nome);
    }
    
    @FXML
    private TextField txtEdt;
        
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //vazio
    }    
    
}
