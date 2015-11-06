
package br.mackenzie.fci.lp2.entidades;

import java.util.*;

/**
 *
 * @author 41381467
 */
public class Pedido {
    private int nroPedido;
    private String status;
    private Date dataPedido;

    public Pedido() {
    }

    public Pedido(int nroPedido, String status, Date dataPedido) {
        this.nroPedido = nroPedido;
        this.status = status;
        this.dataPedido = dataPedido;
    }

    public int getNroPedido() {
        return nroPedido;
    }

    public void setNroPedido(int nroPedido) {
        this.nroPedido = nroPedido;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }
    
    
}
