package model.entities;

public class PedidoViewCliente {

    private int quantidade;
    private String produto;
    private double preco;

    public PedidoViewCliente(int quantidade, String produto, double preco) {
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

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
