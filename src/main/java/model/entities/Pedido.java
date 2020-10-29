package model.entities;

import java.text.DateFormat;

public class Pedido {
    private int id;
    private byte formaPagamento;
    private double totalPreco;
    private double desconto;
    private DateFormat data;
    private int FKVendedor;
    private int FKCliente;

    public Pedido(){

    }

    public Pedido(int id, byte formaPagamento, double totalPreco, double desconto, DateFormat data, int FKVendedor, int FKCliente) {
        this.id = id;
        this.formaPagamento = formaPagamento;
        this.totalPreco = totalPreco;
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

    public double getTotalPreco() {
        return totalPreco;
    }

    public void setTotalPreco(double totalPreco) {
        this.totalPreco = totalPreco;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public DateFormat getData() {
        return data;
    }

    public void setData(DateFormat data) {
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
