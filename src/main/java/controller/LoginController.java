package controller;

import javafx.collections.transformation.TransformationList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    private TextField login;
    @FXML
    private TextField senha;
    @FXML
    private Button btnConfirmarLogin;
    @FXML
    private Hyperlink criarConta;


    // Chamando Scene
    public void criarConta(ActionEvent event) throws IOException {
        Stage stage = null;
        Parent root = null;

        if(event.getSource() == criarConta){
            stage = (Stage)criarConta.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("/criarConta.fxml"));
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void logar(ActionEvent event) throws IOException {
        Stage stage = null;
        Parent root = null;
        if(event.getSource() == btnConfirmarLogin){
            stage = (Stage)btnConfirmarLogin.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("/telaPrincipal.fxml"));
        }

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
