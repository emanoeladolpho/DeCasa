package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import model.Produto;
import model.dao.ProdutosDAO;
import model.entities.Pedido;

import java.io.IOException;
import java.util.ArrayList;

public class TelaPrincipalController {

    @FXML
    private Hyperlink sair;
    @FXML
    private Button buscarProduto;
    @FXML
    private TextField codigoProduto;
    @FXML
    private Label lblCodigo;
    @FXML
    private TextField quantidade;
    @FXML
    private Label lblValorUnitario;
    @FXML
    private Label lblValorTotal;

    // ATRIBUTOS DA TABELA FINAL DA COMPRA
    @FXML
    private TableView<Pedido> tabelaCompra;
    @FXML
    public TableColumn<Pedido,Integer> quantidadePedido;
    @FXML
    public TableColumn<Pedido,String> nomeProduto;
    @FXML
    public TableColumn<Pedido,Double> precoProduto;
    ArrayList<Produto> produtos = new ArrayList<Produto>();
    ProdutosDAO produtodao = new ProdutosDAO();


    // CRIAR LISTA DE PRODUTOS
    public ArrayList<Produto> criar(){
        produtos = produtodao.getProdutos();
        return produtos;
    }

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

    public void buscarProdutos(ActionEvent event){
        criar();
        for (Produto x: produtos) {
            if(codigoProduto.getText().equals(x.getCodigo())){
                lblCodigo.setText(x.getCodigo());
                lblValorUnitario.setText("" + x.getPreco());
            }
        }
    }

    public void multiplicarQuantidade(){
        for (Produto x: produtos) {
            if(codigoProduto.getText().equals(x.getCodigo())){
                lblValorTotal.setText("" + x.getPreco()*Double.parseDouble(quantidade.getText()));
            }
        }
    }

    public void adicionarProduto(){
        
    }
}
