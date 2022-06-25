package com.trabalho.trocalivros.qps.View.Livro;

import com.trabalho.trocalivros.qps.Model.Usuario;
import javax.swing.JFrame;

public class MenuLivroView extends javax.swing.JFrame {

    Usuario usuario;
    public MenuLivroView(Usuario usuario) {
        this.usuario = usuario;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cadastrarLivroButton = new javax.swing.JButton();
        editarLivroButton = new javax.swing.JButton();
        excluirLivroButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cadastrarLivroButton.setText("Cadastrar Livro");
        cadastrarLivroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarLivroButtonActionPerformed(evt);
            }
        });

        editarLivroButton.setText("Editar Livro");
        editarLivroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarLivroButtonActionPerformed(evt);
            }
        });

        excluirLivroButton.setText("Excluir Livro");
        excluirLivroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirLivroButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(excluirLivroButton)
                    .addComponent(cadastrarLivroButton)
                    .addComponent(editarLivroButton))
                .addContainerGap(140, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cadastrarLivroButton, editarLivroButton, excluirLivroButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(cadastrarLivroButton)
                .addGap(18, 18, 18)
                .addComponent(editarLivroButton)
                .addGap(18, 18, 18)
                .addComponent(excluirLivroButton)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cadastrarLivroButton, editarLivroButton, excluirLivroButton});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarLivroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarLivroButtonActionPerformed
        CadastrarLivroView cadastrarLivroView = new CadastrarLivroView(usuario);
        callNewView(cadastrarLivroView);
    }//GEN-LAST:event_cadastrarLivroButtonActionPerformed

    private void editarLivroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarLivroButtonActionPerformed
        EditarLivroView editarLivroView = new EditarLivroView(usuario);
        callNewView(editarLivroView);
    }//GEN-LAST:event_editarLivroButtonActionPerformed

    private void excluirLivroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirLivroButtonActionPerformed
        ExcluirLivroView excluirLivroView = new ExcluirLivroView(usuario);
        callNewView(excluirLivroView);
    }//GEN-LAST:event_excluirLivroButtonActionPerformed
    
    private void callNewView(JFrame frame){
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarLivroButton;
    private javax.swing.JButton editarLivroButton;
    private javax.swing.JButton excluirLivroButton;
    // End of variables declaration//GEN-END:variables
}
