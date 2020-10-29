package model.dao;

import model.entities.Produto;

import java.util.ArrayList;

public class ProdutosDAO {
    ArrayList<Produto>listaDeProdutos = new ArrayList<>();

    public ArrayList<Produto> getProdutos(){

        this.listaDeProdutos.add(new Produto(456,"Pia",200.00,"cod1",100));
        this.listaDeProdutos.add(new Produto(654,"Vaso",150.00,"cod2",200));
        this.listaDeProdutos.add(new Produto(546,"Cascalho",80.5,"cod3",1000));
        this.listaDeProdutos.add(new Produto(123,"Açucar",1.15,"cod4",2000));
        this.listaDeProdutos.add(new Produto(321,"Arroz",4.00,"cod5",5000));
        this.listaDeProdutos.add(new Produto(213,"óleo",1.75,"cod6",800));
        this.listaDeProdutos.add(new Produto(231,"shampoo",10.15,"cod7",500));
        this.listaDeProdutos.add(new Produto(312,"Nissin",1.10,"cod8",15000));

        return listaDeProdutos;
    }
}
