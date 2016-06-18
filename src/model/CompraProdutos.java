/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author daniel
 */
public class CompraProdutos {
    private int codigoproduto;
    private int quantidade;
    private int codfornecedor;
    private int idDespesa;
    private float valor ;

    /**
     * @return the codigoproduto
     */
    public int getCodigoproduto() {
        return codigoproduto;
    }

    /**
     * @param codigoproduto the codigoproduto to set
     */
    public void setCodigoproduto(int codigoproduto) {
        this.codigoproduto = codigoproduto;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the codfornecedor
     */
    public int getCodfornecedor() {
        return codfornecedor;
    }

    /**
     * @param codfornecedor the codfornecedor to set
     */
    public void setCodfornecedor(int codfornecedor) {
        this.codfornecedor = codfornecedor;
    }

    /**
     * @return the idDespesa
     */
    public int getIdDespesa() {
        return idDespesa;
    }

    /**
     * @param idDespesa the idDespesa to set
     */
    public void setIdDespesa(int idDespesa) {
        this.idDespesa = idDespesa;
    }

    /**
     * @return the valor
     */
    public float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(float valor) {
        this.valor = valor;
    }
    
    
}
