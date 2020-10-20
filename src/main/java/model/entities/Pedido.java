package model.entities;

public class Pedido {
    private int quantidade;
    private String produto;
    private double preço;

    public Pedido(int quantidade, String produto, double preço) {
        this.quantidade = quantidade;
        this.produto = produto;
        this.preço = preço;
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

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }
}
