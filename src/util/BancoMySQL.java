/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class BancoMySQL {

    String url = "jdbc:mysql://localhost:3306/banco";
    String usuario = "root";
    String senha = "deadlock15";
    public Connection conexao = null;

    public void conectar() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.conexao = DriverManager.getConnection(url, usuario, senha);
            JOptionPane.showMessageDialog(null, "conectado no banco");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "problema na coneção e driver do banco" + ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "problema ao se conectar no banco");
        }
    }

    public void desconectar() {
        try {
            this.conexao.close();
            JOptionPane.showMessageDialog(null, "desconectado com sucesso");
        } catch (SQLException ex) {
            // Logger.getLogger(bancomysql.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "problema ao se desconectar no banco");
        }
    }

    public void executarcomando(String sql) {
        try {
            Statement objstm = conexao.createStatement();
            JOptionPane.showMessageDialog(null, "comando executado com sucesso");
            objstm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "problema ao executar comando no banco" + ex.getMessage());
        }
    }

    public ResultSet executarconsulta(String sql) {
        try {
            Statement objstm = conexao.createStatement();
            JOptionPane.showMessageDialog(null, "comando executado com sucesso");
            ResultSet objeto = objstm.executeQuery(sql);
            return objeto;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "problema ao executar comando no banco" + ex.getMessage());
            return null;
        }

    }
}
