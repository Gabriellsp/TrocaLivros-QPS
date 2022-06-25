/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.trabalho.trocalivros.qps.View.Livro;

import com.trabalho.trocalivros.qps.Controller.Interface.ILivroController;
import com.trabalho.trocalivros.qps.Controller.LivroController;
import com.trabalho.trocalivros.qps.Model.Abstract.Item;
import com.trabalho.trocalivros.qps.Model.Livro;
import com.trabalho.trocalivros.qps.Model.Usuario;
import java.util.List;
import javax.swing.JOptionPane;

public class EditarLivroView extends javax.swing.JFrame {
    private final Usuario usuario;
    private final ILivroController livroController;
    private List<Item> itensDoUsuario;
    
    public EditarLivroView(Usuario usuario) {
        this.usuario = usuario;
        this.livroController = new LivroController();
        initComponents();
        initListaItensDoUsuario();      
    }
    
    private void initListaItensDoUsuario() {
        livrosUsuarioComboBox.removeAllItems();
        itensDoUsuario = livroController.GetTodosItensDoUsuario(usuario.getId());
        for(Item item : itensDoUsuario) {
            livrosUsuarioComboBox.addItem(item.getNome());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        livrosUsuarioComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        nomeTextField = new javax.swing.JTextField();
        nomeLabel = new javax.swing.JLabel();
        descricaoLabel = new javax.swing.JLabel();
        descricaoTextField = new javax.swing.JTextField();
        anoTextField = new javax.swing.JTextField();
        anoLabel = new javax.swing.JLabel();
        autorLabel = new javax.swing.JLabel();
        autorTextField = new javax.swing.JTextField();
        tipoComboBox = new javax.swing.JComboBox<>();
        tipoLabel = new javax.swing.JLabel();
        editoraLabel = new javax.swing.JLabel();
        editoraTextField = new javax.swing.JTextField();
        editarLivroButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        livrosUsuarioComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        livrosUsuarioComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                livrosUsuarioComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Selecione o livro:");

        nomeTextField.setEnabled(false);
        nomeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTextFieldActionPerformed(evt);
            }
        });

        nomeLabel.setText("Nome:");

        descricaoLabel.setText("Descrição:");

        descricaoTextField.setEnabled(false);
        descricaoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descricaoTextFieldActionPerformed(evt);
            }
        });

        anoTextField.setEnabled(false);
        anoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anoTextFieldActionPerformed(evt);
            }
        });

        anoLabel.setText("Ano:");

        autorLabel.setText("Autor:");

        autorTextField.setEnabled(false);
        autorTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autorTextFieldActionPerformed(evt);
            }
        });

        tipoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acadêmico", "Ficção", "História em quadrinho", "Poesia", "Religião", "Revista", "Romance" }));
        tipoComboBox.setEnabled(false);
        tipoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoComboBoxActionPerformed(evt);
            }
        });

        tipoLabel.setText("Tipo:");

        editoraLabel.setText("Editora:");

        editoraTextField.setEnabled(false);
        editoraTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editoraTextFieldActionPerformed(evt);
            }
        });

        editarLivroButton.setText("Editar livro");
        editarLivroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarLivroButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(editoraLabel)
                            .addGap(12, 12, 12)
                            .addComponent(editoraTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(livrosUsuarioComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomeLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(descricaoLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(anoLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(autorLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tipoLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(descricaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(anoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(autorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tipoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(editarLivroButton)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(livrosUsuarioComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descricaoLabel)
                    .addComponent(descricaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(anoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(autorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(autorLabel))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoLabel)
                    .addComponent(tipoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(editoraTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editoraLabel))
                .addGap(18, 18, 18)
                .addComponent(editarLivroButton)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeTextFieldActionPerformed

    private void descricaoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descricaoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descricaoTextFieldActionPerformed

    private void anoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anoTextFieldActionPerformed

    private void autorTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autorTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_autorTextFieldActionPerformed

    private void tipoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoComboBoxActionPerformed

    private void editoraTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editoraTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editoraTextFieldActionPerformed

    private void editarLivroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarLivroButtonActionPerformed
        Livro livroSelecionado = (Livro) itensDoUsuario.get(livrosUsuarioComboBox.getSelectedIndex());
        int idUsuario = usuario.getId();
        int idLivro = livroSelecionado.getId();
        Livro livro = new Livro(idLivro,idUsuario, nomeTextField.getText(), autorTextField.getText(), Integer.parseInt(anoTextField.getText()), tipoComboBox.getSelectedItem().toString(), descricaoTextField.getText(), editoraTextField.getText());
        livroController.EditarItem(livro);
        JOptionPane.showMessageDialog(null,
            "Livro editado!");
        setVisible(false);
    }//GEN-LAST:event_editarLivroButtonActionPerformed

    private void livrosUsuarioComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_livrosUsuarioComboBoxActionPerformed
        if(livrosUsuarioComboBox.getSelectedIndex() != -1){
            atualizarLivroParaEdicao();
        }
    }//GEN-LAST:event_livrosUsuarioComboBoxActionPerformed
    
    private void atualizarLivroParaEdicao() {
        Livro livroSelecionado = (Livro) itensDoUsuario.get(livrosUsuarioComboBox.getSelectedIndex());
        setTodosItensEnabled(true);
        setTodosTextField(livroSelecionado);
    }
    
    private void setTodosItensEnabled(boolean value) {
        nomeTextField.setEnabled(value);
        descricaoTextField.setEnabled(value);
        anoTextField.setEnabled(value);
        autorTextField.setEnabled(value);
        tipoComboBox.setEnabled(value);
        editoraTextField.setEnabled(value);
    }
    
    private void setTodosTextField(Livro livroSelecionado) {
        nomeTextField.setText(livroSelecionado.getNome());
        descricaoTextField.setText(livroSelecionado.getDescricao());
        anoTextField.setText(String.valueOf(livroSelecionado.getAno()));
        autorTextField.setText(String.valueOf(livroSelecionado.getAutor()));
        tipoComboBox.setSelectedItem(livroSelecionado.getTipo());
        editoraTextField.setText(livroSelecionado.getEditora());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anoLabel;
    private javax.swing.JTextField anoTextField;
    private javax.swing.JLabel autorLabel;
    private javax.swing.JTextField autorTextField;
    private javax.swing.JLabel descricaoLabel;
    private javax.swing.JTextField descricaoTextField;
    private javax.swing.JButton editarLivroButton;
    private javax.swing.JLabel editoraLabel;
    private javax.swing.JTextField editoraTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> livrosUsuarioComboBox;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JComboBox<String> tipoComboBox;
    private javax.swing.JLabel tipoLabel;
    // End of variables declaration//GEN-END:variables

}
