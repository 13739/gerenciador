/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Produto;
import model.Receita;
import model.Venda;
import util.BancoMySQL;


public class ProdutoDao {
     
    
    public void inserir(Produto obj) { //recebe um objeto cliente

        try {

            String sql = "INSERT into produtos "
                    + "(nome,quantidade,preço,"
                    + "fornecedores_idfornecedores ) "
                    + "values(?,?,?,?)"; //string de comando sql

            BancoMySQL objbanco = new BancoMySQL(); //cria um objeto de banco de dados 
            objbanco.conectar();//usar o objeto de banco de dados para conectar

            PreparedStatement objpat = objbanco.conexao.prepareStatement(sql);


            //seta os valores no banco
            objpat.setString(1, obj.getNomeProduto());
            objpat.setInt(2, obj.getQuantidade());
            objpat.setFloat(3,obj.getPreço());
            objpat.setInt(4, obj.getIdFornecedor());
           

            objpat.executeUpdate();
            JOptionPane.showMessageDialog(null, "produto gravado no banco com sucesso");
            objpat.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro receita \n " + ex.getMessage());
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public void alterar(Produto obj) {

        try {

            String sql = "UPDATE  produtos SET "
                    + "nome=?,quantidade=?,preço =?,fornecedores_idfornecedores=? "
                    + "WHERE idprodutos ='" + obj.getIdProduto() + "'"; //string de comando sql

            BancoMySQL objbanco = new BancoMySQL(); //cria um objeto de banco de dados 
            objbanco.conectar();//usar o objeto de banco de dados para conectar

            PreparedStatement objpat = objbanco.conexao.prepareStatement(sql);

            
            //seta os valores no banco
           objpat.setString(1, obj.getNomeProduto());
            objpat.setInt(2, obj.getQuantidade());
            objpat.setFloat(3,obj.getPreço());
            objpat.setInt(4, obj.getIdFornecedor());
            objpat.executeUpdate();

            JOptionPane.showMessageDialog(null, "produto alterado no banco com sucesso");
            objpat.close();

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "" + ex);
        }
    }
    public void deletar(Produto obj) {
        try {

            String sql = "DELETE  FROM produtos WHERE idprodutos ='" + obj.getIdProduto() + "'"; //string de comando sql

            BancoMySQL objbanco = new BancoMySQL(); //cria um objeto de banco de dados 
            objbanco.conectar();//usar o objeto de banco de dados para conectar
            try (PreparedStatement objpat = objbanco.conexao.prepareStatement(sql)) {

                objpat.executeUpdate();
                JOptionPane.showMessageDialog(null, "produto deletado no banco com sucesso");

            }

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "erro deletar \n" + ex);
        }

    }
    
}
