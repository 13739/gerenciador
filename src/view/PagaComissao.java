/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.funcionarioDao;
import java.awt.Dimension;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Funcionario;
import util.BancoMySQL;


/**
 *
 * @author mestre
 */
public class PagaComissao extends javax.swing.JFrame {
    
    //Carregando
    BancoMySQL bd = new BancoMySQL();
    ResultSet rsFunc, rsReceita;
    float vendasAcumuladasMes = 0;
    float vendasAcumuladasDia = 0;
    float comissaoAcumuladaMes = 0;
    float comissaoAcumuladaDia = 0;
    
    /**
     * Creates new form PagaComissao
     */
    public PagaComissao() {        
        try {
            //Conectando ao BD
            bd.conectar();
        } catch (SQLException ex) {
            Logger.getLogger(PagaComissao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        initComponents();
        listaElementosJComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jbOk = new javax.swing.JButton();
        jbVoltar = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbFecharCaixa = new javax.swing.JButton();
        jbQuebra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Colaborador:");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Vendas acumuladas:");

        jLabel3.setText("Vendas hoje:");

        jLabel4.setText("Comissão acumulada:");

        jLabel5.setText("Comissão diária:");

        jTextField1.setEditable(false);
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.setMinimumSize(new java.awt.Dimension(73, 24));
        jTextField1.setPreferredSize(new Dimension(73,25));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField2.setMinimumSize(new java.awt.Dimension(73, 24));
        jTextField2.setPreferredSize(new Dimension(73,25));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField3.setMinimumSize(new java.awt.Dimension(73, 24));
        jTextField3.setPreferredSize(new Dimension(73,25));

        jTextField4.setEditable(false);
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField4.setMinimumSize(new java.awt.Dimension(73, 24));
        jTextField4.setPreferredSize(new Dimension(73,25));

        jLabel7.setText("Saque comissão:");

        jTextField6.setText("jTextField6");
        jTextField6.setMinimumSize(new java.awt.Dimension(73, 24));
        jTextField6.setPreferredSize(new Dimension(73,25));

        jLabel6.setText("Saldo em caixa:");

        jTextField5.setEditable(false);
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField5.setPreferredSize(new Dimension(91,25));

        jbOk.setText("OK");
        jbOk.setMaximumSize(new java.awt.Dimension(70, 32));
        jbOk.setMinimumSize(new java.awt.Dimension(70, 32));
        jbOk.setPreferredSize(new java.awt.Dimension(70, 32));
        jbOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoOk(evt);
            }
        });

        jbVoltar.setText("Voltar");
        jbVoltar.setPreferredSize(new java.awt.Dimension(70, 32));
        jbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltar(evt);
            }
        });

        jbSalvar.setText("Salvar");
        jbSalvar.setPreferredSize(new java.awt.Dimension(70, 32));
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvar(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbOk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(8, 8, 8)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbOk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbFecharCaixa.setText("Fechar Caixa");
        jbFecharCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFecharCaixaActionPerformed(evt);
            }
        });

        jbQuebra.setText("Quebra");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(52, 52, 52)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(27, 27, 27)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(37, 37, 37)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jbQuebra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jbFecharCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbFecharCaixa)
                            .addComponent(jbQuebra))))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaElementosJComboBox(){
        
        //Lendo nome de funcionários
        rsFunc = bd.executarconsulta("SELECT idFuncionario, nome FROM funcionarios");
        
        try {
            //Inserindo primeiro item
            jComboBox1.addItem("Selecione um funcionário!");
            
            //Enquanto houver o que listar, será impresso
            while(rsFunc.next()){
                //Adicionando item
                jComboBox1.addItem(rsFunc.getString("nome"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PagaComissao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void jbFecharCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharCaixaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbFecharCaixaActionPerformed

    private void botaoVoltar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltar
        //Retornando sem salvar alterações
        dispose();        
    }//GEN-LAST:event_botaoVoltar

    private void botaoSalvar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvar
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoSalvar

    private void botaoOk(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoOk
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoOk

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        //Identificando funcionario selecionado
        String func = (String)jComboBox1.getSelectedItem();
        boolean haVendasMes = false;
        boolean haVendasDia = false;
        boolean haComissaoMes = false;
        boolean haComissaoDia = false;
        
        
        if(!func.equals("Selecione um funcionário!")){
            try {
                //Retornando
                rsFunc.beforeFirst();
                
                //Zerando variável
                vendasAcumuladasMes = 0;
                vendasAcumuladasDia = 0;
                comissaoAcumuladaMes = 0;
                comissaoAcumuladaDia = 0;
                
                //Percorrendo
                while(rsFunc.next()){
                    if(func.equalsIgnoreCase(rsFunc.getString("nome"))){
                        String temp = "SELECT data, comissao, valor FROM Receitas WHERE funcionariosIDFuncionario = " + rsFunc.getInt("idFuncionario");
                        
                        System.out.println("String: " + temp);
                        rsReceita = bd.executarconsulta(temp);
                        
                        //Listando vendas do funcionário
                        while(rsReceita.next()){
                            //Listando comissão acumulada no mês
                            if(rsReceita.getString("data").substring(0, 7).equalsIgnoreCase(getDateTime().substring(0, 7))){
                                //System.out.println("Compras: " + rsReceita.getString("data") + " Lido: " + getDateTime());
                                
                                vendasAcumuladasMes += Float.parseFloat(rsReceita.getString("valor"));
                                comissaoAcumuladaMes += Float.parseFloat(rsReceita.getString("comissao"));
                            }
                            
                            //Listando comissão acumulada no dia
                            if(rsReceita.getString("data").substring(0, 10).equalsIgnoreCase(getDateTime().substring(0, 10))){
                                //System.out.println("Compras: " + rsReceita.getString("data") + " Lido: " + getDateTime());
                                
                                vendasAcumuladasDia += Float.parseFloat(rsReceita.getString("valor"));
                                comissaoAcumuladaDia += Float.parseFloat(rsReceita.getString("comissao"));
                            }
                        }
                        
                        haVendasMes = vendasAcumuladasMes > 0;
                        haVendasDia = vendasAcumuladasDia > 0;
                        haComissaoMes = comissaoAcumuladaMes > 0;
                        haComissaoDia = comissaoAcumuladaDia > 0;
                               
                        break;
                    }
                }
                
                if(haVendasMes){
                    jTextField1.setText(String.format("%.2f", vendasAcumuladasMes));
                    System.out.println("Vendas Total: " + vendasAcumuladasMes);
                }
                else{
                    jTextField1.setText("0.00");
                }
                
                if(haVendasDia){
                    jTextField3.setText(String.format("%.2f", vendasAcumuladasDia));
                }
                else{
                    jTextField3.setText("0.00");
                }
                
                if(haComissaoMes){
                    jTextField2.setText(String.format("%.2f", comissaoAcumuladaMes));
                }
                else{
                    jTextField2.setText("0.00");
                }
                
                if(haComissaoDia){
                    jTextField4.setText(String.format("%.2f", comissaoAcumuladaDia));
                }
                else{
                    jTextField4.setText("0.00");
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(PagaComissao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
                        
        Date d2 = new Date();
        /*        
        //Lendo nome de funcionários
        //ResultSet rs = bd.executarconsulta("SELECT data FROM Receitas WHERE funcionariosIDFuncionario = ?");
        
        try {
            //Enquanto houver o que listar, será impresso
            while(rs.next()){
                //Adicionando item
                if(rs.getString("dataNascimento").equalsIgnoreCase(getDateTime())){
                    System.out.println(rs.getString("dataNascimento") + " Lido: " + getDateTime());
                }
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(PagaComissao.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
                     
        System.out.println("Seleção: " + func + "Data: " + d2 + "Data: " + getDateTime());
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private String getDateTimeF2() {
	DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd 00:00:00.000");
	Date date = new Date();
	return dateFormat.format(date);
    }
    
    private String getDateTime() {
	DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	Date date = new Date();
	return dateFormat.format(date);
    }
    
    //Listando por data
    /*public List<Funcionarios> getListaByData(Date data) throws SQLException {
        String sql = " select * from anavend where data BETWEEN ? AND ?";
        
        
        java.sql.PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setDate(1, data);
        stmt.setDate(2, data);
        ResultSet rs = stmt.executeQuery();
        List<Anavend> listaByData = new ArrayList<Anavend>();
        while (rs.next()) {
            Anavend vend = new Anavend();
            vend.setData(rs.getString("data"));
            vend.setVendedor(rs.getString("vend"));
            vend.setLoja(rs.getString("loja"));
            vend.setValor(Double.parseDouble(rs.getString("valorVendido")));
            listaByData.add(vend);
        }
        rs.close();
        stmt.close();
        return listaByData;
    }*/
    
    /*private String getDateTime() {
	//DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date date = new Date();
	return dateFormat.format(date);
    }*/
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PagaComissao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PagaComissao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PagaComissao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PagaComissao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PagaComissao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JButton jbFecharCaixa;
    private javax.swing.JButton jbOk;
    private javax.swing.JButton jbQuebra;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JButton jbVoltar;
    // End of variables declaration//GEN-END:variables
}
