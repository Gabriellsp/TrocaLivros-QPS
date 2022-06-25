package com.trabalho.trocalivros.qps.View.TrocaLivro;

import com.trabalho.trocalivros.qps.Controller.Interface.ITrocaLivroController;
import com.trabalho.trocalivros.qps.Controller.TrocaLivroController;
import com.trabalho.trocalivros.qps.Model.TrocaItem;
import com.trabalho.trocalivros.qps.Model.Usuario;
import com.trabalho.trocalivros.qps.Util.StatusItemEnum;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AprovarTrocaView extends javax.swing.JFrame {
    private final Usuario usuario;
    private final ITrocaLivroController trocaLivroController;
    private List<TrocaItem> listaOfertasRecebidas;
    
    public AprovarTrocaView(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
        this.trocaLivroController = new TrocaLivroController();
        atualizarOfertasRecebidasTable();
    }
    
    private void atualizarOfertasRecebidasTable() {
        listaOfertasRecebidas = trocaLivroController.GetOfertasRecebidaDoUsuario(usuario);
        DefaultTableModel tableModel = (DefaultTableModel) ofertasRecebidasTable.getModel();
        for(TrocaItem item : listaOfertasRecebidas){
            addItemIdTrocasComboBox(String.valueOf(item.getId()));
            tableModel.addRow(new Object[]{item.getId() , item.getDataTroca().toString(), item.getItemInteresse().getNome(), item.getItemOfertado().getNome()});
        }
        ofertasRecebidasTable.setModel(tableModel);
    }
    
    private void addItemIdTrocasComboBox(String item) {
        idTrocasComboBox.addItem(String.valueOf(item));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ofertasRecebidasTable = new javax.swing.JTable();
        idTrocaLabel = new javax.swing.JLabel();
        aprovarTrocaButton = new javax.swing.JButton();
        idTrocasComboBox = new javax.swing.JComboBox<>();
        recusarTrocaButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Aprovar Troca");

        ofertasRecebidasTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DATA", "SEU LIVRO", "LIVRO OFERTADO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ofertasRecebidasTable);

        idTrocaLabel.setText("Selecione o ID da troca:");

        aprovarTrocaButton.setText("Aprovar troca");
        aprovarTrocaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aprovarTrocaButtonActionPerformed(evt);
            }
        });

        recusarTrocaButton.setText("Recusar troca");
        recusarTrocaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recusarTrocaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(idTrocaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(idTrocasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(recusarTrocaButton)
                        .addGap(67, 67, 67)
                        .addComponent(aprovarTrocaButton)))
                .addGap(122, 122, 122))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idTrocaLabel)
                    .addComponent(idTrocasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aprovarTrocaButton)
                    .addComponent(recusarTrocaButton))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aprovarTrocaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aprovarTrocaButtonActionPerformed
        TrocaItem troca = trocaLivroController.GetTrocaPorId(Integer.parseInt(idTrocasComboBox.getSelectedItem().toString()));
        trocaLivroController.UpdateStatusTroca(troca, StatusItemEnum.APROVADO);
        JOptionPane.showMessageDialog(null,
            "Troca aprovada!");
        setVisible(false);
    }//GEN-LAST:event_aprovarTrocaButtonActionPerformed

    private void recusarTrocaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recusarTrocaButtonActionPerformed
        TrocaItem troca = trocaLivroController.GetTrocaPorId(Integer.parseInt(idTrocasComboBox.getSelectedItem().toString()));
        trocaLivroController.UpdateStatusTroca(troca, StatusItemEnum.RECUSADO);
        JOptionPane.showMessageDialog(null,
            "Troca reprovada!");
        setVisible(false);
    }//GEN-LAST:event_recusarTrocaButtonActionPerformed
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aprovarTrocaButton;
    private javax.swing.JLabel idTrocaLabel;
    private javax.swing.JComboBox<String> idTrocasComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable ofertasRecebidasTable;
    private javax.swing.JButton recusarTrocaButton;
    // End of variables declaration//GEN-END:variables
}
