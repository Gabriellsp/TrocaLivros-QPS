package com.trabalho.trocalivros.qps.View.Livro;

import com.trabalho.trocalivros.qps.Model.Usuario;

public class BuscaLivro extends javax.swing.JFrame {

    private final Usuario usuario;
    
    public BuscaLivro(Usuario usuario) {
        this.usuario = usuario;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        pesquisarTextField = new javax.swing.JTextField();
        pesquisarButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        livrosPane = new javax.swing.JEditorPane();
        idLivroTextField = new javax.swing.JTextField();
        idLivroLabel = new javax.swing.JLabel();
        registrarButton = new javax.swing.JButton();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pesquisarTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarTextFieldActionPerformed(evt);
            }
        });

        pesquisarButton.setText("Pesquisar");
        pesquisarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarButtonActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(livrosPane);

        idLivroLabel.setText("Digite o ID do livro interessado:");

        registrarButton.setText("Registrar interesse");
        registrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(idLivroLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(idLivroTextField)
                .addGap(145, 145, 145))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(pesquisarTextField)
                                .addGap(18, 18, 18)
                                .addComponent(pesquisarButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(registrarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(108, 108, 108)))
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesquisarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesquisarButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLivroLabel)
                    .addComponent(idLivroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(registrarButton)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pesquisarTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisarTextFieldActionPerformed

    private void pesquisarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisarButtonActionPerformed

    private void registrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registrarButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel idLivroLabel;
    private javax.swing.JTextField idLivroTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JEditorPane livrosPane;
    private javax.swing.JButton pesquisarButton;
    private javax.swing.JTextField pesquisarTextField;
    private javax.swing.JButton registrarButton;
    // End of variables declaration//GEN-END:variables
}
