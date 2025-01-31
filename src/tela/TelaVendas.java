/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import DAO.ProdutoDAO;
import Model.Produto;
import Model.TipoProduto;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Matheus
 */
public class TelaVendas extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    private Principal principal;
    private Produto produtoSelecionado;
    private ProdutoDAO produto = new ProdutoDAO();
    private ArrayList<Produto> listaProduto = new ArrayList<Produto>();
    private ArrayList<Produto> carrinho = new ArrayList<Produto>();

    public TelaVendas(Principal principal) {
        super("Venda de Produtos", true, true, true, true);
        this.principal = principal;
        initComponents();
        listaProduto = produto.todosProdutos();
        montaTable(listaProduto);
        preencheComboBox();
        this.setFocusable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProdutos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jbPesquisar = new javax.swing.JButton();
        jCheckMenorPreco = new javax.swing.JCheckBox();
        jCheckMaiorPreco = new javax.swing.JCheckBox();
        jcbTipoProd = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jbCarrinho = new javax.swing.JButton();
        jbAdicionaProd = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        jToolBar1.setRollover(true);

        setBorder(null);
        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(0, 102, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Venda de Produtos");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jtProdutos.setBackground(new java.awt.Color(204, 204, 204));
        jtProdutos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "PREÇO", "QUANTIDADE", "CATEGORIA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtProdutos);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome");

        jbPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lupa.png"))); // NOI18N
        jbPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });

        jCheckMenorPreco.setText("Menor preço");
        jCheckMenorPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckMenorPrecoActionPerformed(evt);
            }
        });

        jCheckMaiorPreco.setText("Maior preço");
        jCheckMaiorPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckMaiorPrecoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tipo de produto");

        jbCarrinho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrinho-de-compras-de-design-xadrez (1).png"))); // NOI18N
        jbCarrinho.setBorder(null);
        jbCarrinho.setBorderPainted(false);
        jbCarrinho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCarrinhoActionPerformed(evt);
            }
        });

        jbAdicionaProd.setText("Adicionar ao carrinho");
        jbAdicionaProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAdicionaProdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcbTipoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbAdicionaProd)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckMenorPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckMaiorPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbAdicionaProd)))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbTipoProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jCheckMaiorPreco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckMenorPreco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbCarrinho))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
        Produto p = new Produto();
        p.setNome(jtNome.getText());
        String tipoProd = (String) jcbTipoProd.getSelectedItem();
        if (!tipoProd.equals("")) {
            TipoProduto tp = Enum.valueOf(TipoProduto.class, tipoProd);
            p.setTipoProd(tp);
        }
        limpaTabela();
        listaProduto = produto.pesquisaProduto(p);
        montaTable(listaProduto);
    }//GEN-LAST:event_jbPesquisarActionPerformed

    private void jtProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProdutosMouseClicked
        produtoSelecionado = resgataValoresTable();
    }//GEN-LAST:event_jtProdutosMouseClicked

    private void jCheckMenorPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckMenorPrecoActionPerformed
        if (jCheckMenorPreco.isSelected()) {
            tableCrescente(listaProduto);
        } else {
            atualizaTabela();
        }

    }//GEN-LAST:event_jCheckMenorPrecoActionPerformed

    private void jCheckMaiorPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckMaiorPrecoActionPerformed
        if (jCheckMaiorPreco.isSelected()) {
            tableDecrescente(listaProduto);
        } else {
            atualizaTabela();
        }
    }//GEN-LAST:event_jCheckMaiorPrecoActionPerformed

    private void jbCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCarrinhoActionPerformed
        Carrinho c = null;
        c = new Carrinho(principal, carrinho);
        getParent().add(c);
        c.setVisible(true);
    }//GEN-LAST:event_jbCarrinhoActionPerformed

    private void jbAdicionaProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAdicionaProdActionPerformed
        carrinho.add(adicionarProdutoCarrinho());
        JOptionPane.showMessageDialog(null, "Produto adicionado ao carrinho");
    }//GEN-LAST:event_jbAdicionaProdActionPerformed

    public void montaTable(ArrayList<Produto> listP) {
        modelo = (DefaultTableModel) jtProdutos.getModel();

        String[] linha = {null, null, null, null, null, null};
        for (int i = 0; i < listP.size(); i++) {
            modelo.insertRow(i, linha);
            modelo.setValueAt(listP.get(i).getCodProd(), i, 0);
            modelo.setValueAt(listP.get(i).getNome(), i, 1);
            modelo.setValueAt(listP.get(i).getPreco(), i, 2);
            modelo.setValueAt(listP.get(i).getQuantidade(), i, 3);
            modelo.setValueAt(listP.get(i).getTipoProd(), i, 4);
        }

    }

    public Produto resgataValoresTable() {
        int linha = this.jtProdutos.getSelectedRow();
        Produto p = new Produto();
        p.setCodProd(Integer.parseInt(jtProdutos.getValueAt(linha, 0).toString()));
        p.setNome(jtProdutos.getValueAt(linha, 1).toString());
        p.setPreco(Double.parseDouble(jtProdutos.getValueAt(linha, 2).toString()));
        p.setQuantidade(Integer.parseInt(jtProdutos.getValueAt(linha, 3).toString()));
        String tipoProd = jtProdutos.getValueAt(linha, 4).toString();
        TipoProduto tp = Enum.valueOf(TipoProduto.class, tipoProd);
        p.setTipoProd(tp);
        return p;
    }

    public void limpaTabela() {
        modelo = (DefaultTableModel) jtProdutos.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }

    public void atualizaTabela() {
        limpaTabela();
        listaProduto = produto.todosProdutos();
        montaTable(listaProduto);
    }

    public void tableCrescente(ArrayList<Produto> listP) {
        Collections.sort(listP);
        limpaTabela();
        montaTable(listP);
    }

    public void tableDecrescente(ArrayList<Produto> listP) {
        Collections.sort(listP, Collections.reverseOrder());
        limpaTabela();
        montaTable(listP);
    }

    public void preencheComboBox() {
        TipoProduto tp = null;
        ArrayList<String> tipProd = tp.stringTipoProd();
        tipProd.add(0, "");
        jcbTipoProd.setModel(new DefaultComboBoxModel(tipProd.toArray()));
    }

    public Produto adicionarProdutoCarrinho() {
        int linha = this.jtProdutos.getSelectedRow();
        Produto p = new Produto();
        p.setCodProd(Integer.parseInt(jtProdutos.getValueAt(linha, 0).toString()));
        p.setNome(jtProdutos.getValueAt(linha, 1).toString());
        p.setPreco(Double.parseDouble(jtProdutos.getValueAt(linha, 2).toString()));
        p.setQuantidade(1);
        return p;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckMaiorPreco;
    private javax.swing.JCheckBox jCheckMenorPreco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton jbAdicionaProd;
    private javax.swing.JButton jbCarrinho;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JComboBox<String> jcbTipoProd;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTable jtProdutos;
    // End of variables declaration//GEN-END:variables
}
