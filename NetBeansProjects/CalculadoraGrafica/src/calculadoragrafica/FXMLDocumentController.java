/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoragrafica;

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

    float num1 = 0, num2, resp;
    int operacao = 0;

    @FXML
    private Button btnIgual;

    @FXML
    private Button btn4;

    @FXML
    private Button btn8;

    @FXML
    private Button btn0;

    @FXML
    private Button btn2;

    @FXML
    private Button btn5;

    @FXML
    private Button btn9;

    @FXML
    private Button btn7;

    @FXML
    private Button btn3;

    @FXML
    private Button btn6;

    @FXML
    private Button btnLimpar;

    @FXML
    private Button btnSoma;

    @FXML
    private Button btn1;

    @FXML
    private Button btnSub;

    @FXML
    private Button btnMult;

    @FXML
    private Button btnDivi;

    @FXML
    private TextField display;

    @FXML
    void OnClickButton(ActionEvent event) {

        if (event.getSource().equals(btn1)) {
            display.setText(display.getText() + "1");
        } else if (event.getSource().equals(btn2)) {
            display.setText(display.getText() + "2");
        } else if (event.getSource().equals(btn3)) {
            display.setText(display.getText() + "3");
        } else if (event.getSource().equals(btn4)) {
            display.setText(display.getText() + "4");
        } else if (event.getSource().equals(btn5)) {
            display.setText(display.getText() + "5");
        } else if (event.getSource().equals(btn6)) {
            display.setText(display.getText() + "6");
        } else if (event.getSource().equals(btn7)) {
            display.setText(display.getText() + "7");
        } else if (event.getSource().equals(btn8)) {
            display.setText(display.getText() + "8");
        } else if (event.getSource().equals(btn9)) {
            display.setText(display.getText() + "9");
        } else if (event.getSource().equals(btnSoma)) {
            num1 = Float.parseFloat(display.getText());
            operacao = 1;
            display.setText("");
        } else if (event.getSource().equals(btnSub)) {
            num1 = Float.parseFloat(display.getText());
            operacao = 2;
            display.setText("");
        } else if (event.getSource().equals(btnMult)) {
            num1 = Float.parseFloat(display.getText());
            operacao = 3;
            display.setText("");
        } else if (event.getSource().equals(btnDivi)) {
            num1 = Float.parseFloat(display.getText());
            operacao = 4;
            display.setText("");
        }
        if (event.getSource().equals(btnIgual)) {
            num2 = Float.parseFloat(display.getText());
            switch (operacao) {
                case 1:
                    resp = num1 + num2;
                    display.setText(String.valueOf(resp));
                    break;
                case 2:
                    resp = num1 - num2;
                    display.setText(String.valueOf(resp));
                    break;
                case 3:
                    resp = num1 * num2;
                    display.setText(String.valueOf(resp));
                    break;
                case 4:
                    resp = num1 / num2;
                    display.setText(String.valueOf(resp));
                    break;
            }
        }

    }
    @FXML
    private Label label;

    @FXML
    private void handleButtonAction(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
