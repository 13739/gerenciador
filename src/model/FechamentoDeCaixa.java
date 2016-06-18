package model;

import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daniel
 */
public class FechamentoDeCaixa {
   private Date data;
   private int idfuncionario;
   private float ReceitasTotais;
   private float DespesasTotais;
   private float caixa;

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
     * @return the idfuncionario
     */
    public int getIdfuncionario() {
        return idfuncionario;
    }

    /**
     * @param idfuncionario the idfuncionario to set
     */
    public void setIdfuncionario(int idfuncionario) {
        this.idfuncionario = idfuncionario;
    }

    /**
     * @return the ReceitasTotais
     */
    public float getReceitasTotais() {
        return ReceitasTotais;
    }

    /**
     * @param ReceitasTotais the ReceitasTotais to set
     */
    public void setReceitasTotais(float ReceitasTotais) {
        this.ReceitasTotais = ReceitasTotais;
    }

    /**
     * @return the DespesasTotais
     */
    public float getDespesasTotais() {
        return DespesasTotais;
    }

    /**
     * @param DespesasTotais the DespesasTotais to set
     */
    public void setDespesasTotais(float DespesasTotais) {
        this.DespesasTotais = DespesasTotais;
    }

    /**
     * @return the caixa
     */
    public float getCaixa() {
        return caixa;
    }

    /**
     * @param caixa the caixa to set
     */
    public void setCaixa(float caixa) {
        this.caixa = caixa;
    }
   
   
    
}
