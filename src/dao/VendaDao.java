package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Venda;
import util.BancoMySQL;

/**
 *
 * @author Daniel
 */
public class VendaDao {

//acesso a dados de objetos
    public void inserir(Venda obj) { //recebe um objeto cliente

        try {

            String sql = "INSERT into vendas (quantidade,preço,Receita_idReceita,produtos_idprodutos,data) "
                    + "values(?,?,?,?,?)"; //string de comando sql

            BancoMySQL objbanco = new BancoMySQL(); //cria um objeto de banco de dados 
            objbanco.conectar();//usar o objeto de banco de dados para conectar

            PreparedStatement objpat = objbanco.conexao.prepareStatement(sql);

            java.sql.Timestamp datasql;
            datasql = new java.sql.Timestamp(obj.getData().getTime());

            //seta os valores no banco
            objpat.setInt(1, obj.getQuantidade());
            objpat.setFloat(2, obj.getPreço());
            objpat.setInt(3, obj.getIdReceita());
            objpat.setInt(4, obj.getIdProduto());
            objpat.setTimestamp(5, datasql);

            objpat.executeUpdate();
            JOptionPane.showMessageDialog(null, "cliente gravado no banco com sucesso");
            objpat.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro \n inserir" + ex.getMessage());
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void alterar(Venda obj) {

        try {

            String sql = "UPDATE  vendas SET "
                    + "quantidade=?,preço=?,Receita_idReceita=?,produtos_idprodutos=?,data=? "
                    + "WHERE idvendas ='" + obj.getIdVenda() + "'"; //string de comando sql

            BancoMySQL objbanco = new BancoMySQL(); //cria um objeto de banco de dados 
            objbanco.conectar();//usar o objeto de banco de dados para conectar

            PreparedStatement objpat = objbanco.conexao.prepareStatement(sql);

            java.sql.Timestamp datasql;
            datasql = new java.sql.Timestamp(obj.getData().getTime());

            //seta os valores no banco
            objpat.setInt(1, obj.getQuantidade());
            objpat.setFloat(2, obj.getPreço());
            objpat.setInt(3, obj.getIdReceita());
            objpat.setInt(4, obj.getIdProduto());
            objpat.setTimestamp(5, datasql);

            objpat.executeUpdate();

            JOptionPane.showMessageDialog(null, "cliente alterado no banco com sucesso");
            objpat.close();

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "" + ex);
        }
    }

    public void deletar(Venda obj) {
        try {

            String sql = "DELETE  FROM vendas  WHERE idvendas ='" + obj.getIdVenda() + "'"; //string de comando sql

            BancoMySQL objbanco = new BancoMySQL(); //cria um objeto de banco de dados 
            objbanco.conectar();//usar o objeto de banco de dados para conectar
            try (PreparedStatement objpat = objbanco.conexao.prepareStatement(sql)) {

                objpat.executeUpdate();
                JOptionPane.showMessageDialog(null, "vendas deletado no banco com sucesso");

            }

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "erro deletar \n" + ex);
        }

    }

}
