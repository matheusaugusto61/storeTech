/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import java.awt.Color;

/**
 *
 * @author Matheus
 */
public class TrocaSenha extends javax.swing.JFrame {

    /**
     * Creates new form trocaSenha
     */
    public TrocaSenha() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jbRecuperar = new javax.swing.JButton();
        jbFechar = new javax.swing.JButton();
        jbFecha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setSize(new java.awt.Dimension(10, 10));

        jPanel1.setBackground(new java.awt.Color(0, 102, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Troca de senha");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Digite seu email para continuar");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jbRecuperar.setBackground(new java.awt.Color(0, 102, 51));
        jbRecuperar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbRecuperar.setForeground(new java.awt.Color(255, 255, 255));
        jbRecuperar.setText("Recuperar senha");
        jbRecuperar.setFocusPainted(false);
        jbRecuperar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbRecuperarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbRecuperarMouseExited(evt);
            }
        });
        jbRecuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRecuperarActionPerformed(evt);
            }
        });

        jbFechar.setBackground(new java.awt.Color(255, 0, 0));
        jbFechar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbFechar.setForeground(new java.awt.Color(255, 255, 255));
        jbFechar.setText("Fechar");
        jbFechar.setFocusPainted(false);
        jbFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbFecharMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbFecharMouseExited(evt);
            }
        });
        jbFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbFechar)
                    .addComponent(jTextField1)
                    .addComponent(jbRecuperar, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jbRecuperar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jbFechar)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jbFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao-x (2).png"))); // NOI18N
        jbFecha.setBorder(null);
        jbFecha.setBorderPainted(false);
        jbFecha.setContentAreaFilled(false);
        jbFecha.setFocusPainted(false);
        jbFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbFecha))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jbFecha)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbFecharActionPerformed

    private void jbRecuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRecuperarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbRecuperarActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jbRecuperarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbRecuperarMouseEntered
        jbRecuperar.setBackground(new Color(235,235,235));
        jbRecuperar.setForeground(new Color(58,65,84));
    }//GEN-LAST:event_jbRecuperarMouseEntered

    private void jbRecuperarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbRecuperarMouseExited
        jbRecuperar.setBackground(new Color(0,102,51));
        jbRecuperar.setForeground(Color.WHITE);
    }//GEN-LAST:event_jbRecuperarMouseExited

    private void jbFecharMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbFecharMouseEntered
        jbFechar.setBackground(new Color(235,235,235));
        jbFechar.setForeground(new Color(58,65,84));
    }//GEN-LAST:event_jbFecharMouseEntered

    private void jbFecharMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbFecharMouseExited
        jbFechar.setBackground(new Color(255,0,0));
        jbFechar.setForeground(Color.WHITE);
    }//GEN-LAST:event_jbFecharMouseExited

    private void jbFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFechaActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbFechaActionPerformed

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbFecha;
    private javax.swing.JButton jbFechar;
    private javax.swing.JButton jbRecuperar;
    // End of variables declaration//GEN-END:variables
}
