/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author daniel
 */
@Embeddable
public class ProdutosPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idprodutos")
    private int idprodutos;
    @Basic(optional = false)
    @Column(name = "fornecedores_idfornecedores")
    private int fornecedoresIdfornecedores;

    public ProdutosPK() {
    }

    public ProdutosPK(int idprodutos, int fornecedoresIdfornecedores) {
        this.idprodutos = idprodutos;
        this.fornecedoresIdfornecedores = fornecedoresIdfornecedores;
    }

    public int getIdprodutos() {
        return idprodutos;
    }

    public void setIdprodutos(int idprodutos) {
        this.idprodutos = idprodutos;
    }

    public int getFornecedoresIdfornecedores() {
        return fornecedoresIdfornecedores;
    }

    public void setFornecedoresIdfornecedores(int fornecedoresIdfornecedores) {
        this.fornecedoresIdfornecedores = fornecedoresIdfornecedores;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idprodutos;
        hash += (int) fornecedoresIdfornecedores;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProdutosPK)) {
            return false;
        }
        ProdutosPK other = (ProdutosPK) object;
        if (this.idprodutos != other.idprodutos) {
            return false;
        }
        if (this.fornecedoresIdfornecedores != other.fornecedoresIdfornecedores) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "view.ProdutosPK[ idprodutos=" + idprodutos + ", fornecedoresIdfornecedores=" + fornecedoresIdfornecedores + " ]";
    }
    
}
