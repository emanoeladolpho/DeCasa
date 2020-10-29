package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import model.dao.ProdutosDAO;
import model.entities.Pedido;
import model.entities.Produto;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class TelaPrincipalController implements Initializable {
    @FXML
    private Hyperlink sair;
    @FXML
    private Hyperlink acessarDataBase;
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
    private ImageView imageView =  new ImageView();
    @FXML
    private Label lblAtalhosTeclado;
    @FXML
    private Button btnAguardar; // REMOVER DEPOIS
    @FXML
    private Button btnCancelar;
    @FXML
    private Button btnFinalizarVenda;
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
    @FXML
    private Label lblNomeProduto;
    @FXML
    private TableView<Pedido> tabelaCompras = new TableView<Pedido>();
    @FXML
    private TableColumn<Pedido,Integer> colunaQuantidade;
    @FXML
    private TableColumn<Pedido,String> colunaProduto;
    @FXML
    private TableColumn<Pedido, Float> colunaPreco;

    DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyy:mm:ss");
    LocalDateTime agora = LocalDateTime.now();

    ArrayList<Produto> produtos = new ArrayList<Produto>();
    ProdutosDAO produtodao = new ProdutosDAO();

    // ONDE OS PRODUTOS DA COMPRA FICAM ARMAZENADOS
    ObservableList<Pedido> data = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        quantidade.setText("1");
        colunaQuantidade.setCellValueFactory(new PropertyValueFactory<>("quantidade"));
        colunaProduto.setCellValueFactory(new PropertyValueFactory<>("produto"));
        colunaPreco.setCellValueFactory(new PropertyValueFactory<>("preco"));
        tabelaCompras.setItems(data);
    }
    // CRIAR LISTA DE PRODUTOS
    public ArrayList<Produto> criar(){
        produtos = produtodao.getProdutos();
        return produtos;
    }

    public void buscarProdutos(ActionEvent event){
        System.out.println(agora);
        criar();
        for (Produto x: produtos) {
            if(codigoProduto.getText().equals(x.getId())){ // talvez converter o tipo depois
                lblNomeProduto.setText(x.getNome());
                lblCodigo.setText(String.valueOf(x.getId()));
                lblValorUnitario.setText(String.valueOf(x.getPreco()));
                imageView.setImage(new Image("/images/Arroz.jpg"));
            }
        }
    }

    public void multiplicarQuantidade(){
        for (Produto x: produtos) {
            if(codigoProduto.getText().equals(x.getId())){
                lblValorTotal.setText(String.valueOf(x.getPreco()*Double.parseDouble(quantidade.getText())));
            }
        }
    }

    public void adicionarProduto(){
        double valorTotalDoPedido = 0;
        //adicionando itens na lista de compra dinamicamente
//        data.add(new Pedido(Integer.parseInt(quantidade.getText()),lblNomeProduto.getText(),
//                Double.parseDouble(lblValorTotal.getText())));

        //data.add(new Pedido(1,(byte)1,120.2,0.0,formatoData.format(agora),1,1));

        // Fazendo a soma total do pedido
        for(int i = 0; i < tabelaCompras.getItems().size(); i++){
            valorTotalDoPedido += tabelaCompras.getItems().get(i).getTotalPreco();
            lblTotalDoPedido.setText(String.valueOf(valorTotalDoPedido));
        }
        lblNomeProduto.setText("");
        codigoProduto.clear();
        quantidade.clear();
        lblCodigo.setText("");
        lblValorUnitario.setText("");
        lblValorTotal.setText("");
    }

    public void finalizarVenda(){
    }


    public void cancelar(){
    }

    public void acessarDataBase(ActionEvent event) throws IOException {
        Stage stage = null;
        Parent root = null;

        if(event.getSource() == acessarDataBase){
            stage = (Stage) acessarDataBase.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("/FXML/telaDataBase.fxml"));
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
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

}
