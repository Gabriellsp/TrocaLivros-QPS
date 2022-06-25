package com.trabalho.trocalivros.qps.View.Usuario;

import com.trabalho.trocalivros.qps.Controller.Interface.IUsuarioController;
import com.trabalho.trocalivros.qps.Controller.UsuarioController;
import com.trabalho.trocalivros.qps.DataBase.UsuariosData;
import com.trabalho.trocalivros.qps.Model.Endereco;
import com.trabalho.trocalivros.qps.Model.Telefone;
import com.trabalho.trocalivros.qps.Model.Usuario;
import javax.swing.JOptionPane;

public class EditarUsuarioView extends javax.swing.JFrame {
    private final IUsuarioController usuarioController;
    private final Usuario usuario;
    
    public EditarUsuarioView(Usuario usuario) {
        this.usuario = usuario;
        this.usuarioController = new UsuarioController();
        initComponents();
        initDadosDoUsuario();
    }
    
    private void initDadosDoUsuario() {
        loginTextField.setText(usuario.getLogin());
        senhaTextField.setText(usuario.getSenha());
        nomeTextField.setText(usuario.getNome());
        dataNascimentoTextField.setText(usuario.getDataNascimento());
        emailTextField.setText(usuario.getEmail());
        ruaTextField.setText(usuario.getEndereco().getRua());
        numeroTextField.setText(String.valueOf(usuario.getEndereco().getNumero()));
        bairroTextField.setText(usuario.getEndereco().getBairro());
        cidadeTextField.setText(usuario.getEndereco().getCidade());
        cepTextField.setText(usuario.getEndereco().getCep());
        paisTextField.setText(usuario.getEndereco().getPais());
        prefixoTextField.setText(usuario.getTelefone().getPrefixo());
        dddTextField.setText(String.valueOf(usuario.getTelefone().getDdd()));
        telefoneTextField.setText(usuario.getTelefone().getNumero());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginTextField = new javax.swing.JTextField();
        cadastrarUsuarioLabel = new javax.swing.JLabel();
        loginLabel = new javax.swing.JLabel();
        senhaLabel = new javax.swing.JLabel();
        senhaTextField = new javax.swing.JTextField();
        nomeTextField = new javax.swing.JTextField();
        nomeLabel = new javax.swing.JLabel();
        dataNascimentoLabel = new javax.swing.JLabel();
        dataNascimentoTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        ruaLabel = new javax.swing.JLabel();
        ruaTextField = new javax.swing.JTextField();
        numeroTextField = new javax.swing.JTextField();
        numeroLabel = new javax.swing.JLabel();
        bairroLabel = new javax.swing.JLabel();
        bairroTextField = new javax.swing.JTextField();
        cidadeTextField = new javax.swing.JTextField();
        cidadeLabel = new javax.swing.JLabel();
        cepLabel = new javax.swing.JLabel();
        cepTextField = new javax.swing.JTextField();
        paisTextField = new javax.swing.JTextField();
        paisLabel = new javax.swing.JLabel();
        prefixoTextField = new javax.swing.JTextField();
        dddTextField = new javax.swing.JTextField();
        telefoneTextField = new javax.swing.JTextField();
        editarUsuarioButton = new javax.swing.JButton();
        telefoneLabel = new javax.swing.JLabel();
        isAdmLabel = new javax.swing.JLabel();
        isAdmRadioButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginTextFieldActionPerformed(evt);
            }
        });

        cadastrarUsuarioLabel.setText("Editar usuário");

        loginLabel.setText("Login:");

        senhaLabel.setText("Senha:");

        senhaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaTextFieldActionPerformed(evt);
            }
        });

        nomeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTextFieldActionPerformed(evt);
            }
        });

        nomeLabel.setText("Nome:");

        dataNascimentoLabel.setText("Data de nascimento:");

        dataNascimentoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataNascimentoTextFieldActionPerformed(evt);
            }
        });

        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });

        emailLabel.setText("Email:");

        ruaLabel.setText("Rua:");

        ruaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ruaTextFieldActionPerformed(evt);
            }
        });

        numeroTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroTextFieldActionPerformed(evt);
            }
        });

        numeroLabel.setText("Número:");

        bairroLabel.setText("Bairro:");

        bairroTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bairroTextFieldActionPerformed(evt);
            }
        });

        cidadeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidadeTextFieldActionPerformed(evt);
            }
        });

        cidadeLabel.setText("Cidade:");

        cepLabel.setText("CEP:");

        cepTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cepTextFieldActionPerformed(evt);
            }
        });

        paisTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paisTextFieldActionPerformed(evt);
            }
        });

        paisLabel.setText("País:");

        prefixoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prefixoTextFieldActionPerformed(evt);
            }
        });

        dddTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dddTextFieldActionPerformed(evt);
            }
        });

        telefoneTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneTextFieldActionPerformed(evt);
            }
        });

        editarUsuarioButton.setText("Editar Usuário");
        editarUsuarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarUsuarioButtonActionPerformed(evt);
            }
        });

        telefoneLabel.setText("Telefone:");

        isAdmLabel.setText("Marque se for administrador:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ruaLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(numeroLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bairroLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cidadeLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cepLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(paisLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ruaTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numeroTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bairroTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cidadeTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cepTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(paisTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(telefoneLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(prefixoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dddTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(telefoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nomeLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(dataNascimentoLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(emailLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(12, 12, 12))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(loginLabel)
                                            .addComponent(senhaLabel))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cadastrarUsuarioLabel)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nomeTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dataNascimentoTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(emailTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(senhaTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(loginTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(isAdmLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(isAdmRadioButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(editarUsuarioButton)
                        .addGap(106, 106, 106)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(cadastrarUsuarioLabel)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(loginTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senhaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(isAdmLabel)
                    .addComponent(isAdmRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataNascimentoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataNascimentoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ruaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ruaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bairroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bairroLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cidadeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cidadeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cepTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cepLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(paisTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paisLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefoneLabel)
                    .addComponent(prefixoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dddTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(editarUsuarioButton)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginTextFieldActionPerformed

    private void senhaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaTextFieldActionPerformed

    private void nomeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeTextFieldActionPerformed

    private void dataNascimentoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataNascimentoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataNascimentoTextFieldActionPerformed

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldActionPerformed

    private void ruaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ruaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ruaTextFieldActionPerformed

    private void numeroTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroTextFieldActionPerformed

    private void bairroTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bairroTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bairroTextFieldActionPerformed

    private void cidadeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidadeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidadeTextFieldActionPerformed

    private void cepTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cepTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cepTextFieldActionPerformed

    private void paisTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paisTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paisTextFieldActionPerformed

    private void prefixoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prefixoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prefixoTextFieldActionPerformed

    private void dddTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dddTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dddTextFieldActionPerformed

    private void telefoneTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoneTextFieldActionPerformed

    private void editarUsuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarUsuarioButtonActionPerformed
        Endereco enderecoEditado = new Endereco(ruaTextField.getText(), Integer.parseInt(numeroTextField.getText()), 
                bairroTextField.getText(), cidadeTextField.getText(),  cepTextField.getText(),  paisTextField.getText());
        Telefone telefoneEditado = new Telefone(telefoneTextField.getText(), Integer.parseInt(dddTextField.getText()), prefixoTextField.getText());
        
        boolean isAdm = isAdmRadioButton.isSelected();
        
        Usuario usuarioEditado = new Usuario(usuario.getId(), isAdm, loginTextField.getText(), 
                senhaTextField.getText(), nomeTextField.getText(), 
            enderecoEditado, dataNascimentoTextField.getText(), emailTextField.getText(), telefoneEditado);
        
        usuarioController.EditarUsuario(usuarioEditado);
        JOptionPane.showMessageDialog(null,
            "Usuário editado!");
        setVisible(false);
    }//GEN-LAST:event_editarUsuarioButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bairroLabel;
    private javax.swing.JTextField bairroTextField;
    private javax.swing.JLabel cadastrarUsuarioLabel;
    private javax.swing.JLabel cepLabel;
    private javax.swing.JTextField cepTextField;
    private javax.swing.JLabel cidadeLabel;
    private javax.swing.JTextField cidadeTextField;
    private javax.swing.JLabel dataNascimentoLabel;
    private javax.swing.JTextField dataNascimentoTextField;
    private javax.swing.JTextField dddTextField;
    private javax.swing.JButton editarUsuarioButton;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel isAdmLabel;
    private javax.swing.JRadioButton isAdmRadioButton;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JTextField loginTextField;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JLabel numeroLabel;
    private javax.swing.JTextField numeroTextField;
    private javax.swing.JLabel paisLabel;
    private javax.swing.JTextField paisTextField;
    private javax.swing.JTextField prefixoTextField;
    private javax.swing.JLabel ruaLabel;
    private javax.swing.JTextField ruaTextField;
    private javax.swing.JLabel senhaLabel;
    private javax.swing.JTextField senhaTextField;
    private javax.swing.JLabel telefoneLabel;
    private javax.swing.JTextField telefoneTextField;
    // End of variables declaration//GEN-END:variables
}
