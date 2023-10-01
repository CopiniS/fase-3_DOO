
package Viwe;

import Controler.Main;

public class Tela_cadastro extends javax.swing.JPanel {

    public Tela_cadastro() {
        initComponents();
        tx_nome.setOpaque(false);
        tx_senha.setOpaque(false);
        tx_usuario.setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lb_nome = new javax.swing.JLabel();
        tx_nome = new javax.swing.JTextField();
        lb_usuario = new javax.swing.JLabel();
        tx_usuario = new javax.swing.JTextField();
        lb_senha = new javax.swing.JLabel();
        tx_senha = new javax.swing.JPasswordField();
        bt_voltar = new javax.swing.JButton();
        bt_salvar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(498, 367));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro");
        add(jLabel1);
        jLabel1.setBounds(189, 23, 107, 30);

        lb_nome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_nome.setForeground(new java.awt.Color(255, 255, 255));
        lb_nome.setText("Nome:");
        add(lb_nome);
        lb_nome.setBounds(74, 71, 66, 26);

        tx_nome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tx_nome.setForeground(new java.awt.Color(255, 255, 255));
        add(tx_nome);
        tx_nome.setBounds(74, 103, 293, 22);

        lb_usuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_usuario.setForeground(new java.awt.Color(255, 255, 255));
        lb_usuario.setText("usuario:");
        add(lb_usuario);
        lb_usuario.setBounds(74, 131, 79, 25);

        tx_usuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tx_usuario.setForeground(new java.awt.Color(255, 255, 255));
        add(tx_usuario);
        tx_usuario.setBounds(74, 162, 156, 22);

        lb_senha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_senha.setForeground(new java.awt.Color(255, 255, 255));
        lb_senha.setText("senha");
        add(lb_senha);
        lb_senha.setBounds(74, 190, 62, 25);

        tx_senha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tx_senha.setForeground(new java.awt.Color(255, 255, 255));
        add(tx_senha);
        tx_senha.setBounds(74, 221, 156, 22);

        bt_voltar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bt_voltar.setForeground(new java.awt.Color(0, 0, 0));
        bt_voltar.setText("Voltar");
        bt_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_voltarMouseClicked(evt);
            }
        });
        add(bt_voltar);
        bt_voltar.setBounds(31, 311, 96, 32);

        bt_salvar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bt_salvar.setForeground(new java.awt.Color(0, 0, 0));
        bt_salvar.setText("Salvar");
        bt_salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_salvarMouseClicked(evt);
            }
        });
        add(bt_salvar);
        bt_salvar.setBounds(359, 311, 100, 32);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadastro.imagem (1).jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2);
        jLabel2.setBounds(0, 0, 500, 370);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_salvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_salvarMouseClicked
       Main.c1.getControlerCadastro().bt_salvarMouseClicked(tx_nome.getText(), tx_usuario.getText(), tx_senha.getText());
    }//GEN-LAST:event_bt_salvarMouseClicked

    private void bt_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_voltarMouseClicked
        Main.c1.getControlerCadastro().bt_voltarLoginMouseClicked();
    }//GEN-LAST:event_bt_voltarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_salvar;
    private javax.swing.JButton bt_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lb_nome;
    private javax.swing.JLabel lb_senha;
    private javax.swing.JLabel lb_usuario;
    private javax.swing.JTextField tx_nome;
    private javax.swing.JPasswordField tx_senha;
    private javax.swing.JTextField tx_usuario;
    // End of variables declaration//GEN-END:variables
}
