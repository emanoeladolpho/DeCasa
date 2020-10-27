package model.entities;

public class Pedido {
    private int quantidade;
    private String produto;
    private Double preco;

    public Pedido(int quantidade, String produto, Double preco) {
        this.quantidade = quantidade;
        this.produto = produto;
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
