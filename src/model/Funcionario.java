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
public class Funcionario extends Pessoa{
   private int idFuncionario;
   private String nome;
   private String endereco;
   private int cpf;
   private int rg;
   private String telefone;
   private float comissao;
   private float salario;
   private Date dataNascimento;
   private String senha;
   private String cargo;
   private float porcentagem;

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
     * @return the nome
     */
    public String getNome() {
        return nome;
    }
    
   @Override
    public String toString(){
        return this.nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the cpf
     */
    public int getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the rg
     */
    public int getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(int rg) {
        this.rg = rg;
    }

    /**
     * @return the telefone
     */
   @Override
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
   @Override
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the comissão
     */
    public float getComissao() {
        return comissao;
    }

    /**
     * @param comissao
     */
    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    /**
     * @return the salario
     */
    public float getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(float salario) {
        this.salario = salario;
    }

    /**
     * @return the dataNascimento
     */
   @Override
    public Date getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
   @Override
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the porcentagem
     */
    public float getPorcentagem() {
        return porcentagem;
    }

    /**
     * @param porcentagem the porcentagem to set
     */
    public void setPorcentagem(float porcentagem) {
        this.porcentagem = porcentagem;
    }
     

    
   

    
}