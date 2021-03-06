/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.awt.event.KeyEvent;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import usuario.Usuario;
import usuario.UsuarioDAO;
import util.Criptografia;

public class TelaCadastroUsuario extends javax.swing.JFrame {
    
    Usuario usuario = new Usuario();
    UsuarioDAO usuarioDAO;
    Usuario usuario2;
    
    public TelaCadastroUsuario(Usuario usuario) {
        
        this.usuario2 = usuario;
        usuarioDAO = new UsuarioDAO();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        txtEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnSair1 = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        txtSetor = new javax.swing.JComboBox<>();
        btnVoltar = new javax.swing.JButton();
        txtLogin = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(800, 530));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 221, 204));
        jPanel1.setMinimumSize(new java.awt.Dimension(770, 530));
        jPanel1.setPreferredSize(new java.awt.Dimension(770, 510));
        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel4.setText("SENHA");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(160, 290, 70, 33);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel5.setText("LOGIN");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(160, 250, 70, 21);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel6.setText("NOME");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(160, 100, 60, 21);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel8.setText("EMAIL");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(160, 150, 60, 21);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel9.setText("SETOR");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(160, 200, 80, 21);

        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save-icon-31-2.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalvar);
        btnSalvar.setBounds(150, 390, 100, 90);

        txtEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });
        jPanel1.add(txtEmail);
        txtEmail.setBounds(250, 140, 300, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel1.setText("CADASTRO DE USUÁRIOS");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(160, 20, 360, 26);

        btnSair1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnSair1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon-search-128-2.png"))); // NOI18N
        btnSair1.setText("Pesquisar");
        btnSair1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSair1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSair1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSair1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSair1);
        btnSair1.setBounds(550, 390, 110, 90);

        btnSair.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Exit.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jPanel1.add(btnSair);
        btnSair.setBounds(680, 390, 100, 90);

        txtSetor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtSetor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "Administrador", "CREAS", "Hospital", "Delegacia" }));
        txtSetor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSetorKeyPressed(evt);
            }
        });
        jPanel1.add(txtSetor);
        txtSetor.setBounds(250, 190, 300, 30);

        btnVoltar.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Voltar.png"))); // NOI18N
        btnVoltar.setText("Principal");
        btnVoltar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVoltar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVoltar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltar);
        btnVoltar.setBounds(30, 390, 100, 90);

        txtLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLogin.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLoginKeyPressed(evt);
            }
        });
        jPanel1.add(txtLogin);
        txtLogin.setBounds(250, 240, 300, 30);

        txtSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtSenha.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaKeyPressed(evt);
            }
        });
        jPanel1.add(txtSenha);
        txtSenha.setBounds(250, 290, 300, 30);

        txtNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtNome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
        });
        jPanel1.add(txtNome);
        txtNome.setBounds(250, 90, 300, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logomarca_ligue180_2015(1)-2.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(580, 10, 210, 130);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Login.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 0, 800, 500);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 520);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
//    private String senhaCripto(String senha) {
//        MessageDigest m = null;
//        String s = senha;
//        try {
//            m = MessageDigest.getInstance("MD5");
//        } catch (NoSuchAlgorithmException ex) {
//            Logger.getLogger(TelaCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        m.update(s.getBytes(), 0, s.length());
//        return new BigInteger(1, m.digest()).toString(16);
//    }
    
//    private String converteSenhaMD5(String senha) throws NoSuchAlgorithmException {
//        MessageDigest md = MessageDigest.getInstance("MD5");
// 
//        BigInteger hash = new BigInteger(1, md.digest(senha.getBytes()));
// 
//        return String.format("%32x;", hash);
//    }
       
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (usuario2.getLogin().equals(txtLogin.getText())) {
            JOptionPane.showMessageDialog(null, "Login " + txtLogin.getText() + " já cadastrado!");
            txtLogin.setText("");
            txtLogin.requestFocus();
        } else {
            try {
                preencherDadosUsuario();
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(TelaCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_btnSalvarActionPerformed
    
    private void preencherDadosUsuario() throws NoSuchAlgorithmException {
        if (!(txtNome.getText().isEmpty() || txtEmail.getText().isEmpty()
                || txtSetor.getSelectedItem().equals("---") || txtLogin.getText().isEmpty()
                || txtSenha.getText().isEmpty())) {
            usuario.setNome(txtNome.getText());
            usuario.setEmail(txtEmail.getText());
            usuario.setFuncao(txtSetor.getSelectedItem().toString());
            usuario.setLogin(txtLogin.getText());
            String senha = Criptografia.md5(txtSenha.getText());
            usuario.setSenha(senha);
            //usuarioDAO.salvar(usuario2);

            if (usuario.getId() != 0) {
                usuarioDAO.atualizar(usuario);
                JOptionPane.showMessageDialog(null, "Usuário atualizado com sucesso!");
                this.dispose();
                ConsultarCadastro cadastro = new ConsultarCadastro(this.usuario2);
                cadastro.setVisible(true);
            } else {
                usuarioDAO.salvar(usuario);
                JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
            }
            
            limparCampos();
            
        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        }
        
    }
    
    public void atualizarConsulta() {
        //AQUI
        txtNome.setText(usuario.getNome());
        txtEmail.setText(usuario.getEmail());
        txtSetor.setSelectedItem(usuario.getFuncao());
        txtLogin.setText(usuario.getLogin());
        txtSenha.setText(usuario.getSenha());
    }
    
    private void limparCampos() {
        txtNome.setText("");
        txtEmail.setText("");
        txtLogin.setText("");
        txtSetor.setSelectedIndex(0);
        txtSenha.setText("");
        //usuario = new Usuario();
    }

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new TelaPrincipal(this.usuario2).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        Object[] options = {"Sim", "Não"};
        if (JOptionPane.showOptionDialog(null, "Deseja mesmo sair da aplicação?", "Cadastro de Usuários",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnSairActionPerformed

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnSalvarActionPerformed(null);
        }
    }//GEN-LAST:event_txtSenhaKeyPressed

    private void btnSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSair1ActionPerformed
        ConsultarCadastro consultarCadastro = new ConsultarCadastro(this.usuario2);
        consultarCadastro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSair1ActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void txtLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoginKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnSalvarActionPerformed(null);
        }
    }//GEN-LAST:event_txtLoginKeyPressed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnSalvarActionPerformed(null);
        }
    }//GEN-LAST:event_txtEmailKeyPressed

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnSalvarActionPerformed(null);
        }
    }//GEN-LAST:event_txtNomeKeyPressed

    private void txtSetorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSetorKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnSalvarActionPerformed(null);
        }
    }//GEN-LAST:event_txtSetorKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroUsuario(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSair1;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JComboBox<String> txtSetor;
    // End of variables declaration//GEN-END:variables
}
