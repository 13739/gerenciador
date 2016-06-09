/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Daniel
 */
public class Venda extends Receita {

    private int idVenda;
    private int quantidade;
    private int idReceita;
    private int idProduto;
    private float preço;
    private Date data;

    /**
     * @return the idVenda
     */
    public int getIdVenda() {
        return idVenda;
    }

    /**
     * @param idVenda the idVenda to set
     */
    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
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
     * @return the idReceita
     */
    public int getIdReceita() {
        return idReceita;
    }

    /**
     * @param idReceita the idReceita to set
     */
    public void setIdReceita(int idReceita) {
        this.idReceita = idReceita;
    }

    /**
     * @return the idProduto
     */
    public int getIdProduto() {
        return idProduto;
    }

    /**
     * @param idProduto the idProduto to set
     */
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    /**
     * @return the preço
     */
    public float getPreço() {
        return preço;
    }

    /**
     * @param preço the preço to set
     */
    public void setPreço(float preço) {
        this.preço = preço;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }
}
