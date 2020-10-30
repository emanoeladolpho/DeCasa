package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import java.net.URL;
import java.util.ResourceBundle;

public class TelaDataBaseController implements Initializable {
    @FXML
    ChoiceBox acao;
    @FXML
    private TextField idProduto,nomeProduto,precoProduto,codigoBarraProduto;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        acao.getItems().addAll("Inserir","Excluir","Editar");
        acao.getSelectionModel().select("Inserir");
        idProduto.setVisible(false);
        nomeProduto.setVisible(false);
        precoProduto.setVisible(false);
        codigoBarraProduto.setVisible(false);
    }

    public void escolherAcao(){
        if(acao.getSelectionModel().getSelectedItem().equals("Inserir")){
            idProduto.setVisible(true);
            nomeProduto.setVisible(true);
            precoProduto.setVisible(true);
            codigoBarraProduto.setVisible(true);
            idProduto.clear();
            nomeProduto.clear();
            precoProduto.clear();
            codigoBarraProduto.clear();
        }else if(acao.getSelectionModel().getSelectedItem().equals("Editar")){
            idProduto.setVisible(true);
            nomeProduto.setVisible(true);
            nomeProduto.setText("Produto Tal");
            precoProduto.setVisible(true);
            precoProduto.setText("Preço Tal");
            codigoBarraProduto.setVisible(true);
            codigoBarraProduto.setText("Cod Barra Tal");
        }else if(acao.getSelectionModel().getSelectedItem().equals("Excluir")){
            idProduto.setVisible(true);
            nomeProduto.setVisible(false);
            precoProduto.setVisible(false);
            codigoBarraProduto.setVisible(false);
            if(idProduto.getText().equals("tal")) {
                int opcao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o produto: " +
                        idProduto.getText() + " ?");
                if(opcao == 0){
                    JOptionPane.showMessageDialog(null,"Produto Excluido com sucesso!");
                }
            }
        }
    }
}
