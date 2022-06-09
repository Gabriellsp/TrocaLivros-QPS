package com.trabalho.trocalivros.qps.View.Usuario;

import com.trabalho.trocalivros.qps.Model.Usuario;
import com.trabalho.trocalivros.qps.View.Livro.BuscaLivro;
import com.trabalho.trocalivros.qps.View.Livro.MenuLivro;
import javax.swing.JFrame;

public class MenuUsuario extends javax.swing.JFrame {
    private final Usuario user;
    public MenuUsuario(Usuario user) {
        this.user = user;
        initComponents();
        apresentacaoLabel.setText("Bem vindo, "+user.getNome()+"!");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        livrosButton = new javax.swing.JButton();
        buscaLivrosButton = new javax.swing.JButton();
        minhasTrocasButton = new javax.swing.JButton();
        apresentacaoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        livrosButton.setText("Livros");
        livrosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                livrosButtonActionPerformed(evt);
            }
        });

        buscaLivrosButton.setText("Buscar Livros Disponíveis");
        buscaLivrosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaLivrosButtonActionPerformed(evt);
            }
        });

        minhasTrocasButton.setText("Minhas Trocas");
        minhasTrocasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minhasTrocasButtonActionPerformed(evt);
            }
        });

        apresentacaoLabel.setText("Bem vindo, !");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(livrosButton)
                            .addComponent(buscaLivrosButton)
                            .addComponent(minhasTrocasButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(apresentacaoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(apresentacaoLabel)
                .addGap(58, 58, 58)
                .addComponent(livrosButton)
                .addGap(35, 35, 35)
                .addComponent(buscaLivrosButton)
                .addGap(41, 41, 41)
                .addComponent(minhasTrocasButton)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minhasTrocasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minhasTrocasButtonActionPerformed
        
    }//GEN-LAST:event_minhasTrocasButtonActionPerformed

    private void livrosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_livrosButtonActionPerformed
        MenuLivro menuLivro = new MenuLivro(user);
        menuLivro.setLocationRelativeTo(null);
        menuLivro.setVisible(true);
        menuLivro.setResizable(false);
        menuLivro.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }//GEN-LAST:event_livrosButtonActionPerformed

    private void buscaLivrosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaLivrosButtonActionPerformed
        BuscaLivro buscaLivro = new BuscaLivro(user);
        buscaLivro.setLocationRelativeTo(null);
        buscaLivro.setVisible(true);
        buscaLivro.setSize(507, 450);
        buscaLivro.setResizable(true);
        buscaLivro.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }//GEN-LAST:event_buscaLivrosButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apresentacaoLabel;
    private javax.swing.JButton buscaLivrosButton;
    private javax.swing.JButton livrosButton;
    private javax.swing.JButton minhasTrocasButton;
    // End of variables declaration//GEN-END:variables
}
