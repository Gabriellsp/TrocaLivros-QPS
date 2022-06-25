package com.trabalho.trocalivros.qps.View.Login;

import com.trabalho.trocalivros.qps.Controller.Interface.IUsuarioController;
import com.trabalho.trocalivros.qps.View.Usuario.MenuUsuarioView;
import com.trabalho.trocalivros.qps.View.Usuario.CadastrarUsuarioView;
import com.trabalho.trocalivros.qps.Controller.LoginController;
import com.trabalho.trocalivros.qps.Controller.UsuarioController;
import com.trabalho.trocalivros.qps.Model.Usuario;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LoginView extends javax.swing.JPanel {
    private final IUsuarioController usuarioController;

    public LoginView(IUsuarioController usuarioController) {
        this.usuarioController = usuarioController;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        loginLabel = new javax.swing.JLabel();
        senhaLabel = new javax.swing.JLabel();
        loginTextField = new javax.swing.JTextField();
        senhaTextField = new javax.swing.JTextField();
        entrarButton = new javax.swing.JButton();
        cadastrarUsuarioButton = new javax.swing.JButton();

        setToolTipText("");
        setSize(new java.awt.Dimension(300, 250));

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 400));

        loginLabel.setText("Login:");

        senhaLabel.setText("Senha:");

        loginTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginTextFieldActionPerformed(evt);
            }
        });

        senhaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaTextFieldActionPerformed(evt);
            }
        });

        entrarButton.setText("Entrar");
        entrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarButtonActionPerformed(evt);
            }
        });

        cadastrarUsuarioButton.setText("Cadastrar usuário");
        cadastrarUsuarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarUsuarioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(senhaLabel)
                            .addComponent(loginLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(senhaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(entrarButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(cadastrarUsuarioButton)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(cadastrarUsuarioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginLabel)
                    .addComponent(loginTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhaLabel)
                    .addComponent(senhaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(entrarButton)
                .addGap(105, 105, 105))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleName("Login");
    }// </editor-fold>//GEN-END:initComponents

    private void loginTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginTextFieldActionPerformed

    private void senhaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaTextFieldActionPerformed

    private void entrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarButtonActionPerformed
        LoginController loginController = new LoginController();
        Usuario usuarioLogado = loginController.login(loginTextField.getText(), senhaTextField.getText());
        if(usuarioLogado != null){            
            MenuUsuarioView menuUsuarioView = new MenuUsuarioView(usuarioLogado);
            callNewView(menuUsuarioView); 
        }
        else {
            JOptionPane.showMessageDialog(null,
    "Usuário não cadastrado!");
        }
        
    }//GEN-LAST:event_entrarButtonActionPerformed

    private void cadastrarUsuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarUsuarioButtonActionPerformed
        CadastrarUsuarioView cadastrarView = new CadastrarUsuarioView(usuarioController);
        callNewView(cadastrarView); 
    }//GEN-LAST:event_cadastrarUsuarioButtonActionPerformed
    
    private void callNewView(JFrame frame){
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarUsuarioButton;
    private javax.swing.JButton entrarButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JTextField loginTextField;
    private javax.swing.JLabel senhaLabel;
    private javax.swing.JTextField senhaTextField;
    // End of variables declaration//GEN-END:variables
}
