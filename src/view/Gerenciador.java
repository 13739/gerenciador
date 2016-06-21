/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CtrlReceita;
import dao.ReceitaDao;
import dao.VendaDao;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Receita;
import model.Venda;

/**
 *
 * @author Daniel
 */
public class Gerenciador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {

        Receita rec = new Receita();
        rec.setComissão(666666);
        rec.setValor(7000000);
        rec.setIdFuncionario(1);

        rec.setIdCliente(2);
        rec.setIdReceita(5);
        //Cliente client = new Cliente();
        //ClienteDao clientdao = new ClienteDao();
        /* client.setEndereço("30 inserido pela controller mesmo");
        client.setNome("nelãoch");
        client.setCpf(189569343);
        //client.setIdCliente(5);
        client.setTelefone("534534897589alt3");
         */
        Calendar data = Calendar.getInstance();
        Date dataf = data.getTime();

        //
        JOptionPane.showMessageDialog(null, "\n" + dataf);
       rec.setData(dataf);

        //client.setEmail("meuemail@chinelão");
        CtrlReceita rece = new CtrlReceita();
        ReceitaDao recdao = new ReceitaDao();
        //recdao.alterar(rec);
rece.CtrlInserirReceita(rec);

        Venda ven = new Venda();
        VendaDao vendao = new VendaDao();
        // ven.setComissão(20);
        ven.setIdFuncionario(1);
        ven.setIdProduto(1);
        ven.setIdReceita(11);
        ven.setIdVenda(0);
        ven.setQuantidade(666);
        ven.setPreço(3409);
        ven.setData(dataf);
        vendao.inserir(ven);
        
      
    }
}
