/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ProdutoDao;
import java.sql.SQLException;
import java.util.List;
import model.Produto;


/**
 *
 * @author daniel
 */
public class CtrlProduto {

    public void CtrlInserirProduto(Produto objeto) {

        ProdutoDao objDao = new ProdutoDao();
        objDao.inserir(objeto);

    }

    public void CtrlAlterarProduto(Produto objeto) {

        ProdutoDao objDao = new ProdutoDao();
        objDao.inserir(objeto);

    }

    public void CtrlDeletarProduto(Produto objeto) {

        ProdutoDao objDao = new ProdutoDao();
        objDao.inserir(objeto);
    }

    public List<Produto> CtrlListarProduto() throws SQLException {

        ProdutoDao objDao = new ProdutoDao();
        return objDao.listar();
    }
}
