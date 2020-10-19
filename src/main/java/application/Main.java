package application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

import static javafx.application.Application.launch;

public class Main extends Application {

    Stage janela;
    Scene login, criarConta;

        @Override
        public void start(Stage primaryStage) throws Exception{
            Parent root = FXMLLoader.load(getClass().getResource("/login.fxml"));
            primaryStage.setTitle("Sistema DeCasa");
            primaryStage.setScene(new Scene(root, 300, 275));
            primaryStage.show();


        }

    public static void main(String []args){
        launch(args);
        System.out.println("Olá,mundo");
    }
}
