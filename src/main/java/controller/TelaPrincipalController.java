package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.stage.Stage;
import java.io.IOException;

public class TelaPrincipalController {

    @FXML
    private Hyperlink sair;
    @FXML
    private Button buscarProduto;



    public void sair(ActionEvent event) throws IOException {
        Stage stage = null;
        Parent root = null;

        if(event.getSource() == sair){
            stage = (Stage) sair.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("/login.fxml"));
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void buscarProdutos(ActionEvent event) {

    }

}
