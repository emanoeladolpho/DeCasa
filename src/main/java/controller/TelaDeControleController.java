package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TelaDeControleController implements Initializable {

    @FXML
    private Hyperlink cadastro,produto,vendaBalcao,vendas,sair;

    @Override
    public void initialize(URL location, ResourceBundle resources) {}

    public void irVendaBalcao(ActionEvent event) throws IOException {
        Stage stage = null;
        Parent root = null;
        if(event.getSource() == vendaBalcao){
            stage = (Stage)vendaBalcao.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("/FXML/telaPrincipal.fxml"));
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void sair(ActionEvent event) throws IOException {
        Stage stage = null;
        Parent root = null;
        if(event.getSource() == sair){
            stage = (Stage)sair.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("/FXML/login.fxml"));
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
