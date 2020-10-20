package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Produto;
import model.dao.ProdutosDAO;
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
