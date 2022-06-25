package com.trabalho.trocalivros.qps.View.TrocaLivro;

import com.trabalho.trocalivros.qps.Controller.Interface.ILivroController;
import com.trabalho.trocalivros.qps.Controller.Interface.ITrocaLivroController;
import com.trabalho.trocalivros.qps.Controller.LivroController;
import com.trabalho.trocalivros.qps.Controller.TrocaLivroController;
import com.trabalho.trocalivros.qps.DataBase.ItensData;
import com.trabalho.trocalivros.qps.Model.Abstract.Item;
import com.trabalho.trocalivros.qps.Model.Livro;
import com.trabalho.trocalivros.qps.Model.TrocaItem;
import com.trabalho.trocalivros.qps.Model.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

public class RealizarTrocaView extends javax.swing.JFrame {

    private final Usuario usuario;
    private final ILivroController livroController;
    private final ITrocaLivroController trocaLivroController;
    private List<Item> itensDoUsuario;
    
    public RealizarTrocaView(Usuario usuario) {
        this.usuario = usuario;
        this.livroController = new LivroController();
        this.trocaLivroController = new TrocaLivroController();
        initComponents();
        initListaItensDoUsuario();
        initListaItensDisponiveis();
    }
    
    private void initListaItensDoUsuario() {
        livrosUsuarioComboBox.removeAllItems();
        itensDoUsuario = livroController.GetItensDisponiveisDoUsuario(usuario.getId());
        for(Item item : itensDoUsuario) {
            livrosUsuarioComboBox.addItem(item.getNome());
        }
    }
    
    
    private void initListaItensDisponiveis() {
        List<Item> listaItensDisponiveis = livroController.GetItensDisponiveisParaTroca(usuario.getId());
        DefaultListModel listModelResultado = new DefaultListModel();

        for(Item item : listaItensDisponiveis){
            listModelResultado.addElement(item.getId() + " - " + item.getNome());
        }
        
        livrosDisponiveisList.setModel(listModelResultado);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        pesquisarTextField = new javax.swing.JTextField();
        pesquisarButton = new javax.swing.JButton();
        idLivroTextField = new javax.swing.JTextField();
        idLivroLabel = new javax.swing.JLabel();
        registrarButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        livrosDisponiveisList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        livrosUsuarioComboBox = new javax.swing.JComboBox<>();

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

        idLivroLabel.setText("Digite o ID do livro interessado:");

        registrarButton.setText("Registrar interesse");
        registrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarButtonActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(livrosDisponiveisList);

        jLabel1.setText("Selecione qual livro deseja ofertar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pesquisarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pesquisarButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(registrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(idLivroLabel)
                        .addGap(18, 18, 18)
                        .addComponent(idLivroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(livrosUsuarioComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(113, 113, 113))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesquisarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesquisarButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLivroLabel)
                    .addComponent(idLivroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(livrosUsuarioComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(registrarButton)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pesquisarTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisarTextFieldActionPerformed

    private void pesquisarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarButtonActionPerformed
        List<Item> listaResultado = livroController.PesquisarItemDisponiveis(pesquisarTextField.getText());
        DefaultListModel listModelResultado = new DefaultListModel();

        for(Item item : listaResultado){
            if(item.getIdUsuario() != usuario.getId() && item.isDisponivel())
                listModelResultado.addElement(item.getId() + " - " + item.getNome());
        }
        
        livrosDisponiveisList.setModel(listModelResultado);
    }//GEN-LAST:event_pesquisarButtonActionPerformed

    private void registrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarButtonActionPerformed
        Livro livroOfertado = (Livro) itensDoUsuario.get(livrosUsuarioComboBox.getSelectedIndex());
        Livro livroInteresse = (Livro) livroController.GetItemPorId(Integer.parseInt(idLivroTextField.getText()));
        int id = trocaLivroController.GetNovoId();
        TrocaItem troca = new TrocaItem(id, livroInteresse, livroOfertado);
        trocaLivroController.CadastrarTroca(troca);
        setVisible(false);
    }//GEN-LAST:event_registrarButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel idLivroLabel;
    private javax.swing.JTextField idLivroTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JList<String> livrosDisponiveisList;
    private javax.swing.JComboBox<String> livrosUsuarioComboBox;
    private javax.swing.JButton pesquisarButton;
    private javax.swing.JTextField pesquisarTextField;
    private javax.swing.JButton registrarButton;
    // End of variables declaration//GEN-END:variables
}
