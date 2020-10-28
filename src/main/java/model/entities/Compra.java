package model.entities;

import java.util.Date;

public class Compra {
    private int id;
    private byte formaPagamento;
    private double total_preco;
    private double desconto;
    private Date data;
    private int FKVendedor;
    private int FKCliente;

    public Compra(){

    }

    public Compra(int id, byte formaPagamento, double total_preco, double desconto, Date data, int FKVendedor, int FKCliente) {
        this.id = id;
        this.formaPagamento = formaPagamento;
        this.total_preco = total_preco;
        this.desconto = desconto;
        this.data = data;
        this.FKVendedor = FKVendedor;
        this.FKCliente = FKCliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public byte getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(byte formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public double getTotal_preco() {
        return total_preco;
    }

    public void setTotal_preco(double total_preco) {
        this.total_preco = total_preco;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getFKVendedor() {
        return FKVendedor;
    }

    public void setFKVendedor(int FKVendedor) {
        this.FKVendedor = FKVendedor;
    }

    public int getFKCliente() {
        return FKCliente;
    }

    public void setFKCliente(int FKCliente) {
        this.FKCliente = FKCliente;
    }
}
