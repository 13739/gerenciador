/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.awt.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;
import model.Funcionario;
import util.BancoMySQL;

/**
 *
 * @author mestre
 */
public class funcionarioDao {
    
    //Acesso aos dados de objeto funcionário

    /**
     *
     * @param obj
     */
    public void inserir(Funcionario obj){
        try{
            
            String sql = "INSERT into funcionarios "
                    + "(nome,endereco,cpf,rg,telefone,"
                    + "comissao,salario,dataNascimento,"
                    + "senha,cargo,porcentagem ) "
                    + "values(?,?,?,?,?,?,?,?,?,?,?)"; //string de comando sql

            BancoMySQL objbanco = new BancoMySQL(); //cria um objeto de banco de dados 
            objbanco.conectar();//usar o objeto de banco de dados para conectar

            PreparedStatement objpat = objbanco.conexao.prepareStatement(sql);

            java.sql.Date dataSql;//variavel data do tipo sql
            dataSql = new java.sql.Date(obj.getDataNascimento().getTime());//converte data da util para data sql

            //seta os valores no banco
            objpat.setString(1, obj.getNome());
            objpat.setString(2, obj.getEndereco());
            objpat.setInt(3, obj.getCpf());
            objpat.setInt(4, obj.getRg());
            objpat.setString(5, obj.getTelefone());
            objpat.setFloat(6, obj.getComissao());
            objpat.setFloat(7, obj.getSalario());
            objpat.setDate(8, dataSql);
            objpat.setString(9, obj.getSenha());
            objpat.setString(10, obj.getCargo());
            objpat.setFloat(11, obj.getPorcentagem());

            objpat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Funcionário gravado no banco com sucesso");
            objpat.close();
            
        } catch(SQLException ex){
            //Processar exceção
            JOptionPane.showMessageDialog(null, "Erro \n Inserir" + ex.getMessage());
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     *
     * @param obj
     */
    public void alterar(Funcionario obj) {
        
    }
    
    /**
     *
     * @param obj
     */
    public void deletar(Funcionario obj) {
        
    }
    
    /** Função para a listagem de funcionários.
     * 
     * @return objeto awt.List, utilizado em menus dropdown
     */
    
    
    public ResultSet listaFuncionarios() throws SQLException{
        //Criando objeto banco
        BancoMySQL objbanco = new BancoMySQL();
        
        //Criando string de consulta
        String sql = "SELECT nome FROM " + objbanco + "funcionarios";

        //Fazendo consulta no banco
        ResultSet rs = objbanco.executarconsulta(sql);

        while(rs.next()){
            System.out.println(rs.getString("nome"));
        }
        
        //Fazendo coerção para retorno
        return rs;
    }//Fechando listaFuncionarios(){

    /*public void listaFuncionarios() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
}