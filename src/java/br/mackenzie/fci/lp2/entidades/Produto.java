package br.mackenzie.fci.lp2.entidades;

/**
 *
 * @author 41381467
 */
public class Produto {
    private int codProduto;
    private String nomeProduto;
    private int qtdeDisponivel;

    public Produto() {
    }

    public Produto(int codProduto, String nomeProduto, int qtdeDisponivel) {
        this.codProduto = codProduto;
        this.nomeProduto = nomeProduto;
        this.qtdeDisponivel = qtdeDisponivel;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQtdeDisponivel() {
        return qtdeDisponivel;
    }

    public void setQtdeDisponivel(int qtdeDisponivel) {
        this.qtdeDisponivel = qtdeDisponivel;
    }
    
    
}
