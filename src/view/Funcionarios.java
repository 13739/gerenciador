/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author mestre
 */
@Entity
@Table(name = "funcionarios", catalog = "banco", schema = "")
@NamedQueries({
    @NamedQuery(name = "Funcionarios.findAll", query = "SELECT f FROM Funcionarios f"),
    @NamedQuery(name = "Funcionarios.findByIdFuncionario", query = "SELECT f FROM Funcionarios f WHERE f.idFuncionario = :idFuncionario"),
    @NamedQuery(name = "Funcionarios.findByNome", query = "SELECT f FROM Funcionarios f WHERE f.nome = :nome"),
    @NamedQuery(name = "Funcionarios.findByEndereco", query = "SELECT f FROM Funcionarios f WHERE f.endereco = :endereco"),
    @NamedQuery(name = "Funcionarios.findByCpf", query = "SELECT f FROM Funcionarios f WHERE f.cpf = :cpf"),
    @NamedQuery(name = "Funcionarios.findByRg", query = "SELECT f FROM Funcionarios f WHERE f.rg = :rg"),
    @NamedQuery(name = "Funcionarios.findByTelefone", query = "SELECT f FROM Funcionarios f WHERE f.telefone = :telefone"),
    @NamedQuery(name = "Funcionarios.findByComissao", query = "SELECT f FROM Funcionarios f WHERE f.comissao = :comissao"),
    @NamedQuery(name = "Funcionarios.findBySalario", query = "SELECT f FROM Funcionarios f WHERE f.salario = :salario"),
    @NamedQuery(name = "Funcionarios.findByDataNascimento", query = "SELECT f FROM Funcionarios f WHERE f.dataNascimento = :dataNascimento"),
    @NamedQuery(name = "Funcionarios.findBySenha", query = "SELECT f FROM Funcionarios f WHERE f.senha = :senha"),
    @NamedQuery(name = "Funcionarios.findByCargo", query = "SELECT f FROM Funcionarios f WHERE f.cargo = :cargo"),
    @NamedQuery(name = "Funcionarios.findByPorcentagem", query = "SELECT f FROM Funcionarios f WHERE f.porcentagem = :porcentagem")})
public class Funcionarios implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idFuncionario")
    private Integer idFuncionario;
    @Column(name = "nome")
    private String nome;
    @Column(name = "endereco")
    private String endereco;
    @Column(name = "cpf")
    private Integer cpf;
    @Column(name = "rg")
    private Integer rg;
    @Column(name = "telefone")
    private String telefone;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "comissao")
    private Float comissao;
    @Column(name = "salario")
    private Float salario;
    @Column(name = "dataNascimento")
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;
    @Column(name = "senha")
    private String senha;
    @Column(name = "cargo")
    private String cargo;
    @Column(name = "porcentagem")
    private Float porcentagem;

    public Funcionarios() {
    }

    public Funcionarios(Integer idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public Integer getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Integer idFuncionario) {
        Integer oldIdFuncionario = this.idFuncionario;
        this.idFuncionario = idFuncionario;
        changeSupport.firePropertyChange("idFuncionario", oldIdFuncionario, idFuncionario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        String oldEndereco = this.endereco;
        this.endereco = endereco;
        changeSupport.firePropertyChange("endereco", oldEndereco, endereco);
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        Integer oldCpf = this.cpf;
        this.cpf = cpf;
        changeSupport.firePropertyChange("cpf", oldCpf, cpf);
    }

    public Integer getRg() {
        return rg;
    }

    public void setRg(Integer rg) {
        Integer oldRg = this.rg;
        this.rg = rg;
        changeSupport.firePropertyChange("rg", oldRg, rg);
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        String oldTelefone = this.telefone;
        this.telefone = telefone;
        changeSupport.firePropertyChange("telefone", oldTelefone, telefone);
    }

    public Float getComissao() {
        return comissao;
    }

    public void setComissao(Float comissao) {
        Float oldComissao = this.comissao;
        this.comissao = comissao;
        changeSupport.firePropertyChange("comissao", oldComissao, comissao);
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        Float oldSalario = this.salario;
        this.salario = salario;
        changeSupport.firePropertyChange("salario", oldSalario, salario);
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        Date oldDataNascimento = this.dataNascimento;
        this.dataNascimento = dataNascimento;
        changeSupport.firePropertyChange("dataNascimento", oldDataNascimento, dataNascimento);
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        String oldSenha = this.senha;
        this.senha = senha;
        changeSupport.firePropertyChange("senha", oldSenha, senha);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        String oldCargo = this.cargo;
        this.cargo = cargo;
        changeSupport.firePropertyChange("cargo", oldCargo, cargo);
    }

    public Float getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(Float porcentagem) {
        Float oldPorcentagem = this.porcentagem;
        this.porcentagem = porcentagem;
        changeSupport.firePropertyChange("porcentagem", oldPorcentagem, porcentagem);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFuncionario != null ? idFuncionario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Funcionarios)) {
            return false;
        }
        Funcionarios other = (Funcionarios) object;
        if ((this.idFuncionario == null && other.idFuncionario != null) || (this.idFuncionario != null && !this.idFuncionario.equals(other.idFuncionario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "view.Funcionarios[ idFuncionario=" + idFuncionario + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
