package model.dao;

import model.entities.Produto;

import java.util.ArrayList;

public class ProdutosDAO {
    ArrayList<Produto>listaDeProdutos = new ArrayList<>();

    public ArrayList<Produto> getProdutos(){

        this.listaDeProdutos.add(new Produto("456","Pia",200.00));
        this.listaDeProdutos.add(new Produto("654","Vaso",150.00));
        this.listaDeProdutos.add(new Produto("546","Cascalho",80.5));
        this.listaDeProdutos.add(new Produto("123","Açucar",1.15));
        this.listaDeProdutos.add(new Produto("321","Arroz",4.00));
        this.listaDeProdutos.add(new Produto("213","óleo",1.75));
        this.listaDeProdutos.add(new Produto("231","shampoo",10.15));
        this.listaDeProdutos.add(new Produto("312","Nissin",1.10));

        return listaDeProdutos;
    }
}
