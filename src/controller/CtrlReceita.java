/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ClienteDao;
import dao.ReceitaDao;
import model.Cliente;
import model.Receita;

/**
 *
 * @author daniel
 */
public class CtrlReceita {

    public void CtrlInserirReceita(Receita objeto) {

        ReceitaDao objDao = new ReceitaDao();
        objDao.inserir(objeto);

    }

    public void CtrlAlterarCliente(Receita objeto) {

        ReceitaDao objDao = new ReceitaDao();
        objDao.inserir(objeto);

    }

    public void CtrlDeletarCliente(Receita objeto) {

        ReceitaDao objDao = new ReceitaDao();
        objDao.inserir(objeto);
    }

}
