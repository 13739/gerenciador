/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template the editor.
 */
package model;

import java.util.Date;




public class Receita {
    private int idReceita;
    private float valor ,comissão;
    private int idCliente;
    private int idFuncionario;
    private Date data;

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
     * @return the idCliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * @return the idFuncionario
     */
    public int getIdFuncionario() {
        return idFuncionario;
    }

    /**
     * @param idFuncionario the idFuncionario to set
     */
    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
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

    /**
     * @return the comissão
     */
    public float getComissão() {
        return comissão;
    }

    /**
     * @param comissão the comissão to set
     */
    public void setComissão(float comissão) {
        this.comissão = comissão;
    }
    
    
}
