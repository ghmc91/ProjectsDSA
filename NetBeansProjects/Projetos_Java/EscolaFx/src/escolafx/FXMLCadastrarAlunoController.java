/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escolafx;

import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Gustavo
 */
public class FXMLCadastrarAlunoController implements Initializable {

    @FXML
    private TextField edtNome;

    @FXML
    private RadioButton chkMasculino;

    @FXML
    private RadioButton chkFeminino;

    @FXML
    private DatePicker edtDataNasc;

    @FXML
    private Button btnCancelar;

    @FXML
    private Button btnGravar;

    @FXML
    private TextField edtEndereco;

    @FXML
    void evtCancelar(ActionEvent event) {
        Stage stage = (Stage) btnCancelar.getScene().getWindow();
        stage.close();
    }

    @FXML
    void evtGravar(ActionEvent event) {
        String cmdSql;
        String nome = edtNome.getText();
        String sexo = "";
        if (chkFeminino.isSelected()) {
            sexo = "F";
        } else if (chkMasculino.isSelected()) {
            sexo = "M";
        }
        String endereco = edtEndereco.getText();
        String dataNasc = edtDataNasc.getValue().format(DateTimeFormatter.ISO_DATE);

        if (nome.isEmpty() || sexo.isEmpty() || dataNasc.isEmpty()) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setHeaderText("Atenção");
            alerta.setContentText("Preencha todos os campos antes de gravar.");
            alerta.showAndWait();
        } else {
            cmdSql = "INSERT INTO alunos (nome, sexo, endereco, datanasc) VALUES("
                    + "'" + nome + "',"
                    + "'" + sexo + "',"
                    + "'" + endereco + "',"
                    + "'" + dataNasc + "'"
                    + ")";
        System.out.println(cmdSql);
        try {
            Connection conn = new ConnectionFactory().getConnection();
            Statement stmt = conn.createStatement();
            stmt.execute(cmdSql);
            edtNome.clear();
            chkFeminino.setSelected(false);
            chkMasculino.setSelected(false);
            edtEndereco.clear();
            edtDataNasc.setValue(null);
            edtDataNasc.getEditor().setText(null);
        }
        catch (SQLException e){
        Alert alerta = new Alert(Alert.AlertType.ERROR);
        alerta.setHeaderText("Problema na gravação " + e.getMessage());
        alerta.showAndWait();
        }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
