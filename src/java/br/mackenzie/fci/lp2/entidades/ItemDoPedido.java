package br.mackenzie.fci.lp2.entidades;

/**
 *
 * @author 41381467
 */
public class ItemDoPedido {
    private int nroPedido;
    private int codProduto;
    private double preco;
    private int quantidade;

    public ItemDoPedido() {
    }

    public ItemDoPedido(int nroPedido, int codProduto, double preco, int quantidade) {
        this.nroPedido = nroPedido;
        this.codProduto = codProduto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getNroPedido() {
        return nroPedido;
    }

    public void setNroPedido(int nroPedido) {
        this.nroPedido = nroPedido;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    }
