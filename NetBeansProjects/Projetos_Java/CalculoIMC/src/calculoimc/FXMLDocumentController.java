/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculoimc;

import java.net.URL;
import java.text.DecimalFormat;
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

    float alt, peso, imc;
    String imcf;
    @FXML
    private TextField display1;
    @FXML
    private TextField display2;
    @FXML
    private Button btn1;
    @FXML
    private Label lbl1;
    @FXML
    private Label lbl2;
    @FXML
    private Label lbl3;

    @FXML
    private void OnClickButton(ActionEvent event) {
        peso = Float.parseFloat(display1.getText());
        alt = Float.parseFloat(display2.getText());
        imc = peso / (alt * alt);
        DecimalFormat format = new DecimalFormat("0.##");
        imcf = format.format(imc);
        lbl1.setText(lbl1.getText() + imcf);
        if (imc < 16) {
            lbl2.setText(lbl2.getText() + "Magreza grave");
            lbl3.setText(lbl3.getText() + "Insuficiência cardíaca");
        } else if (imc < 17 && imc >= 16) {
            lbl2.setText(lbl2.getText() + "Magreza moderada");
            lbl3.setText(lbl3.getText() + "Infertilidade");
        } else if (imc < 18.5 && imc >= 17) {
            lbl2.setText(lbl2.getText() + "Magreza leve");
            lbl3.setText(lbl3.getText() + "Infertilidade");
        } else if (imc < 25 && imc >= 18.5) {
            lbl2.setText(lbl2.getText() + "Saudável");
            lbl3.setText(lbl3.getText() + "Menor risco de doenças");
        } else if (imc < 30 && imc >= 25) {
            lbl2.setText(lbl2.getText() + "Sobrepeso");
            lbl3.setText(lbl3.getText() + "Fadiga");
        } else if (imc < 35 && imc >= 30) {
            lbl2.setText(lbl2.getText() + "Obesidade grau 1");
            lbl3.setText(lbl3.getText() + "Diabetes, infarto");
        } else if (imc < 40 && imc >= 35) {
            lbl2.setText(lbl2.getText() + "Obesidade grau II");
            lbl3.setText(lbl3.getText() + "Apneia de sono");
        } else {
            lbl2.setText(lbl2.getText() + "Obesidade grau III");
            lbl3.setText(lbl3.getText() + "Refluxo");

        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

}
