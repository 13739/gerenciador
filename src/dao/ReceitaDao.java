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
import model.Receita;
import util.BancoMySQL;

/**
 *
 * @author Daniel
 */
public class ReceitaDao {

//acesso a dados de objetos
    public void inserir(Receita obj) { //recebe um objeto cliente

        try {

            String sql = "INSERT into receitas "
                    + "(funcionarios_idfuncionarios,clientes_idcliente,Data,"
                    + "comissao,valor ) "
                    + "values(?,?,?,?,?)"; //string de comando sql

            BancoMySQL objbanco = new BancoMySQL(); //cria um objeto de banco de dados 
            objbanco.conectar();//usar o objeto de banco de dados para conectar

            PreparedStatement objpat = objbanco.conexao.prepareStatement(sql);

            java.sql.Date datasql;//variavel data do tipo sql
            datasql = new java.sql.Date(obj.getData().getTime());//converte data da util para data sql

            //seta os valores no banco
            objpat.setInt(1, obj.getIdFuncionario());
            objpat.setInt(2, obj.getIdCliente());
            objpat.setDate(3, datasql);
            objpat.setFloat(4, obj.getComissão());
            objpat.setFloat(5, obj.getValor());

            objpat.executeUpdate();
            JOptionPane.showMessageDialog(null, "receita gravado no banco com sucesso");
            objpat.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro receita \n " + ex.getMessage());
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void alterar(Receita obj) {

        try {

            String sql = "UPDATE  receitas SET "
                    + "funcionarios_idfuncionarios=?,clientes_idcliente=?,Data=?,comissao=?,valor=? "
                    + "WHERE idreceita = '" + obj.getIdReceita() + "'";
                    
                    
                   
            BancoMySQL objbanco = new BancoMySQL(); //cria um objeto de banco de dados 
            objbanco.conectar();//usar o objeto de banco de dados para conectar

            PreparedStatement objpat = objbanco.conexao.prepareStatement(sql);

            java.sql.Date datasql;//variavel data do tipo sql
            datasql = new java.sql.Date(obj.getData().getTime());//converte data da util para data sql

            //seta os valores no banco
            objpat.setInt(1, obj.getIdFuncionario());
            objpat.setInt(2, obj.getIdCliente());
            objpat.setDate(3, datasql);
            objpat.setFloat(4, obj.getComissão());
            objpat.setFloat(5, obj.getValor());

            objpat.executeUpdate();
            JOptionPane.showMessageDialog(null, "receita alterado no banco com sucesso");
            objpat.close();

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "" + ex);
        }
    }

    public void deletar(Receita obj) {
        try {

            String sql = "DELETE  FROM receitas  WHERE idreceita ='" + obj.getIdReceita() + "'"; //string de comando sql

            BancoMySQL objbanco = new BancoMySQL(); //cria um objeto de banco de dados 
            objbanco.conectar();//usar o objeto de banco de dados para conectar
            try (PreparedStatement objpat = objbanco.conexao.prepareStatement(sql)) {

                objpat.executeUpdate();
                JOptionPane.showMessageDialog(null, "receita deletado no banco com sucesso");

            }

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "erro deletar \n" + ex);
        }

    }

}
