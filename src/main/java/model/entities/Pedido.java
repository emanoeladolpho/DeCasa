package model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.text.DateFormat;

@Entity
public class Pedido{
    @Id
    @Column
    private int id;
    @Column
    private int formaPagamento;
    @Column
    private double totalPreco;
    @Column
    private double desconto;
    @Column
    private DateFormat data;
    @Column
    private int FKVendedor;
    @Column
    private int FKCliente;

    public Pedido(){
    }

    public Pedido(int id, int formaPagamento, double totalPreco, double desconto, DateFormat data, int FKVendedor, int FKCliente) {
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

    public int getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(int formaPagamento) {
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
