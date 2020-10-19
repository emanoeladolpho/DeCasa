package application;

import controller.ProdutoController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Produto;
import java.util.ArrayList;
import java.util.Scanner;


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
        Scanner entrada = new Scanner(System.in);
        double valorTotal = 0;

        ProdutoController p1 = new ProdutoController(new Produto("123","Cimento",20.0));
        ProdutoController p2 = new ProdutoController(new Produto("321","Tijolo",0.15));
        ProdutoController p3 = new ProdutoController(new Produto("231","Telha",1.15));

        ArrayList<ProdutoController> produtos = new ArrayList<ProdutoController>();
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);

        ArrayList<ProdutoController> listaDeCompras = new ArrayList<ProdutoController>();

        for(int i = 0; i<3; i++) {

            System.out.println("Qual o produto está sendo comprado: ");
            String produtoCod = entrada.nextLine();

            for (ProdutoController x : produtos) {
                if (x.getProdutoCodigo().equals(produtoCod)) {
                    listaDeCompras.add(x);
                    valorTotal += x.getProdutoPreco();
                }
            }
            System.out.println("Valor total da compra: " + valorTotal);
        }
    }
}
