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
import model.Cliente;
import util.BancoMySQL;

/**
 *
 * @author Daniel
 */
public class ClienteDao {

//acesso a dados de objetos
    public void inserir(Cliente obj) { //recebe um objeto cliente

        try {

            String sql = "INSERT into clientes (nome,endereço,email,datanascimento,telefone ) "
                    + "values(?,?,?,?,?)"; //string de comando sql

            BancoMySQL objbanco = new BancoMySQL(); //cria um objeto de banco de dados 
            objbanco.conectar();//usar o objeto de banco de dados para conectar

            PreparedStatement objpat = objbanco.conexao.prepareStatement(sql);

            java.sql.Date datasql;//variavel data do tipo sql
            datasql = new java.sql.Date(obj.getDataNascimento().getTime());//converte data da util para data sql

            //seta os valores no banco
            objpat.setString(1, obj.getNome());
            objpat.setString(2, obj.getEndereco());
            objpat.setString(3, obj.getEmail());
            objpat.setDate(4, datasql);
            objpat.setString(5, obj.getTelefone());

            objpat.executeUpdate();
            JOptionPane.showMessageDialog(null, "cliente gravado no banco com sucesso");
            objpat.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro \n inserir" + ex.getMessage());
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void alterar(Cliente obj) {

        try {

            String sql = "UPDATE  clientes SET "
                    + "nome=?,endereço=?,email=?,datanascimento=?,telefone=? "
                    + "WHERE idcliente ='" + obj.getIdCliente() + "'"; //string de comando sql

            BancoMySQL objbanco = new BancoMySQL(); //cria um objeto de banco de dados 
            objbanco.conectar();//usar o objeto de banco de dados para conectar

            PreparedStatement objpat = objbanco.conexao.prepareStatement(sql);

            java.sql.Date datasql;//variavel data do tipo sql
            datasql = new java.sql.Date(obj.getDataNascimento().getTime());//converte data da util para data sql

            //seta os valores no banco
            objpat.setString(1, obj.getNome());
            objpat.setString(2, obj.getEndereco());
            objpat.setString(3, obj.getEmail());
            objpat.setDate(4, datasql);
            objpat.setString(5, obj.getTelefone());
            objpat.execute();
            JOptionPane.showMessageDialog(null, "cliente alterado no banco com sucesso");
            objpat.close();

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "" + ex);
        }
    }

    public void deletar(Cliente obj) {
        try {

            String sql = "DELETE  FROM clientes  WHERE idcliente ='" + obj.getIdCliente() + "'"; //string de comando sql

            BancoMySQL objbanco = new BancoMySQL(); //cria um objeto de banco de dados 
            objbanco.conectar();//usar o objeto de banco de dados para conectar
            try (PreparedStatement objpat = objbanco.conexao.prepareStatement(sql)) {

                objpat.executeUpdate();
                JOptionPane.showMessageDialog(null, "cliente deletado no banco com sucesso");

            }

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "erro deletar \n" + ex);
        }

    }

}
