package controller;

import model.entities.Produto;

public class ProdutoController {

    private Produto model;

    public ProdutoController(Produto model){
        this.model = model;
    }

    public String getProdutoCodigo(){
        return this.model.getCodigo();
    }

    public void setProdutoCodigo(String codigo){
        this.model.setCodigo(codigo);
    }

    public String getProdutoNome(){
        return this.model.getNome();
    }

    public void setProdutoNome(String nome){
        this.model.setNome(nome);
    }

    public double getProdutoPreco(){
        return this.model.getPreco();
    }

    public void setProdutoPreco(double preco){
        this.model.setPreco(preco);
    }


}
