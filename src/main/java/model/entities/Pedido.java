package model.entities;

import java.util.Date;

public class Pedido {
    private int id;
    private byte formaPagamento;
    private double totalPreco;
    private double desconto;
    private Date data;
    private int FKVendedor;
    private int FKCliente;


}
