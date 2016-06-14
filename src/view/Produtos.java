/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author daniel
 */
@Entity
@Table(name = "produtos", catalog = "banco", schema = "")
@NamedQueries({
    @NamedQuery(name = "Produtos.findAll", query = "SELECT p FROM Produtos p"),
    @NamedQuery(name = "Produtos.findByIdprodutos", query = "SELECT p FROM Produtos p WHERE p.produtosPK.idprodutos = :idprodutos"),
    @NamedQuery(name = "Produtos.findByNome", query = "SELECT p FROM Produtos p WHERE p.nome = :nome"),
    @NamedQuery(name = "Produtos.findByQuantidade", query = "SELECT p FROM Produtos p WHERE p.quantidade = :quantidade"),
    @NamedQuery(name = "Produtos.findByPre\u00e7o", query = "SELECT p FROM Produtos p WHERE p.pre\u00e7o = :pre\u00e7o"),
    @NamedQuery(name = "Produtos.findByFornecedoresIdfornecedores", query = "SELECT p FROM Produtos p WHERE p.produtosPK.fornecedoresIdfornecedores = :fornecedoresIdfornecedores")})
public class Produtos implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProdutosPK produtosPK;
    @Column(name = "Nome")
    private String nome;
    @Column(name = "quantidade")
    private Integer quantidade;
    @Column(name = "pre\u00e7o")
    private Short preço;

    public Produtos() {
    }

    public Produtos(ProdutosPK produtosPK) {
        this.produtosPK = produtosPK;
    }

    public Produtos(int idprodutos, int fornecedoresIdfornecedores) {
        this.produtosPK = new ProdutosPK(idprodutos, fornecedoresIdfornecedores);
    }

    public ProdutosPK getProdutosPK() {
        return produtosPK;
    }

    public void setProdutosPK(ProdutosPK produtosPK) {
        this.produtosPK = produtosPK;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        Integer oldQuantidade = this.quantidade;
        this.quantidade = quantidade;
        changeSupport.firePropertyChange("quantidade", oldQuantidade, quantidade);
    }

    public Short getPreço() {
        return preço;
    }

    public void setPreço(Short preço) {
        Short oldPreço = this.preço;
        this.preço = preço;
        changeSupport.firePropertyChange("pre\u00e7o", oldPreço, preço);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (produtosPK != null ? produtosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produtos)) {
            return false;
        }
        Produtos other = (Produtos) object;
        if ((this.produtosPK == null && other.produtosPK != null) || (this.produtosPK != null && !this.produtosPK.equals(other.produtosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "view.Produtos[ produtosPK=" + produtosPK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
