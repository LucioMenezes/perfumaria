package br.mackenzie.fci.lp2.entidades;

/**
 *
 * @author 41381467
 */
public class Pagamento {
    private int codPagamento;
    private int tipoPagamento;

    public Pagamento() {
    }

    public Pagamento(int codPagamento, int tipoPagamento) {
        this.codPagamento = codPagamento;
        this.tipoPagamento = tipoPagamento;
    }

    public int getCodPagamento() {
        return codPagamento;
    }

    public void setCodPagamento(int codPagamento) {
        this.codPagamento = codPagamento;
    }

    public int getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(int tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
    
    
}
