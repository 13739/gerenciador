/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Cliente;
import dao.ClienteDao;

/**
 *
 * @author Daniel
 */
public class CtrlCliente {

    public void CtrlInserirCliente(Cliente objeto) {

        ClienteDao objDao = new ClienteDao();
        objDao.inserir(objeto);

    }

    public void CtrlAlterarCliente(Cliente objeto) {

        ClienteDao objDao = new ClienteDao();
        objDao.alterar(objeto);
    }

    public void CtrlDeletarCliente(Cliente objeto) {

        ClienteDao objDao = new ClienteDao();
        objDao.deletar(objeto);

    }

}
