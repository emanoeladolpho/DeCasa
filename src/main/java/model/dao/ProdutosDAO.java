package model.dao;

import model.Produto;

import java.util.ArrayList;

public class ProdutosDAO {
    ArrayList<Produto>listaDeProdutos = new ArrayList<>();

    public ArrayList<Produto> getProdutos(){

        this.listaDeProdutos.add(new Produto("456","Pia",200.00));
        this.listaDeProdutos.add(new Produto("654","Vaso",150.00));
        this.listaDeProdutos.add(new Produto("546","Cascalho",80.5));

        return listaDeProdutos;
    }
}
