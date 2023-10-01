
package Viwe;

import Controler.Main;
import java.awt.Color;

public class Tela_login extends javax.swing.JPanel {

    
    public Tela_login() {
        initComponents();
        DeixaTransparente();
    }
    
    public void DeixaTransparente(){
        tx_usuario.setOpaque(false);
        tx_senha.setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        lb_titulo = new javax.swing.JLabel();
        lb_usuario = new javax.swing.JLabel();
        lb_senha = new javax.swing.JLabel();
        tx_usuario = new javax.swing.JTextField();
        bt_cadastrar = new javax.swing.JButton();
        bt_entrar = new javax.swing.JButton();
        tx_senha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setPreferredSize(new java.awt.Dimension(425, 366));
        setLayout(null);

        lb_titulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_titulo.setForeground(new java.awt.Color(255, 255, 255));
        lb_titulo.setText("Login");
        add(lb_titulo);
        lb_titulo.setBounds(165, 26, 79, 40);

        lb_usuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_usuario.setForeground(new java.awt.Color(255, 255, 255));
        lb_usuario.setText("Usuário:");
        add(lb_usuario);
        lb_usuario.setBounds(120, 102, 56, 20);

        lb_senha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_senha.setForeground(new java.awt.Color(255, 255, 255));
        lb_senha.setText("Senha:");
        add(lb_senha);
        lb_senha.setBounds(120, 180, 50, 20);

        tx_usuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tx_usuario.setForeground(new java.awt.Color(255, 255, 255));
        add(tx_usuario);
        tx_usuario.setBounds(120, 134, 159, 22);

        bt_cadastrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bt_cadastrar.setForeground(new java.awt.Color(0, 0, 0));
        bt_cadastrar.setText("Cadastrar");
        bt_cadastrar.setOpaque(true);
        bt_cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_cadastrarMouseClicked(evt);
            }
        });
        add(bt_cadastrar);
        bt_cadastrar.setBounds(18, 315, 130, 32);

        bt_entrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bt_entrar.setForeground(new java.awt.Color(0, 0, 0));
        bt_entrar.setText("Entrar");
        bt_entrar.setOpaque(true);
        bt_entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_entrarMouseClicked(evt);
            }
        });
        add(bt_entrar);
        bt_entrar.setBounds(270, 310, 130, 32);

        tx_senha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tx_senha.setForeground(new java.awt.Color(255, 255, 255));
        add(tx_senha);
        tx_senha.setBounds(120, 212, 159, 22);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/login.imagem (1).jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 0, 425, 370);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_entrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_entrarMouseClicked
        Main.c1.getControlerLogin().bt_entrarMouseClicked(tx_usuario.getText(), tx_senha.getText());
    }//GEN-LAST:event_bt_entrarMouseClicked

    private void bt_cadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_cadastrarMouseClicked
         Main.c1.getControlerLogin().bt_cadastrarMouseClicked();
    }//GEN-LAST:event_bt_cadastrarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cadastrar;
    private javax.swing.JButton bt_entrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lb_senha;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JLabel lb_usuario;
    private javax.swing.JPasswordField tx_senha;
    private javax.swing.JTextField tx_usuario;
    // End of variables declaration//GEN-END:variables
}
