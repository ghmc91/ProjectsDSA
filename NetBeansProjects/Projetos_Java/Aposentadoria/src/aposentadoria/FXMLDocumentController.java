/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aposentadoria;

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
    
    int idade;
    
    @FXML
    private Button button;

    @FXML
    private TextField txtIdade;

    @FXML
    private Label lblBenef;
    
    @FXML
    private Button btnLimpar;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        idade = Integer.parseInt(txtIdade.getText());
        if (idade<18){
            lblBenef.setText(lblBenef.getText() + "Sem direito a aposentadoria");
            
        }else if(idade>=18 && idade <30 ){
            lblBenef.setText(lblBenef.getText() + "Aposentadoria parcial");
            
        }else{
            lblBenef.setText(lblBenef.getText() + "Aposentadoria Integral");
            
        }
       

    }
    
     @FXML
    void CleanButtonActions(ActionEvent event) {
    lblBenef.setText("");
    }

        
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
