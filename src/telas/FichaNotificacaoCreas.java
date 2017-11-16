/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import creas.Creas;
import creas.CreasDAO;
import java.io.Serializable;
import javax.swing.JOptionPane;
import usuario.Usuario;

/**
 *
 * @author Katyeudo
 */
public class FichaNotificacaoCreas extends javax.swing.JFrame implements Serializable{

    Creas creas;
    CreasDAO creasDAO;

    Usuario usuario = new Usuario();

    public FichaNotificacaoCreas(Usuario usuario) {
        this.usuario = usuario;

        creas = new Creas();
        creasDAO = new CreasDAO();
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

        btnVoltar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        Pesquisar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jcClassificacao = new javax.swing.JComboBox<>();
        labelPonto4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jcEncaminhamento = new javax.swing.JComboBox<>();
        labelPonto2 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObs = new javax.swing.JTextArea();
        jPanel10 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCircunstancia = new javax.swing.JTextField();
        labelPonto6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ficha de Notificação de CREAS");
        setMinimumSize(new java.awt.Dimension(879, 460));
        setResizable(false);
        getContentPane().setLayout(null);

        btnVoltar.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Voltar.png"))); // NOI18N
        btnVoltar.setText("Principal");
        btnVoltar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVoltar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar);
        btnVoltar.setBounds(30, 320, 104, 80);

        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save-icon-31-2.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(150, 320, 104, 80);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 0, 0));
        jLabel14.setText("* Dados Obrigatórios");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(260, 320, 130, 15);

        Pesquisar.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Pesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon-search-128-2.png"))); // NOI18N
        Pesquisar.setText("Pesquisar");
        Pesquisar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Pesquisar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(Pesquisar);
        Pesquisar.setBounds(617, 320, 120, 80);

        btnSair.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Exit.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(750, 320, 110, 80);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rodape-3.png"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(0, 350, 880, 80);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Classificação final", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jcClassificacao.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jcClassificacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "Suspeito", "Confirmado", "Descartado" }));

        labelPonto4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelPonto4.setForeground(new java.awt.Color(204, 0, 0));
        labelPonto4.setText("*");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jcClassificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelPonto4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcClassificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPonto4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel7);
        jPanel7.setBounds(20, 120, 190, 70);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(36, 39, 89));
        jLabel15.setText("Ficha de Notificação de Creas");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(30, 10, 280, 20);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Encaminhamento da pessoa atendida para outros setores", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel8.setMinimumSize(new java.awt.Dimension(845, 70));

        jcEncaminhamento.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jcEncaminhamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "Conselho tutelar (criança/adolescente)", "Vara da infância/juventude", "Casa de proteção/abrigo", "Programa Sentinela", "Delegacia Especializada da Mulher", "Delegacia de Proteção da Criança e do Adolescente", "Outras Delegacias", "Ministério Público", "Centro de Referência da Assistência Social/CRAS", "IML", "Ignorado" }));
        jcEncaminhamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcEncaminhamentoActionPerformed(evt);
            }
        });

        labelPonto2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelPonto2.setForeground(new java.awt.Color(204, 0, 0));
        labelPonto2.setText("*");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jcEncaminhamento, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelPonto2)
                .addContainerGap(334, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcEncaminhamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPonto2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel8);
        jPanel8.setBounds(20, 40, 520, 70);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações complementares e observações", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel9.setMinimumSize(new java.awt.Dimension(845, 70));

        txtObs.setColumns(20);
        txtObs.setRows(5);
        jScrollPane1.setViewportView(txtObs);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(230, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel9);
        jPanel9.setBounds(220, 120, 630, 180);

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Circunstância da lesão (confirmada)", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel10.setMinimumSize(new java.awt.Dimension(845, 70));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setText("CID 10");

        txtCircunstancia.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        labelPonto6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelPonto6.setForeground(new java.awt.Color(204, 0, 0));
        labelPonto6.setText("*");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCircunstancia, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelPonto6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(557, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtCircunstancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelPonto6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel10);
        jPanel10.setBounds(550, 40, 300, 70);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        new TelaPrincipal(this.usuario).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        if (preencherDados()) {

            preencherDados();

            if (creas.getIdCreas() != 0) {
                creasDAO.atualizar(creas);
                JOptionPane.showMessageDialog(null, "Ficha atualizada com sucesso!");
            } else {
                creasDAO.salvar(creas);

                JOptionPane.showMessageDialog(null, "Ficha cadastrada com sucesso!");
            }

            limparCampos();
        } else {
            JOptionPane.showMessageDialog(null, "Campo obrigatório não preenchido!");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed
    private void limparCampos() {
        jcClassificacao.setSelectedIndex(0);
        jcEncaminhamento.setSelectedIndex(0);
        txtCircunstancia.setText("");
        txtObs.setText("");
        creas = new Creas();
    }

    private boolean preencherDados() {

        if (!((jcClassificacao.getSelectedItem().equals("---")) || (jcEncaminhamento.getSelectedItem().equals("---"))
                || (txtCircunstancia.getText().equals("")))) {

            creas.setCreasCircunstacia(txtCircunstancia.getText());
            creas.setCreasClassificacao(jcClassificacao.getSelectedItem().toString());
            creas.setCreasEncaminhamento(jcEncaminhamento.getSelectedItem().toString());
            creas.setCreasObservacoes(txtObs.getText());

            return true;
        }

        return false;
    }

    public void atualizarConsulta() {

        txtCircunstancia.setText(creas.getCreasCircunstacia());
        jcClassificacao.setSelectedItem(creas.getCreasClassificacao());
        jcEncaminhamento.setSelectedItem(creas.getCreasEncaminhamento());
        txtObs.setText(creas.getCreasObservacoes());

    }
    private void PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarActionPerformed
        ConsultarFichaNotificacaoCreas consultarFichaNotificacaoCreas = new ConsultarFichaNotificacaoCreas(this.usuario);
        consultarFichaNotificacaoCreas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PesquisarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        Object[] options = {"Sim", "Não"};
        if (JOptionPane.showOptionDialog(null, "Deseja mesmo sair da aplicação?", "Ficha de Notificação Creas",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnSairActionPerformed

    private void jcEncaminhamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcEncaminhamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcEncaminhamentoActionPerformed

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
            java.util.logging.Logger.getLogger(FichaNotificacaoCreas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FichaNotificacaoCreas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FichaNotificacaoCreas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FichaNotificacaoCreas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FichaNotificacaoCreas(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Pesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcClassificacao;
    private javax.swing.JComboBox<String> jcEncaminhamento;
    private javax.swing.JLabel labelPonto2;
    private javax.swing.JLabel labelPonto4;
    private javax.swing.JLabel labelPonto6;
    private javax.swing.JTextField txtCircunstancia;
    private javax.swing.JTextArea txtObs;
    // End of variables declaration//GEN-END:variables
}
