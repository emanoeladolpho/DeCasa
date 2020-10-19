package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class CriarContaController {
    @FXML
    private TextField nome;
    @FXML
    private TextField login;
    @FXML
    private PasswordField senha;
    @FXML
    private PasswordField confirmarSenha;
    private Button criarConta;
    @FXML
    private Hyperlink voltarTelaLogin;

    public void voltarTelaLogin(ActionEvent event) throws IOException {
        Stage stage = null;
        Parent root = null;
        if(event.getSource() == voltarTelaLogin){
            stage = (Stage) voltarTelaLogin.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("/login.fxml"));
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
