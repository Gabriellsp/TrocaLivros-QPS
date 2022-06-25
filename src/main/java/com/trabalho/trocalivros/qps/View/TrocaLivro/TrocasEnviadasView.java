package com.trabalho.trocalivros.qps.View.TrocaLivro;

import com.trabalho.trocalivros.qps.Controller.Interface.ITrocaLivroController;
import com.trabalho.trocalivros.qps.Controller.TrocaLivroController;
import com.trabalho.trocalivros.qps.Model.TrocaItem;
import com.trabalho.trocalivros.qps.Model.Usuario;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class TrocasEnviadasView extends javax.swing.JFrame {
    private final Usuario usuario;
    private final ITrocaLivroController trocaLivroController;
    public TrocasEnviadasView(Usuario usuario) {
        this.usuario = usuario;
        this.trocaLivroController = new TrocaLivroController();
        initComponents();
        initListaInteresses();
    }
    
    private void initListaInteresses() {
        List<TrocaItem> listaInteresses = trocaLivroController.GetInteressesDoUsuario(this.usuario);
        DefaultTableModel listModel = (DefaultTableModel) meusInteressesTable.getModel();

        for(TrocaItem item : listaInteresses){
            listModel.addRow(new Object[]{item.getId() , item.getDataTroca().toString(), item.getItemInteresse().getNome(), item.getItemOfertado().getNome(), item.getStatus()});
        }
        meusInteressesTable.setModel(listModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        meusInteressesTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Meus interesses:");

        meusInteressesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DATA", "LIVRO INTERESSE", "LIVRO OFERTADO", "STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(meusInteressesTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable meusInteressesTable;
    // End of variables declaration//GEN-END:variables

}
