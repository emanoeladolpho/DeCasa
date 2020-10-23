package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import model.dao.ProdutosDAO;
import model.entities.Pedido;
import model.entities.Produto;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class TelaPrincipalController implements Initializable {
    @FXML
    private Hyperlink sair;
    @FXML
    private Button btnbuscarProdutos;
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
    @FXML
    private Label lblTotalDoPedido;
    @FXML
    private ImageView imageView;
    @FXML
    private Label lblAtalhosTeclado;
    @FXML
    private Button btnAguardar;
    @FXML
    private Button btnCancelar;
    @FXML
    private Button btnFinalizarVenda;
    @FXML
    private Button btnTeste; // ------------------------- BOTAO DE TESTE PARA CAPTURAR DE TECLA -------------------
    @FXML
    private Label lblTipoCliente;
    @FXML
    private Label lblVendedor;
    @FXML
    private Label lblMarcacaoNomeProduto;
    @FXML
    private Label lblMarcacaoCodigoProduto;
    @FXML
    private Label lblMarcacaoValUnit;
    @FXML
    private Label lblMarcacaoValTotal;

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


    //POP UP PARA INSERÇÃO DE CPF
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

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
            root = FXMLLoader.load(getClass().getResource("/FXML/login.fxml"));
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
                imageView.setImage(new Image("/images/ArtelliJ roz.jpg"));
            }
        }
    }

    public void multiplicarQuantidade(){
        for (Produto x: produtos) {
            if(codigoProduto.getText().equals(x.getCodigo())){
                lblValorTotal.setText("" + x.getPreco()*Double.parseDouble(quantidade.getText()));
                lblTotalDoPedido.setText("" + x.getPreco()*Double.parseDouble(quantidade.getText()));
            }
        }
    }

    public void adicionarProduto(){
    }

}
