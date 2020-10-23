package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.dao.ProdutosDAO;
import model.entities.Produto;
import java.util.ArrayList;
import java.util.Scanner;


public class Main extends Application {

    Stage janela;
    Scene login, criarConta;

        @Override
        public void start(Stage primaryStage) throws Exception{
            Stage stage;
            Parent root2;

            Parent root = FXMLLoader.load(getClass().getResource("/FXML/telaPrincipal.fxml"));
            primaryStage.setTitle("Sistema DeCasa");
            Scene scene = new Scene(root,300,275);
            primaryStage.setScene(scene);
            scene.getStylesheets().add("/telaPrincipal.css");
            //primaryStage.setScene(new Scene(root, 300, 275));
            primaryStage.show();
            scene.setOnKeyPressed(e -> {
                switch (e.getCode()){
                    case F1:
                        System.out.println("VOCE PRESSIONOU A TECLA [F1]");
                    break;

                    case F2:
                        System.out.println("VOCÊ PRESSIONAL A TECLA [F2]");
                    break;

                    case F3:
                        System.out.println("VOCE PRESSIONAL A TECLA [F3]");
                    break;

                    case F4:

                    break;

                    case F5:

                    break;

                    case F6:

                    break;

                    case F7:
                        System.out.println("Lista de todos os atalhos");
                    break;

                    default:
                        System.out.println("ATALHO NÃO EXISTENTE");
                    break;
                }
                /*
                if(e.getCode() == KeyCode.F1){
                    System.out.println("VOCÊ PRESSIONAL A TECLA [F1]");
                }
                 */
            });
        }

    public static void main(String []args){
        launch(args);
        Scanner entrada = new Scanner(System.in);
        double valorTotal = 0;

        ProdutosDAO produtodao = new ProdutosDAO();
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        produtos = produtodao.getProdutos();

        ArrayList<Produto> listaDeCompras = new ArrayList<Produto>();

        /*
        for(int i = 0; i<3; i++) {
            System.out.println("Qual o produto está sendo comprado: ");
            String produtoCod = entrada.nextLine();

            for (Produto x : produtos) {
                if (x.getCodigo().equals(produtoCod)) {
                    listaDeCompras.add(x);
                    valorTotal += x.getPreco();
                }
            }
            System.out.println("Valor total da compra: " + valorTotal);
        }
             */
    }
}
