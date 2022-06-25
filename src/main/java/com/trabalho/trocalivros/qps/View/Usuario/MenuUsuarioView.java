package com.trabalho.trocalivros.qps.View.Usuario;

import com.trabalho.trocalivros.qps.View.Livro.AprovarLivroView;
import com.trabalho.trocalivros.qps.View.TrocaLivro.TrocasEnviadasView;
import com.trabalho.trocalivros.qps.View.TrocaLivro.AprovarTrocaView;
import com.trabalho.trocalivros.qps.Model.Usuario;
import com.trabalho.trocalivros.qps.View.TrocaLivro.RealizarTrocaView;
import com.trabalho.trocalivros.qps.View.Livro.MenuLivroView;
import javax.swing.JFrame;

public class MenuUsuarioView extends javax.swing.JFrame {
    private final Usuario user;
    public MenuUsuarioView(Usuario user) {
        this.user = user;
        initComponents();
        initMenu();   
    }
    
    private void initMenu() {
        aprovarLivrosButton.setVisible(this.user.isIsAdm());
        apresentacaoLabel.setText("Bem vindo, "+user.getNome()+"!");    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        livrosButton = new javax.swing.JButton();
        buscaLivrosButton = new javax.swing.JButton();
        trocasEnviadasButton = new javax.swing.JButton();
        apresentacaoLabel = new javax.swing.JLabel();
        ofertasRecebidasButton = new javax.swing.JButton();
        editarUsuarioButton = new javax.swing.JButton();
        aprovarLivrosButton = new javax.swing.JButton();

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

        trocasEnviadasButton.setText("Trocas Enviadas");
        trocasEnviadasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trocasEnviadasButtonActionPerformed(evt);
            }
        });

        apresentacaoLabel.setText("Bem vindo, !");

        ofertasRecebidasButton.setText("Ofertas Recebidas");
        ofertasRecebidasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ofertasRecebidasButtonActionPerformed(evt);
            }
        });

        editarUsuarioButton.setText("Editar Usuário");
        editarUsuarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarUsuarioButtonActionPerformed(evt);
            }
        });

        aprovarLivrosButton.setText("Aprovar Livros Cadastrados");
        aprovarLivrosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aprovarLivrosButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(apresentacaoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(editarUsuarioButton)
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(livrosButton)
                    .addComponent(buscaLivrosButton)
                    .addComponent(trocasEnviadasButton)
                    .addComponent(ofertasRecebidasButton)
                    .addComponent(aprovarLivrosButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apresentacaoLabel)
                    .addComponent(editarUsuarioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(aprovarLivrosButton)
                .addGap(27, 27, 27)
                .addComponent(livrosButton)
                .addGap(28, 28, 28)
                .addComponent(buscaLivrosButton)
                .addGap(41, 41, 41)
                .addComponent(trocasEnviadasButton)
                .addGap(37, 37, 37)
                .addComponent(ofertasRecebidasButton)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void trocasEnviadasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trocasEnviadasButtonActionPerformed
        TrocasEnviadasView meusInteressesView = new TrocasEnviadasView(user);
        callNewView(meusInteressesView);
    }//GEN-LAST:event_trocasEnviadasButtonActionPerformed
  
    private void livrosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_livrosButtonActionPerformed
        MenuLivroView menuLivroView = new MenuLivroView(user);
        callNewView(menuLivroView);
    }//GEN-LAST:event_livrosButtonActionPerformed

    private void buscaLivrosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaLivrosButtonActionPerformed
        RealizarTrocaView realizarTrocaView = new RealizarTrocaView(user);
        callNewView(realizarTrocaView);
    }//GEN-LAST:event_buscaLivrosButtonActionPerformed

    private void ofertasRecebidasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ofertasRecebidasButtonActionPerformed
        AprovarTrocaView aprovarTrocaView = new AprovarTrocaView(user);
        callNewView(aprovarTrocaView);
    }//GEN-LAST:event_ofertasRecebidasButtonActionPerformed

    private void editarUsuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarUsuarioButtonActionPerformed
        EditarUsuarioView editarUsuarioView = new EditarUsuarioView(user);
        callNewView(editarUsuarioView);
    }//GEN-LAST:event_editarUsuarioButtonActionPerformed

    private void aprovarLivrosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aprovarLivrosButtonActionPerformed
        AprovarLivroView aprovarLivroView = new AprovarLivroView();
        callNewView(aprovarLivroView);
    }//GEN-LAST:event_aprovarLivrosButtonActionPerformed
    
    private void callNewView(JFrame frame){
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apresentacaoLabel;
    private javax.swing.JButton aprovarLivrosButton;
    private javax.swing.JButton buscaLivrosButton;
    private javax.swing.JButton editarUsuarioButton;
    private javax.swing.JButton livrosButton;
    private javax.swing.JButton ofertasRecebidasButton;
    private javax.swing.JButton trocasEnviadasButton;
    // End of variables declaration//GEN-END:variables

}
