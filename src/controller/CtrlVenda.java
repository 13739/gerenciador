package controller;


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
