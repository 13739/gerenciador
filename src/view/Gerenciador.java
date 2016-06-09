/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CtrlCliente;
import controller.CtrlReceita;
import dao.ClienteDao;
import dao.ReceitaDao;
import dao.VendaDao;
import util.BancoMySQL;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Receita;
import model.Venda;
import sun.java2d.pipe.SpanShapeRenderer.Simple;
import static sun.misc.Version.println;

/**
 *
 * @author Daniel
 */
public class Gerenciador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

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
        //data.getTime();
        Date dataf = data.getTime();

       // JOptionPane.showMessageDialog(null, "\n" + dataf);
        rec.setData(data.getTime());

        //client.setEmail("meuemail@chinelão");
        //CtrlReceita rece = new CtrlReceita();
        //ReceitaDao recdao= new ReceitaDao();
        //recdao.alterar(rec);
//rece.CtrlInserirReceita(rec);

           Venda ven = new Venda(); 
           VendaDao vendao = new VendaDao(); 
          // ven.setComissão(20);
           ven.setIdFuncionario(2);
           ven.setIdProduto(1);
           ven.setIdReceita(8);
           ven.setIdVenda(6);
           ven.setQuantidade(666);
           ven.setPreço(3409);
           ven.setData(dataf);
           vendao.deletar(ven);
           
           

    }

}