package com.trabalho.trocalivros.qps.View.Livro;

import com.trabalho.trocalivros.qps.Controller.Interface.ILivroController;
import com.trabalho.trocalivros.qps.Controller.LivroController;
import com.trabalho.trocalivros.qps.Model.Abstract.Item;
import com.trabalho.trocalivros.qps.Model.Livro;
import com.trabalho.trocalivros.qps.Util.StatusItemEnum;
import java.util.List;
import javax.swing.JOptionPane;

public class AprovarLivroView extends javax.swing.JFrame {
    private final ILivroController livroController;
    private List<Item> livrosParaAprovar;
    
    public AprovarLivroView() {
        this.livroController = new LivroController();
        initComponents();
        initListaItensParaAprovar();
    }
    
    private void initListaItensParaAprovar() {
        livrosParaAprovarComboBox.removeAllItems();
        livrosParaAprovar = livroController.GetItensParaAprovar();
        for(Item item : livrosParaAprovar) {
            livrosParaAprovarComboBox.addItem(item.getNome());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        livrosParaAprovarComboBox = new javax.swing.JComboBox<>();
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
        aprovarButton = new javax.swing.JButton();
        aprovarLivroLabel = new javax.swing.JLabel();
        recusarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Selecione o livro:");

        livrosParaAprovarComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        livrosParaAprovarComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                livrosParaAprovarComboBoxActionPerformed(evt);
            }
        });

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

        aprovarButton.setText("Aprovar");
        aprovarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aprovarButtonActionPerformed(evt);
            }
        });

        aprovarLivroLabel.setText("Aprovar Livro");

        recusarButton.setText("Recusar");
        recusarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recusarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(editoraLabel)
                        .addGap(12, 12, 12)
                        .addComponent(editoraTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                                .addComponent(tipoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(aprovarLivroLabel)
                                .addComponent(livrosParaAprovarComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(82, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(recusarButton)
                .addGap(62, 62, 62)
                .addComponent(aprovarButton)
                .addGap(109, 109, 109))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(aprovarLivroLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(livrosParaAprovarComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aprovarButton)
                    .addComponent(recusarButton))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void livrosParaAprovarComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_livrosParaAprovarComboBoxActionPerformed
        if(livrosParaAprovarComboBox.getSelectedIndex() != -1){
            atualizarLivroParaAprovar();
        }
    }//GEN-LAST:event_livrosParaAprovarComboBoxActionPerformed
    
    private void atualizarLivroParaAprovar() {
        Livro livroSelecionado = (Livro) livrosParaAprovar.get(livrosParaAprovarComboBox.getSelectedIndex());
        setTodosTextField(livroSelecionado);
    }
    
    private void setTodosTextField(Livro livroSelecionado) {
        nomeTextField.setText(livroSelecionado.getNome());
        descricaoTextField.setText(livroSelecionado.getDescricao());
        anoTextField.setText(String.valueOf(livroSelecionado.getAno()));
        autorTextField.setText(String.valueOf(livroSelecionado.getAutor()));
        tipoComboBox.setSelectedItem(livroSelecionado.getTipo());
        editoraTextField.setText(livroSelecionado.getEditora());
    }
    
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

    private void aprovarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aprovarButtonActionPerformed
        int indexLivro = livrosParaAprovarComboBox.getSelectedIndex();
        Livro livroSelecionado = (Livro) livrosParaAprovar.get(indexLivro);
        livroController.UpdateStatusItem(livroSelecionado.getId(), StatusItemEnum.APROVADO);
        livrosParaAprovar.remove(livroSelecionado);
        JOptionPane.showMessageDialog(null,
            "Livro aprovado!");
        setVisible(false);
    }//GEN-LAST:event_aprovarButtonActionPerformed

    private void recusarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recusarButtonActionPerformed
        int indexLivro = livrosParaAprovarComboBox.getSelectedIndex();
        Livro livroSelecionado = (Livro) livrosParaAprovar.get(indexLivro);
        livroController.UpdateStatusItem(livroSelecionado.getId(), StatusItemEnum.RECUSADO);
        livrosParaAprovar.remove(livroSelecionado);
        JOptionPane.showMessageDialog(null,
            "Livro reprovado!");
        setVisible(false);
    }//GEN-LAST:event_recusarButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anoLabel;
    private javax.swing.JTextField anoTextField;
    private javax.swing.JButton aprovarButton;
    private javax.swing.JLabel aprovarLivroLabel;
    private javax.swing.JLabel autorLabel;
    private javax.swing.JTextField autorTextField;
    private javax.swing.JLabel descricaoLabel;
    private javax.swing.JTextField descricaoTextField;
    private javax.swing.JLabel editoraLabel;
    private javax.swing.JTextField editoraTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> livrosParaAprovarComboBox;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JButton recusarButton;
    private javax.swing.JComboBox<String> tipoComboBox;
    private javax.swing.JLabel tipoLabel;
    // End of variables declaration//GEN-END:variables
}
