/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 */
package controller;

import model.Cliente;
import dao.ClienteDao;
import dao.VendaDao;
import model.Venda;

/**
 *
 * @author Daniel
 */
public class CtrlVenda{

    public void CtrlInserirVenda(Venda objeto) {

        VendaDao objDao = new VendaDao();
        objDao.inserir(objeto);

    }

    public void CtrlAlterarVenda(Venda objeto) {

       VendaDao objDao = new VendaDao();
        objDao.inserir(objeto);
    }

    public void CtrlDeletarVenda(Venda objeto) {

        VendaDao objDao = new VendaDao();
        objDao.inserir(objeto);

    }

}
